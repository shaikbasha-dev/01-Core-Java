# Right Triangle Continuous Number Pattern in Java

## Introduction

The Right Triangle Continuous Number Pattern is a popular Java pattern program in which numbers are printed continuously without restarting from **1** in every row. Unlike the simple Right Triangle Number Pattern, this pattern maintains a single counter that increments throughout the entire pattern.

This program helps learners understand nested loops, variable scope, continuous counting, and logical thinking. It is one of the most frequently asked pattern programs during Java interviews and coding assessments.

---

# Real-World Example

Imagine assigning token numbers to customers waiting in a queue.

Instead of restarting the numbering in every row, each customer receives the next available token number.

Example:

- Row 1 → Token 1
- Row 2 → Tokens 2 3
- Row 3 → Tokens 4 5 6
- Row 4 → Tokens 7 8 9 10
- Row 5 → Tokens 11 12 13 14 15

The Right Triangle Continuous Number Pattern follows the same concept.

---

# Pattern Preview

```text
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

---

# Problem Statement

Write a Java program to print a Right Triangle Continuous Number Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

---

# Pattern Observation

- Total Rows = 5.
- Numbers never restart from 1.
- Every printed number increases by one.
- A separate counter variable is maintained throughout the program.
- The number of values printed in each row is equal to the row number.

---

# Step-by-Step Logic

1. Declare the total number of rows.
2. Declare a counter variable and initialize it to **1**.
3. Execute the outer loop for each row.
4. Execute the inner loop according to the current row number.
5. Print the current value of the counter.
6. Increment the counter.
7. Move to the next line.
8. Repeat until all rows are completed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Declare `number = 1`.
4. Execute the outer loop.
5. Execute the inner loop.
6. Print `number`.
7. Increment `number`.
8. Print a new line.
9. Stop.

---

# Dry Run

Initial Value:

```text
number = 1
```

Execution:

```text
Row 1 → 1

Row 2 → 2 3

Row 3 → 4 5 6

Row 4 → 7 8 9 10

Row 5 → 11 12 13 14 15
```

---

# Loop Execution Explanation

## Outer Loop

Controls the number of rows.

```java
for(int i = 1; i <= rows; i++)
```

## Inner Loop

Controls the number of values printed in each row.

```java
for(int j = 1; j <= i; j++)
```

Continuous Counter

```java
number++
```

The counter is increased after printing every number.

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

- Declaring the counter variable inside the outer loop.
- Resetting the counter to 1 for every row.
- Forgetting to increment the counter.
- Using the row number instead of the counter.
- Incorrect loop conditions.

---

# Interview Questions

1. Why should the counter variable be declared outside the loops?
2. What happens if the counter is declared inside the outer loop?
3. Which loop controls the rows?
4. Which loop controls the columns?
5. What is the time complexity?

---

# Practice Exercises

- Print continuous odd numbers.
- Print continuous even numbers.
- Print continuous alphabets.
- Accept the number of rows from the user.
- Create a Continuous Number Pyramid Pattern.

---

# Summary

The Right Triangle Continuous Number Pattern introduces learners to continuous counting using a single counter variable. It strengthens the understanding of nested loops, variable scope, and logical programming. Mastering this pattern prepares learners for advanced pattern programming questions and Java technical interviews.
