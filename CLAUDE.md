# CLAUDE.md - AI Assistant Guide for Gfdd

This document provides guidance for AI assistants working with this codebase.

## Project Overview

**Repository**: Gfdd
**Type**: Educational content repository
**Language**: Polish (Polski)
**Subject**: Biology / Chemistry educational lessons
**Last Updated**: 2026-03-13

This repository contains educational lesson materials written in Markdown, targeting students learning biology and chemistry concepts. The lessons use an accessible teaching style with analogies, visual aids (emojis), comparison tables, memory tricks, and self-test quizzes.

## Repository Structure

```
Gfdd/
├── CLAUDE.md              # This file - AI assistant guidance
└── lekcja_sacharydy.md    # Lesson: Carbohydrates (sacharydy/cukry/weglowodany)
```

## Content Format & Conventions

### Lesson Structure

Each lesson file follows a consistent structure:

1. **Quick Intro** - Why the topic matters, estimated study time
2. **Part 1: Basics** - Core definitions and concepts
3. **Part 2: Classification/Details** - Deeper breakdown of subtopics
4. **Part 3: Summary** - Comparison tables, memory tricks, self-test quiz

### Writing Style

- **Target audience**: Beginner-level students (poziom 0) with no prior knowledge
- **Language**: Polish with scientific terms explained inline
- **Emojis**: Used extensively as visual markers and to make content engaging
- **Analogies**: Each concept includes a relatable analogy (e.g., LEGO blocks, fuel for cars)
- **Tables**: Used for comparisons, examples, and side-by-side explanations
- **Dialogues**: Teacher-student dialogues used to explain tricky concepts
- **Memory tricks** (triki pamieciowe): Mnemonics provided for key facts
- **Self-test quizzes**: Collapsible `<details>` blocks with questions and answers

### Concept Definition Pattern

Each concept ("POJECIE") follows this template:
1. **Definition** (Definicja) - Full explanation with inline definitions of technical terms, word count noted
2. **Analogy** (Analogia) - Comparison table to something familiar
3. **Examples** (Przyklady) - Table of real-world examples

### Naming Convention

- Lesson files: `lekcja_<topic>.md` (e.g., `lekcja_sacharydy.md`)
- All filenames use lowercase with underscores

## Development Workflows

### Branch Naming Convention

- Feature branches: `feature/<description>`
- Bug fixes: `fix/<description>`
- Documentation: `docs/<description>`
- Claude AI branches: `claude/<session-id>`

### Commit Message Format

```
<type>: <short description>

[optional body with more details]
```

Types: `feat`, `fix`, `docs`, `style`, `refactor`, `test`, `chore`

### Pull Request Process

1. Create a feature branch from master
2. Make changes and commit
3. Push branch and create PR
4. Request review
5. Merge after approval

## AI Assistant Guidelines

### When Working on This Repository

1. **Read Before Modifying**: Always read existing files before making changes
2. **Minimal Changes**: Make only the changes requested; avoid over-engineering
3. **Preserve Style**: Match the existing lesson format, emoji usage, and tone
4. **Language Consistency**: All educational content must be in Polish
5. **No Guessing**: If information is missing, ask rather than assume
6. **Accuracy**: Ensure all scientific facts and definitions are correct

### Adding New Lessons

1. Follow the established lesson structure (Intro, Parts, Summary)
2. Use the concept definition pattern (Definition, Analogy, Examples)
3. Include word counts for definitions
4. Add memory tricks and a self-test quiz
5. Name the file `lekcja_<topic>.md`
6. Match the emoji-rich, beginner-friendly writing style

### Editing Existing Lessons

1. Preserve the overall structure and formatting
2. Keep emoji usage consistent with the rest of the lesson
3. Verify scientific accuracy of any changes
4. Maintain the analogy and table-based explanation style

### Things to Avoid

- Writing content in languages other than Polish (unless specifically asked)
- Removing emojis or changing the visual style
- Adding overly technical language without inline explanations
- Creating files outside the established naming conventions
- Introducing factual errors in scientific content
