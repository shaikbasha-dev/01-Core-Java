# Inverted Right Triangle Even Number Pattern in Java

## Introduction

The Inverted Right Triangle Even Number Pattern is a beginner-friendly Java pattern program that prints even numbers in a decreasing triangular structure. Unlike the Right Triangle Even Number Pattern, where the number of elements increases in each row, this pattern starts with the maximum number of even numbers and decreases by one in every subsequent row.

This program helps learners understand reverse nested loop execution, arithmetic operations, and logical pattern generation. It also strengthens problem-solving skills and is commonly used in Java coding practice and technical interviews.

---

# Real-World Example

Imagine displaying a list of even-numbered seats in an auditorium. As each row is removed, one seat number disappears from the end.

Example:

- Row 1 → 2 4 6 8 10
- Row 2 → 2 4 6 8
- Row 3 → 2 4 6
- Row 4 → 2 4
- Row 5 → 2

The Inverted Right Triangle Even Number Pattern follows this decreasing sequence.

---

# Pattern Preview

```text
2 4 6 8 10
2 4 6 8
2 4 6
2 4
2
```

---

# Problem Statement

Write a Java program to print an Inverted Right Triangle Even Number Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
2 4 6 8 10
2 4 6 8
2 4 6
2 4
2
```

---

# Pattern Observation

- Total Rows = 5.
- The first row contains five even numbers.
- Each subsequent row contains one fewer even number.
- Every row starts with **2**.
- The last row contains only one even number.

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Execute the outer loop from the total number of rows down to 1.
3. Execute the inner loop from 1 to the current row value.
4. Calculate the even number using the formula `j * 2`.
5. Print the calculated even number.
6. Move to the next line.
7. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop from `rows` to `1`.
4. Execute the inner loop from `1` to the current row value.
5. Calculate the even number.
6. Print the even number.
7. Move to the next line.
8. Stop.

---

# Dry Run

```text
Row 5 → 2 4 6 8 10

Row 4 → 2 4 6 8

Row 3 → 2 4 6

Row 2 → 2 4

Row 1 → 2
```

---

# Loop Execution Explanation

## Outer Loop

Controls the rows in decreasing order.

```java
for(int i = rows; i >= 1; i--)
```

## Inner Loop

Controls the number of values printed.

```java
for(int j = 1; j <= i; j++)
```

## Even Number Formula

```java
int evenNumber = j * 2;
```

The formula generates the sequence:

```text
2
4
6
8
10
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

- Using an increasing outer loop.
- Printing `j` instead of the calculated even number.
- Using an incorrect formula for even numbers.
- Forgetting to decrement the outer loop.
- Missing `System.out.println()` after each row.

---

# Interview Questions

1. How are even numbers generated in this pattern?
2. Why does the outer loop decrement?
3. Which loop controls the rows?
4. Which loop controls the columns?
5. What is the time complexity?

---

# Practice Exercises

- Print an Inverted Right Triangle using odd numbers.
- Accept the number of rows from the user.
- Print reverse even numbers.
- Create a Hollow Inverted Right Triangle Even Number Pattern.
- Print the pattern using a `while` loop.

---

# Summary

The Inverted Right Triangle Even Number Pattern helps learners understand reverse iteration, nested loops, arithmetic calculations, and decreasing pattern generation. It is an excellent practice program for improving Java programming logic and preparing for technical interviews.
