# Right Triangle Row Number Pattern in Java

## Introduction

The Right Triangle Row Number Pattern is a popular Java pattern program in which each row prints the same number repeatedly. The printed number is equal to the current row number.

This pattern helps beginners understand how nested loops work together and demonstrates the relationship between the outer loop (rows) and the inner loop (columns). It is one of the most commonly asked pattern programs in Java interviews and coding assessments.

---

# Real-World Example

Imagine a classroom where each row of students is assigned a row number.

Example:

- Row 1 → Student badges display **1**
- Row 2 → Student badges display **2 2**
- Row 3 → Student badges display **3 3 3**
- Row 4 → Student badges display **4 4 4 4**
- Row 5 → Student badges display **5 5 5 5 5**

The Right Triangle Row Number Pattern follows the same concept.

---

# Pattern Preview

```text
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
```

---

# Problem Statement

Write a Java program to print a Right Triangle Row Number Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
```

---

# Pattern Observation

- Total Rows = 5.
- Each row contains identical numbers.
- The printed number is always equal to the current row number.
- The number of values printed is equal to the row number.

---

# Step-by-Step Logic

1. Declare the number of rows.
2. Execute the outer loop for each row.
3. Execute the inner loop according to the current row number.
4. Print the current row number in every column.
5. Move to the next line.
6. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop.
4. Execute the inner loop.
5. Print the row number.
6. Move to the next line.
7. Stop.

---

# Dry Run

```text
Row 1 → 1

Row 2 → 2 2

Row 3 → 3 3 3

Row 4 → 4 4 4 4

Row 5 → 5 5 5 5 5
```

---

# Loop Execution Explanation

## Outer Loop

Controls the rows.

```java
for(int i = 1; i <= rows; i++)
```

## Inner Loop

Controls the columns.

```java
for(int j = 1; j <= i; j++)
```

Printing Logic

```java
System.out.print(i + " ");
```

The value of the outer loop variable (`i`) is printed repeatedly in every column of the current row.

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

- Printing the column number (`j`) instead of the row number (`i`).
- Incorrect loop conditions.
- Forgetting to print a new line after each row.
- Printing continuous numbers instead of repeated row numbers.

---

# Interview Questions

1. Why is the row variable printed instead of the column variable?
2. Which loop controls the rows?
3. Which loop controls the columns?
4. What happens if `j` is printed instead of `i`?
5. What is the time complexity?

---

# Practice Exercises

- Print repeated even row numbers.
- Print repeated odd row numbers.
- Reverse the pattern.
- Accept the number of rows from the user.
- Create a Row Number Pyramid Pattern.

---

# Summary

The Right Triangle Row Number Pattern is an excellent beginner-level program for understanding nested loops and the relationship between row and column variables. It strengthens logical thinking and is a frequently asked Java interview pattern.
