# CLAUDE.md - AI Assistant Guide for Gfdd

This document provides guidance for AI assistants working with this codebase.

## Project Overview

**Repository**: Gfdd
**Status**: New/Empty Repository
**Last Updated**: 2025-12-02

> **Note**: This is a newly initialized repository. Update this document as the project develops.

## Repository Structure

```
Gfdd/
├── CLAUDE.md          # This file - AI assistant guidance
└── (project files)    # To be added
```

## Development Setup

### Prerequisites

<!-- Update this section when dependencies are established -->
- [ ] Define required programming language(s) and versions
- [ ] Document package managers and dependencies
- [ ] Add environment setup instructions

### Getting Started

```bash
# Clone the repository
git clone <repository-url>
cd Gfdd

# Install dependencies (update when package manager is chosen)
# npm install / pip install -r requirements.txt / etc.
```

## Development Workflows

### Branch Naming Convention

- Feature branches: `feature/<description>`
- Bug fixes: `fix/<description>`
- Documentation: `docs/<description>`
- Claude AI branches: `claude/<session-id>`

### Commit Message Format

Use clear, descriptive commit messages:
```
<type>: <short description>

[optional body with more details]
```

Types: `feat`, `fix`, `docs`, `style`, `refactor`, `test`, `chore`

### Pull Request Process

1. Create a feature branch from main
2. Make changes and commit
3. Push branch and create PR
4. Request review
5. Merge after approval

## Code Conventions

### General Guidelines

- Write clean, readable, self-documenting code
- Follow established patterns within the codebase
- Keep functions/methods focused and concise
- Add comments only where logic isn't self-evident

### Testing

<!-- Update when testing framework is established -->
- Write tests for new functionality
- Ensure all tests pass before committing
- Maintain test coverage for critical paths

## AI Assistant Guidelines

### When Working on This Repository

1. **Read Before Modifying**: Always read existing files before making changes
2. **Minimal Changes**: Make only the changes requested; avoid over-engineering
3. **Preserve Style**: Match existing code style and conventions
4. **No Guessing**: If information is missing, ask rather than assume
5. **Security First**: Never introduce security vulnerabilities

### Common Tasks

#### Adding New Features
1. Understand the existing codebase structure
2. Plan the implementation approach
3. Write minimal, focused code
4. Add appropriate tests
5. Update documentation if needed

#### Fixing Bugs
1. Reproduce and understand the issue
2. Identify the root cause
3. Implement the minimal fix
4. Verify the fix doesn't introduce regressions

#### Code Review
1. Check for correctness and completeness
2. Verify code style consistency
3. Look for potential security issues
4. Ensure adequate test coverage

### Things to Avoid

- Adding unnecessary abstractions or complexity
- Creating documentation files unless explicitly requested
- Making changes outside the scope of the request
- Introducing breaking changes without discussion
- Committing sensitive data (API keys, credentials, etc.)

## Build & Test Commands

<!-- Update this section as project tooling is established -->

```bash
# Build (placeholder)
# npm run build / make / etc.

# Test (placeholder)
# npm test / pytest / etc.

# Lint (placeholder)
# npm run lint / flake8 / etc.
```

## Project-Specific Notes

<!-- Add project-specific information here as the codebase develops -->

---

*This CLAUDE.md was created for a new repository. Update it as the project structure and conventions are established.*
