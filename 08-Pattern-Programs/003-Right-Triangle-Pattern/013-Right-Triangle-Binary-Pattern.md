# Right Triangle Binary Pattern in Java

## Introduction

The Right Triangle Binary Pattern is a beginner-friendly Java pattern program that prints binary digits (0 and 1) in the shape of a right triangle. This pattern introduces learners to nested loops, binary number concepts, mathematical operations, and logical programming techniques.

Unlike star, number, or alphabet patterns, this pattern focuses on binary values, making it an excellent exercise for improving logical thinking and understanding how binary digits can be generated programmatically.

---

# Real-World Example

Imagine a digital communication system where information is transmitted using only binary digits (0 and 1).

Example:

- Row 1 → 1
- Row 2 → 1 0
- Row 3 → 1 0 1
- Row 4 → 1 0 1 0
- Row 5 → 1 0 1 0 1

The Right Triangle Binary Pattern follows the same concept.

---

# Pattern Preview

```text
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
```

---

# Problem Statement

Write a Java program to print a Right Triangle Binary Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
```

---

# Pattern Observation

- Total Rows = 5.
- Every row starts with **1**.
- Binary digits alternate between **1** and **0**.
- The number of binary digits printed in each row is equal to the row number.
- The binary digit is determined using the column number.

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Execute the outer loop for each row.
3. Execute the inner loop from 1 to the current row number.
4. Determine whether the current column number is odd or even.
5. Print **1** for odd columns.
6. Print **0** for even columns.
7. Move to the next line.
8. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop.
4. Execute the inner loop.
5. Check whether the column number is odd or even.
6. Print **1** if odd, otherwise print **0**.
7. Move to the next line.
8. Stop.

---

# Dry Run

For 5 rows:

- Row 1 → 1
- Row 2 → 1 0
- Row 3 → 1 0 1
- Row 4 → 1 0 1 0
- Row 5 → 1 0 1 0 1

---

# Loop Execution Explanation

## Outer Loop

Controls the total number of rows.

```java
for(int i = 1; i <= rows; i++)
```

## Inner Loop

Controls the number of binary digits printed in each row.

```java
for(int j = 1; j <= i; j++)
```

Binary Logic:

```java
if(j % 2 == 0)
```

- Even Column → 0
- Odd Column → 1

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

- Using the row number instead of the column number.
- Forgetting to alternate binary digits.
- Incorrect loop conditions.
- Forgetting to print a new line after every row.
- Using hardcoded values instead of logical conditions.

---

# Interview Questions

1. Why is the modulus operator (`%`) used?
2. Why does every row start with 1?
3. Which loop controls the rows?
4. Which loop controls the columns?
5. What is the time complexity?

---

# Practice Exercises

- Start every row with 0 instead of 1.
- Reverse the binary pattern.
- Accept the number of rows from the user.
- Print continuous binary numbers.
- Create a Binary Pyramid Pattern.

---

# Summary

The Right Triangle Binary Pattern strengthens the understanding of nested loops, conditional statements, and binary number generation. It is an excellent practice program for improving logical thinking and preparing for Java coding interviews.
