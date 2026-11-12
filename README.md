# Java From Zero to Core

**Understand Java. Think like an engineer. Build software that works.**

A structured, practical Java 21 learning path for complete beginners and aspiring Java developers. Learn the language step by step, understand what happens behind the code, practise problem-solving, and apply your knowledge through progressively more realistic projects.

> **The standard:** Do not memorise code you cannot explain. Understand the problem, predict the behaviour, run the program, inspect the result, debug it, and explain your reasoning.

[![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)](https://dev.java/)
[![Learning path](https://img.shields.io/badge/Path-Zero%20to%20Advanced-blue)](#curriculum)
[![Focus](https://img.shields.io/badge/Focus-Learn%20%7C%20Practise%20%7C%20Build%20%7C%20Interview-success)](#how-to-study)


---

## Start here

New to Java? Follow this sequence:

1. Read [how to study](#how-to-study).
2. Set up [JDK 21](#development-environment).
3. Start **[Module 01 — Java Fundamentals](01-java-fundamentals/README.md)**.
4. Run the examples in [`01-java-fundamentals/examples/`](01-java-fundamentals/examples/).
5. Attempt the exercises in [`01-java-fundamentals/practice/`](01-java-fundamentals/practice/).
6. Test yourself with [Java Fundamentals interview preparation](14-interview-preparation/01-java-fundamentals.md).
7. Record what you learned, what confused you, and what you can now explain independently.

No previous Java experience is required. Basic computer literacy and a willingness to practise are enough.

## What this repository develops

| Ability | What it means in practice |
|---|---|
| **Language fluency** | Read and write Java syntax correctly and idiomatically. |
| **Technical understanding** | Explain execution, object behaviour, memory, APIs and language rules. |
| **Problem-solving** | Break a requirement into steps, choose an approach and analyse complexity. |
| **Engineering judgement** | Write readable, testable, maintainable code and handle failure cases. |
| **Interview communication** | Explain decisions, trace code, discuss trade-offs and respond to follow-up questions. |

Reading every page does not make someone interview-ready. Readiness means being able to solve an unfamiliar problem, explain the approach, discuss edge cases and defend reasonable design choices.

---

## Curriculum

The numbered modules form the main learning path. Supporting tracks reinforce the concepts and turn knowledge into demonstrable work.

| # | Module | Core coverage | Status |
|---|---|---|---|
| 01 | [Java Fundamentals](01-java-fundamentals/README.md) | Setup, execution model, syntax, variables, types, operators, control flow, methods and recursion | **In progress** |
| 02 | [Arrays and Strings](02-arrays-and-strings/README.md) | Arrays, 2D arrays, String, StringBuilder, searching and sorting | Roadmap |
| 03 | [Object-Oriented Programming](03-object-oriented-programming/README.md) | Classes, objects, constructors, encapsulation, inheritance, polymorphism, abstraction and composition | Roadmap |
| 04 | [Exception Handling](04-exception-handling/README.md) | Throwable hierarchy, checked/unchecked exceptions, propagation, custom exceptions and resource handling | Roadmap |
| 05 | [Collections Framework](05-collections-framework/README.md) | List, Set, Queue, Map, iterators, ordering, hashing and implementation trade-offs | Roadmap |
| 06 | [Generics](06-generics/README.md) | Type parameters, generic methods, bounds, wildcards, PECS and type erasure | Roadmap |
| 07 | [Java I/O and Files](07-java-io-and-files/README.md) | Byte/character streams, buffering, paths, NIO.2 and serialization considerations | Roadmap |
| 08 | [Java 8 and Functional Features](08-java-8-features/README.md) | Lambdas, functional interfaces, method references, streams, collectors and Optional | Roadmap |
| 09 | [Multithreading and Concurrency](09-multithreading/README.md) | Thread lifecycle, shared state, visibility, atomicity, locks, executors and concurrent utilities | Roadmap |
| 10 | [JVM and Memory Management](10-jvm-and-memory-management/README.md) | Class loading, runtime areas, object lifecycle, garbage collection, JIT and diagnostics | Roadmap |
| 11 | [Modern Java](11-modern-java/README.md) | Version-labelled Java 9–21 features, records, sealed classes, pattern matching and virtual threads | Roadmap |
| 12 | [Design Principles and Patterns](12-design-patterns/README.md) | SOLID, composition, common patterns, maintainability and trade-offs | Roadmap |

### Supporting tracks

| Track | Purpose | Entry point |
|---|---|---|
| Coding practice | Build implementation fluency and problem-solving habits | [13 — Coding Practice](13-coding-practice/README.md) |
| Interview preparation | Prepare conceptual, code-tracing, debugging and scenario questions | [14 — Interview Preparation](14-interview-preparation/README.md) |
| Mini projects | Apply concepts in progressively larger applications | [15 — Mini Projects](15-mini-projects/README.md) |
| Learning resources | Official specifications, API documentation and trusted references | [Resources](resources/README.md) |

**Status honesty:** "Roadmap" means the module outline exists; it does not mean the lessons are complete. A module should only be marked complete after its explanations, examples, exercises and review material have been written and checked.

---

## How to study

Use the same cycle for every topic:

1. **Frame the problem.** What does this concept help a developer do?
2. **Build the mental model.** Understand the idea before memorising syntax.
3. **Learn the language rules.** Know what Java guarantees and what it does not.
4. **Trace a small example.** Predict the result before running it.
5. **Experiment.** Change inputs, values and conditions. Observe what changes.
6. **Inspect failure.** Read compiler errors, exceptions and incorrect output.
7. **Apply it.** Solve a problem without copying the demonstration.
8. **Explain it aloud.** Teach the idea in plain language, then add technical precision.
9. **Connect it.** Relate the topic to earlier concepts and later applications.
10. **Review it later.** Revisit mistakes and solve a fresh variation.

### Lesson quality standard

Major topics should contain, where relevant:

- Learning objectives and prerequisites
- Plain-language explanation and precise definition
- Motivation: the problem being solved
- Syntax, rules and terminology
- Execution walkthroughs and diagrams
- Internal working (JVM, memory, data structure or API behaviour)
- Runnable examples with expected output
- Edge cases, common bugs and debugging advice
- Practical use cases and design trade-offs
- Exercises with hints and progressive difficulty
- Interview questions, model answers and follow-ups
- Summary, glossary and completion checklist
- References to authoritative documentation

Not every topic needs a JVM deep dive. Depth should be technically relevant, not added as decoration.

## The interviewer's standard

Prepare important concepts at four levels:

| Level | What is being assessed | Example |
|---|---|---|
| Foundation | Accurate definitions and terminology | What is a Java reference variable? |
| Application | Correct use of language features and APIs | When would you choose an ArrayList? |
| Internals | Understanding behaviour and implementation | How does HashMap use hashing and buckets? |
| Engineering judgement | Trade-offs, failure modes and maintainability | What can go wrong if a mutable object is used as a HashMap key? |

Interview practice includes conceptual questions, follow-ups, output prediction, debugging, coding, complexity analysis, scenarios and project walkthroughs.

**Answering rule:** Start with a concise answer, support it with reasoning or an example, state important caveats, and finish with a practical use case when appropriate.

---

## Development environment

| Tool | Recommendation |
|---|---|
| Java | JDK 21 |
| Distribution | A trusted OpenJDK distribution, such as Eclipse Temurin |
| IDE | IntelliJ IDEA |
| Editor alternative | VS Code with Java extensions |
| Version control | Git and GitHub |
| Build tools | Introduced when projects need them |
| Testing | JUnit 5 when the testing module/project introduces it |

Verify the JDK in a new terminal:

```bash
java -version
javac -version
```

Both commands should report a Java 21 installation.

### Compile and run an example

From the directory containing `HelloWorld.java`:

```bash
javac HelloWorld.java
java HelloWorld
```

`javac` compiles source code into class files. The `java` launcher starts the application using the JVM.

Java also supports source-file launching:

```bash
java HelloWorld.java
```

The repository uses explicit compilation in its foundational examples so the source-to-bytecode step is visible.

### Verify all examples

On macOS, Linux or Git Bash on Windows:

```bash
bash scripts/verify-examples.sh
```

The script compiles every example into a temporary directory and compares each program's output with a checked-in expected-output fixture, including `UserInputDemo` with sample input.

---

## Coding standards

- Use Java 21 unless a lesson explicitly identifies another release.
- Use meaningful names and standard Java naming conventions.
- Keep examples small enough to teach one main idea.
- Explain why a non-obvious line exists; do not comment every obvious statement.
- Handle invalid input and boundary cases where the exercise requires it.
- Prefer clear, maintainable code over clever shortcuts.
- Include expected output for deterministic examples.
- Do not commit `.class` files, IDE metadata, secrets or local environment files.
- Do not claim code has been tested unless it has actually been compiled or run.
- Label simplified explanations when they omit implementation details.

## Learning progress

Mark a module complete only when you can explain its concepts, write and modify code, complete its exercises and answer its interview questions.

- [ ] 01 — Java Fundamentals
- [ ] 02 — Arrays and Strings
- [ ] 03 — Object-Oriented Programming
- [ ] 04 — Exception Handling
- [ ] 05 — Collections Framework
- [ ] 06 — Generics
- [ ] 07 — Java I/O and Files
- [ ] 08 — Java 8 and Functional Features
- [ ] 09 — Multithreading and Concurrency
- [ ] 10 — JVM and Memory Management
- [ ] 11 — Modern Java
- [ ] 12 — Design Principles and Patterns
- [ ] 13 — Coding Practice
- [ ] 14 — Interview Preparation
- [ ] 15 — Mini Projects

For day-to-day tracking, use Git commits and checklists inside each module. This README is a roadmap, not a substitute for evidence of learning.

## Repository map

```text
java-from-zero-to-core/
├── .github/
│   ├── ISSUE_TEMPLATE/
│   ├── PULL_REQUEST_TEMPLATE.md
│   └── workflows/
├── scripts/
├── 01-java-fundamentals/
├── 02-arrays-and-strings/
├── 03-object-oriented-programming/
├── 04-exception-handling/
├── 05-collections-framework/
├── 06-generics/
├── 07-java-io-and-files/
├── 08-java-8-features/
├── 09-multithreading/
├── 10-jvm-and-memory-management/
├── 11-modern-java/
├── 12-design-patterns/
├── 13-coding-practice/
├── 14-interview-preparation/
├── 15-mini-projects/
├── resources/
├── .editorconfig
├── .gitattributes
├── .gitignore
├── CONTRIBUTING.md
└── README.md
```

## Official learning resources

- [Dev.java — Learn Java](https://dev.java/learn/)
- [Java SE 21 Documentation](https://docs.oracle.com/en/java/javase/21/)
- [Java Language Specification, Java SE 21](https://docs.oracle.com/javase/specs/jls/se21/html/index.html)
- [JDK 21 API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/)
- [OpenJDK](https://openjdk.org/)
- [Eclipse Temurin](https://adoptium.net/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)

Use the language specification for precise language rules and API documentation for library contracts. Tutorials are useful for learning, but official documentation is the reference when behaviour needs verification.

## Maintainer release checklist

Before calling a public release complete, review [`RELEASE_CHECKLIST.md`](RELEASE_CHECKLIST.md). It separates checks completed in this package from the actions that must be performed on the live GitHub repository.

## Contributing and feedback

Corrections, clearer explanations, additional examples and well-designed exercises are welcome. Read [CONTRIBUTING.md](CONTRIBUTING.md) before proposing changes.

When reporting an issue, include the module, topic, Java version, steps to reproduce and the observed versus expected behaviour.


---

> **Learn it clearly. Test it honestly. Explain it simply. Apply it thoughtfully.**

**Understand the code—not just the syntax.**
