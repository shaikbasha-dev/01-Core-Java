# Rectangle Odd Number Pattern in Java

## Introduction

The **Rectangle Odd Number Pattern** is a simple Java pattern program that demonstrates how to print **consecutive odd numbers** inside a rectangular shape using nested loops.

This pattern builds upon the Rectangle Even Number Pattern. Instead of printing even numbers, the program starts from **1** and increases the value by **2** after every print.

Understanding this pattern strengthens your knowledge of nested loops, arithmetic progression, and number generation, which are frequently tested during Java interviews.

---

# Learning Objectives

After completing this program, you will be able to:

- Print odd numbers in a rectangle.
- Understand arithmetic progression using odd numbers.
- Generate odd numbers using increment operations.
- Improve nested loop programming skills.
- Strengthen logical thinking for interview questions.

---

# Real-World Example

Imagine a building where only **odd-numbered rooms** are occupied.

Each floor has the following room numbers:

```text
1 3 5 7 9 11
```

Every floor follows the same arrangement.

Similarly, this Java program prints odd numbers in a rectangular layout.

---

# Problem Statement

Write a Java program to print a rectangle using odd numbers.

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
1 3 5 7 9 11
1 3 5 7 9 11
1 3 5 7 9 11
1 3 5 7 9 11
```

---

# Pattern Observation

Observe the following:

- Rows = 4
- Columns = 6
- Every row starts with **1**.
- The numbers increase by **2**.
- Every row contains the same sequence.

---

# Visual Representation

```text
Row 1    1 3 5 7 9 11

Row 2    1 3 5 7 9 11

Row 3    1 3 5 7 9 11

Row 4    1 3 5 7 9 11
```

---

# How to Think Before Writing the Program

Ask yourself:

- How many rows should be printed?
- How many columns should each row contain?
- Which number should be printed first?
- How can the next odd number be generated?

Answer:

Start with **1**.

Increase the number by **2** after every print.

```text
1 → 3 → 5 → 7 → 9 → 11
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

Initialize an odd number variable with **1**.

### Step 5

Start the inner loop to print columns.

### Step 6

Print the current odd number.

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
Odd Number = 1

Print 1

Increase to 3

Print 3

Increase to 5

Print 5

Increase to 7

Print 7
```

Output

```text
1 3 5 7
```

---

### Second Row

Again initialize:

```text
Odd Number = 1
```

Output

```text
1 3 5 7

1 3 5 7
```

---

# Loop Execution Table

| Row | Numbers Printed |
|------|-----------------|
| 1 | 1 3 5 7 9 11 |
| 2 | 1 3 5 7 9 11 |
| 3 | 1 3 5 7 9 11 |
| 4 | 1 3 5 7 9 11 |

---

# Logic Behind the Program

The program uses two nested loops.

The **outer loop** controls the rows.

The **inner loop** prints the odd numbers.

A variable starts with **1** and increases by **2** after every print statement.

This generates consecutive odd numbers for each row.

---

# Formula Used

The nth odd number can be calculated as:

```text
(2 × Column Number) - 1
```

Example:

| Column | Odd Number |
|---------|-----------:|
| 1 | 1 |
| 2 | 3 |
| 3 | 5 |
| 4 | 7 |
| 5 | 9 |
| 6 | 11 |

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

- Forgetting to reset the odd number for every row.
- Increasing by 1 instead of 2.
- Printing outside the inner loop.
- Forgetting to move to the next line.
- Mixing even and odd number logic.

---

# Interview Questions

### Q1. Why is the odd number reset for every row?

To print the same odd number sequence in every row.

---

### Q2. How are odd numbers generated?

By starting from **1** and increasing by **2** after each print.

---

### Q3. Can this program be written without an extra variable?

Yes.

Example:

```java
System.out.print((2 * column - 1) + " ");
```

---

### Q4. Which loop controls the rows?

The outer loop.

---

### Q5. What is the time complexity?

**O(rows × columns)**

---

# Practice Exercises

Modify the program to print:

- Odd numbers in reverse order.
- Continuous odd numbers.
- Odd numbers starting from 11.
- Hollow odd number rectangle.
- Odd number pyramid.

---

# Summary

The Rectangle Odd Number Pattern demonstrates how arithmetic progression and nested loops work together to generate structured mathematical patterns.

Mastering this pattern improves your understanding of number generation and strengthens your problem-solving skills for Java interviews and advanced pattern programming.
