/*
## Headline
Else-If Ladder in Java

## Definition
The else if ladder is used when there are multiple conditions to check one by one.

## Java Program with comments on each step
*/

public class ElseIfDemo {
    public static void main(String[] args) {
        // Step 1: Declare a variable for marks
        int marks = 75;

        // Step 2: Check the first condition
        if (marks >= 90) {
            // Step 3: If first condition is true
            System.out.println("Grade A");
        } else if (marks >= 75) {
            // Step 4: If second condition is true
            System.out.println("Grade B");
        } else if (marks >= 60) {
            // Step 5: If third condition is true
            System.out.println("Grade C");
        } else {
            // Step 6: If all conditions are false
            System.out.println("Fail");
        }

        // Step 7: This line runs after the ladder
        System.out.println("Program finished.");
    }
}

/*
## Output
Grade B
Program finished.

## Explanation
The program checks the conditions from top to bottom.
Since marks = 75, the first condition is false, the second condition is true,
and the output is Grade B.

## Pseudocode
if marks >= 90 then
    print "Grade A"
else if marks >= 75 then
    print "Grade B"
else if marks >= 60 then
    print "Grade C"
else
    print "Fail"
end if

## Code Explanation
- int marks = 75; stores the marks value.
- Each if or else if checks a different condition.
- The program stops checking once a true condition is found.

## Important Points
- else if is used for multiple conditions.
- Only one block executes from the ladder.
- The final else is optional.

## Summary
The else if ladder helps in choosing one option from many conditions.
*/
