Control Constructs in Java
========================

Control constructs are used to control the flow of execution in a Java program.
They are mainly of two types:
1. Decision-making statements
2. Looping statements

1. if statement
--------------
Use: Executes a block of code only if a condition is true.

Syntax:
if (condition) {
    // statements
}

Example:
int age = 20;
if (age >= 18) {
    System.out.println("You are eligible to vote.");
}

Output:
You are eligible to vote.

2. if-else statement
-------------------
Use: Executes one block if condition is true, otherwise another block.

Syntax:
if (condition) {
    // true block
} else {
    // false block
}

Example:
int number = 10;
if (number % 2 == 0) {
    System.out.println("Even number");
} else {
    System.out.println("Odd number");
}

Output:
Even number

3. else-if ladder
-----------------
Use: Checks multiple conditions one by one.

Example:
int marks = 75;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 60) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}

Output:
Grade B

4. Nested if statement
---------------------
Use: An if statement inside another if statement.

Example:
int age = 20;
int weight = 55;

if (age >= 18) {
    if (weight > 50) {
        System.out.println("You are eligible for the gym.");
    }
}

Output:
You are eligible for the gym.

5. switch statement
-------------------
Use: Used when there are multiple possible values for a variable.

Syntax:
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}

Example:
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}

Output:
Wednesday

6. for loop
-----------
Use: Repeats a block of code a fixed number of times.

Example:
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

Output:
1
2
3
4
5

7. while loop
-------------
Use: Repeats a block of code while a condition is true.

Example:
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}

Output:
1
2
3
4
5

8. do-while loop
---------------
Use: Executes the block at least once before checking the condition.

Example:
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);

Output:
1
2
3
4
5

9. break statement
-----------------
Use: Stops the loop or switch immediately.

Example:
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}

Output:
1
2
3
4

10. continue statement
----------------------
Use: Skips the current iteration and continues with the next one.

Example:
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}

Output:
1
2
4
5

Summary
-------
- if, if-else, else-if: used for decision-making
- switch: used for multiple choices based on a value
- for, while, do-while: used for repetition
- break and continue: used to control loop execution
