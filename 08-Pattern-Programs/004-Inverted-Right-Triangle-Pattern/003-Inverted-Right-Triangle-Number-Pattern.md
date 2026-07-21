# Inverted Right Triangle Number Pattern in Java

## Introduction

The Inverted Right Triangle Number Pattern is a fundamental Java pattern program that prints numbers in a decreasing triangular structure. Unlike the Right Triangle Number Pattern, where the number of values increases in each row, this pattern starts with the maximum number of values and decreases by one in every subsequent row.

This program helps learners understand reverse nested loop execution, decreasing row-column relationships, and logical pattern generation. It is one of the most commonly asked pattern programs in Java interviews and coding assessments.

---

# Real-World Example

Imagine a countdown board where each new row displays one fewer number than the previous row.

Example:

- Row 1 → 1 2 3 4 5
- Row 2 → 1 2 3 4
- Row 3 → 1 2 3
- Row 4 → 1 2
- Row 5 → 1

The Inverted Right Triangle Number Pattern follows this decreasing sequence.

---

# Pattern Preview

```text
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

---

# Problem Statement

Write a Java program to print an Inverted Right Triangle Number Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

---

# Pattern Observation

- Total Rows = 5.
- The first row contains five numbers.
- Each subsequent row contains one fewer number than the previous row.
- Every row starts with **1**.
- The last row contains only one number.

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Execute the outer loop from the total number of rows down to 1.
3. Execute the inner loop from 1 to the current row value.
4. Print the current column number.
5. Move to the next line.
6. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop from `rows` to `1`.
4. Execute the inner loop from `1` to the current row value.
5. Print the column number.
6. Move to the next line.
7. Stop.

---

# Dry Run

```text
Row 5 → 1 2 3 4 5

Row 4 → 1 2 3 4

Row 3 → 1 2 3

Row 2 → 1 2

Row 1 → 1
```

---

# Loop Execution Explanation

## Outer Loop

Controls the total number of rows in decreasing order.

```java
for(int i = rows; i >= 1; i--)
```

## Inner Loop

Controls the number of values printed in each row.

```java
for(int j = 1; j <= i; j++)
```

The inner loop prints numbers starting from **1** up to the current row value.

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
- Printing the row number instead of the column number.
- Incorrect loop boundary conditions.
- Forgetting to decrement the outer loop variable.
- Missing `System.out.println()` after each row.

---

# Interview Questions

1. How does this pattern differ from the Right Triangle Number Pattern?
2. Why does the outer loop decrement?
3. Which loop controls the rows?
4. Which loop controls the columns?
5. What is the time complexity of this program?

---

# Practice Exercises

- Print the pattern in reverse order.
- Accept the number of rows from the user.
- Print an Inverted Right Triangle using even numbers.
- Print an Inverted Right Triangle using odd numbers.
- Create a Hollow Inverted Right Triangle Number Pattern.

---

# Summary

The Inverted Right Triangle Number Pattern is an excellent beginner-friendly program for understanding decreasing nested loops and reverse iteration. It strengthens logical thinking, reinforces row-column relationships, and serves as a stepping stone toward more advanced inverted and pyramid-based pattern programs.
