# 01 — Java Fundamentals

**Level:** Absolute beginner  
**Java baseline:** 21  
**Suggested effort:** 7–10 focused study days (adjust to your pace)

This module establishes the foundation for every later Java topic. You will learn how to set up Java, write and execute programs, reason about values and types, control program flow, and organise logic into methods.

The aim is not to memorise syntax. By the end, you should be able to write small programs independently, explain what each important line does, predict program behaviour, and debug common mistakes.

## Learning outcomes

You should be able to:

- Explain the roles of source code, bytecode, the JDK, JVM and Java launcher.
- Install and verify a JDK 21 development environment.
- Create, compile and run a Java class.
- Use primitive and reference types correctly.
- Explain declaration, initialization, assignment, scope and lifetime.
- Apply conversions and operators while recognising precision and overflow issues.
- Read input, format output and validate simple user input.
- Select suitable conditional and looping structures.
- Write methods with parameters, return values and overloaded signatures.
- Explain Java's pass-by-value semantics.
- Trace simple recursive calls and identify their base cases.
- Solve the practice problems without copying a solution.

## Prerequisites

No Java experience is required. You should be comfortable creating folders and files and opening a terminal. If command-line tools are new to you, take time to practise navigating directories.

## Lesson roadmap

| # | Lesson | Essential questions |
|---|---|---|
| 01 | Introduction to Java | What is Java? What does platform independence mean? |
| 02 | JDK, JRE and JVM | Which tools compile, load and execute Java programs? |
| 03 | Development setup | How do you install and verify JDK 21? |
| 04 | First Java program | What are a class, `main`, statements and bytecode? |
| 05 | Variables and identifiers | What are declaration, initialization, assignment and naming rules? |
| 06 | Primitive and reference types | What are the eight primitive types? What does a reference variable hold? |
| 07 | Scope and lifetime | Where can a variable be accessed, and how long does it remain usable? |
| 08 | Type conversion and casting | What are widening, narrowing and precision loss? |
| 09 | Operators and precedence | How do arithmetic, relational, logical and assignment operators behave? |
| 10 | Input and output | How do `Scanner`, `print`, `println` and formatting work? |
| 11 | Conditional statements | When should you use `if`, `else` or `switch`? |
| 12 | Loops | How do `for`, `while` and `do-while` differ? |
| 13 | Loop control | What do `break` and `continue` change? |
| 14 | Methods | How do parameters, arguments, return types and calls work? |
| 15 | Method overloading | How does Java select between overloaded methods? |
| 16 | Pass-by-value | What exactly is copied when a method receives an argument? |
| 17 | Recursion | How do base cases, recursive steps and stack frames work? |
| 18 | Debugging fundamentals | How do you read compiler errors and trace logic? |
| 19 | Integrated practice | Can you combine the concepts into small programs? |
| 20 | Interview review | Can you explain, apply and defend your understanding? |

## 1. What is Java?

Java is a general-purpose, class-based, statically typed programming language. Java source files are compiled into class files containing bytecode. A compatible Java Virtual Machine (JVM) loads and executes that bytecode.

A useful first mental model is:

```text
Java source (.java)
       |
       | javac
       v
Bytecode (.class)
       |
       | Java launcher starts a JVM
       v
Class loading, verification, linking and initialization
       |
       v
Execution by the JVM
(interpreting and/or JIT compilation)
```

### Why does this help portability?

The compiler targets the JVM instruction set rather than directly targeting one operating system's CPU instruction set. A compatible JVM implementation exists for the target platform.

**Important qualification:** Platform independence is not a promise that every application runs unchanged everywhere. Native libraries, file paths, environment assumptions and external dependencies can still be platform-specific.

Java is not purely object-oriented because it has primitive types such as `int`, `char` and `boolean`.

## 2. JDK, JRE and JVM

| Term | Meaning | Responsibility |
|---|---|---|
| JVM | Java Virtual Machine | Loads and executes bytecode |
| JRE | Java Runtime Environment | Runtime concept: JVM plus runtime libraries and supporting components |
| JDK | Java Development Kit | Development tools, including `javac`, plus runtime components |

For development, install a JDK. A separate JRE download is not provided by every modern Java distribution.

## 3. Install and verify JDK 21

