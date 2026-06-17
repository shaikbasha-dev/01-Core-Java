/*
## Headline
Different Ways to Create Strings in Java

## Definition
Strings can be created in Java using different methods.
Here we show three ways:
1. String s1 = new String("Java");
2. char[] ch = {'J', 'A', 'v', 'A'}; String s2 = new String(ch);
3. String s3 = "Java";

## Java Program with comments on each step
*/

public class StringDemo1 {
    public static void main(String[] args) {
        // Step 1: Create a string using new keyword
        String s1 = new String("Java");

        // Step 2: Create a character array
        char[] ch = {'J', 'A', 'v', 'A'};

        // Step 3: Create a string from the character array
        String s2 = new String(ch);

        // Step 4: Create a string using string literal
        String s3 = "Java";

        // Step 5: Print all three strings
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

/*
## Output
Java
Java
Java

## Explanation
The first string is created using the new keyword.
The second string is created from a character array.
The third string is created using a string literal.
All three outputs are the same text, but the creation methods are different.

## Pseudocode
START
    s1 = new String("Java")
    create char array ch = ['J','A','v','A']
    s2 = new String(ch)
    s3 = "Java"
    print s1
    print s2
    print s3
END

## Code Explanation
- String s1 = new String("Java"); creates a string object explicitly.
- char[] ch stores characters individually.
- String s2 = new String(ch); converts the character array into a string.
- String s3 = "Java"; uses a string literal.

## Important Points
- String literals are stored in the string pool.
- new String(...) creates a new object in memory.
- Characters in a char array can be converted into a string.

## Summary
Java allows strings to be created in multiple ways.
The most common ways are using new keyword, character arrays, and string literals.
*/
