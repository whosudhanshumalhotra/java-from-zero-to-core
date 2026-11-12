# Contributing and Learning Standards

Thank you for helping improve **Java From Zero to Core**. This repository is both a learning resource and a practical engineering exercise. Accuracy, clarity and reproducibility matter more than the number of pages.

## 1. Principles

- Teach the learner, not the compiler alone.
- Explain concepts from first principles, then introduce precise terminology.
- Distinguish language guarantees from common implementation details.
- Prefer small, runnable examples over large unexplained code blocks.
- Be honest about what has and has not been tested.
- Keep the learning path progressive: prerequisites should be introduced before advanced use.

## 2. Standard lesson structure

Use the following outline for substantial topics. Sections may be omitted when they genuinely do not apply.

1. Learning objectives
2. Prerequisites
3. What it is
4. Why it exists / problem it solves
5. Terminology and syntax
6. How it works (include diagrams or traces where useful)
7. Runnable examples
8. Expected output and explanation
9. Edge cases and common mistakes
10. Practical use cases and trade-offs
11. Practice problems (easy → medium → challenging)
12. Interview questions with model answers and follow-ups
13. Summary and completion checklist
14. References

## 3. Code quality requirements

- Target Java 21 unless the example is explicitly version-specific.
- Use meaningful names and standard Java conventions.
- Keep one primary learning objective per example.
- Include imports and a clear filename when needed.
- Include deterministic expected output where possible.
- Avoid unnecessary dependencies in beginner examples.
- Explain exceptions, input assumptions and boundary conditions.
- Do not include secrets, credentials or personal information.

## 4. Verification before submitting

For Java changes:

```bash
javac -version
javac FileName.java
java FileName
```

For multi-file or package-based examples, document the exact compile/run commands or provide a build configuration.

Before marking content complete:

- [ ] The explanation is technically accurate.
- [ ] The code compiles on the stated Java version.
- [ ] The example output matches the program.
- [ ] Important edge cases are discussed.
- [ ] Exercises are solvable using concepts already taught.
- [ ] Interview answers are accurate and include caveats where needed.
- [ ] Links and relative paths work.
- [ ] No generated `.class` files or local IDE files are included.

## 5. Interview answer quality

A strong model answer should generally contain:

- A direct answer first.
- A clear explanation of the reasoning.
- A small example or analogy when useful.
- Important limitations or misconceptions.
- One or more likely follow-up questions.

Do not teach false certainty. If behaviour depends on the Java specification, API contract, runtime, garbage collector or implementation, say so.

## 6. Suggested commit messages

- `docs: improve Java fundamentals explanation`
- `feat: add examples for method overloading`
- `test: verify fundamentals examples on JDK 21`
- `fix: correct loop example output`
- `docs: add HashMap interview questions`

Small, focused commits are easier to review and revert.
