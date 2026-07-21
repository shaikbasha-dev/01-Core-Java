# Inverted Right Triangle Odd Number Pattern in Java

## Introduction

The Inverted Right Triangle Odd Number Pattern is a simple yet important Java pattern program that prints odd numbers in a decreasing triangular structure. It is the reverse of the Right Triangle Odd Number Pattern, where the number of odd values decreases by one in each subsequent row.

This pattern helps learners understand reverse nested loop execution, arithmetic calculations, and decreasing pattern generation. It is widely used in Java programming practice and frequently appears in coding interviews to evaluate logical thinking and loop concepts.

---

# Real-World Example

Imagine a scoreboard displaying only odd-numbered positions. As each round progresses, the last position is removed, reducing the count by one.

Example:

- Row 1 → 1 3 5 7 9
- Row 2 → 1 3 5 7
- Row 3 → 1 3 5
- Row 4 → 1 3
- Row 5 → 1

The Inverted Right Triangle Odd Number Pattern follows this decreasing arrangement.

---

# Pattern Preview

```text
1 3 5 7 9
1 3 5 7
1 3 5
1 3
1
```

---

# Problem Statement

Write a Java program to print an Inverted Right Triangle Odd Number Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
1 3 5 7 9
1 3 5 7
1 3 5
1 3
1
```

---

# Pattern Observation

- Total Rows = 5.
- The first row contains five odd numbers.
- Each subsequent row contains one fewer odd number.
- Every row starts with **1**.
- The last row contains only one odd number.
- Odd numbers increase by **2**.

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Execute the outer loop from the total number of rows down to 1.
3. Execute the inner loop from 1 to the current row value.
4. Calculate the odd number using the formula `(j * 2) - 1`.
5. Print the calculated odd number.
6. Move to the next line.
7. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop from `rows` to `1`.
4. Execute the inner loop from `1` to the current row value.
5. Calculate the odd number.
6. Print the odd number.
7. Move to the next line.
8. Stop.

---

# Dry Run

```text
Row 5 → 1 3 5 7 9

Row 4 → 1 3 5 7

Row 3 → 1 3 5

Row 2 → 1 3

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

Controls the number of odd values printed.

```java
for(int j = 1; j <= i; j++)
```

## Odd Number Formula

```java
int oddNumber = (j * 2) - 1;
```

The formula generates the following sequence:

```text
1
3
5
7
9
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
- Printing `j` instead of the calculated odd number.
- Using an incorrect formula for odd numbers.
- Forgetting to decrement the outer loop.
- Missing `System.out.println()` after each row.

---

# Interview Questions

1. How are odd numbers generated in this pattern?
2. Why does the outer loop decrement?
3. Which loop controls the rows?
4. Which loop controls the columns?
5. What is the time complexity of this program?

---

# Practice Exercises

- Print the pattern using even numbers.
- Accept the number of rows from the user.
- Print the odd numbers in reverse order.
- Create a Hollow Inverted Right Triangle Odd Number Pattern.
- Implement the same pattern using a `while` loop.

---

# Summary

The Inverted Right Triangle Odd Number Pattern is an excellent exercise for mastering nested loops, reverse iteration, and arithmetic-based pattern generation. It strengthens logical thinking and provides a solid foundation for solving more advanced number pattern problems in Java.
