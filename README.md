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

## Question 1 — isPrime(int n)
This method must return true if n is a prime number, and false otherwise. A prime number is greater than 1 and divisible only by 1 and itself.

The code below contains a broken loop range, a wrong operator, and a broken return statement. Fix all three.

public static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i < n * n; i++) {    // fix the loop condition
        if (n % i =- 0) {                 // fix the operator
            return true;                  // fix the return value
        }
    }
    return false;
}
public static boolean isPrime(int n)
Hint: a number is NOT prime if any divisor evenly divides it.

## Question 2 — printMultiples(int n, int limit)
Fix the method so that it prints all multiples of n from n up to and including limit, each on its own line.

Example: printMultiples(3, 12) should print: 3, 6, 9, 12

The starter version has a broken loop condition, wrong operator, and broken increment.

public static void printMultiples(int n, int limit) {
    for (int i = n; i <= limit; i =+ n) {   // fix the increment operator
        if (i % n = 0) {                       // fix the comparison
            System.out.println(i);
        }
    }
}
public static void printMultiples(int n, int limit)

## Question 3 — gradeScore(int score)
Complete the method so that it returns a letter grade based on the rules below.

You must handle the invalid case, complete the conditions, and fix the return statement at the end.

Condition	Required return value
score < 0 or score > 100	"Invalid"
score >= 75	"Distinction"
score >= 60	"Merit"
score >= 50	"Pass"
anything else	"Fail"

public static String gradeScore(int score) {
    if (          ) {           // fix: check for invalid range
        return "Invalid";
    } else if (   ) {           // fix: distinction condition
        return "Distinction";
    } else if (   ) {           // fix: merit condition
        return "Merit";
    } else if (   ) {           // fix: pass condition
        return "Pass";
    } else {
        return ;                // fix: what goes here?
    }
}

## Question 4 — longestWord(String sentence)
Implement the method so that it returns the longest word in a sentence. If two words are the same length, return the first one encountered. Ignore extra spaces between words.

Input: "The quick brown fox"
Output: "quick" (or "brown" — both length 5, return whichever comes first)

The method signature and a return statement placeholder are provided — the body is yours to write.

public static String longestWord(String sentence) {

    return longestWord;
}
public static String longestWord(String sentence)
Hint: consider sentence.trim().split("\\s+") to handle extra spaces.

---

## Comprehension questions

Write answers in your own words inside `answers.txt`.

1. Low-level vs high-level languages

Scenario: A classmate who programmes only in Java has just heard that some embedded systems and game engines are written in C or assembly language. They cannot understand why anyone would use something "harder" when Java exists.

In your own words, explain the difference between low-level and high-level programming languages. Your explanation should cover what makes a language "low-level" versus "high-level", what is meant by abstraction and why it matters, what the trade-offs are between writing close to the hardware versus writing in a language like Java, and give at least one real-world reason why a developer might deliberately choose a low-level language.

2. Version control

Scenario: A freelancer has been working solo on a website project. They keep copies of their project folder named things like "project_v2_final", "project_v2_final_REAL", and "project_backup_tuesday". They have just broken something and cannot figure out what changed.

Explain version control to this developer. Your explanation should cover what version control actually is and what problem it solves, how Git tracks changes and why that is better than manually copying folders, what the difference is between git add, git commit, and git push, and why even a solo developer benefits from version control.

3. Build tools and dependency management

Scenario: A junior developer has been told to "add JUnit to the project using Maven" but they have no idea what Maven is, why it is needed, or how it is different from just downloading a JAR file manually and adding it to their project.

Explain build tools and dependency management to this developer. Your explanation should cover what a build tool is and what it manages, why downloading and managing JAR files manually becomes a problem on real projects, what Maven specifically does and where it stores dependency information, what commands like mvn compile, mvn test, and mvn package do, and name at least one other build tool used in the Java ecosystem.

4. Arrays vs ArrayLists in Java

Scenario: A fellow student has only used plain arrays in Java. They keep running into situations where they need to add or remove items and cannot understand why their code keeps throwing errors. A senior student tells them to use an ArrayList instead, but they do not understand the difference.

In your own words, explain the difference between an array and an ArrayList in Java. Your explanation should cover how arrays are declared and what their main limitation is, how an ArrayList is declared and what makes it more flexible, what methods like add(), remove(), and size() do, and when you might still choose a plain array over an ArrayList. Include enough Java syntax that your classmate could write both correctly.

5. Two pillars of OOP with Java examples

Scenario: A student has just been introduced to the four pillars of OOP: encapsulation, inheritance, polymorphism, and abstraction. They understand what a class and an object are, but they cannot connect those four terms to anything concrete.

In your own words, explain at least two of the four pillars of OOP. For each one you choose, cover what the concept means, what problem it helps solve in real code, and show a short Java example (even pseudocode-level) that demonstrates it. Your explanation should be grounded enough that this student could identify these concepts when reading someone else's Java code.

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
