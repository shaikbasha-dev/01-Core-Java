/*
## Headline
Storing Duplicate String Values Outside String Pool

## Definition
In Java, duplicate string values can be stored in different memory areas.
String literals are stored in the string pool, but strings created with new keyword are stored in heap memory.
This program shows how values may be same while references may be different.

## Java Program with comments on each step
*/

public class StringDemo2 {
    public static void main(String[] args) {
        // Step 1: Create string literal and store it in string pool
        String s1 = "Java";

        // Step 2: Create another string literal with same value
        String s2 = "Java";

        // Step 3: Create a new string object in heap memory
        String s3 = new String("Java");

        // Step 4: Print values
        System.out.println("Value of s1: " + s1);
        System.out.println("Value of s2: " + s2);
        System.out.println("Value of s3: " + s3);

        // Step 5: Compare values using equals()
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));

        // Step 6: Compare references using ==
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
    }
}

/*
## Output
Value of s1: Java
Value of s2: Java
Value of s3: Java
s1 equals s2: true
s1 equals s3: true
s1 == s2: true
s1 == s3: false

## Explanation
s1 and s2 are string literals with the same value, so they point to the same object in the string pool.
s3 is created using new, so it is stored in heap memory and has a different reference.
The values are same, but the references are different for s3.

## Pseudocode
START
    s1 = "Java"
    s2 = "Java"
    s3 = new String("Java")
    print value of s1, s2, s3
    print s1.equals(s2)
    print s1.equals(s3)
    print s1 == s2
    print s1 == s3
END

## Code Explanation
- String literals are stored in the string pool.
- new String(...) creates a new object in heap memory.
- equals() checks value equality.
- == checks reference equality.
- No hashing is used in this program.

## Important Points
- Same values may have same or different references.
- equals() compares content.
- == compares memory reference.
- String pool stores literals for reuse.
- This example shows the difference without using hashing.

## Summary
This program shows that duplicate string values can exist in different memory locations.
Values may be same, but references can differ depending on how the string is created.
*/
