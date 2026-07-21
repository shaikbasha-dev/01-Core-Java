# Inverted Right Triangle Row Number Pattern in Java

## Introduction

The Inverted Right Triangle Row Number Pattern is a simple yet important Java pattern program that prints the current row number repeatedly in a decreasing triangular structure. Unlike the Inverted Continuous Number Pattern, the numbers do not increase continuously. Instead, every row contains the same number repeated until the row ends.

This pattern helps learners understand nested loops, reverse iteration, row-based logic, and pattern generation using loop variables. It is frequently asked during Java interviews because it strengthens the understanding of row-column relationships.

---

# Real-World Example

Imagine a classroom where each row is assigned a row number. Every student sitting in the same row receives the same row number. As the number of students decreases in each row, the assigned row number remains unchanged.

Example:

- Row 1 → 5 5 5 5 5
- Row 2 → 4 4 4 4
- Row 3 → 3 3 3
- Row 4 → 2 2
- Row 5 → 1

This is exactly how the Inverted Right Triangle Row Number Pattern works.

---

# Pattern Preview

```text
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
```

---

# Problem Statement

Write a Java program to print an Inverted Right Triangle Row Number Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
```

---

# Pattern Observation

- Total Rows = 5.
- The first row contains five **5s**.
- The second row contains four **4s**.
- The third row contains three **3s**.
- The fourth row contains two **2s**.
- The last row contains one **1**.
- Every row prints its own row number repeatedly.

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Execute the outer loop from the total number of rows down to **1**.
3. Execute the inner loop from **1** to the current row value.
4. Print the current row number.
5. Move to the next line.
6. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop from `rows` to `1`.
4. Execute the inner loop from `1` to the current row value.
5. Print the current row number.
6. Move to the next line.
7. Stop.

---

# Dry Run

```text
Row 5 → 5 5 5 5 5

Row 4 → 4 4 4 4

Row 3 → 3 3 3

Row 2 → 2 2

Row 1 → 1
```

---

# Loop Execution Explanation

## Outer Loop

Controls the rows in decreasing order.

```java
for(int i = rows; i >= 1; i--)
```

## Inner Loop

Controls how many numbers are printed in each row.

```java
for(int j = 1; j <= i; j++)
```

## Row Number Logic

```java
System.out.print(i + " ");
```

The value of the outer loop variable (`i`) remains constant throughout one row, so the same number is printed repeatedly.

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

- Printing the inner loop variable (`j`) instead of the row number (`i`).
- Using an increasing outer loop instead of a decreasing one.
- Incorrect loop boundary conditions.
- Forgetting to move to the next line after each row.
- Confusing this pattern with the Continuous Number Pattern.

---

# Interview Questions

1. Why is the outer loop variable printed instead of the inner loop variable?
2. What happens if `j` is printed instead of `i`?
3. Which loop controls the rows?
4. Why does each row contain identical values?
5. What is the time complexity of this program?

---

# Practice Exercises

- Accept the number of rows from the user.
- Print the same pattern using alphabets.
- Print the same pattern using binary values.
- Implement the pattern using a `while` loop.
- Print the row numbers in ascending order.

---

# Summary

The Inverted Right Triangle Row Number Pattern is an excellent beginner-level pattern that demonstrates row-based printing using nested loops. It strengthens understanding of outer loop variables, reverse iteration, and row-column relationships, making it an important exercise for Java programming practice and technical interview preparation.
