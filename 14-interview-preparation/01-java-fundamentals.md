# Java Fundamentals — Interview Preparation

Use these questions after completing [Module 01](../01-java-fundamentals/README.md). Try answering aloud before reading the model answer.

## A. Core concepts

### 1. What is Java?

**Model answer:** Java is a statically typed, class-based, general-purpose programming language. Java source code is compiled into bytecode, which is executed by a Java Virtual Machine (JVM) implementation. The JVM abstracts many operating-system and hardware differences, helping the same bytecode run on different platforms with compatible runtimes.

**Go deeper:** Java is not purely object-oriented because it includes primitive types. Also, platform independence is not absolute: native libraries, operating-system assumptions and external dependencies can affect portability.

**Follow-ups:**
- What is bytecode?
- Is Java compiled or interpreted?
- What role does the JIT compiler play?

### 2. Why is Java called platform-independent?

**Model answer:** The Java compiler generally produces platform-neutral bytecode rather than machine code for one specific operating system. A compatible JVM on each platform loads and executes that bytecode.

**Important qualification:** The application can still depend on platform-specific paths, native libraries, environment variables or external services. The JVM provides portability; it cannot make every application dependency portable automatically.

**Follow-ups:**
- Does the JVM itself differ by platform?
- What is the difference between source code, bytecode and machine code?

### 3. Differentiate JDK, JRE and JVM.

**Model answer:**
- **JVM:** The virtual machine that loads and executes Java class files.
- **JRE:** A runtime concept consisting of a JVM plus the libraries and components needed to run Java applications.
- **JDK:** The development kit, including tools such as `javac`, along with runtime components.

For development, install a JDK. Modern Java distributions do not all provide a separately downloadable JRE package.

**Follow-up:** Which tool compiles `.java` files? `javac`.

### 4. What is bytecode?

**Model answer:** Bytecode is the instruction format stored in Java class files (`.class`). The JVM implementation verifies, loads and executes these instructions. A JVM may interpret bytecode and compile frequently executed code to native machine code using its JIT compiler.

**Follow-ups:**
- What is a class file?
- Is bytecode the same as machine code?
- What does bytecode verification help protect against?

### 5. What happens when you compile and run a Java program?

**Model answer:** In a traditional command-line flow, `javac` compiles source code into class files. When the application is launched, the Java launcher starts a JVM. The JVM loads required classes, verifies and links them as needed, initializes classes, and executes the program. Runtime execution may involve interpretation and JIT compilation.

**Follow-up:** Is every class loaded at application startup? No. Class loading is generally demand-driven.

### 6. Why is the `main` method static?

**Model answer:** The traditional Java application entry point is declared static so the launcher can invoke it without first constructing an instance of the class. `void` indicates it returns no value, and `String[] args` receives command-line arguments.

**Follow-up:** What is the conventional signature?

```java
public static void main(String[] args)
```

Modern Java launch behaviour has evolved, so distinguish the conventional entry point taught here from every form supported by newer launchers.

### 7. Is Java purely object-oriented?

**Model answer:** No. Java supports object-oriented programming, but it also has primitive types such as `int`, `double`, `char` and `boolean`. Primitive values are not objects, although wrapper classes such as `Integer` and `Double` provide object representations.

**Follow-ups:**
- What is autoboxing?
- Why do wrapper classes exist?

## B. Variables, types and operators

### 8. What is the difference between declaration, initialization and assignment?

**Model answer:**
- **Declaration:** Introduces a variable and its type, for example `int count;`.
- **Initialization:** Gives the variable its first value, for example `int count = 10;`.
- **Assignment:** Stores a value in an already declared variable, for example `count = 20;`.

Local variables must be definitely assigned before they are read. Fields receive default values according to their type.

### 9. Primitive types versus reference types?

**Model answer:** A primitive variable stores a value of a primitive type. A reference variable contains either a reference to an object or `null`. The distinction affects assignment, method calls, equality and object behaviour.

**Important:** Do not casually say that every reference variable stores the object itself. The variable holds a reference, not the object's full state.

### 10. What are Java's eight primitive types?

**Model answer:** `byte`, `short`, `int`, `long`, `float`, `double`, `char` and `boolean`.

