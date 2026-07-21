# Right Triangle Star Pattern in Java

## Introduction

The Right Triangle Star Pattern is one of the first pattern programs beginners learn in Java. It demonstrates how nested loops work together to print a triangular arrangement of stars (`*`). This pattern is an excellent exercise for understanding loop execution, row-column relationships, and logical thinking.

It also serves as the foundation for learning more advanced patterns such as pyramids, diamonds, butterflies, and hollow patterns.

---

# Real-World Example

Imagine arranging chairs in a classroom where each new row contains one additional chair than the previous row.

Example:

- Row 1 → 1 Chair
- Row 2 → 2 Chairs
- Row 3 → 3 Chairs
- Row 4 → 4 Chairs
- Row 5 → 5 Chairs

The Right Triangle Star Pattern follows the same principle using stars instead of chairs.

---

# Pattern Preview

```text
*
* *
* * *
* * * *
* * * * *
```

---

# Problem Statement

Write a Java program to print a Right Triangle Star Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
*
* *
* * *
* * * *
* * * * *
```

---

# Pattern Observation

- Total Rows = 5
- Row 1 prints 1 star.
- Row 2 prints 2 stars.
- Row 3 prints 3 stars.
- Row 4 prints 4 stars.
- Row 5 prints 5 stars.
- The number of stars is always equal to the current row number.

---

# Step-by-Step Logic

1. Read the number of rows.
2. Start the outer loop from 1 to the number of rows.
3. For each row, execute the inner loop from 1 to the current row number.
4. Print one star during each iteration of the inner loop.
5. Move to the next line after completing the inner loop.
6. Continue until all rows are printed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop.
4. Execute the inner loop according to the current row.
5. Print stars.
6. Move to the next line.
7. Repeat until all rows are completed.
8. Stop.

---

# Dry Run

For 5 rows:

- Row 1 → Print 1 star
- Row 2 → Print 2 stars
- Row 3 → Print 3 stars
- Row 4 → Print 4 stars
- Row 5 → Print 5 stars

---

# Loop Execution Explanation

## Outer Loop

Controls the number of rows.

```java
for(int i = 1; i <= rows; i++)
```

## Inner Loop

Controls the number of stars printed in each row.

```java
for(int j = 1; j <= i; j++)
```

Since the inner loop depends on the outer loop variable (`i`), each row prints one more star than the previous row.

---

# Source Code Walkthrough

- Declare the number of rows.
- The outer loop controls rows.
- The inner loop controls columns.
- Print `"* "` during each iteration.
- Use `System.out.println();` after every row.

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

- Forgetting to use nested loops.
- Using incorrect loop conditions.
- Printing `println()` inside the inner loop.
- Incorrect row or column limits.
- Forgetting the space after each star.

---

# Interview Questions

1. Why are nested loops required for pattern programs?
2. Which loop controls rows?
3. Which loop controls columns?
4. What happens if the inner loop runs from `1` to `rows`?
5. What is the time complexity of this pattern?

---

# Practice Exercises

- Print the pattern using user input.
- Print the pattern using a `while` loop.
- Print the same pattern using numbers.
- Convert it into an alphabet pattern.
- Reverse the triangle.

---

# Summary

The Right Triangle Star Pattern is one of the simplest and most important Java pattern programs. It strengthens the understanding of nested loops, logical thinking, and row-column relationships. Mastering this pattern makes it easier to solve advanced pattern programming questions commonly asked in interviews and coding assessments.
