# Right Triangle Even Number Pattern in Java

## Introduction

The Right Triangle Even Number Pattern is a beginner-friendly Java pattern program that prints only even numbers in the shape of a right triangle. This pattern helps learners understand nested loops, conditional thinking, number sequences, and pattern generation using mathematical logic.

Instead of printing every number, the program displays only even numbers, making it an excellent exercise for learning how to work with number conditions inside nested loops.

---

# Real-World Example

Imagine arranging only even-numbered seats in an auditorium.

Example:

- Row 1 → Seat 2
- Row 2 → Seat 2 4
- Row 3 → Seat 2 4 6
- Row 4 → Seat 2 4 6 8
- Row 5 → Seat 2 4 6 8 10

The Right Triangle Even Number Pattern follows the same concept.

---

# Pattern Preview

```text
2
2 4
2 4 6
2 4 6 8
2 4 6 8 10
```

---

# Problem Statement

Write a Java program to print a Right Triangle Even Number Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
2
2 4
2 4 6
2 4 6 8
2 4 6 8 10
```

---

# Pattern Observation

- Total Rows = 5.
- Every row starts with the number 2.
- Each subsequent number increases by 2.
- The number of even numbers printed in each row is equal to the row number.

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Execute the outer loop for each row.
3. Execute the inner loop from 1 to the current row number.
4. Multiply the column number by 2.
5. Print the calculated even number.
6. Move to the next line after completing each row.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop.
4. Execute the inner loop.
5. Calculate `j × 2`.
6. Print the result.
7. Move to the next line.
8. Repeat until all rows are completed.
9. Stop.

---

# Dry Run

For 5 rows:

- Row 1 → 2
- Row 2 → 2 4
- Row 3 → 2 4 6
- Row 4 → 2 4 6 8
- Row 5 → 2 4 6 8 10

---

# Loop Execution Explanation

## Outer Loop

The outer loop controls the number of rows.

```java
for(int i = 1; i <= rows; i++)
```

## Inner Loop

The inner loop controls the number of even numbers printed in each row.

```java
for(int j = 1; j <= i; j++)
```

The even number is generated using:

```java
j * 2
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

- Printing `j` instead of `j * 2`.
- Incorrect loop limits.
- Forgetting to print a new line after each row.
- Starting the loop from zero.

---

# Interview Questions

1. Why is `j * 2` used?
2. Which loop controls the rows?
3. Which loop controls the columns?
4. Can this program be written using a `while` loop?
5. What is the time complexity?

---

# Practice Exercises

- Print odd numbers instead of even numbers.
- Print the pattern in reverse order.
- Accept the number of rows from the user.
- Print square numbers.
- Print multiples of five.

---

# Summary

The Right Triangle Even Number Pattern introduces learners to generating number sequences using mathematical expressions inside nested loops. It strengthens logical thinking and prepares learners for advanced pattern programming questions frequently asked in Java interviews.
