# Square Odd Number Pattern in Java

## Introduction

The **Square Odd Number Pattern** is a beginner-friendly Java pattern program that demonstrates how to generate and print **odd numbers** using nested loops.

In this pattern, each row displays the same sequence of odd numbers. Since the number of rows and columns are equal, the output forms a perfect square.

This program helps beginners understand how arithmetic sequences and nested loops work together to create structured number patterns.

---

# Learning Objectives

After completing this program, you will be able to:

- Understand nested loop execution.
- Generate odd numbers using arithmetic operations.
- Print number patterns in a square format.
- Improve logical thinking and programming skills.
- Build a strong foundation for advanced pattern programming.

---

# Real-World Example

Imagine a sports tournament where players wear only **odd-numbered jerseys**.

Each row displays the jersey numbers as follows:

```text
1 3 5 7 9
```

Every row repeats the same sequence, creating a square arrangement.

Similarly, this Java program prints odd numbers repeatedly in every row.

---

# Problem Statement

Write a Java program to print a square pattern using odd numbers.

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
1 3 5 7 9
1 3 5 7 9
1 3 5 7 9
1 3 5 7 9
1 3 5 7 9
```

---

# Pattern Observation

Observe the following:

- Total Rows = 5
- Total Columns = 5
- Every row prints the same sequence.
- The numbers increase by **2**.
- Only odd numbers are printed.

---

# Visual Representation

```text
Row 1    1 3 5 7 9

Row 2    1 3 5 7 9

Row 3    1 3 5 7 9

Row 4    1 3 5 7 9

Row 5    1 3 5 7 9
```

---

# How to Think Before Writing the Program

Ask yourself:

- How many rows should be printed?
- How many numbers should each row contain?
- Which numbers should be printed?
- How can the next odd number be generated?

Answer:

The first odd number is **1**.

The next odd number is obtained by adding **2**.

```text
1 → 3 → 5 → 7 → 9
```

---

# Step-by-Step Algorithm

### Step 1

Read the size of the square.

### Step 2

Start the outer loop to print rows.

### Step 3

Initialize an odd number variable with **1** for every row.

### Step 4

Start the inner loop to print columns.

### Step 5

Print the current odd number.

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
Odd Number = 1

Print 1

Increase to 3

Print 3

Increase to 5

Print 5
```

Output

```text
1 3 5
```

---

### Second Row

Again initialize:

```text
Odd Number = 1
```

Output

```text
1 3 5

1 3 5
```

---

### Third Row

Output

```text
1 3 5

1 3 5

1 3 5
```

---

# Loop Execution Table

| Row | Numbers Printed |
|-----|-----------------|
| 1 | 1 3 5 7 9 |
| 2 | 1 3 5 7 9 |
| 3 | 1 3 5 7 9 |
| 4 | 1 3 5 7 9 |
| 5 | 1 3 5 7 9 |

---

# Logic Behind the Program

The program uses two nested loops.

The **outer loop** controls the rows.

The **inner loop** prints the odd numbers.

A variable starts with **1** and increases by **2** after every print statement.

This generates consecutive odd numbers.

---

# Formula Used

The nth odd number can be calculated as:

```text
(2 × Column Number) - 1
```

Example:

| Column | Odd Number |
|---------|------------|
| 1 | 1 |
| 2 | 3 |
| 3 | 5 |
| 4 | 7 |
| 5 | 9 |

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

- Forgetting to reset the odd number for every row.
- Increasing the number by 1 instead of 2.
- Printing outside the inner loop.
- Forgetting to print a new line after each row.

---

# Interview Questions

### Q1. Why is the odd number reset for every row?

To print the same odd number sequence in every row.

---

### Q2. How are odd numbers generated?

By starting from **1** and increasing by **2** after every iteration.

---

### Q3. Can this program be written without an extra variable?

Yes.

Using:

```java
System.out.print((2 * column - 1) + " ");
```

---

### Q4. Which loop prints rows?

The outer loop.

---

### Q5. Which loop prints odd numbers?

The inner loop.

---

# Practice Exercises

Modify the program to print:

- Odd numbers in reverse order.
- Continuous odd numbers.
- Hollow odd number square.
- Odd number triangle.
- Odd number pyramid.

---

# Summary

The Square Odd Number Pattern demonstrates how arithmetic progression and nested loops work together to generate structured number patterns.

Understanding this program will make it easier to solve more advanced number-based pattern problems and strengthen your Java programming fundamentals.
