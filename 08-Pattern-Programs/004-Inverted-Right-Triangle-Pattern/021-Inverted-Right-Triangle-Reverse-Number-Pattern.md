# Inverted Right Triangle Reverse Number Pattern in Java

## Introduction

The Inverted Right Triangle Reverse Number Pattern is an interesting Java pattern program that prints numbers in reverse order within a decreasing triangular structure. Unlike the Inverted Right Triangle Number Pattern, where each row begins with **1**, this pattern starts with the largest number in the row and counts backward to **1**.

This pattern helps learners understand reverse nested loop execution, row-column relationships, decreasing iteration, and logical pattern generation. It is frequently asked in Java interviews because it combines reverse looping with number manipulation.

---

# Real-World Example

Imagine a countdown display where each row starts from the highest remaining number and counts down to **1**. As each new row begins, the starting number decreases by one.

Example:

- Row 1 → 5 4 3 2 1
- Row 2 → 4 3 2 1
- Row 3 → 3 2 1
- Row 4 → 2 1
- Row 5 → 1

The Inverted Right Triangle Reverse Number Pattern follows this decreasing reverse arrangement.

---

# Pattern Preview

```text
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
```

---

# Problem Statement

Write a Java program to print an Inverted Right Triangle Reverse Number Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
```

---

# Pattern Observation

- Total Rows = 5.
- The first row starts with **5** and ends with **1**.
- Every subsequent row starts with one smaller number.
- Each row contains one fewer number than the previous row.
- Numbers are printed in descending order.
- The last row contains only **1**.

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Execute the outer loop from the total number of rows down to **1**.
3. Execute the inner loop from the current row value down to **1**.
4. Print the current value of the inner loop.
5. Move to the next line.
6. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop from `rows` to `1`.
4. Execute the inner loop from the current row value to `1`.
5. Print the current number.
6. Move to the next line.
7. Stop.

---

# Dry Run

```text
Row 5 → 5 4 3 2 1

Row 4 → 4 3 2 1

Row 3 → 3 2 1

Row 2 → 2 1

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

Controls the reverse numbers printed in each row.

```java
for(int j = i; j >= 1; j--)
```

The inner loop starts from the current row value and decreases until **1**, producing a reverse number sequence.

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

- Using an increasing inner loop instead of a decreasing one.
- Printing the outer loop variable instead of the inner loop variable.
- Incorrect loop boundary conditions.
- Forgetting to decrement the inner loop.
- Missing `System.out.println()` after each row.

---

# Interview Questions

1. Why does the inner loop execute in reverse order?
2. Which loop controls the rows?
3. Which loop controls the numbers printed?
4. What happens if the inner loop starts from **1** instead of the current row value?
5. What is the time complexity of this program?

---

# Practice Exercises

- Accept the number of rows from the user.
- Print reverse even numbers.
- Print reverse odd numbers.
- Implement the same pattern using a `while` loop.
- Create a Hollow Inverted Right Triangle Reverse Number Pattern.

---

# Summary

The Inverted Right Triangle Reverse Number Pattern is an excellent exercise for understanding reverse iteration, nested loops, and descending number generation. It strengthens logical thinking and provides a strong foundation for solving advanced number-based pattern programming questions commonly asked in Java technical interviews.
