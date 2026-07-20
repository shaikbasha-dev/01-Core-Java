# Rectangle Number Pattern in Java

## Introduction

The **Rectangle Number Pattern** is one of the basic number-based pattern programs in Java. It demonstrates how to print numbers inside a rectangular shape using **nested loops**.

Unlike the Rectangle Star Pattern, which prints stars (`*`), this program prints numbers. Although the output value changes, the program logic remains exactly the same.

This pattern helps beginners understand that **the shape of a pattern is controlled by loops, while the displayed value is determined by the print statement.**

---

# Learning Objectives

After completing this program, you will be able to:

- Understand rectangle-based number patterns.
- Learn how nested loops work independently.
- Print numbers inside a rectangular layout.
- Understand the relationship between rows and columns.
- Strengthen your Java programming fundamentals.

---

# Real-World Example

Imagine a classroom where every desk is assigned the **same classroom number**.

Example:

```text
1 1 1 1 1 1
1 1 1 1 1 1
1 1 1 1 1 1
1 1 1 1 1 1
```

Every row contains the same number, creating a rectangular arrangement.

Similarly, this Java program prints the number **1** repeatedly in every row.

---

# Problem Statement

Write a Java program to print a rectangle using numbers.

The user should enter the number of rows and columns separately.

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
1 1 1 1 1 1
1 1 1 1 1 1
1 1 1 1 1 1
1 1 1 1 1 1
```

---

# Pattern Observation

Observe the following:

- Rows = 4
- Columns = 6
- Every row contains six numbers.
- Every printed value is **1**.
- Only the printed value differs from the Rectangle Star Pattern.

---

# Visual Representation

```text
Row 1    1 1 1 1 1 1

Row 2    1 1 1 1 1 1

Row 3    1 1 1 1 1 1

Row 4    1 1 1 1 1 1
```

---

# How to Think Before Writing the Program

Ask yourself:

- How many rows should be printed?
- How many columns should each row contain?
- What value should be printed?

Answer:

The loops remain exactly the same.

Only the print statement changes.

```java
System.out.print("* ");
```

becomes

```java
System.out.print("1 ");
```

---

# Step-by-Step Algorithm

### Step 1

Read the number of rows.

### Step 2

Read the number of columns.

### Step 3

Start the outer loop to print rows.

### Step 4

Start the inner loop to print columns.

### Step 5

Print the number **1**.

### Step 6

Move to the next line.

### Step 7

Repeat until all rows are completed.

---

# Dry Run

Suppose:

```text
Rows = 2

Columns = 4
```

### First Row

```text
Print 1

Print 1

Print 1

Print 1
```

Output

```text
1 1 1 1
```

---

### Second Row

```text
Print 1

Print 1

Print 1

Print 1
```

Output

```text
1 1 1 1

1 1 1 1
```

---

# Loop Execution Table

| Outer Loop (Rows) | Inner Loop (Columns) | Printed Value |
|-------------------|----------------------|---------------|
| 1 | 1 to 6 | 1 |
| 2 | 1 to 6 | 1 |
| 3 | 1 to 6 | 1 |
| 4 | 1 to 6 | 1 |

---

# Logic Behind the Program

The program uses two nested loops.

The **outer loop** prints the rows.

The **inner loop** prints the columns.

The only difference from the Rectangle Star Pattern is the value printed inside the inner loop.

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

- Printing outside the inner loop.
- Forgetting to move to the next line.
- Confusing rows with columns.
- Using only one loop.

---

# Interview Questions

### Q1. What is the difference between Rectangle Star Pattern and Rectangle Number Pattern?

Only the printed value changes.

The nested loop structure remains exactly the same.

---

### Q2. Which loop prints rows?

The outer loop.

---

### Q3. Which loop prints columns?

The inner loop.

---

### Q4. Why are nested loops required?

One loop controls rows, while the other controls columns.

---

### Q5. Can another number be printed instead of 1?

Yes.

Simply replace the printed value.

---

# Practice Exercises

Modify the program to print:

- All 5s
- All 9s
- All 0s
- User-defined numbers
- Rectangle using even numbers

---

# Summary

The Rectangle Number Pattern demonstrates that the overall structure of a rectangle depends on nested loops, while the displayed output depends on the print statement.

Understanding this concept makes it easier to solve more advanced number-based rectangle patterns and interview-oriented programming questions.
