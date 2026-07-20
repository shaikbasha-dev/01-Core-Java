# Rectangle Even Number Pattern in Java

## Introduction

The **Rectangle Even Number Pattern** is a beginner-friendly Java pattern program that demonstrates how to print **even numbers** inside a rectangular shape using nested loops.

Unlike the Rectangle Number Pattern, which prints the same number repeatedly, this pattern prints **consecutive even numbers** in every row. It introduces arithmetic progression along with nested loops, making it an excellent exercise for improving logical thinking.

This pattern is commonly used to strengthen understanding of loops, variables, and number generation.

---

# Learning Objectives

After completing this program, you will be able to:

- Print even numbers in a rectangle.
- Understand arithmetic progression.
- Generate even numbers using increment operations.
- Apply nested loops effectively.
- Improve logical thinking for interview-based pattern problems.

---

# Real-World Example

Imagine a parking area where only vehicles with **even-numbered parking slots** are allowed.

Each row contains the following parking slot numbers:

```text
2 4 6 8 10 12
```

Every row repeats the same sequence, creating a rectangular arrangement.

Similarly, this Java program prints consecutive even numbers inside a rectangle.

---

# Problem Statement

Write a Java program to print a rectangle using even numbers.

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
2 4 6 8 10 12
2 4 6 8 10 12
2 4 6 8 10 12
2 4 6 8 10 12
```

---

# Pattern Observation

Observe the following:

- Rows = 4
- Columns = 6
- Every row starts with **2**.
- The numbers increase by **2**.
- Every row prints the same even number sequence.

---

# Visual Representation

```text
Row 1    2 4 6 8 10 12

Row 2    2 4 6 8 10 12

Row 3    2 4 6 8 10 12

Row 4    2 4 6 8 10 12
```

---

# How to Think Before Writing the Program

Ask yourself:

- How many rows should be printed?
- How many columns should each row contain?
- Which number should be printed first?
- How can the next even number be generated?

Answer:

Start with **2**.

Increase the number by **2** after every print.

```text
2 → 4 → 6 → 8 → 10 → 12
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

Initialize an even number variable with **2**.

### Step 5

Start the inner loop to print columns.

### Step 6

Print the current even number.

### Step 7

Increase the number by **2**.

### Step 8

Move to the next line after completing one row.

---

# Dry Run

Suppose:

```text
Rows = 2

Columns = 4
```

### First Row

```text
Even Number = 2

Print 2

Increase to 4

Print 4

Increase to 6

Print 6

Increase to 8

Print 8
```

Output

```text
2 4 6 8
```

---

### Second Row

Again initialize:

```text
Even Number = 2
```

Output

```text
2 4 6 8

2 4 6 8
```

---

# Loop Execution Table

| Row | Numbers Printed |
|-----|-----------------|
| 1 | 2 4 6 8 10 12 |
| 2 | 2 4 6 8 10 12 |
| 3 | 2 4 6 8 10 12 |
| 4 | 2 4 6 8 10 12 |

---

# Logic Behind the Program

The program uses two nested loops.

The **outer loop** controls the rows.

The **inner loop** prints the even numbers.

A variable starts with **2** and increases by **2** after every print statement.

This generates consecutive even numbers for every row.

---

# Formula Used

The nth even number can also be calculated as:

```text
2 × Column Number
```

Example:

| Column | Even Number |
|---------|------------:|
| 1 | 2 |
| 2 | 4 |
| 3 | 6 |
| 4 | 8 |
| 5 | 10 |
| 6 | 12 |

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

- Forgetting to reset the even number for each row.
- Increasing by 1 instead of 2.
- Printing outside the inner loop.
- Forgetting to move to the next line after each row.

---

# Interview Questions

### Q1. Why is the even number reset for every row?

To print the same sequence of even numbers in every row.

---

### Q2. How are even numbers generated?

By starting from **2** and increasing by **2**.

---

### Q3. Can this program be written without an extra variable?

Yes.

Using:

```java
System.out.print((column * 2) + " ");
```

---

### Q4. Which loop controls the rows?

The outer loop.

---

### Q5. Which loop prints the even numbers?

The inner loop.

---

# Practice Exercises

Modify the program to print:

- Even numbers in reverse order.
- Continuous even numbers.
- Even number rectangle starting from 20.
- Hollow even number rectangle.
- Even number pyramid.

---

# Summary

The Rectangle Even Number Pattern demonstrates how nested loops and arithmetic progression work together to generate structured mathematical patterns.

Mastering this program will help you solve many number-based rectangle patterns and prepare you for more advanced Java pattern programming problems.
