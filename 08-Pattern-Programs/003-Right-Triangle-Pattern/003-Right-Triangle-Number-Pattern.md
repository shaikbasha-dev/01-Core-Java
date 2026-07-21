# Right Triangle Number Pattern in Java

## Introduction

The Right Triangle Number Pattern is one of the most common pattern programs asked in Java interviews and coding assessments. Instead of printing stars, this pattern prints numbers in a right triangular format. It helps beginners understand nested loops, row-column relationships, and number-based pattern logic.

This pattern is an excellent transition from star patterns to number patterns and builds a strong foundation for solving more complex programming problems.

---

# Real-World Example

Imagine numbering seats in a small auditorium where each new row contains one additional seat than the previous row.

Example:

- Row 1 → Seat 1
- Row 2 → Seat 1 2
- Row 3 → Seat 1 2 3
- Row 4 → Seat 1 2 3 4
- Row 5 → Seat 1 2 3 4 5

The Right Triangle Number Pattern follows the same principle by printing numbers instead of stars.

---

# Pattern Preview

```text
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

---

# Problem Statement

Write a Java program to print a Right Triangle Number Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

---

# Pattern Observation

- Total Rows = 5
- Every row starts with number **1**.
- The last number printed in each row is equal to the current row number.
- Each row contains one more number than the previous row.

---

# Step-by-Step Logic

1. Declare the number of rows.
2. Execute the outer loop from 1 to the number of rows.
3. Execute the inner loop from 1 to the current row number.
4. Print the current column number.
5. Move to the next line after completing each row.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop.
4. Execute the inner loop.
5. Print the current column number.
6. Print a new line.
7. Repeat until all rows are completed.
8. Stop.

---

# Dry Run

For 5 rows:

- Row 1 → 1
- Row 2 → 1 2
- Row 3 → 1 2 3
- Row 4 → 1 2 3 4
- Row 5 → 1 2 3 4 5

---

# Loop Execution Explanation

## Outer Loop

Controls the total number of rows.

```java
for(int i = 1; i <= rows; i++)
```

## Inner Loop

Prints numbers from **1** to the current row number.

```java
for(int j = 1; j <= i; j++)
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

- Starting the inner loop with 0.
- Printing the row number instead of the column number.
- Forgetting to print a new line after each row.
- Using incorrect loop conditions.

---

# Interview Questions

1. Why does every row begin with 1?
2. Which loop controls the rows?
3. Which loop controls the columns?
4. What happens if `j <= rows` is used instead of `j <= i`?
5. What is the time complexity of this program?

---

# Practice Exercises

- Print the same pattern using a `while` loop.
- Print the pattern in reverse.
- Convert the pattern into an alphabet pattern.
- Print only even numbers.
- Print only odd numbers.

---

# Summary

The Right Triangle Number Pattern is one of the easiest and most important number-based pattern programs in Java. It strengthens the understanding of nested loops and prepares learners for more advanced pattern programming questions frequently asked during interviews.
