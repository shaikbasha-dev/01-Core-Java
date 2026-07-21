# Inverted Right Triangle Binary Pattern in Java

## Introduction

The Inverted Right Triangle Binary Pattern is an important Java pattern program that prints binary digits (`0` and `1`) in a decreasing triangular structure. It is the reverse of the Right Triangle Binary Pattern, where the number of binary digits decreases by one in every subsequent row.

This pattern helps learners understand reverse nested loop execution, binary value generation, arithmetic operations, and logical pattern design. It is frequently used in Java programming practice and coding interviews to evaluate a candidate's understanding of loops and conditional logic.

---

# Real-World Example

Imagine a digital display board showing binary signals. As each row progresses, one binary signal is removed from the end.

Example:

- Row 1 → 1 0 1 0 1
- Row 2 → 1 0 1 0
- Row 3 → 1 0 1
- Row 4 → 1 0
- Row 5 → 1

The Inverted Right Triangle Binary Pattern follows this decreasing binary sequence.

---

# Pattern Preview

```text
1 0 1 0 1
1 0 1 0
1 0 1
1 0
1
```

---

# Problem Statement

Write a Java program to print an Inverted Right Triangle Binary Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
1 0 1 0 1
1 0 1 0
1 0 1
1 0
1
```

---

# Pattern Observation

- Total Rows = 5.
- The first row contains five binary digits.
- Each subsequent row contains one fewer binary digit.
- The binary sequence always starts with **1**.
- The values alternate between **1** and **0**.
- The last row contains only **1**.

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Execute the outer loop from the total number of rows down to 1.
3. Execute the inner loop from 1 to the current row value.
4. Determine whether the current position is odd or even.
5. Print **1** for odd positions and **0** for even positions.
6. Move to the next line.
7. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop from `rows` to `1`.
4. Execute the inner loop from `1` to the current row value.
5. If the current position is odd, print **1**.
6. Otherwise, print **0**.
7. Move to the next line.
8. Stop.

---

# Dry Run

```text
Row 5 → 1 0 1 0 1

Row 4 → 1 0 1 0

Row 3 → 1 0 1

Row 2 → 1 0

Row 1 → 1
```

---

# Loop Execution Explanation

## Outer Loop

Controls the rows in decreasing order.

```java
for(int i = rows; i >= 1; i--)
```

## Inner Loop

Controls the number of binary digits printed.

```java
for(int j = 1; j <= i; j++)
```

## Binary Logic

```java
if(j % 2 == 0)
    binaryDigit = 0;
else
    binaryDigit = 1;
```

Generated sequence:

```text
1
0
1
0
1
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

- Using an increasing outer loop instead of a decreasing one.
- Forgetting to alternate between **1** and **0**.
- Using the row number instead of the column position for binary generation.
- Missing `System.out.println()` after each row.
- Writing incorrect loop boundary conditions.

---

# Interview Questions

1. How are binary digits generated in this pattern?
2. Why does the outer loop decrement?
3. Which loop controls the rows?
4. Why is the modulus (`%`) operator used?
5. What is the time complexity of this program?

---

# Practice Exercises

- Start the pattern with **0** instead of **1**.
- Accept the number of rows from the user.
- Print alternating binary digits using a `while` loop.
- Create a Hollow Inverted Binary Triangle.
- Print the binary pattern in reverse order.

---

# Summary

The Inverted Right Triangle Binary Pattern is an excellent exercise for understanding nested loops, reverse iteration, conditional statements, and binary value generation. It strengthens logical thinking and prepares learners for more advanced binary and number-based pattern programming questions frequently asked in Java technical interviews.
