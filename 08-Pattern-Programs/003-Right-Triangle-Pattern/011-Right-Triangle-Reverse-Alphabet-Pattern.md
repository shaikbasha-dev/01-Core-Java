# Right Triangle Reverse Alphabet Pattern in Java

## Introduction

The Right Triangle Reverse Alphabet Pattern is an interesting variation of the Alphabet Pattern. Instead of printing alphabets in ascending order (A, B, C...), this pattern prints alphabets in descending order (Z, Y, X...). It helps learners understand nested loops, character manipulation, ASCII values, reverse sequencing, and logical programming techniques.

This pattern is commonly used to improve problem-solving skills and is frequently asked in Java programming interviews.

---

# Real-World Example

Imagine arranging books on a shelf in reverse alphabetical order.

Example:

- Row 1 → Z
- Row 2 → Z Y
- Row 3 → Z Y X
- Row 4 → Z Y X W
- Row 5 → Z Y X W V

The Right Triangle Reverse Alphabet Pattern follows the same concept.

---

# Pattern Preview

```text
Z
Z Y
Z Y X
Z Y X W
Z Y X W V
```

---

# Problem Statement

Write a Java program to print a Right Triangle Reverse Alphabet Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
Z
Z Y
Z Y X
Z Y X W
Z Y X W V
```

---

# Pattern Observation

- Total Rows = 5.
- Every row starts with the alphabet **Z**.
- Each subsequent alphabet decreases by one.
- The number of alphabets printed in each row is equal to the row number.
- Characters are generated using reverse ASCII values.

---

# Character Sequence

| Decimal | Character |
|---------:|:---------:|
| 90 | Z |
| 89 | Y |
| 88 | X |
| 87 | W |
| 86 | V |

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Execute the outer loop for each row.
3. Execute the inner loop from 1 to the current row number.
4. Generate the alphabet using reverse ASCII values.
5. Print the generated alphabet.
6. Move to the next line.
7. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop.
4. Execute the inner loop.
5. Calculate:

```text
(char)(91 - j)
```

6. Print the alphabet.
7. Move to the next line.
8. Stop.

---

# Dry Run

For 5 rows:

- Row 1 → Z
- Row 2 → Z Y
- Row 3 → Z Y X
- Row 4 → Z Y X W
- Row 5 → Z Y X W V

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
(char)(91 - j)
```

Explanation:

- ASCII value of **Z** is **90**.

When `j = 1`

```text
91 - 1 = 90 → Z
```

When `j = 2`

```text
91 - 2 = 89 → Y
```

When `j = 3`

```text
91 - 3 = 88 → X
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

- Forgetting to convert the integer into a character.
- Using ascending ASCII values instead of descending values.
- Using incorrect loop conditions.
- Forgetting to print a new line after every row.
- Starting the inner loop from zero.

---

# Interview Questions

1. Why is `(char)(91 - j)` used?
2. What is the ASCII value of `Z`?
3. Can this program print lowercase reverse alphabets?
4. Which loop controls the rows?
5. What is the time complexity?

---

# Practice Exercises

- Print lowercase reverse alphabets.
- Reverse the entire triangle.
- Print alternate reverse alphabets.
- Accept the number of rows from the user.
- Print reverse alphabetical pyramid patterns.

---

# Summary

The Right Triangle Reverse Alphabet Pattern introduces reverse character sequencing using ASCII values and nested loops. It enhances logical thinking, strengthens understanding of character manipulation, and prepares learners for advanced Java pattern programming and coding interviews.
