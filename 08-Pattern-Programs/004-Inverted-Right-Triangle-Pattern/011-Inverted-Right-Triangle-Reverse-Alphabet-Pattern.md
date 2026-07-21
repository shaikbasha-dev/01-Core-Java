# Inverted Right Triangle Reverse Alphabet Pattern in Java

## Introduction

The Inverted Right Triangle Reverse Alphabet Pattern is an interesting Java pattern program that prints uppercase English alphabets in reverse order within a decreasing triangular structure. Unlike the standard Alphabet Pattern that begins with **A**, this pattern starts with the highest alphabet in the row and proceeds backward until **A**.

This pattern helps learners understand reverse character manipulation, ASCII value conversion, decreasing nested loop execution, and logical pattern generation. It is a common interview question because it combines loop control with character arithmetic.

---

# Real-World Example

Imagine arranging books on a shelf in reverse alphabetical order. After each round, the last book is removed, reducing the number of books displayed.

Example:

- Row 1 → E D C B A
- Row 2 → D C B A
- Row 3 → C B A
- Row 4 → B A
- Row 5 → A

The Inverted Right Triangle Reverse Alphabet Pattern follows this decreasing reverse arrangement.

---

# Pattern Preview

```text
E D C B A
D C B A
C B A
B A
A
```

---

# Problem Statement

Write a Java program to print an Inverted Right Triangle Reverse Alphabet Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
E D C B A
D C B A
C B A
B A
A
```

---

# Pattern Observation

- Total Rows = 5.
- The first row begins with **E** and ends with **A**.
- Every subsequent row starts with the previous alphabet.
- Each row contains one fewer alphabet than the previous row.
- The last row contains only **A**.
- Characters are generated using ASCII values.

---

# ASCII Value Reference

| Alphabet | ASCII Value |
|-----------|------------:|
| A | 65 |
| B | 66 |
| C | 67 |
| D | 68 |
| E | 69 |

The expression below converts an integer into its corresponding uppercase alphabet.

```java
(char)(64 + j)
```

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Execute the outer loop from the total number of rows down to 1.
3. Execute the inner loop from the current row value down to 1.
4. Convert each value into its corresponding uppercase alphabet.
5. Print the alphabet followed by a space.
6. Move to the next line.
7. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop from `rows` to `1`.
4. Execute the inner loop from the current row value to `1`.
5. Convert the value into an alphabet.
6. Print the alphabet.
7. Move to the next line.
8. Stop.

---

# Dry Run

```text
Row 5 → E D C B A

Row 4 → D C B A

Row 3 → C B A

Row 2 → B A

Row 1 → A
```

---

# Loop Execution Explanation

## Outer Loop

Controls the rows in decreasing order.

```java
for(int i = rows; i >= 1; i--)
```

## Inner Loop

Controls the reverse alphabets printed in each row.

```java
for(int j = i; j >= 1; j--)
```

## Alphabet Conversion

```java
char alphabet = (char)(64 + j);
```

Generated sequence:

```text
E D C B A
D C B A
C B A
B A
A
```

---

# Time Complexity

```text
O(n²)
```

---

# Space Complexity

```text
O(1)
```

---

# Common Mistakes

- Using an increasing inner loop instead of a decreasing one.
- Forgetting to cast the integer to `char`.
- Using incorrect ASCII values.
- Printing numbers instead of alphabets.
- Missing `System.out.println()` after each row.

---

# Interview Questions

1. Why is the inner loop executed in reverse?
2. What is the ASCII value of uppercase **A**?
3. Why is type casting required?
4. Which loop controls the rows?
5. What is the time complexity of this program?

---

# Practice Exercises

- Print lowercase reverse alphabets.
- Accept the number of rows from the user.
- Print the reverse alphabet pattern using a `while` loop.
- Create a Hollow Reverse Alphabet Pattern.
- Print the reverse pattern starting from **Z**.

---

# Summary

The Inverted Right Triangle Reverse Alphabet Pattern is an excellent exercise for understanding reverse iteration, nested loops, character manipulation, and ASCII value conversion. It improves logical thinking and prepares learners for advanced alphabet-based pattern programming and Java technical interviews.
