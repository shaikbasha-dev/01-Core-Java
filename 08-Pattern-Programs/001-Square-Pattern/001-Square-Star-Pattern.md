# Square Star Pattern in Java

## Introduction

The **Square Star Pattern** is one of the simplest and most beginner-friendly pattern programs in Java. It is usually the first pattern introduced when learning **nested loops**, making it an ideal starting point for understanding pattern programming.

This program prints a square where each row contains the same number of stars (`*`), and every row has an equal number of columns. Since the number of rows and columns are the same, the output forms a perfect square.

Mastering this pattern will make it easier to understand more advanced patterns such as rectangles, triangles, pyramids, diamonds, butterflies, and many other interview-oriented pattern programs.

---

# Learning Objectives

After completing this program, you will be able to:

- Understand how nested `for` loops work.
- Differentiate between the outer loop and the inner loop.
- Print data row by row and column by column.
- Develop logical thinking using nested loops.
- Build the foundation required for advanced pattern programming.

---

# Real-World Example

Imagine a classroom where every row contains the same number of chairs.

Example:

- Row 1 → 5 Chairs
- Row 2 → 5 Chairs
- Row 3 → 5 Chairs
- Row 4 → 5 Chairs
- Row 5 → 5 Chairs

Since every row has an equal number of chairs, the classroom arrangement forms a square.

Similarly, this program prints the same number of stars in every row, creating a square-shaped pattern.

Another example is a chessboard, where the number of rows and columns are equal.

---

# Problem Statement

Write a Java program to print a square pattern using stars (`*`).

The number of rows and columns should be equal.

---

# Sample Input

```text
Enter the size of the square:

5
```

---

# Sample Output

```text
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

---

# Pattern Observation

Notice the following:

- Number of rows = 5
- Number of columns = 5
- Every row prints exactly 5 stars.
- Every row follows the same structure.
- Only after printing all columns does the program move to the next row.

---

# Visual Representation

```text
Row 1   * * * * *

Row 2   * * * * *

Row 3   * * * * *

Row 4   * * * * *

Row 5   * * * * *
```

---

# How to Think Before Writing the Program

Before writing the code, ask yourself:

- How many rows should be printed?
- How many columns should each row contain?
- Does every row print the same number of stars?
- Which loop controls rows?
- Which loop controls columns?

Answer:

The outer loop prints rows.

The inner loop prints stars.

---

# Step-by-Step Algorithm

### Step 1

Read the size of the square.

### Step 2

Start the outer loop to print rows.

### Step 3

Inside the outer loop, start another loop to print columns.

### Step 4

Print one star during each iteration of the inner loop.

### Step 5

After printing all columns, move to the next line.

### Step 6

Repeat until all rows are printed.

---

# Dry Run

Suppose:

```text
Size = 3
```

### First Iteration

```text
Row = 1

Column = 1 → *

Column = 2 → *

Column = 3 → *

Output

* * *
```

---

### Second Iteration

```text
Row = 2

Column = 1 → *

Column = 2 → *

Column = 3 → *

Output

* * *
* * *
```

---

### Third Iteration

```text
Row = 3

Column = 1 → *

Column = 2 → *

Column = 3 → *

Output

* * *
* * *
* * *
```

---

# Loop Execution Table

| Outer Loop (Rows) | Inner Loop (Columns) | Printed |
|-------------------|----------------------|----------|
| 1 | 1 to 5 | ***** |
| 2 | 1 to 5 | ***** |
| 3 | 1 to 5 | ***** |
| 4 | 1 to 5 | ***** |
| 5 | 1 to 5 | ***** |

---

# Logic Behind the Program

The program uses **two nested loops**.

The **outer loop** controls the number of rows.

The **inner loop** controls how many stars are printed in each row.

Since both loops run the same number of times, a square is formed.

---

# Time Complexity

```text
O(n²)
```

Reason:

For every row, all columns are printed.

---

# Space Complexity

```text
O(1)
```

Reason:

The program uses only a few variables regardless of the input size.

---

# Common Mistakes

- Using only one loop.
- Forgetting to print a new line after each row.
- Confusing rows with columns.
- Printing inside the wrong loop.
- Using incorrect loop conditions.

---

# Interview Questions

### Q1. Why are nested loops required?

Because one loop prints rows and another loop prints columns.

---

### Q2. Which loop prints rows?

The outer loop.

---

### Q3. Which loop prints stars?

The inner loop.

---

### Q4. What happens if the inner loop runs fewer times?

The square becomes a rectangle or another incomplete shape.

---

### Q5. Which pattern should be learned after this?

Rectangle Pattern.

---

# Practice Exercises

Try modifying the program to print:

- A square using numbers.
- A square using alphabets.
- A square using binary values.
- A hollow square.
- A square using any symbol entered by the user.

---

# Summary

The Square Star Pattern is the foundation of Java pattern programming.

By understanding this program, you will learn how nested loops work together to print data in rows and columns. Once this concept is clear, learning advanced patterns such as triangles, pyramids, diamonds, and butterflies becomes much easier.

Master this program before moving to the next pattern variation.