| Type | Typical width / domain |
|---|---|
| `byte` | 8-bit signed integer |
| `short` | 16-bit signed integer |
| `int` | 32-bit signed integer |
| `long` | 64-bit signed integer |
| `float` | 32-bit IEEE 754 floating-point |
| `double` | 64-bit IEEE 754 floating-point |
| `char` | 16-bit unsigned UTF-16 code unit |
| `boolean` | `true` or `false`; storage representation is not specified as a fixed bit width by the language |

### 11. Widening versus narrowing conversion?

**Model answer:** Widening converts a value to a type that has a broader range or representation in the relevant conversion context, such as `int` to `long`. Narrowing converts to a type that may not represent the original value exactly, such as `double` to `int`, and often requires an explicit cast.

```java
int count = 25;
double wider = count;

double price = 19.87;
int whole = (int) price; // 19
```

**Caveat:** Widening does not always mean exact precision preservation. For example, converting a large `long` to `float` can lose precision.

### 12. What is the difference between `==` and `=`?

**Model answer:** `=` is the assignment operator. `==` is an equality operator. For primitive operands, `==` compares values. For reference operands, it compares whether the references identify the same object (or are both `null`).

For logical object equality, classes commonly provide `.equals()`, whose behaviour depends on the class implementation.

### 13. What is short-circuit evaluation?

**Model answer:** With `&&`, Java evaluates the right operand only if the left operand is true. With `||`, Java evaluates the right operand only if the left operand is false. This can avoid unnecessary work and prevent unsafe evaluation.

```java
if (user != null && user.isActive()) {
    System.out.println("Active user");
}
```

The second condition is not evaluated when `user` is `null`.

### 14. Why does `10 / 3` produce `3`?

**Model answer:** Both operands are integers, so Java performs integer division. The fractional part is discarded toward zero. If floating-point division is required, at least one operand must be floating-point, for example `10.0 / 3`.

### 15. What is integer overflow?

**Model answer:** An integer operation can produce a mathematical result outside the representable range of its type. For ordinary integer arithmetic, Java does not automatically throw an overflow exception; the result follows the type's defined two's-complement arithmetic behaviour.

**Follow-up:** How can you reduce overflow risk? Use appropriate types, validate bounds, use methods such as `Math.addExact` where checked overflow is required, and reason about input constraints.

## C. Control flow and methods

### 16. `while` versus `do-while`?

**Model answer:** A `while` loop checks its condition before executing the body, so the body may run zero times. A `do-while` loop checks after the body, so it executes at least once.

### 17. `break` versus `continue`?

**Model answer:** `break` exits the nearest enclosing loop or switch statement. `continue` skips the remainder of the current loop iteration and proceeds to the next iteration, subject to the loop form.

### 18. What is a method parameter versus an argument?

**Model answer:** A parameter is a variable declared in the method signature. An argument is the value or expression supplied when the method is called.

### 19. What is method overloading?

**Model answer:** Method overloading means declaring methods with the same name but different parameter lists. The compiler selects an applicable overload based on the invocation and overload-resolution rules. Changing only the return type does not create a valid overload.

### 20. Is Java pass-by-value or pass-by-reference?

**Model answer:** Java is always pass-by-value. When a primitive is passed, the primitive value is copied. When an object reference is passed, the reference value is copied. The method can use that copied reference to mutate the same object, but reassigning the parameter does not change the caller's variable.

**Follow-up:** Why can a method mutate an object but cannot replace the caller's reference by reassigning its parameter?

### 21. What is recursion?

**Model answer:** Recursion is when a method calls itself directly or indirectly. A correct recursive solution needs a base case that stops further calls and a recursive step that moves toward that base case. Each call has its own stack frame; excessive recursion can cause `StackOverflowError`.

## D. Output-based questions

Predict the output before running each snippet.

### 22. Integer division

```java
public class Question22 {
    public static void main(String[] args) {
        System.out.println(10 / 3);
        System.out.println(10.0 / 3);
    }
}
```

**Answer:**
```text
3
3.3333333333333335
```

**Why:** The first expression uses integer division. The second uses floating-point division.

### 23. Pre-increment and post-increment

```java
public class Question23 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value++);
        System.out.println(++value);
        System.out.println(value);
    }
}
```

**Answer:**
```text
5
7
7
```

**Why:** Post-increment yields the old value before incrementing. Pre-increment increments before yielding the value.

