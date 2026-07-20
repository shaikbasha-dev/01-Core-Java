# Square Binary Pattern in Java

## Introduction

The **Square Binary Pattern** is a beginner-friendly Java pattern program that prints **binary digits (0 and 1)** in a square format using nested loops.

Unlike star, number, and alphabet patterns, this program works with only two values: **0** and **1**. It introduces an important programming concept called the **modulus (%) operator**, which is commonly used to determine whether a number is even or odd.

This pattern is frequently asked in Java interviews because it combines nested loops, arithmetic operators, and logical thinking.

---

# Learning Objectives

After completing this program, you will be able to:

- Understand binary values.
- Learn how to generate alternating binary digits.
- Use the modulus (%) operator.
- Apply nested loops to print binary patterns.
- Build a foundation for advanced binary pattern problems.

---

# Real-World Example

Imagine a row of LED lights where:

- **1** represents the light is **ON**
- **0** represents the light is **OFF**

Example:

```text
ON OFF ON OFF ON
```

In binary form:

```text
1 0 1 0 1
```

Every row follows the same sequence, creating a square arrangement.

Similarly, this Java program prints alternating binary values in every row.

---

# Problem Statement

Write a Java program to print a square pattern using alternating binary digits (1 and 0).

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
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
```

---

# Pattern Observation

Observe the following:

- Total Rows = 5
- Total Columns = 5
- Every row begins with **1**.
- Values alternate between **1** and **0**.
- Every row prints the same sequence.

---

# Visual Representation

```text
Row 1    1 0 1 0 1

Row 2    1 0 1 0 1

Row 3    1 0 1 0 1

Row 4    1 0 1 0 1

Row 5    1 0 1 0 1
```

---

# Understanding Binary Numbers

Binary numbers consist of only two digits:

```text
0

1
```

These two values are the foundation of digital computers.

Every computer processes information internally using binary values.

---

# Understanding the Modulus (%) Operator

The modulus operator returns the remainder after division.

Examples:

| Expression | Result |
|------------|-------:|
| 1 % 2 | 1 |
| 2 % 2 | 0 |
| 3 % 2 | 1 |
| 4 % 2 | 0 |
| 5 % 2 | 1 |

This makes it easy to generate alternating binary values.

---

# How to Think Before Writing the Program

Ask yourself:

- How many rows should be printed?
- How many columns should each row contain?
- How can alternating values be generated?

Answer:

Check whether the column number is odd or even.

If odd:

```text
Print 1
```

If even:

```text
Print 0
```

---

# Step-by-Step Algorithm

### Step 1

Read the size of the square.

### Step 2

Start the outer loop to print rows.

### Step 3

Start the inner loop to print columns.

### Step 4

Check whether the column number is odd or even.

### Step 5

If odd, print **1**.

### Step 6

Otherwise, print **0**.

### Step 7

Move to the next line after completing one row.

---

# Dry Run

Suppose:

```text
Size = 5
```

### First Row

```text
Column = 1

1 % 2 = 1

Print 1
```

```text
Column = 2

2 % 2 = 0

Print 0
```

```text
Column = 3

3 % 2 = 1

Print 1
```

```text
Column = 4

4 % 2 = 0

Print 0
```

```text
Column = 5

5 % 2 = 1

Print 1
```

Output

```text
1 0 1 0 1
```

The same process repeats for every row.

---

# Loop Execution Table

| Row | Binary Values |
|-----|---------------|
| 1 | 1 0 1 0 1 |
| 2 | 1 0 1 0 1 |
| 3 | 1 0 1 0 1 |
| 4 | 1 0 1 0 1 |
| 5 | 1 0 1 0 1 |

---

# Logic Behind the Program

The program uses two nested loops.

The **outer loop** controls the rows.

The **inner loop** controls the columns.

The modulus operator determines whether the current column is odd or even.

- Odd column → Print **1**
- Even column → Print **0**

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

- Checking the row instead of the column.
- Reversing the values of 1 and 0.
- Forgetting to print a new line.
- Using division (`/`) instead of modulus (`%`).

---

# Interview Questions

### Q1. Why is the modulus operator used?

It helps determine whether a number is odd or even.

---

### Q2. What does `%` return?

The remainder after division.

---

### Q3. Which loop prints rows?

The outer loop.

---

### Q4. Which loop prints binary values?

The inner loop.

---

### Q5. Can this pattern start with 0 instead of 1?

Yes.

Simply reverse the printing logic.

---

# Practice Exercises

Modify the program to print:

- 0 1 0 1 0
- Continuous binary values.
- Binary triangle.
- Binary pyramid.
- Hollow binary square.

---

# Summary

The Square Binary Pattern introduces binary values and demonstrates how the modulus operator can be combined with nested loops to generate alternating patterns.

Understanding this program will strengthen your knowledge of arithmetic operators, logical conditions, and pattern programming, preparing you for more advanced binary-based interview questions.
