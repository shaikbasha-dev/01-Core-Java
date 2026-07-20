# Rectangle Binary Pattern in Java

## Introduction

The **Rectangle Binary Pattern** is a beginner-friendly Java pattern program that demonstrates how to print **binary digits (0 and 1)** inside a rectangular shape using nested loops.

Binary numbers are the foundation of computer systems. Every piece of information processed by a computer is internally represented using only **0** and **1**. This pattern introduces learners to binary concepts while strengthening their understanding of nested loops and logical thinking.

This program is frequently used in Java practice sessions because it combines pattern programming with binary number generation.

---

# Learning Objectives

After completing this program, you will be able to:

- Understand binary pattern programming.
- Learn how binary values are generated.
- Print alternating binary digits using nested loops.
- Improve logical thinking and loop control.
- Build a foundation for advanced binary-based pattern programs.

---

# Real-World Example

Every computer stores data in binary form.

Example:

```text
0 1 0 1 0 1
```

These binary values are processed electronically inside processors and memory.

Similarly, this Java program prints binary digits repeatedly in a rectangular shape.

---

# Problem Statement

Write a Java program to print a rectangle using alternating binary values.

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
0 1 0 1 0 1
0 1 0 1 0 1
0 1 0 1 0 1
0 1 0 1 0 1
```

---

# Pattern Observation

Observe the following:

- Rows = 4
- Columns = 6
- Every row starts with **0**.
- The values alternate between **0** and **1**.
- Every row prints the same binary sequence.

---

# Visual Representation

```text
Row 1    0 1 0 1 0 1

Row 2    0 1 0 1 0 1

Row 3    0 1 0 1 0 1

Row 4    0 1 0 1 0 1
```

---

# How to Think Before Writing the Program

Ask yourself:

- How many rows should be printed?
- How many columns should each row contain?
- How can alternating binary digits be generated?

Answer:

Start with:

```text
0
```

After printing each value, change it to the opposite value.

```text
0 → 1 → 0 → 1 → 0 → 1
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

Initialize a binary variable with **0**.

### Step 5

Start the inner loop to print columns.

### Step 6

Print the current binary value.

### Step 7

Toggle the value.

- If it is **0**, make it **1**.
- If it is **1**, make it **0**.

### Step 8

Move to the next line after completing one row.

---

# Dry Run

Suppose:

```text
Rows = 2

Columns = 5
```

### First Row

```text
Binary = 0

Print 0

Binary = 1

Print 1

Binary = 0

Print 0

Binary = 1

Print 1

Binary = 0

Print 0
```

Output

```text
0 1 0 1 0
```

---

### Second Row

Again initialize:

```text
Binary = 0
```

Output

```text
0 1 0 1 0

0 1 0 1 0
```

---

# Loop Execution Table

| Row | Binary Values Printed |
|------|-----------------------|
| 1 | 0 1 0 1 0 1 |
| 2 | 0 1 0 1 0 1 |
| 3 | 0 1 0 1 0 1 |
| 4 | 0 1 0 1 0 1 |

---

# Logic Behind the Program

The program uses two nested loops.

The **outer loop** controls the rows.

The **inner loop** prints alternating binary digits.

A binary variable starts with **0**. After each print operation, its value is toggled between **0** and **1**.

This process generates an alternating binary sequence for every row.

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

- Forgetting to reset the binary value for every row.
- Printing only 0s or only 1s.
- Forgetting to toggle the value.
- Printing outside the inner loop.
- Missing the line break after each row.

---

# Interview Questions

### Q1. Why is the binary value reset for every row?

To print the same alternating binary sequence in each row.

---

### Q2. How can the binary value be toggled?

Using an if-else statement or:

```java
binary = 1 - binary;
```

---

### Q3. Which loop controls the rows?

The outer loop.

---

### Q4. Which loop prints the binary values?

The inner loop.

---

### Q5. What is the time complexity?

**O(rows × columns)**

---

# Practice Exercises

Modify the program to print:

- Binary values starting with **1**.
- Continuous binary sequence.
- Reverse binary rectangle.
- Hollow binary rectangle.
- Binary pyramid.

---

# Summary

The Rectangle Binary Pattern demonstrates how nested loops and simple logical operations can be combined to generate alternating binary values.

Understanding this pattern improves your knowledge of binary concepts, loop control, and logical programming, making it an excellent exercise for Java beginners and interview preparation.
