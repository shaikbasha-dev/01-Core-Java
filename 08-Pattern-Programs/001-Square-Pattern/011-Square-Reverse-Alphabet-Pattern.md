# Square Reverse Alphabet Pattern in Java

## Introduction

The **Square Reverse Alphabet Pattern** is a character-based Java pattern program that prints uppercase English alphabets in **reverse alphabetical order**.

Unlike the Square Alphabet Pattern, which starts from **A** and moves forward, this pattern starts from the last required alphabet and moves backward in every row.

This program helps learners understand **reverse traversal**, **character decrement operations**, and **nested loops**, which are commonly used in interview-based pattern programming.

---

# Learning Objectives

After completing this program, you will be able to:

- Print alphabets in reverse order.
- Understand character decrement operations.
- Strengthen your knowledge of nested loops.
- Learn reverse traversal techniques.
- Prepare for interview-oriented alphabet pattern questions.

---

# Real-World Example

Imagine students standing in descending order of roll numbers.

Instead of arranging them like:

```text
A B C D E
```

they stand as:

```text
E D C B A
```

Every row follows the same arrangement, forming a square.

Similarly, this Java program prints reverse alphabets repeatedly in every row.

---

# Problem Statement

Write a Java program to print a square pattern using uppercase English alphabets in reverse order.

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
E D C B A
E D C B A
E D C B A
E D C B A
E D C B A
```

---

# Pattern Observation

Observe the following:

- Total Rows = 5
- Total Columns = 5
- Every row starts with **E**.
- Alphabets decrease from left to right.
- Every row prints the same sequence.

---

# Visual Representation

```text
Row 1    E D C B A

Row 2    E D C B A

Row 3    E D C B A

Row 4    E D C B A

Row 5    E D C B A
```

---

# How to Think Before Writing the Program

Ask yourself:

- Which alphabet should be printed first?
- How can we move backwards through the alphabet?
- Which loop controls rows?
- Which loop controls columns?

Answer:

Start from the last required alphabet.

Decrease the character after every print.

```text
E → D → C → B → A
```

---

# Understanding Character Decrement

Java allows characters to be decremented.

Example:

```java
char letter = 'E';

letter--;

System.out.println(letter);
```

Output

```text
D
```

Each decrement moves to the previous alphabet.

---

# Step-by-Step Algorithm

### Step 1

Read the size of the square.

### Step 2

Start the outer loop to print rows.

### Step 3

Initialize the character with the last required alphabet.

### Step 4

Start the inner loop to print columns.

### Step 5

Print the current alphabet.

### Step 6

Decrease the alphabet.

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
Letter = C

Print C

Decrease to B

Print B

Decrease to A

Print A
```

Output

```text
C B A
```

---

### Second Row

Again initialize:

```text
Letter = C
```

Output

```text
C B A

C B A
```

---

### Third Row

Output

```text
C B A

C B A

C B A
```

---

# Loop Execution Table

| Row | Characters Printed |
|-----|--------------------|
| 1 | E D C B A |
| 2 | E D C B A |
| 3 | E D C B A |
| 4 | E D C B A |
| 5 | E D C B A |

---

# Logic Behind the Program

The program uses two nested loops.

The **outer loop** controls the rows.

The **inner loop** prints the reverse alphabets.

The character starts from the last required alphabet and decreases after every print statement until the first alphabet is reached.

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

- Starting from **A** instead of the last alphabet.
- Using increment (`++`) instead of decrement (`--`).
- Forgetting to reset the character for every row.
- Printing outside the inner loop.
- Confusing rows and columns.

---

# Interview Questions

### Q1. What is the difference between the Alphabet Pattern and the Reverse Alphabet Pattern?

The Alphabet Pattern prints characters in ascending order, while the Reverse Alphabet Pattern prints them in descending order.

---

### Q2. How do you move to the previous alphabet?

By using the decrement operator (`--`) on a character variable.

---

### Q3. Which loop prints the rows?

The outer loop.

---

### Q4. Which loop prints the reverse alphabets?

The inner loop.

---

### Q5. What happens if you forget to reset the starting character for each row?

The output will not repeat the correct reverse alphabet sequence in every row.

---

# Practice Exercises

Modify the program to print:

- Reverse lowercase alphabets.
- Continuous reverse alphabets.
- Reverse alphabet triangle.
- Reverse alphabet pyramid.
- Hollow reverse alphabet square.

---

# Summary

The Square Reverse Alphabet Pattern introduces reverse character traversal using nested loops.

By mastering this pattern, you will understand how character decrement operations work in Java and be better prepared to solve advanced alphabet-based pattern problems frequently asked in technical interviews.
