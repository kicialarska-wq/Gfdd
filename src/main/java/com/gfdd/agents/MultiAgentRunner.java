package com.gfdd.agents;

import com.anthropic.client.AnthropicClient;
import com.anthropic.client.okhttp.AnthropicOkHttpClient;
import com.anthropic.models.messages.ContentBlock;
import com.anthropic.models.messages.Message;
import com.anthropic.models.messages.MessageCreateParams;
import com.anthropic.models.messages.Model;
import com.anthropic.models.messages.ThinkingConfigAdaptive;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Runs multiple Claude agents in parallel using CompletableFuture.
 * Each agent gets its own prompt and system instruction.
 */
public class MultiAgentRunner {

    private final AnthropicClient client;
    private final ExecutorService executor;

    public MultiAgentRunner() {
        this.client = AnthropicOkHttpClient.fromEnv();
        this.executor = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors());
    }

    /**
     * Represents a single agent task with a name and prompt.
     */
    public record AgentTask(String name, String systemPrompt, String userPrompt) {}

    /**
     * Represents the result from a single agent.
     */
    public record AgentResult(String agentName, String response, long durationMs) {}

    /**
     * Sends a single request to the Claude API.
     */
    private AgentResult runAgent(AgentTask task) {
        long start = System.currentTimeMillis();

        MessageCreateParams params = MessageCreateParams.builder()
                .model(Model.CLAUDE_OPUS_4_6)
                .maxTokens(4096L)
                .thinking(ThinkingConfigAdaptive.builder().build())
                .system(task.systemPrompt())
                .addUserMessage(task.userPrompt())
                .build();

        Message response = client.messages().create(params);

        String text = response.content().stream()
                .flatMap(block -> block.text().stream())
                .map(textBlock -> textBlock.text())
                .reduce("", (a, b) -> a + b);

        long duration = System.currentTimeMillis() - start;
        return new AgentResult(task.name(), text, duration);
    }

    /**
     * Runs multiple agents in parallel and returns all results.
     */
    public List<AgentResult> runAll(List<AgentTask> tasks) {
        List<CompletableFuture<AgentResult>> futures = tasks.stream()
                .map(task -> CompletableFuture.supplyAsync(
                        () -> runAgent(task), executor))
                .toList();

        return futures.stream()
                .map(CompletableFuture::join)
                .toList();
    }

    public void shutdown() {
        executor.shutdown();
    }

    public static void main(String[] args) {
        MultiAgentRunner runner = new MultiAgentRunner();

        List<AgentTask> tasks = List.of(
                new AgentTask(
                        "code-reviewer",
                        "You are an expert code reviewer. Be concise.",
                        "Review this Java snippet for issues:\n"
                                + "public String process(String input) {\n"
                                + "  return input.toLowerCase().trim();\n"
                                + "}"
                ),
                new AgentTask(
                        "translator",
                        "You are a translator. Translate to Polish. Be concise.",
                        "Translate: 'The quick brown fox jumps over the lazy dog.'"
                ),
                new AgentTask(
                        "summarizer",
                        "You are a summarizer. Respond in one sentence.",
                        "Summarize the concept of microservices architecture."
                )
        );

        System.out.println("Running " + tasks.size() + " agents in parallel...\n");

        List<AgentResult> results = runner.runAll(tasks);

        for (AgentResult result : results) {
            System.out.println("=== " + result.agentName()
                    + " (" + result.durationMs() + "ms) ===");
            System.out.println(result.response());
            System.out.println();
        }

        runner.shutdown();
    }
}
