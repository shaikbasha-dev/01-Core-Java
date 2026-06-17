/*
## Headline
Continue Statement in Java

## Definition
The continue statement skips the current iteration of a loop and moves to the next one.

## Java Program with comments on each step
*/

public class ContinueDemo {
    public static void main(String[] args) {
        // Step 1: Start a loop from 1 to 5
        for (int i = 1; i <= 5; i++) {
            // Step 2: Skip the iteration when i is 3
            if (i == 3) {
                // Step 3: Skip the current iteration
                continue;
            }

            // Step 4: Print values except 3
            System.out.println(i);
        }

        // Step 5: Message after the loop ends
        System.out.println("Loop finished.");
    }
}

/*
## Output
1
2
4
5
Loop finished.

## Explanation
When i becomes 3, the continue statement skips the rest of the loop body for that iteration.
The loop then continues with the next value.

## Pseudocode
for i = 1 to 5
    if i == 3 then
        continue
    end if
    print i
end for

## Code Explanation
- for (int i = 1; i <= 5; i++) creates the loop.
- if (i == 3) checks when to skip.
- continue; jumps to the next iteration.

## Important Points
- continue skips only the current iteration.
- It does not stop the loop completely.
- It is useful when you want to ignore certain values.

## Summary
The continue statement helps skip unwanted iterations in a loop.
*/