Install JDK 21 from [Eclipse Temurin](https://adoptium.net/) or another trusted OpenJDK distribution.

Open a new terminal:

```bash
java -version
javac -version
```

Both commands should report version 21.

- `java` launches a Java application.
- `javac` compiles Java source code.
- If `javac` is not found, verify that a JDK is installed and its `bin` directory is on `PATH`.

## 4. Your first Java program

File: `examples/HelloWorld.java`

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println("I am starting from zero.");
    }
}
```

Expected output:

```text
Hello, Java!
I am starting from zero.
```

### Read the program carefully

- `public class HelloWorld` declares a class.
- Because the class is public, the source file is named `HelloWorld.java`.
- `main` is the conventional application entry point.
- `public` makes the method accessible to the launcher.
- `static` allows invocation without first creating an instance.
- `void` means the method does not return a value.
- `String[] args` receives command-line arguments.
- `System.out.println()` writes text followed by a line separator.
- Java is case-sensitive: `System` and `system` are different identifiers.

Compile and run from the `examples` directory:

```bash
javac HelloWorld.java
java HelloWorld
```

Compilation creates `HelloWorld.class`, which contains bytecode.

## 5. Variables and identifiers

A variable is a named, typed storage abstraction used by a program to work with a value.

```java
int age;        // declaration
age = 21;       // assignment
int score = 95; // declaration and initialization
score = 98;     // reassignment
```

### Naming rules and conventions

- An identifier cannot be a Java keyword.
- Identifiers are case-sensitive.
- A name cannot begin with a digit.
- Use `lowerCamelCase` for variables and methods.
- Use meaningful names such as `totalPrice`, not cryptic names such as `x1`, unless the context is a short mathematical expression.

## 6. Primitive and reference types

Java has eight primitive types:

| Type | Example | Important detail |
|---|---|---|
| `byte` | `byte count = 10;` | 8-bit signed integer |
| `short` | `short year = 2026;` | 16-bit signed integer |
| `int` | `int age = 21;` | 32-bit signed integer |
| `long` | `long population = 8_000_000_000L;` | 64-bit signed integer |
| `float` | `float price = 12.5F;` | 32-bit floating-point |
| `double` | `double pi = 3.14159;` | 64-bit floating-point |
| `char` | `char letter = 'J';` | 16-bit UTF-16 code unit |
| `boolean` | `boolean active = true;` | `true` or `false` |

`String` is a reference type, not a primitive type. Strings are immutable.

A reference variable holds a reference to an object or `null`; it does not contain the entire object state as a primitive variable does.

File: `examples/VariablesDemo.java`

```java
public class VariablesDemo {
    public static void main(String[] args) {
        int age = 21;
        double heightInMeters = 1.76;
        char grade = 'A';
        boolean learningJava = true;
        String goal = "Become a Java developer";

        System.out.println("Age: " + age);
        System.out.println("Height: " + heightInMeters);
        System.out.println("Grade: " + grade);
        System.out.println("Learning Java: " + learningJava);
        System.out.println("Goal: " + goal);
    }
}
```

Expected output:

```text
Age: 21
Height: 1.76
Grade: A
Learning Java: true
Goal: Become a Java developer
```

## 7. Scope, lifetime and default values

**Scope** describes where a variable can be accessed in source code. **Lifetime** describes how long the variable or its associated storage/value remains relevant during execution.

- Local variables are declared inside methods, constructors or blocks. They must be definitely assigned before use.
- Instance fields belong to an object.
- Static fields belong to a class rather than to an individual instance.
- A block-local variable is accessible only within its declaring block and nested scopes, subject to Java's scope rules.

Fields receive default values when their containing object or class is initialized. Local variables do not receive an automatic default value that can be read.

| Field type | Default value |
|---|---|
| Numeric primitives | Zero (`0`, `0L`, `0.0f`, etc.) |
| `char` | `'\u0000'` |
| `boolean` | `false` |
| Reference type | `null` |

Do not confuse a variable's scope with the memory layout of a JVM. The Java language defines variable behaviour; the JVM specification defines runtime data areas, while implementations choose many low-level details.

## 8. Type conversion and casting

Widening conversions are often implicit. Narrowing conversions may lose information and generally require an explicit cast.

File: `examples/TypeCastingDemo.java`

```java
public class TypeCastingDemo {
    public static void main(String[] args) {
        int wholeNumber = 25;
        double widened = wholeNumber;

        double decimalNumber = 19.87;
        int narrowed = (int) decimalNumber;

        System.out.println("Widened value: " + widened);
        System.out.println("Narrowed value: " + narrowed);
    }
}
```

Expected output:

```text
Widened value: 25.0
Narrowed value: 19
```

The cast from `double` to `int` discards the fractional part; it does not round to the nearest integer.

**Deeper point:** A widening conversion is not always perfectly precise. For example, a large `long` value may lose precision when converted to `float`.

## 9. Operators and precedence

Java includes arithmetic, unary, relational, equality, logical, bitwise, shift, assignment and conditional operators.

File: `examples/OperatorsDemo.java`

```java
public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Integer division: " + (a / b));
        System.out.println("Remainder: " + (a % b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Both positive? " + (a > 0 && b > 0));
        System.out.println("Larger value: " + (a > b ? a : b));
    }
}
```

Expected output:

```text
Addition: 13
Subtraction: 7
Multiplication: 30
Integer division: 3
Remainder: 1
Is a greater than b? true
Both positive? true
Larger value: 10
```

### Short-circuit evaluation

- `&&` does not evaluate the right operand when the left operand is `false`.
- `||` does not evaluate the right operand when the left operand is `true`.

This matters for both performance and correctness:

```java
String name = null;

