# Square Even Number Pattern in Java

## Introduction

The **Square Even Number Pattern** is an excellent beginner-level Java pattern program that demonstrates how to print **even numbers** using nested loops.

In this pattern, every row displays the same sequence of even numbers. The number of rows and columns are equal, forming a perfect square.

This program not only strengthens your understanding of nested loops but also introduces the concept of generating numbers using a fixed increment.

---

# Learning Objectives

After completing this program, you will be able to:

- Understand how nested loops work.
- Print even numbers in a square format.
- Generate even numbers using increment operations.
- Improve logical thinking in pattern programming.
- Build a strong foundation for advanced number patterns.

---

# Real-World Example

Imagine a parking area where only vehicles with **even-numbered parking slots** are allowed.

Each row contains the following parking slot numbers:

```text
2 4 6 8 10
```

Every row repeats the same sequence, creating a square arrangement.

Similarly, this program prints even numbers repeatedly in every row.

---

# Problem Statement

Write a Java program to print a square pattern using even numbers.

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
2 4 6 8 10
2 4 6 8 10
2 4 6 8 10
2 4 6 8 10
2 4 6 8 10
```

---

# Pattern Observation

Notice the following:

- Total Rows = 5
- Total Columns = 5
- Every row prints the same sequence.
- The numbers increase by **2**.
- Only even numbers are printed.

---

# Visual Representation

```text
Row 1    2 4 6 8 10

Row 2    2 4 6 8 10

Row 3    2 4 6 8 10

Row 4    2 4 6 8 10

Row 5    2 4 6 8 10
```

---

# How to Think Before Writing the Program

Ask yourself:

- How many rows should be printed?
- How many numbers should appear in each row?
- Which numbers should be printed?
- How can the next even number be generated?

Answer:

The first even number is **2**.

The next even number is obtained by adding **2**.

```text
2 → 4 → 6 → 8 → 10
```

---

# Step-by-Step Algorithm

### Step 1

Read the size of the square.

### Step 2

Start the outer loop to print rows.

### Step 3

Initialize an even number variable with **2** for each row.

### Step 4

Start the inner loop to print columns.

### Step 5

Print the current even number.

### Step 6

Increase the number by **2**.

### Step 7

Repeat until all columns are printed.

### Step 8

Move to the next row.

---

# Dry Run

Suppose:

```text
Size = 3
```

### First Row

```text
Even Number = 2

Print 2

Increase to 4

Print 4

Increase to 6

Print 6
```

Output

```text
2 4 6
```

---

### Second Row

Again initialize:

```text
Even Number = 2
```

Output

```text
2 4 6

2 4 6
```

---

### Third Row

Output

```text
2 4 6

2 4 6

2 4 6
```

---

# Loop Execution Table

| Row | Numbers Printed |
|-----|-----------------|
| 1 | 2 4 6 8 10 |
| 2 | 2 4 6 8 10 |
| 3 | 2 4 6 8 10 |
| 4 | 2 4 6 8 10 |
| 5 | 2 4 6 8 10 |

---

# Logic Behind the Program

The program uses two nested loops.

The **outer loop** controls the rows.

The **inner loop** prints the even numbers.

A variable starts with **2** and increases by **2** after every print statement.

This produces consecutive even numbers.

---

# Formula Used

The nth even number can also be calculated as:

```text
2 × Column Number
```

Example:

| Column | Even Number |
|---------|-------------|
| 1 | 2 |
| 2 | 4 |
| 3 | 6 |
| 4 | 8 |
| 5 | 10 |

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

- Forgetting to reset the even number for every row.
- Increasing the number by 1 instead of 2.
- Printing outside the inner loop.
- Forgetting to move to the next line.

---

# Interview Questions

### Q1. Why is the even number reset for every row?

To print the same sequence in each row.

---

### Q2. How are even numbers generated?

By starting from **2** and increasing by **2**.

---

### Q3. Can this pattern be printed without an extra variable?

Yes.

Using:

```java
System.out.print((column * 2) + " ");
```

---

### Q4. Which loop prints rows?

The outer loop.

---

### Q5. Which loop prints even numbers?

The inner loop.

---

# Practice Exercises

Modify the program to print:

- Even numbers in reverse order.
- Continuous even numbers.
- Hollow even number square.
- Even numbers in a triangle.
- Even numbers in a pyramid.

---

# Summary

The Square Even Number Pattern demonstrates how nested loops and simple arithmetic can be combined to generate structured number patterns.

By mastering this program, you will gain confidence in generating mathematical sequences and applying them to more advanced pattern programming problems.
