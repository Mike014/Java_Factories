# Java Factories

A growing collection of reusable Java utility libraries, organized by domain.
Every module is clean, dependency-free, and ready to drop into any Java project.
New libraries and use-case modules are added on a regular basis as the project expands.

---

## Requirements

| Tool  | Version |
|-------|---------|
| Java  | 17+     |
| Maven | 3.8+    |
| JUnit | 5.10    |

---

## Project Structure

```
src/
├── main/java/com/javafactories/
│   ├── primitives/    Type conversion utilities
│   ├── strings/       String manipulation utilities
│   ├── math/          Math and number utilities
│   ├── collections/   Array, List and Matrix utilities
│   ├── geometry/      Geometric shapes hierarchy
│   ├── people/        Person, Student and WorkingStudent hierarchy
│   ├── employees/     Employee, Manager and Director hierarchy
│   └── vehicles/      Vehicle hierarchy
└── test/java/com/javafactories/
    └── ...            JUnit 5 tests mirroring the main structure
```

---

## Build & Test

```bash
mvn test     # run all JUnit 5 tests
mvn package  # build → target/java-factories-1.0.0.jar
```

---

## Roadmap

- `algorithms` — sorting, searching, recursion
- `io` — file reading/writing helpers
- `functional` — higher-order function patterns
- `datastructures` — stacks, queues, linked lists, trees

> New real-world use-case modules will be added progressively as the project grows.


