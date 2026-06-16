/*
 * Headline: Java Program Demonstrating All Primitive Data Types
 *
 * This program declares one variable for each Java primitive data type,
 * assigns a sample value, and prints the result to the console.
 */

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Pseudocode:
        // 1. Declare one variable of each primitive data type.
        // 2. Initialize each variable with a valid sample value.
        // 3. Print each variable and its type to the console.
        //
        // Explanation:
        // - Java has 8 primitive data types: byte, short, int, long, float, double, char, boolean.
        // - Each primitive type stores a single value directly, not a reference to an object.
        // - Use suffixes 'L' for long and 'f' for float when required.

        // byte: 8-bit signed integer
        byte sampleByte = 100;

        // short: 16-bit signed integer
        short sampleShort = 32000;

        // int: 32-bit signed integer
        int sampleInt = 123456789;

        // long: 64-bit signed integer (use L suffix)
        long sampleLong = 1234567890123456789L;

        // float: 32-bit floating point number (use f suffix)
        float sampleFloat = 3.14f;

        // double: 64-bit floating point number
        double sampleDouble = 9.81;

        // char: single Unicode character
        char sampleChar = 'J';

        // boolean: true or false
        boolean sampleBoolean = true;

        // Print all values with labels
        System.out.println("Java Primitive Data Types Example");
        System.out.println("--------------------------------");
        System.out.println("byte value    : " + sampleByte);
        System.out.println("short value   : " + sampleShort);
        System.out.println("int value     : " + sampleInt);
        System.out.println("long value    : " + sampleLong);
        System.out.println("float value   : " + sampleFloat);
        System.out.println("double value  : " + sampleDouble);
        System.out.println("char value    : " + sampleChar);
        System.out.println("boolean value : " + sampleBoolean);
    }
}

/*
Output:
Java Primitive Data Types Example
--------------------------------
byte value    : 100
short value   : 32000
int value     : 123456789
long value    : 1234567890123456789
float value   : 3.14
double value  : 9.81
char value    : J
boolean value : true
*/

