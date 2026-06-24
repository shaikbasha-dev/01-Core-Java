/*
 * Headline: Java Program Demonstrating Non-Primitive Data Types
 *
 * This program shows common non-primitive data types in Java:
 * - String
 * - Array
 * - Class object
 * - Enum
 *
 * Non-primitive types are reference types. They store references
 * to objects rather than the values directly.
 */

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        // Pseudocode:
        // 1. Create a String value.
        // 2. Create an array of integers.
        // 3. Create an object of a custom Person class.
        // 4. Create an enum value for a day of the week.
        // 5. Print each example and explain the reference behavior.
        //
        // Explanation:
        // - String is a built-in class and part of Java's standard library.
        // - Arrays are objects that hold multiple elements of the same type.
        // - Custom classes are user-defined reference types.
        // - Enums are special classes that define a fixed set of constants.

        // String example: a non-primitive object for text values
        String sampleString = "Hello, Java Non-Primitive Types";

        // Array example: arrays are objects in Java
        int[] sampleArray = {10, 20, 30};

        // Object example: Person is a custom class type
        Person samplePerson = new Person("Ayesha", 22);

        // Enum example: Day is a reference type with fixed constants
        Day sampleDay = Day.MONDAY;

        // Print values and object references
        System.out.println("Java Non-Primitive Data Types Example");
        System.out.println("-----------------------------------");
        System.out.println("String value      : " + sampleString);
        System.out.print("Array values      : ");
        for (int value : sampleArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Person object     : " + samplePerson);
        System.out.println("Enum value        : " + sampleDay);

        // Explain that the following are references to objects
        System.out.println();
        System.out.println("Note: String, arrays, classes, and enums are reference types.");
        System.out.println("They store a reference (memory address) to the object, not the value itself.");
        System.out.println();
        System.out.println("Primitive vs Non-Primitive:");
        System.out.println("- Primitive types store values directly.");
        System.out.println("- Non-primitive types store references to objects.");
        System.out.println("- Examples: int, float, char, boolean vs String, arrays, classes, enums.");
    }

    // Custom class example for non-primitive data type demonstration
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + " years old)";
        }
    }

    // Enum example showing a fixed set of constants
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}

/*
Sample output:
Java Non-Primitive Data Types Example
-----------------------------------
String value      : Hello, Java Non-Primitive Types
Array values      : 10 20 30 
Person object     : Ayesha (22 years old)
Enum value        : MONDAY

Note: String, arrays, classes, and enums are reference types.
They store a reference (memory address) to the object, not the value itself.
*/