if (name != null && !name.isBlank()) {
    System.out.println(name);
}
```

The second condition is skipped when `name` is `null`.

### Integer overflow

Ordinary integer arithmetic does not automatically throw an exception when a result exceeds the representable range. The result follows Java's defined integer arithmetic behaviour. Use appropriate types, validate bounds, or use methods such as `Math.addExact` when detecting overflow is required.

## 10. Input and output

File: `examples/UserInputDemo.java`

```java
import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println("Hello, " + name + "!");
            System.out.println("Next year, you will be " + (age + 1) + ".");
        }
    }
}
```

Example run:

```text
Enter your name: Alex
Enter your age: 21
Hello, Alex!
Next year, you will be 22.
```

`Scanner` reads input from `System.in`. When mixing `nextInt()` and `nextLine()`, remember that `nextInt()` does not consume the rest of the line. For robust applications, validate input and handle invalid tokens.

The example uses try-with-resources to close the scanner. Closing a scanner wrapping `System.in` also closes the underlying input stream; this is fine for a standalone program but may be undesirable when multiple components share standard input.

## 11. Conditional statements

File: `examples/ConditionsDemo.java`

```java
public class ConditionsDemo {
    public static void main(String[] args) {
        int marks = 76;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Needs improvement");
        }
    }
}
```

Expected output:

```text
Grade B
```

Conditions are checked from top to bottom. The first true branch runs. Use `switch` when selecting among discrete alternatives; use `if` when conditions involve ranges or more complex boolean expressions.

## 12. Loops

File: `examples/LoopsDemo.java`

```java
public class LoopsDemo {
    public static void main(String[] args) {
        System.out.println("for loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        System.out.println("while loop:");
        int count = 1;
        while (count <= 3) {
            System.out.println(count);
            count++;
        }

        System.out.println("do-while loop:");
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= 3);
    }
}
```

Expected output:

```text
for loop:
1
2
3
while loop:
1
2
3
do-while loop:
1
2
3
```

A `while` loop checks its condition before the body. A `do-while` loop executes its body at least once. A `for` loop groups initialization, condition and update in one header.

## 13. Loop control

- `break` exits the nearest enclosing loop or switch statement.
- `continue` skips the remainder of the current loop iteration and proceeds to the next iteration.
- Labeled `break` and `continue` can affect an enclosing labeled statement; learn these after the basic forms.

Avoid using loop-control statements to hide complicated control flow.

## 14. Methods

A method is a named unit of behaviour. It can accept parameters, perform work and optionally return a value.

File: `examples/MethodsDemo.java`

```java
public class MethodsDemo {
    public static int add(int first, int second) {
        return first + second;
    }

    public static void greet(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    public static void main(String[] args) {
        int result = add(12, 8);
        System.out.println("Sum: " + result);
        greet("Java learner");
    }
}
```

Expected output:

```text
Sum: 20
Welcome, Java learner!
```

`add` accepts two `int` parameters and returns an `int`. `greet` accepts a `String` and returns no value (`void`).

## 15. Method overloading

Method overloading allows multiple methods to share a name while having different parameter lists. The compiler resolves which applicable method to call.

File: `examples/MethodOverloadingDemo.java`

```java
public class MethodOverloadingDemo {
    static int add(int first, int second) {
        return first + second;
    }

    static double add(double first, double second) {
        return first + second;
    }

    static int add(int first, int second, int third) {
        return first + second + third;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2.5, 3.5));
        System.out.println(add(1, 2, 3));
    }
}
```

Expected output:

```text
5
6.0
6
```

Changing only the return type does not create a valid overload. Overload resolution is based on the method name, parameter types and invocation context—not just the return type.

## 16. Java is pass-by-value

Java always passes arguments by value.

- For a primitive, the method receives a copy of the primitive value.
- For an object, the method receives a copy of the reference value.
- The copied reference can still refer to the same object, so the method can mutate that object's state.
- Reassigning the parameter does not reassign the caller's variable.

File: `examples/PassByValueDemo.java`

```java
public class PassByValueDemo {
    static void changeNumber(int number) {
        number = 99;
    }

    static void changeFirstElement(int[] numbers) {
        numbers[0] = 99;
    }

    static void reassignArray(int[] numbers) {
        numbers = new int[] {7, 8, 9};
    }

