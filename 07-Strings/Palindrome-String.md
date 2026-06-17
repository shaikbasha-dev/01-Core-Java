/*
## Headline
Palindrome String Program

## Definition
A palindrome string reads the same from left to right and right to left. For example, "madam" is a palindrome.

## Java Program with comments on each step
*/

public class StringDemo6 {
    public static void main(String[] args) {
        // Step 1: Store the string to check
        String text = "madam";

        // Step 2: Convert the string to lowercase so case does not matter
        String lowerText = text.toLowerCase();

        // Step 3: Create a reverse string
        String reverseText = "";
        for (int i = lowerText.length() - 1; i >= 0; i--) {
            reverseText = reverseText + lowerText.charAt(i);
        }

        // Step 4: Compare original and reversed strings
        if (lowerText.equals(reverseText)) {
            System.out.println(text + " is a palindrome");
        } else {
            System.out.println(text + " is not a palindrome");
        }
    }
}

/*
## Output
madam is a palindrome

## Explanation
The program compares the original string with its reverse. If both are same, the string is palindrome.

## Pseudocode
START
    text = "madam"
    lowerText = text.toLowerCase()
    reverseText = ""
    for i from length-1 down to 0
        reverseText = reverseText + lowerText.charAt(i)
    if lowerText == reverseText
        print "is a palindrome"
    else
        print "is not a palindrome"
END

## Code Explanation
- toLowerCase() makes the comparison case-insensitive.
- The loop reads characters from the end to the start.
- charAt(i) picks each character at a specific index.
- equals() checks if the original and reversed strings are same.

## Important Points
- A palindrome reads the same in both directions.
- Spaces and punctuation are not handled in this simple example.
- This method works correctly for basic string checks.

## Summary
This program checks whether a string is a palindrome using reverse comparison.
*/
