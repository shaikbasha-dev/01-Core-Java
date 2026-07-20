# Rectangle Alphabet Pattern in Java

## Introduction

The **Rectangle Alphabet Pattern** is one of the most common character-based pattern programs in Java. Instead of printing stars or numbers, this program prints **uppercase English alphabets** inside a rectangular shape.

This pattern introduces beginners to character data (`char`) in Java while reinforcing the concepts of nested loops. It demonstrates how letters can be generated sequentially using their ASCII/Unicode values.

Learning this pattern provides an excellent foundation for solving advanced alphabet-based pattern questions frequently asked during technical interviews.

---

# Learning Objectives

After completing this program, you will be able to:

- Understand character-based pattern programming.
- Learn how Java stores characters.
- Print alphabets using nested loops.
- Generate characters sequentially.
- Strengthen logical thinking using loops and character variables.

---

# Real-World Example

Imagine a classroom where every row contains the English alphabets displayed in order.

```text
A B C D E F
A B C D E F
A B C D E F
A B C D E F
```

Each row starts from **A** and continues alphabetically until the required number of columns is completed.

Similarly, this Java program prints alphabets inside a rectangle.

---

# Problem Statement

Write a Java program to print a rectangle using uppercase English alphabets.

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
A B C D E F
A B C D E F
A B C D E F
A B C D E F
```

---

# Pattern Observation

Observe the following:

- Rows = 4
- Columns = 6
- Every row starts with **A**.
- The alphabet increases by one character.
- Every row prints the same sequence.

---

# Visual Representation

```text
Row 1    A B C D E F

Row 2    A B C D E F

Row 3    A B C D E F

Row 4    A B C D E F
```

---

# How to Think Before Writing the Program

Ask yourself:

- How many rows should be printed?
- How many columns should each row contain?
- Which alphabet should be printed first?
- How can the next alphabet be generated?

Answer:

Start with:

```text
A
```

Increase the character after every print.

```text
A → B → C → D → E → F
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

Initialize a character variable with **'A'**.

### Step 5

Start the inner loop to print columns.

### Step 6

Print the current alphabet.

### Step 7

Increase the character by one.

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
Alphabet = A

Print A

Alphabet becomes B

Print B

Alphabet becomes C

Print C

Alphabet becomes D

Print D

Alphabet becomes E

Print E
```

Output

```text
A B C D E
```

---

### Second Row

Again initialize:

```text
Alphabet = A
```

Output

```text
A B C D E

A B C D E
```

---

# Loop Execution Table

| Row | Characters Printed |
|------|--------------------|
| 1 | A B C D E F |
| 2 | A B C D E F |
| 3 | A B C D E F |
| 4 | A B C D E F |

---

# Logic Behind the Program

The program uses two nested loops.

The **outer loop** controls the rows.

The **inner loop** prints the alphabets.

A character variable starts with **'A'** and is incremented after every print statement.

Each row begins again from **'A'**, ensuring the same alphabetical sequence is printed in every row.

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

- Forgetting to reset the alphabet to **'A'** for every row.
- Printing outside the inner loop.
- Using an integer instead of a character variable.
- Forgetting to move to the next line.
- Confusing character increment with string concatenation.

---

# Interview Questions

### Q1. Why is the alphabet reset to 'A' for every row?

To print the same alphabetical sequence in every row.

---

### Q2. How does Java generate the next alphabet?

By incrementing the character variable.

Example:

```java
alphabet++;
```

---

### Q3. Can lowercase letters be printed?

Yes.

Initialize the character with:

```java
'a'
```

instead of

```java
'A'
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

- Lowercase alphabets.
- Reverse alphabets.
- Continuous alphabets.
- Hollow alphabet rectangle.
- Alphabet rectangle starting from **M**.

---

# Summary

The Rectangle Alphabet Pattern demonstrates how characters can be generated using nested loops and character variables in Java.

Understanding this program strengthens your knowledge of character manipulation, loop control, and pattern programming, providing a solid foundation for solving advanced alphabet-based interview questions.
