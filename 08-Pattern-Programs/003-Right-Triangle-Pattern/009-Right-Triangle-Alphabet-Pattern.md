# Right Triangle Alphabet Pattern in Java

## Introduction

The Right Triangle Alphabet Pattern is a beginner-friendly Java pattern program that prints alphabets in the shape of a right triangle. Instead of printing stars or numbers, this pattern uses uppercase English letters, making it an excellent exercise for understanding nested loops, character data types, ASCII values, and pattern generation.

This pattern helps learners understand how characters can be manipulated in Java using simple arithmetic operations and explicit type casting.

---

# Real-World Example

Imagine students standing in rows according to alphabetical order.

Example:

- Row 1 → A
- Row 2 → A B
- Row 3 → A B C
- Row 4 → A B C D
- Row 5 → A B C D E

The Right Triangle Alphabet Pattern follows the same concept.

---

# Pattern Preview

```text
A
A B
A B C
A B C D
A B C D E
```

---

# Problem Statement

Write a Java program to print a Right Triangle Alphabet Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
A
A B
A B C
A B C D
A B C D E
```

---

# Pattern Observation

- Total Rows = 5.
- Every row starts with the alphabet **A**.
- Each subsequent alphabet increases sequentially.
- The number of alphabets printed in each row is equal to the row number.
- Characters are generated using ASCII values.

---

# Character Sequence

| Decimal | Character |
|---------:|:---------:|
| 65 | A |
| 66 | B |
| 67 | C |
| 68 | D |
| 69 | E |

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Execute the outer loop for each row.
3. Execute the inner loop from 1 to the current row number.
4. Convert the ASCII value into its corresponding alphabet.
5. Print the generated alphabet.
6. Move to the next line.
7. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop.
4. Execute the inner loop.
5. Calculate the alphabet using:

```text
(char)(64 + j)
```

6. Print the alphabet.
7. Print a new line.
8. Stop.

---

# Dry Run

For 5 rows:

- Row 1 → A
- Row 2 → A B
- Row 3 → A B C
- Row 4 → A B C D
- Row 5 → A B C D E

---

# Loop Execution Explanation

## Outer Loop

Controls the total number of rows.

```java
for(int i = 1; i <= rows; i++)
```

## Inner Loop

Controls the number of alphabets printed in each row.

```java
for(int j = 1; j <= i; j++)
```

Alphabet generation:

```java
(char)(64 + j)
```

Explanation:

- ASCII value of **A** is **65**.
- When `j = 1`

```text
64 + 1 = 65 → A
```

- When `j = 2`

```text
64 + 2 = 66 → B
```

- When `j = 3`

```text
64 + 3 = 67 → C
```

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

- Forgetting type casting to `char`.
- Using lowercase ASCII values unintentionally.
- Printing the row number instead of the alphabet.
- Incorrect loop conditions.
- Forgetting to print a new line after each row.

---

# Interview Questions

1. Why is type casting required?
2. What is the ASCII value of 'A'?
3. Why is `(char)(64 + j)` used?
4. Can this program print lowercase letters?
5. What is the time complexity?

---

# Practice Exercises

- Print lowercase alphabets.
- Print the alphabet pattern in reverse.
- Print alternate alphabets.
- Print vowels only.
- Accept the number of rows from the user.

---

# Summary

The Right Triangle Alphabet Pattern introduces learners to character manipulation, ASCII values, nested loops, and logical programming. It provides an excellent bridge between number-based patterns and character-based patterns, making it an essential program for Java beginners and interview preparation.
