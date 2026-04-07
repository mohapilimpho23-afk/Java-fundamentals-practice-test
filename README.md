# Practice Test 

## Overview

This project contains four broken or incomplete Java methods in `Fundamentals.java`.
Your job is to fix or implement them so that all tests in `FundamentalsTest.java` pass.

There are also five comprehension questions — write your answers in `answers.txt`.

---

## Coding questions

| Question | Method | Task |
|----------|--------|------|
| 1 | `isPrime(int n)` | Fix three errors: loop condition, operator, return value |
| 2 | `printMultiples(int n, int limit)` | Fix broken increment and comparison operator |
| 3 | `gradeScore(int score)` | Complete all missing conditions and the final return |
| 4 | `longestWord(String sentence)` | Implement from scratch |

---

## Comprehension questions

Write answers in your own words inside `answers.txt`.

1. Low-level vs high-level languages
2. Version control
3. Build tools and dependency management
4. Arrays vs ArrayLists in Java
5. Two pillars of OOP with Java examples

---

## Running the tests

```bash
mvn test
```

All tests should pass before you submit.

---

## Project structure

```
oop-000-fun/
├── src/
│   ├── main/java/za/co/wethinkcode/
│   │   └── Fundamentals.java        ← edit this
│   └── test/java/za/co/wethinkcode/
│       └── FundamentalsTest.java    ← do not edit
├── answers.txt                      
├── pom.xml
├── .gitignore
└── README.md
```
