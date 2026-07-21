# Inverted Right Triangle Continuous Number Pattern in Java

## Introduction

The Inverted Right Triangle Continuous Number Pattern is a popular Java pattern program that prints continuously increasing numbers in a decreasing triangular structure. Unlike the standard Number Pattern, where every row starts from **1**, this pattern maintains a single continuous sequence throughout the entire pattern.

This program helps learners understand nested loops, continuous variable updates, reverse iteration, and logical pattern generation. It is commonly asked in Java coding interviews because it demonstrates the ability to maintain state across nested loops.

---

# Real-World Example

Imagine assigning token numbers to customers standing in rows. Every customer receives the next available token number, regardless of the row. As each new row contains fewer customers, the numbering still continues without restarting.

Example:

- Row 1 → 1 2 3 4 5
- Row 2 → 6 7 8 9
- Row 3 → 10 11 12
- Row 4 → 13 14
- Row 5 → 15

The numbering never resets to **1**.

---

# Pattern Preview

```text
1 2 3 4 5
6 7 8 9
10 11 12
13 14
15
```

---

# Problem Statement

Write a Java program to print an Inverted Right Triangle Continuous Number Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
1 2 3 4 5
6 7 8 9
10 11 12
13 14
15
```

---

# Pattern Observation

- Total Rows = 5.
- The first row contains five numbers.
- Every subsequent row contains one fewer number.
- Numbers continue increasing throughout the pattern.
- The sequence never restarts from **1**.
- A separate counter variable is required.

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Declare a counter variable and initialize it to **1**.
3. Execute the outer loop from the total number of rows down to **1**.
4. Execute the inner loop from **1** to the current row value.
5. Print the current counter value.
6. Increment the counter.
7. Move to the next line.
8. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare `rows`.
3. Declare `currentNumber = 1`.
4. Execute the outer loop from `rows` to `1`.
5. Execute the inner loop from `1` to the current row value.
6. Print `currentNumber`.
7. Increment `currentNumber`.
8. Move to the next line.
9. Stop.

---

# Dry Run

```text
Row 5 → 1 2 3 4 5

Row 4 → 6 7 8 9

Row 3 → 10 11 12

Row 2 → 13 14

Row 1 → 15
```

---

# Loop Execution Explanation

## Outer Loop

Controls the rows in decreasing order.

```java
for(int i = rows; i >= 1; i--)
```

## Inner Loop

Controls the number of values printed in each row.

```java
for(int j = 1; j <= i; j++)
```

## Continuous Number Logic

```java
System.out.print(currentNumber + " ");
currentNumber++;
```

The counter is incremented after every printed number, ensuring a continuous sequence across all rows.

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

- Resetting the counter inside the outer loop.
- Printing the loop variable instead of the continuous counter.
- Forgetting to increment the counter.
- Using an increasing outer loop instead of a decreasing one.
- Missing `System.out.println()` after each row.

---

# Interview Questions

1. Why is an extra counter variable required?
2. What happens if the counter is declared inside the outer loop?
3. Which loop controls the rows?
4. Why do the numbers continue instead of restarting?
5. What is the time complexity of this program?

---

# Practice Exercises

- Accept the number of rows from the user.
- Print the continuous numbers in reverse order.
- Print only continuous even numbers.
- Print only continuous odd numbers.
- Implement the same pattern using a `while` loop.

---

# Summary

The Inverted Right Triangle Continuous Number Pattern is an excellent exercise for understanding nested loops, reverse iteration, and continuous variable management. It teaches learners how to maintain state across multiple loop iterations and forms a strong foundation for solving advanced number-based pattern problems frequently asked in Java technical interviews.