    public static void main(String[] args) {
        int value = 10;
        changeNumber(value);
        System.out.println(value);

        int[] values = {1, 2, 3};
        changeFirstElement(values);
        System.out.println(values[0]);

        reassignArray(values);
        System.out.println(values[0]);
    }
}
```

Expected output:

```text
10
99
99
```

The array element changes because the copied reference still identifies the same array. Reassigning the local parameter does not change the caller's reference.

## 17. Recursion

Recursion occurs when a method calls itself directly or indirectly.

A correct recursive method needs:

1. A **base case** that stops recursion.
2. A **recursive case** that moves toward the base case.

File: `examples/RecursionDemo.java`

```java
public class RecursionDemo {
    static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        if (number <= 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
```

Expected output:

```text
120
```

Each recursive call has its own method invocation state. Excessive recursion can exhaust the thread's stack and result in `StackOverflowError`. Also consider numeric overflow: `long` cannot represent arbitrarily large factorials.

## 18. Debugging fundamentals

When a program does not behave as expected:

1. Read the first compiler error carefully.
2. Check the filename, class name, braces, semicolons and types.
3. Identify the exact line where behaviour first diverges from expectation.
4. Trace variable values one statement at a time.
5. Reduce the program to the smallest reproducible example.
6. Test boundary inputs, not just the happy path.
7. Do not change several things at once; isolate the cause.

Understand the difference:
- **Compile-time error:** The source cannot be compiled.
- **Runtime exception/error:** The program starts but fails during execution.
- **Logical error:** The program runs but produces an incorrect result.

## 19. Practice tasks

Complete these in `practice/`. Write your own solution before looking for help.

### Easy — syntax and logic

1. Print your name, city and learning goal.
2. Declare one variable of each primitive type and print it.
3. Convert a `double` to an `int`; explain what happens to the fractional part.
4. Check whether a number is positive, negative or zero.
5. Check whether a year is a leap year.
6. Print numbers from 1 to 100.
7. Print the multiplication table of a number.

### Medium — combine concepts

8. Read two numbers and print sum, difference, product, quotient and remainder. Handle division by zero.
9. Find the sum of the first `n` natural numbers. Consider what happens for negative input and large values.
10. Write methods that return the maximum of two and three integers.
11. Write an `isEven` method and test positive, negative and zero values.
12. Build a menu-driven calculator using methods and `switch`.
13. Create overloaded methods to calculate the area of a square, rectangle and circle. Choose clear parameter lists and explain any limitations.

### Challenging — explain your reasoning

14. Implement factorial iteratively and recursively. Compare readability, stack usage and overflow.
15. Write a method that swaps two array elements. Explain why mutating the array works even though Java is pass-by-value.
16. Predict the output of expressions involving pre-increment, post-increment and short-circuit evaluation before running them.
17. Demonstrate integer overflow with a small program and explain how you would detect it.
18. Read invalid numeric input and handle it without crashing. Explain how your input loop terminates.

For each exercise, record:
- Problem understanding
- Approach
- Code
- Sample input/output
- Edge cases
- Time and space complexity when relevant
- What you learned

## 20. Interview preparation

Attempt the questions in [14 — Java Fundamentals Interview Preparation](../14-interview-preparation/01-java-fundamentals.md).

You should be able to explain:
- Java source, bytecode, JVM, JDK and JRE.
- Primitive versus reference types.
- Declaration, initialization, assignment, scope and field defaults.
- Widening, narrowing, precision loss and integer overflow.
- `==`, `=`, `.equals()`, operator precedence and short-circuit evaluation.
- Loop behaviour and method overloading.
- Java's pass-by-value semantics.
- Recursion, base cases and stack frames.

## Completion checklist

- [ ] I can install and verify JDK 21.
- [ ] I can compile and run Java from the terminal.
- [ ] I can explain source code, bytecode, JDK, JRE and JVM.
- [ ] I understand all eight primitive types and reference variables.
- [ ] I can explain scope, field defaults and local-variable definite assignment.
- [ ] I understand widening, narrowing, precision loss and integer overflow.
- [ ] I can use operators, conditions, loops and console input.
- [ ] I can write methods and explain overloading.
- [ ] I can explain pass-by-value using an object example.
- [ ] I can trace a recursive method and identify its base case.
- [ ] I have completed the practice tasks independently.
- [ ] I can answer the interview questions without reading notes.

## Official references

- [Dev.java — Getting Started](https://dev.java/learn/getting-started/)
- [Java 21 Documentation](https://docs.oracle.com/en/java/javase/21/)
- [Java Language Specification, Java SE 21](https://docs.oracle.com/javase/specs/jls/se21/html/index.html)
- [JDK 21 `javac` documentation](https://docs.oracle.com/en/java/javase/21/docs/specs/man/javac.html)
- [JDK 21 `java` launcher documentation](https://docs.oracle.com/en/java/javase/21/docs/specs/man/java.html)
