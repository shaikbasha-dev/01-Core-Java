# Rectangle Star Pattern in Java

## Introduction

The **Rectangle Star Pattern** is one of the most fundamental Java pattern programs that demonstrates how to print a rectangle using nested loops.

Unlike the Square Star Pattern, where the number of rows and columns are the same, a rectangle allows the number of rows and columns to be different. This introduces the concept of controlling rows and columns independently, which is an essential skill for solving advanced pattern programming questions.

Learning this pattern builds a strong foundation for understanding triangles, pyramids, diamonds, butterflies, and many other interview-oriented pattern programs.

---

# Learning Objectives

After completing this program, you will be able to:

- Understand the concept of rectangle patterns.
- Learn how nested loops work independently.
- Print rows and columns with different dimensions.
- Improve logical thinking for pattern programming.
- Build confidence for solving advanced interview questions.

---

# Real-World Example

Imagine a classroom arranged with:

- **4 Rows**
- **6 Columns**

Each row contains exactly six chairs.

```text
* * * * * *
* * * * * *
* * * * * *
* * * * * *
```

Since the number of rows and columns are different, the arrangement forms a rectangle.

Similarly, this Java program prints stars in a rectangular shape.

---

# Problem Statement

Write a Java program to print a rectangle pattern using stars (`*`).

The user should be able to enter the number of rows and columns separately.

---

# Sample Input

```text
Enter the number of rows:
4

Enter the number of columns:
6
```

---

# Sample Output

```text
* * * * * *
* * * * * *
* * * * * *
* * * * * *
```

---

# Pattern Observation

Observe the following:

- Number of Rows = 4
- Number of Columns = 6
- Every row contains six stars.
- Every row follows the same structure.
- Rows and columns are controlled independently.

---

# Visual Representation

```text
Row 1    * * * * * *

Row 2    * * * * * *

Row 3    * * * * * *

Row 4    * * * * * *
```

---

# How to Think Before Writing the Program

Ask yourself:

- How many rows should be printed?
- How many columns should each row contain?
- Does every row print the same number of stars?
- Which loop controls the rows?
- Which loop controls the columns?

Answer:

The **outer loop** controls the rows.

The **inner loop** controls the columns.

---

# Step-by-Step Algorithm

### Step 1

Read the number of rows.

### Step 2

Read the number of columns.

### Step 3

Start the outer loop to print rows.

### Step 4

Inside the outer loop, start the inner loop to print columns.

### Step 5

Print one star during each iteration of the inner loop.

### Step 6

Move to the next line after completing one row.

### Step 7

Repeat until all rows are printed.

---

# Dry Run

Suppose:

```text
Rows = 2

Columns = 4
```

### First Iteration

```text
Row = 1

Column = 1 → *

Column = 2 → *

Column = 3 → *

Column = 4 → *

Output

* * * *
```

---

### Second Iteration

```text
Row = 2

Column = 1 → *

Column = 2 → *

Column = 3 → *

Column = 4 → *

Output

* * * *

* * * *
```

---

# Loop Execution Table

| Outer Loop (Rows) | Inner Loop (Columns) | Printed |
|-------------------|----------------------|----------|
| 1 | 1 to 6 | ****** |
| 2 | 1 to 6 | ****** |
| 3 | 1 to 6 | ****** |
| 4 | 1 to 6 | ****** |

---

# Logic Behind the Program

The program uses **two nested loops**.

The **outer loop** executes once for every row.

The **inner loop** executes once for every column.

Since the number of rows and columns can be different, the output forms a rectangle instead of a square.

---

# Time Complexity

```text
O(rows × columns)
```

---

# Space Complexity

```text
O(1)
```

---

# Common Mistakes

- Using the same value for both rows and columns.
- Forgetting to move to the next line after each row.
- Printing outside the inner loop.
- Confusing the row loop with the column loop.
- Using incorrect loop conditions.

---

# Interview Questions

### Q1. What is the difference between a Square Pattern and a Rectangle Pattern?

A Square Pattern has equal rows and columns, whereas a Rectangle Pattern allows different numbers of rows and columns.

---

### Q2. Which loop controls the rows?

The outer loop.

---

### Q3. Which loop controls the columns?

The inner loop.

---

### Q4. Why are nested loops required?

Because one loop prints rows while the other prints columns.

---

### Q5. What is the time complexity of this program?

**O(rows × columns)**

---

# Practice Exercises

Modify the program to print:

- Rectangle using numbers.
- Rectangle using alphabets.
- Rectangle using binary values.
- Hollow rectangle.
- Rectangle using user-defined symbols.

---

# Summary

The Rectangle Star Pattern extends the concepts learned from the Square Star Pattern by allowing different numbers of rows and columns.

By understanding this program, you will gain confidence in controlling nested loops independently, which is a key skill for solving more advanced Java pattern programming and interview questions.
