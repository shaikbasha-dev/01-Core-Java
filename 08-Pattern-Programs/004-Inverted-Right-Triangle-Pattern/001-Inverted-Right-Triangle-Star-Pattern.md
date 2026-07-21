# Inverted Right Triangle Star Pattern in Java

## Introduction

The Inverted Right Triangle Star Pattern is one of the most fundamental pattern programs in Java. It is the reverse of the Right Triangle Star Pattern, where the number of stars decreases by one in each subsequent row.

This pattern introduces learners to decreasing nested loop execution and helps them understand how modifying loop conditions can produce entirely different shapes while using the same programming concepts.

It is one of the most frequently asked pattern programs in Java interviews and serves as a foundation for learning inverted triangles, mirrored triangles, pyramids, diamonds, and other advanced pattern programs.

---

# Real-World Example

Imagine a stack of blocks where one block is removed from the end of each row.

Example:

- Row 1 → 5 Blocks
- Row 2 → 4 Blocks
- Row 3 → 3 Blocks
- Row 4 → 2 Blocks
- Row 5 → 1 Block

The Inverted Right Triangle Star Pattern follows the same concept.

---

# Pattern Preview

```text
* * * * *
* * * *
* * *
* *
*
```

---

# Problem Statement

Write a Java program to print an Inverted Right Triangle Star Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
* * * * *
* * * *
* * *
* *
*
```

---

# Pattern Observation

- Total Rows = 5.
- The first row contains 5 stars.
- Each subsequent row contains one fewer star than the previous row.
- The last row contains only one star.
- The number of stars printed is equal to the current row count in reverse order.

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Execute the outer loop from the total number of rows down to 1.
3. Execute the inner loop from 1 to the current row value.
4. Print a star followed by a space.
5. Move to the next line.
6. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop from `rows` to `1`.
4. Execute the inner loop from `1` to the current row value.
5. Print `"* "`.
6. Move to the next line.
7. Stop.

---

# Dry Run

```text
Row 5 → * * * * *

Row 4 → * * * *

Row 3 → * * *

Row 2 → * *

Row 1 → *
```

---

# Loop Execution Explanation

## Outer Loop

Controls the total number of rows in decreasing order.

```java
for(int i = rows; i >= 1; i--)
```

## Inner Loop

Controls the number of stars printed in each row.

```java
for(int j = 1; j <= i; j++)
```

Each iteration of the outer loop decreases the number of stars by one.

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
- Incorrect loop boundary conditions.
- Forgetting to decrement the outer loop variable.
- Missing `System.out.println()` after each row.
- Printing an incorrect number of stars.

---

# Interview Questions

1. How does an Inverted Right Triangle differ from a Right Triangle?
2. Why does the outer loop decrement?
3. Which loop controls the rows?
4. Which loop controls the columns?
5. What is the time complexity of this program?

---

# Practice Exercises

- Print the pattern using the `#` symbol.
- Accept the number of rows from the user.
- Print an Inverted Right Triangle using numbers.
- Print an Inverted Right Triangle using alphabets.
- Create a Hollow Inverted Right Triangle.

---

# Summary

The Inverted Right Triangle Star Pattern is one of the easiest decreasing-order pattern programs in Java. It strengthens the understanding of nested loops, reverse iteration, and row-column relationships. Mastering this pattern provides a solid foundation for solving more advanced inverted and pyramid-based pattern problems.
