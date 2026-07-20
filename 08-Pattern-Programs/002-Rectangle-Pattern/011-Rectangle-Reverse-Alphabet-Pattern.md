# Rectangle Reverse Alphabet Pattern in Java

## Introduction

The **Rectangle Reverse Alphabet Pattern** is a character-based Java pattern program that prints **uppercase English alphabets in reverse order** inside a rectangular shape.

Unlike the Rectangle Alphabet Pattern, which prints characters from **A** to **Z**, this pattern starts from a higher alphabet and prints the characters in descending order.

This pattern strengthens your understanding of character manipulation, nested loops, and reverse sequence generation, all of which are important concepts for Java programming and technical interviews.

---

# Learning Objectives

After completing this program, you will be able to:

- Understand reverse character patterns.
- Print alphabets in descending order.
- Learn reverse character manipulation using Java.
- Improve nested loop programming skills.
- Strengthen logical thinking for interview-based pattern questions.

---

# Real-World Example

Imagine a classroom displaying the English alphabets in reverse order on every row.

```text
F E D C B A
F E D C B A
F E D C B A
F E D C B A
```

Each row begins with the last required alphabet and moves backward until **A**.

Similarly, this Java program prints reverse alphabets inside a rectangle.

---

# Problem Statement

Write a Java program to print a rectangle using uppercase English alphabets in reverse order.

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
F E D C B A
F E D C B A
F E D C B A
F E D C B A
```

---

# Pattern Observation

Observe the following:

- Rows = 4
- Columns = 6
- Every row starts with **F**.
- Characters decrease one by one.
- Every row prints the same reverse sequence.

---

# Visual Representation

```text
Row 1    F E D C B A

Row 2    F E D C B A

Row 3    F E D C B A

Row 4    F E D C B A
```

---

# How to Think Before Writing the Program

Ask yourself:

- How many rows should be printed?
- How many columns should each row contain?
- Which alphabet should be printed first?
- How can the previous alphabet be generated?

Answer:

For six columns:

```text
Start from F

F → E → D → C → B → A
```

The starting alphabet depends on the number of columns entered by the user.

---

# Step-by-Step Algorithm

### Step 1

Read the number of rows.

### Step 2

Read the number of columns.

### Step 3

Start the outer loop to print rows.

### Step 4

Initialize the starting alphabet as:

```java
(char)('A' + columns - 1)
```

### Step 5

Start the inner loop to print columns.

### Step 6

Print the current alphabet.

### Step 7

Decrease the alphabet after every print.

### Step 8

Move to the next line after completing one row.

---

# Dry Run

Suppose:

```text
Rows = 2

Columns = 5
```

Starting alphabet:

```text
E
```

### First Row

```text
Print E

Print D

Print C

Print B

Print A
```

Output

```text
E D C B A
```

---

### Second Row

Again initialize:

```text
Alphabet = E
```

Output

```text
E D C B A

E D C B A
```

---

# Loop Execution Table

| Row | Characters Printed |
|------|--------------------|
| 1 | F E D C B A |
| 2 | F E D C B A |
| 3 | F E D C B A |
| 4 | F E D C B A |

---

# Logic Behind the Program

The program uses two nested loops.

The **outer loop** controls the rows.

The **inner loop** prints the reverse alphabets.

For every row, the starting alphabet is calculated based on the number of columns.

After printing each character, the alphabet is decremented using:

```java
alphabet--;
```

This produces the reverse alphabetical sequence.

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

- Forgetting to calculate the starting alphabet.
- Using `alphabet++` instead of `alphabet--`.
- Not resetting the alphabet for every row.
- Printing outside the inner loop.
- Confusing forward and reverse alphabet patterns.

---

# Interview Questions

### Q1. Why is the starting alphabet calculated dynamically?

Because the number of columns can change, so the first alphabet should adjust automatically.

---

### Q2. How is the starting alphabet calculated?

```java
(char)('A' + columns - 1)
```

---

### Q3. How do we move to the previous alphabet?

```java
alphabet--;
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

- Reverse lowercase alphabets.
- Continuous reverse alphabets.
- Hollow reverse alphabet rectangle.
- Reverse alphabet rectangle starting from Z.
- Reverse alphabet pyramid.

---

# Summary

The Rectangle Reverse Alphabet Pattern demonstrates how Java characters can be manipulated in reverse order using nested loops and decrement operations.

Understanding this program strengthens your knowledge of character arithmetic, loop control, and reverse sequence generation, providing a strong foundation for solving advanced character-based pattern programming and Java interview questions.
