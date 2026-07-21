# Right Triangle Repeated Alphabet Pattern in Java

## Introduction

The Right Triangle Repeated Alphabet Pattern is a popular Java pattern program in which every row prints the same uppercase alphabet repeatedly. The alphabet printed in each row corresponds to the row number. For example, the first row prints **A**, the second row prints **B**, the third row prints **C**, and so on.

This pattern is an excellent exercise for learning nested loops, ASCII value conversion, character manipulation, and logical programming. It is commonly asked during Java coding interviews and helps learners understand how characters are generated dynamically.

---

# Real-World Example

Imagine assigning section names in a school.

- Section A → A
- Section B → B B
- Section C → C C C
- Section D → D D D D
- Section E → E E E E E

Each row represents a section, and the section name is repeated according to the row number.

---

# Pattern Preview

```text
A
B B
C C C
D D D D
E E E E E
```

---

# Problem Statement

Write a Java program to print a Right Triangle Repeated Alphabet Pattern using nested `for` loops.

---

# Input

```text
Number of Rows = 5
```

---

# Output

```text
A
B B
C C C
D D D D
E E E E E
```

---

# Pattern Observation

- Total Rows = 5.
- Every row prints only one alphabet.
- The alphabet changes from one row to the next.
- The number of alphabets printed is equal to the row number.
- ASCII values are used to generate alphabets dynamically.

---

# ASCII Table

| Alphabet | ASCII Value |
|-----------|------------:|
| A | 65 |
| B | 66 |
| C | 67 |
| D | 68 |
| E | 69 |

Formula:

```java
(char)(64 + i)
```

Where **i** is the current row number.

Example:

```text
Row 1 → (char)(64+1) = A
Row 2 → (char)(64+2) = B
Row 3 → (char)(64+3) = C
Row 4 → (char)(64+4) = D
Row 5 → (char)(64+5) = E
```

---

# Step-by-Step Logic

1. Declare the number of rows.
2. Execute the outer loop.
3. Calculate the alphabet for the current row.
4. Execute the inner loop.
5. Print the calculated alphabet.
6. Move to the next line.
7. Repeat until all rows are printed.

---

# Algorithm

1. Start.
2. Declare the number of rows.
3. Execute the outer loop.
4. Convert the row number into an alphabet.
5. Execute the inner loop.
6. Print the alphabet repeatedly.
7. Move to the next line.
8. Stop.

---

# Dry Run

```text
Row 1 → A

Row 2 → B B

Row 3 → C C C

Row 4 → D D D D

Row 5 → E E E E E
```

---

# Loop Execution Explanation

## Outer Loop

Controls the total number of rows.

```java
for(int i = 1; i <= rows; i++)
```

## Alphabet Generation

```java
char alphabet = (char)(64 + i);
```

The current row number is converted into its corresponding uppercase English alphabet.

## Inner Loop

Controls the number of alphabets printed.

```java
for(int j = 1; j <= i; j++)
```

The same alphabet is printed repeatedly in the current row.

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

- Printing the column number instead of the alphabet.
- Using incorrect ASCII values.
- Forgetting to type cast into `char`.
- Declaring the alphabet inside the inner loop unnecessarily.
- Incorrect loop conditions.

---

# Interview Questions

1. Why is type casting required?
2. Why is ASCII value 64 used?
3. Which loop controls the rows?
4. Which loop controls the columns?
5. What is the time complexity?

---

# Practice Exercises

- Print lowercase repeated alphabets.
- Reverse the alphabet sequence.
- Accept the number of rows from the user.
- Print repeated reverse alphabets.
- Create an Alphabet Pyramid Pattern.

---

# Summary

The Right Triangle Repeated Alphabet Pattern is an excellent exercise for mastering nested loops, ASCII value conversion, and character manipulation in Java. It builds a strong foundation for advanced alphabet-based pattern programs and is frequently asked during Java technical interviews.
