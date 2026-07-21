# Right Triangle Odd Number Pattern in Java

## Introduction

The Right Triangle Odd Number Pattern is a simple yet effective Java pattern program that prints only odd numbers in the shape of a right triangle. This pattern helps learners understand nested loops, mathematical expressions, and number sequence generation using logical programming techniques.

Unlike the Even Number Pattern, this program generates odd numbers by applying a mathematical formula inside the inner loop, making it an excellent exercise for improving logical thinking and problem-solving skills.

---

# Real-World Example

Imagine a classroom where only students with odd roll numbers are seated in each row.

Example:

- Row 1 → Roll Number 1
- Row 2 → Roll Numbers 1 3
- Row 3 → Roll Numbers 1 3 5
- Row 4 → Roll Numbers 1 3 5 7
- Row 5 → Roll Numbers 1 3 5 7 9

The Right Triangle Odd Number Pattern follows the same principle.

---

# Pattern Preview

```text
1
1 3
1 3 5
1 3 5 7
1 3 5 7 9
```

---

# Problem Statement

Write a Java program to print a Right Triangle Odd Number Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
1
1 3
1 3 5
1 3 5 7
1 3 5 7 9
```

---

# Pattern Observation

- Total Rows = 5.
- Every row starts with the number **1**.
- Every next number increases by **2**.
- The number of odd numbers printed in each row is equal to the current row number.
- Odd numbers are generated using the formula:

```text
(2 × Column Number) − 1
```

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Execute the outer loop for each row.
3. Execute the inner loop from 1 to the current row number.
4. Calculate the odd number using the formula `(2 × j) − 1`.
5. Print the calculated odd number.
6. Move to the next line.
7. Repeat until all rows are printed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop.
4. Execute the inner loop.
5. Calculate `(2 × j) − 1`.
6. Print the odd number.
7. Print a new line.
8. Repeat until all rows are completed.
9. Stop.

---

# Dry Run

For 5 rows:

- Row 1 → 1
- Row 2 → 1 3
- Row 3 → 1 3 5
- Row 4 → 1 3 5 7
- Row 5 → 1 3 5 7 9

---

# Loop Execution Explanation

## Outer Loop

The outer loop controls the total number of rows.

```java
for(int i = 1; i <= rows; i++)
```

## Inner Loop

The inner loop controls the number of odd numbers printed in each row.

```java
for(int j = 1; j <= i; j++)
```

The odd number is generated using:

```java
(2 * j) - 1
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

- Printing `j` instead of `(2 * j) - 1`.
- Using `j * 2`, which generates even numbers.
- Incorrect loop conditions.
- Forgetting to print a new line after each row.
- Starting the inner loop from zero.

---

# Interview Questions

1. Why is `(2 * j) - 1` used?
2. Can this pattern be generated without multiplication?
3. Which loop controls the rows?
4. Which loop controls the columns?
5. What is the time complexity of this program?

---

# Practice Exercises

- Print odd numbers in reverse order.
- Print odd numbers using a `while` loop.
- Accept the number of rows from the user.
- Print multiples of three.
- Convert the pattern into an alphabet pattern.

---

# Summary

The Right Triangle Odd Number Pattern strengthens the understanding of nested loops and mathematical expressions by generating odd numbers in a structured triangular format. Mastering this pattern helps learners build confidence before solving more advanced Java pattern programming questions and technical interview problems.