### 24. Short-circuit evaluation

```java
public class Question24 {
    public static void main(String[] args) {
        int number = 0;
        boolean result = number != 0 && 10 / number > 1;
        System.out.println(result);
    }
}
```

**Answer:**
```text
false
```

**Why:** The left side of `&&` is false, so the division on the right is not evaluated.

## E. Practical coding prompts

Attempt these without copying a solution:

1. Read two integers and print sum, difference, product, quotient and remainder. Handle division by zero.
2. Determine whether a year is a leap year.
3. Find the largest of three numbers without using a library maximum method.
4. Print a multiplication table using a loop.
5. Calculate the sum of the first `n` natural numbers. Discuss possible overflow.
6. Write an `isEven` method.
7. Build a menu-driven calculator using methods and `switch`.
8. Implement factorial iteratively and recursively. Compare the trade-offs.
9. Validate user input and handle invalid numeric input.
10. Write a method that swaps the values of two elements in an array; explain why Java's parameter passing still works for array mutation.

For each problem, explain:
- Assumptions and input constraints
- Approach
- Correctness reasoning
- Time and space complexity where relevant
- Edge cases
- One alternative approach

## F. Interview self-check

Before considering this module interview-ready, you should be able to:

- [ ] Explain source code → bytecode → JVM execution.
- [ ] Differentiate JDK, JRE and JVM accurately.
- [ ] Explain primitive and reference variables.
- [ ] Discuss widening, narrowing and precision loss.
- [ ] Explain `==`, `=`, and `.equals()`.
- [ ] Predict operator and loop behaviour.
- [ ] Explain pass-by-value using an object example.
- [ ] Explain recursion and stack frames.
- [ ] Solve the practical prompts without copying.
- [ ] Handle follow-up questions calmly and accurately.

**Interviewer reminder:** A correct definition is the beginning of an answer, not proof of deep understanding. Be ready to demonstrate the concept with code and reason about a variation you have not seen before.


## G. Follow-up and scenario questions

### 25. A method receives an array and changes one element. Does the caller see the change?

**Model answer:** Yes, if the method mutates the array through the copied reference. Both the caller's reference and the parameter's copied reference identify the same array object. Java still passes the reference by value. Reassigning the parameter itself does not replace the caller's reference.

### 26. Why can a local variable not always be read before it is assigned?

**Model answer:** Java applies definite-assignment rules at compile time. The compiler must be able to establish that a local variable has been assigned before every possible read. This prevents a program from depending on an undefined local-variable value.

### 27. Is `long` always a safer choice than `int`?

**Model answer:** No. `long` has a larger integer range, but it can still overflow. It also does not solve floating-point precision problems. Choose the type based on the domain, constraints and required arithmetic behaviour.

### 28. A program compiles but prints the wrong result. What do you do?

**Model answer:** I reproduce the issue with the smallest input, identify the first point where actual state differs from expected state, trace variable values, check boundary conditions and operator behaviour, and add a regression test for the bug. I avoid changing multiple unrelated lines at once.

### 29. When would you choose a loop instead of recursion?

**Model answer:** Both can express repeated work. A loop is often preferable for straightforward repetition because it avoids consuming a new call frame for each iteration. Recursion can make naturally recursive structures or divide-and-conquer algorithms clearer. The choice depends on clarity, stack depth and the problem's structure.

## H. Mini mock interview

Try answering each question aloud in 60–90 seconds. The interviewer may ask "why?", "show me in code", or "what if the input changes?"

1. Explain how a Java program moves from source code to execution.
2. What is the difference between a primitive variable and a reference variable?
3. Explain why Java is pass-by-value with a small demonstration.
4. What happens when an `int` overflows?
5. Explain short-circuit evaluation and give a practical use case.
6. What makes two methods valid overloads?
7. Explain how a recursive method returns from its deepest call.
8. How would you make a console program handle invalid input robustly?

### Mock interview scoring

Score each response from 0 to 4:

- **0:** No answer or fundamentally incorrect.
- **1:** Memorised definition only.
- **2:** Correct explanation and basic example.
- **3:** Correct reasoning, edge cases and follow-up handling.
- **4:** Clear, precise explanation plus trade-offs and unfamiliar variations.

Use the score to identify what to revise. It is not a guarantee of interview performance.
