# Inverted Right Triangle Alphabet Pattern in Java

## Introduction

The Inverted Right Triangle Alphabet Pattern is a beginner-friendly Java pattern program that prints uppercase English alphabets in a decreasing triangular structure. Unlike the Right Triangle Alphabet Pattern, where the number of characters increases in each row, this pattern starts with the maximum number of alphabets and decreases by one in every subsequent row.

This pattern helps learners understand reverse nested loop execution, character manipulation, ASCII values, and logical pattern generation. It is widely used in Java programming practice and is a common interview question for evaluating knowledge of loops and character data types.

---

# Real-World Example

Imagine a classroom where students are seated in alphabetical order. At the end of each session, the last student leaves the classroom, reducing the number of students in each row.

Example:

- Row 1 → A B C D E
- Row 2 → A B C D
- Row 3 → A B C
- Row 4 → A B
- Row 5 → A

The Inverted Right Triangle Alphabet Pattern follows this decreasing arrangement.

---

# Pattern Preview

```text
A B C D E
A B C D
A B C
A B
A
```

---

# Problem Statement

Write a Java program to print an Inverted Right Triangle Alphabet Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
A B C D E
A B C D
A B C
A B
A
```

---

# Pattern Observation

- Total Rows = 5.
- The first row contains five alphabets.
- Each subsequent row contains one fewer alphabet.
- Every row starts with **A**.
- The last row contains only **A**.
- Each alphabet is generated using ASCII character values.

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
3. Execute the inner loop from 1 to the current row value.
4. Convert the current value into an uppercase alphabet.
5. Print the alphabet followed by a space.
6. Move to the next line.
7. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop from `rows` to `1`.
4. Execute the inner loop from `1` to the current row value.
5. Convert the current value into an alphabet.
6. Print the alphabet.
7. Move to the next line.
8. Stop.

---

# Dry Run

```text
Row 5 → A B C D E

Row 4 → A B C D

Row 3 → A B C

Row 2 → A B

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

Controls the number of alphabets printed.

```java
for(int j = 1; j <= i; j++)
```

## Alphabet Conversion

```java
char alphabet = (char)(64 + j);
```

Generated sequence:

```text
A
B
C
D
E
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

- Using an increasing outer loop instead of a decreasing one.
- Forgetting to cast the integer value to `char`.
- Using an incorrect ASCII value.
- Printing the loop variable instead of the alphabet.
- Missing `System.out.println()` after each row.

---

# Interview Questions

1. Why is type casting required while printing alphabets?
2. What is the ASCII value of uppercase **A**?
3. Why does the outer loop decrement?
4. Which loop controls the rows and columns?
5. What is the time complexity of this program?

---

# Practice Exercises

- Print lowercase alphabets instead of uppercase.
- Accept the number of rows from the user.
- Print the alphabets in reverse order.
- Create a Hollow Inverted Right Triangle Alphabet Pattern.
- Implement the same pattern using a `while` loop.

---

# Summary

The Inverted Right Triangle Alphabet Pattern is an excellent exercise for understanding reverse iteration, nested loops, character manipulation, and ASCII value conversion. It strengthens logical thinking and prepares learners for more advanced alphabet-based pattern programs frequently asked in Java interviews.
