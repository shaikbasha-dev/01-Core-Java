# Square Number Pattern in Java

## Introduction

The **Square Number Pattern** is one of the fundamental pattern programs in Java that helps beginners understand **nested loops** and the concept of printing numbers in a structured format.

Unlike the Square Star Pattern, this program prints numbers instead of stars. Although the printed value changes, the overall program logic remains the same. This demonstrates an important concept in pattern programming: **the shape is determined by the loops, while the displayed value depends on the print statement.**

Learning this pattern will help you easily solve many number-based interview questions.

---

# Learning Objectives

After completing this program, you will be able to:

- Understand how nested loops print numbers.
- Learn the relationship between rows and columns.
- Understand how changing the print statement changes the pattern.
- Build confidence in solving number-based pattern problems.
- Strengthen your logical thinking skills.

---

# Real-World Example

Imagine a classroom where every student is given the same roll number card for a demonstration.

Example:

Row 1 → 1 1 1 1 1

Row 2 → 1 1 1 1 1

Row 3 → 1 1 1 1 1

Every row displays the same value repeatedly, forming a square arrangement.

Another example is a digital display board that repeatedly shows the same number in a grid layout.

---

# Problem Statement

Write a Java program to print a square pattern using numbers.

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
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
```

---

# Pattern Observation

Observe the following:

- Rows = 5
- Columns = 5
- Every row prints the same number.
- Every column also prints the same number.
- Only the printed value is different from the previous star pattern.

---

# Visual Representation

```text
Row 1   1 1 1 1 1

Row 2   1 1 1 1 1

Row 3   1 1 1 1 1

Row 4   1 1 1 1 1

Row 5   1 1 1 1 1
```

---

# How to Think Before Writing the Program

Ask yourself:

- How many rows should be printed?
- How many columns should each row contain?
- What value should be printed?
- Does the printed value change?

Answer:

The loops remain exactly the same as the Square Star Pattern.

Only the print statement changes from:

```java
System.out.print("* ");
```

to

```java
System.out.print("1 ");
```

---

# Step-by-Step Algorithm

### Step 1

Read the size of the square.

### Step 2

Start the outer loop to print rows.

### Step 3

Inside the outer loop, start another loop to print columns.

### Step 4

Print the number **1**.

### Step 5

Move to the next line.

### Step 6

Repeat until all rows are completed.

---

# Dry Run

Suppose:

```text
Size = 3
```

### First Iteration

```text
Row = 1

Column = 1 → 1

Column = 2 → 1

Column = 3 → 1

Output

1 1 1
```

---

### Second Iteration

```text
Row = 2

Column = 1 → 1

Column = 2 → 1

Column = 3 → 1

Output

1 1 1

1 1 1
```

---

### Third Iteration

```text
Row = 3

Column = 1 → 1

Column = 2 → 1

Column = 3 → 1

Output

1 1 1

1 1 1

1 1 1
```

---

# Loop Execution Table

| Outer Loop (Rows) | Inner Loop (Columns) | Printed Value |
|-------------------|----------------------|---------------|
| 1 | 1 to 5 | 1 |
| 2 | 1 to 5 | 1 |
| 3 | 1 to 5 | 1 |
| 4 | 1 to 5 | 1 |
| 5 | 1 to 5 | 1 |

---

# Logic Behind the Program

The outer loop prints every row.

The inner loop prints every column.

Since both loops execute the same number of times, a square is formed.

The only difference from the previous program is the value printed inside the inner loop.

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

- Forgetting to move to the next line after each row.
- Using only one loop.
- Printing outside the inner loop.
- Confusing rows with columns.

---

# Interview Questions

### Q1. What is the difference between the Square Star Pattern and the Square Number Pattern?

Only the printed value changes.

The nested loop structure remains the same.

---

### Q2. Which loop prints rows?

The outer loop.

---

### Q3. Which loop prints columns?

The inner loop.

---

### Q4. What happens if the inner loop runs fewer times?

The square shape changes into a rectangle or becomes incomplete.

---

### Q5. Can this program print another number instead of 1?

Yes.

Simply replace the printed value.

---

# Practice Exercises

Try modifying the program to print:

- All 5s
- All 9s
- All 0s
- Any number entered by the user
- A square using even numbers

---

# Summary

The Square Number Pattern demonstrates that the overall structure of a pattern is controlled by nested loops, while the displayed output depends entirely on the print statement.

Master this concept before moving on to Even Number Patterns and other advanced number-based pattern programs.
