# Square Alphabet Pattern in Java

## Introduction

The **Square Alphabet Pattern** is one of the most popular character-based pattern programs in Java. Instead of printing stars or numbers, this program prints **uppercase alphabets** in a square format.

This pattern introduces the concept of **character data types**, **ASCII (Unicode) values**, and **nested loops**. It also helps beginners understand that characters can be manipulated just like numbers.

Learning this pattern prepares you for solving more advanced alphabet and character-based pattern problems frequently asked during interviews.

---

# Learning Objectives

After completing this program, you will be able to:

- Understand how characters are printed in Java.
- Learn how nested loops generate alphabet patterns.
- Understand character increment operations.
- Learn the relationship between ASCII values and characters.
- Build a strong foundation for advanced alphabet patterns.

---

# Real-World Example

Imagine a classroom where every row displays the first five English alphabets.

```text
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
```

Every row contains the same sequence of letters, creating a square arrangement.

Similarly, this Java program prints alphabets repeatedly in every row.

---

# Problem Statement

Write a Java program to print a square pattern using uppercase English alphabets.

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
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
```

---

# Pattern Observation

Observe the following:

- Number of rows = 5
- Number of columns = 5
- Every row begins with **A**.
- Alphabets increase from left to right.
- Every row prints the same sequence.

---

# Visual Representation

```text
Row 1    A B C D E

Row 2    A B C D E

Row 3    A B C D E

Row 4    A B C D E

Row 5    A B C D E
```

---

# How to Think Before Writing the Program

Ask yourself:

- How many rows should be printed?
- How many columns should each row contain?
- Which alphabet should appear first?
- How do we print the next alphabet?

Answer:

Start with character **'A'**.

Increase the character after every column.

```text
A → B → C → D → E
```

---

# Understanding Characters in Java

Java stores characters using the **Unicode (ASCII-compatible)** character set.

Some uppercase alphabet values are:

| Character | Value |
|-----------|------:|
| A | 65 |
| B | 66 |
| C | 67 |
| D | 68 |
| E | 69 |

When a character variable is incremented, Java automatically moves to the next character.

Example:

```java
char letter = 'A';

letter++;

System.out.println(letter);
```

Output

```text
B
```

---

# Step-by-Step Algorithm

### Step 1

Read the size of the square.

### Step 2

Start the outer loop to print rows.

### Step 3

Initialize a character variable with **'A'** for every row.

### Step 4

Start the inner loop to print columns.

### Step 5

Print the current character.

### Step 6

Increase the character.

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
Letter = A

Print A

Increase to B

Print B

Increase to C

Print C
```

Output

```text
A B C
```

---

### Second Row

Again initialize:

```text
Letter = A
```

Output

```text
A B C

A B C
```

---

### Third Row

Output

```text
A B C

A B C

A B C
```

---

# Loop Execution Table

| Row | Characters Printed |
|-----|--------------------|
| 1 | A B C D E |
| 2 | A B C D E |
| 3 | A B C D E |
| 4 | A B C D E |
| 5 | A B C D E |

---

# Logic Behind the Program

The program uses two nested loops.

The **outer loop** controls the rows.

The **inner loop** prints the alphabets.

A character variable starts with **'A'** and is incremented after every print statement.

This generates consecutive uppercase alphabets.

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

- Forgetting to reset the character to **'A'** for every row.
- Using a string instead of a character.
- Forgetting to increment the character.
- Printing outside the inner loop.
- Confusing rows and columns.

---

# Interview Questions

### Q1. Why is the character reset to 'A' for every row?

To print the same alphabet sequence in every row.

---

### Q2. How does Java print the next alphabet?

By incrementing the character variable.

---

### Q3. What is the data type used?

```java
char
```

---

### Q4. Which loop prints the rows?

The outer loop.

---

### Q5. Which loop prints the alphabets?

The inner loop.

---

# Practice Exercises

Modify the program to print:

- Lowercase alphabets.
- Reverse alphabets.
- Continuous alphabets.
- Alphabet triangle.
- Alphabet pyramid.
- Hollow alphabet square.

---

# Summary

The Square Alphabet Pattern introduces character-based pattern programming in Java.

By understanding how characters can be incremented and printed using nested loops, you will be well prepared for solving more advanced alphabet, character, and interview-oriented pattern programs.
