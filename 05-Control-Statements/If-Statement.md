/*
## Headline
If Control Construct in Java

## Definition
The if statement is used to execute a block of code only when a condition is true.

## Java Program with comments on each step 
*/

public class IfDemo {
    public static void main(String[] args) {
        // Step 1: Declare an integer variable
        int age = 18;

        // Step 2: Check the condition using if
        if (age >= 18) {
            // Step 3: If condition is true, execute this block
            System.out.println("You are eligible to vote.");
        }

        // Step 4: This line runs after the if block
        System.out.println("Program finished.");
    }
}

/*
## Output
You are eligible to vote.
Program finished.

## Explanation
The condition age >= 18 is checked first. Since the value is 18, the condition is true,
so the code inside the if block is executed.

## Pseudocode
if age >= 18 then
    print "You are eligible to vote."
end if

## Code Explanation
- int age = 18; stores the age value.
- if (age >= 18) checks whether the person is an adult.
- System.out.println(...) prints the message when the condition is true.

## Important Points
- The condition must be a boolean expression.
- The code inside the if block runs only when the condition is true.
- Curly braces {} are used to define the block.

## Summary
The if statement is used for decision-making in Java.
It allows the program to run different code based on a condition.
*/
