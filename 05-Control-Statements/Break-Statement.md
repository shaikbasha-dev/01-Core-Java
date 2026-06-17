/*
## Headline
Break Statement in Java

## Definition
The break statement is used to terminate the loop or switch immediately.

## Java Program with comments on each step
*/

public class BreakDemo {
    public static void main(String[] args) {
        // Step 1: Start a loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Step 2: Check if i is 5
            if (i == 5) {
                // Step 3: Stop the loop when i becomes 5
                break;
            }

            // Step 4: Print numbers before breaking
            System.out.println(i);
        }

        // Step 5: Message after the loop ends
        System.out.println("Loop stopped at 5.");
    }
}

/*
## Output
1
2
3
4
Loop stopped at 5.

## Explanation
The loop runs normally until i becomes 5.
When the condition i == 5 is true, the break statement stops the loop immediately.

## Pseudocode
for i = 1 to 10
    if i == 5 then
        break
    end if
    print i
end for

## Code Explanation
- for (int i = 1; i <= 10; i++) creates the loop.
- if (i == 5) checks when the loop should stop.
- break; exits the loop immediately.

## Important Points
- break is used to exit a loop or switch.
- It prevents further execution of the remaining loop body.
- It is useful when a condition is met.

## Summary
The break statement helps stop the loop as soon as a required condition is reached.
*/
