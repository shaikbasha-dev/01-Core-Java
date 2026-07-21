# Inverted Right Triangle Repeated Alphabet Pattern in Java

## Introduction

The Inverted Right Triangle Repeated Alphabet Pattern is a beginner-friendly Java pattern program that prints the same uppercase alphabet repeatedly in each row while the number of characters decreases from top to bottom. Unlike the standard Alphabet Pattern, where alphabets change within a row, this pattern repeats a single alphabet throughout an entire row.

This pattern helps learners understand nested loops, character manipulation, ASCII value conversion, reverse iteration, and row-based pattern generation. It is commonly used in Java programming practice and technical interviews to strengthen logical thinking and loop concepts.

---

# Real-World Example

Imagine a classroom where each row is assigned a section name represented by an alphabet. Every student sitting in the same row belongs to the same section. As the number of students decreases in each row, the section name remains unchanged.

Example:

- Row 1 → E E E E E
- Row 2 → D D D D
- Row 3 → C C C
- Row 4 → B B
- Row 5 → A

The Inverted Right Triangle Repeated Alphabet Pattern follows this decreasing arrangement.

---

# Pattern Preview

```text
E E E E E
D D D D
C C C
B B
A
```

---

# Problem Statement

Write a Java program to print an Inverted Right Triangle Repeated Alphabet Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
E E E E E
D D D D
C C C
B B
A
```

---

# Pattern Observation

- Total Rows = 5.
- The first row contains five **E** characters.
- The second row contains four **D** characters.
- The third row contains three **C** characters.
- The fourth row contains two **B** characters.
- The last row contains one **A** character.
- Every row prints the same alphabet repeatedly.
- The alphabet changes only after moving to the next row.

---

# ASCII Value Reference

| Alphabet | ASCII Value |
|-----------|------------:|
| A | 65 |
| B | 66 |
| C | 67 |
| D | 68 |
| E | 69 |

The expression below converts the current row value into its corresponding uppercase alphabet.

```java
(char)(64 + i)
```

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Execute the outer loop from the total number of rows down to **1**.
3. Convert the current row value into an uppercase alphabet.
4. Execute the inner loop from **1** to the current row value.
5. Print the same alphabet repeatedly.
6. Move to the next line.
7. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop from `rows` to `1`.
4. Convert the row number into an alphabet.
5. Execute the inner loop from `1` to the current row value.
6. Print the alphabet.
7. Move to the next line.
8. Stop.

---

# Dry Run

```text
Row 5 → E E E E E

Row 4 → D D D D

Row 3 → C C C

Row 2 → B B

Row 1 → A
```

---

# Loop Execution Explanation

## Outer Loop

Controls the rows in decreasing order.

```java
for(int i = rows; i >= 1; i--)
```

## Inner Loop

Controls how many alphabets are printed in each row.

```java
for(int j = 1; j <= i; j++)
```

## Alphabet Conversion

```java
char repeatedAlphabet = (char)(64 + i);
```

The value of `repeatedAlphabet` remains unchanged throughout one row, so the same alphabet is printed repeatedly.

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

- Printing the inner loop variable instead of the repeated alphabet.
- Converting the column value (`j`) instead of the row value (`i`) into an alphabet.
- Using an increasing outer loop instead of a decreasing one.
- Forgetting to cast the integer to `char`.
- Missing `System.out.println()` after each row.

---

# Interview Questions

1. Why is the alphabet calculated using the outer loop variable?
2. What happens if the inner loop variable is used instead?
3. What is the ASCII value of uppercase **A**?
4. Which loop controls the rows?
5. What is the time complexity of this program?

---

# Practice Exercises

- Print lowercase repeated alphabets.
- Accept the number of rows from the user.
- Print repeated numbers instead of alphabets.
- Implement the pattern using a `while` loop.
- Print the pattern starting from **Z**.

---

# Summary

The Inverted Right Triangle Repeated Alphabet Pattern is an excellent exercise for understanding row-based character printing, reverse iteration, nested loops, and ASCII value conversion. It strengthens logical thinking and provides a strong foundation for solving more advanced alphabet-based pattern programming problems in Java.
