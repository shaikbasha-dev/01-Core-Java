# Right Triangle Floyd's Triangle Pattern in Java

## Introduction

Floyd's Triangle is one of the most popular and frequently asked number pattern programs in Java. It prints consecutive natural numbers in the form of a right triangle. Unlike a simple number pattern where each row starts from **1**, Floyd's Triangle maintains a continuous sequence of numbers throughout the pattern.

The pattern was introduced by computer scientist **Robert W. Floyd**, and it is widely used to teach nested loops, variable scope, and logical programming.

---

# Real-World Example

Imagine assigning serial numbers to participants entering an event.

Instead of restarting the numbering for every row, each participant receives the next available serial number.

Example:

- Row 1 → 1
- Row 2 → 2 3
- Row 3 → 4 5 6
- Row 4 → 7 8 9 10
- Row 5 → 11 12 13 14 15

This continuous numbering forms Floyd's Triangle.

---

# Pattern Preview

```text
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

---

# Problem Statement

Write a Java program to print Floyd's Triangle using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

---

# Pattern Observation

- Total Rows = 5.
- Numbers are printed continuously.
- Every number is unique.
- The sequence never restarts.
- The number of values printed in each row is equal to the row number.

---

# Step-by-Step Logic

1. Declare the number of rows.
2. Declare a counter variable and initialize it to **1**.
3. Execute the outer loop for each row.
4. Execute the inner loop according to the current row number.
5. Print the current counter value.
6. Increment the counter.
7. Move to the next row.
8. Repeat until the pattern is completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Initialize `number = 1`.
4. Execute the outer loop.
5. Execute the inner loop.
6. Print `number`.
7. Increment `number`.
8. Print a new line.
9. Stop.

---

# Dry Run

```text
Initial number = 1

Row 1 → 1

Row 2 → 2 3

Row 3 → 4 5 6

Row 4 → 7 8 9 10

Row 5 → 11 12 13 14 15
```

---

# Loop Execution Explanation

## Outer Loop

Controls the rows.

```java
for(int i = 1; i <= rows; i++)
```

## Inner Loop

Controls the columns.

```java
for(int j = 1; j <= i; j++)
```

## Counter Variable

```java
number++
```

The counter increases after every printed value, ensuring a continuous sequence throughout the triangle.

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

- Declaring the counter inside the outer loop.
- Resetting the counter after every row.
- Forgetting to increment the counter.
- Incorrect loop boundaries.
- Confusing Floyd's Triangle with a simple number triangle.

---

# Interview Questions

1. What is Floyd's Triangle?
2. Who introduced Floyd's Triangle?
3. Why is the counter declared outside the loops?
4. Which loop controls the rows?
5. What is the time complexity?

---

# Practice Exercises

- Print Floyd's Triangle using odd numbers.
- Print Floyd's Triangle using even numbers.
- Print Floyd's Triangle in reverse order.
- Accept the number of rows from the user.
- Create an Inverted Floyd's Triangle.

---

# Summary

Floyd's Triangle is one of the most important pattern programs for Java beginners. It strengthens the understanding of nested loops, continuous counting, and variable scope. Because of its simplicity and interview relevance, it is considered an essential program for Java coding practice and technical interview preparation.
