/*
 * Headline: Java Program Demonstrating Implicit Type Casting
 *
 * This program shows implicit type casting in Java, where the compiler
 * automatically converts a smaller primitive type into a larger primitive type.
 * It includes examples for byte, short, char, int, long, float, and double.
 */

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        // Pseudocode:
        // 1. Declare and initialize a byte value.
        // 2. Assign the byte to short, int, long, float, and double variables.
        // 3. Declare and initialize a short value.
        // 4. Assign the short to int, long, float, and double variables.
        // 5. Declare and initialize a char value.
        // 6. Assign the char to int, long, float, and double variables.
        // 7. Declare and initialize an int value.
        // 8. Assign the int to long, float, and double variables.
        // 9. Declare and initialize a long value.
        // 10. Assign the long to float and double variables.
        // 11. Declare and initialize a float value.
        // 12. Assign the float to a double variable.
        // 13. Print all converted values with labels.

        // Explanation:
        // - Implicit type casting is done automatically by Java when converting
        //   from a smaller data type to a larger data type.
        // - This is also called widening conversion.
        // - No cast operator is required for widening conversions.

        // byte example: convert to larger numeric types
        byte byteValue = 42;
        short byteToShort = byteValue;
        int byteToInt = byteValue;
        long byteToLong = byteValue;
        float byteToFloat = byteValue;
        double byteToDouble = byteValue;

        // short example: convert to larger numeric types
        short shortValue = 32000;
        int shortToInt = shortValue;
        long shortToLong = shortValue;
        float shortToFloat = shortValue;
        double shortToDouble = shortValue;

        // char example: convert to numeric types using Unicode code point
        char charValue = 'A';
        int charToInt = charValue;
        long charToLong = charValue;
        float charToFloat = charValue;
        double charToDouble = charValue;

        // int example: convert to larger numeric types
        int intValue = 123456;
        long intToLong = intValue;
        float intToFloat = intValue;
        double intToDouble = intValue;

        // long example: convert to larger numeric types
        long longValue = 123456789L;
        float longToFloat = longValue;
        double longToDouble = longValue;

        // float example: convert to larger numeric type
        float floatValue = 3.14f;
        double floatToDouble = floatValue;

        // Print all implicit conversions
        System.out.println("Java Implicit Type Casting Example");
        System.out.println("----------------------------------");
        System.out.println("byte value         : " + byteValue);
        System.out.println("byte -> short      : " + byteToShort);
        System.out.println("byte -> int        : " + byteToInt);
        System.out.println("byte -> long       : " + byteToLong);
        System.out.println("byte -> float      : " + byteToFloat);
        System.out.println("byte -> double     : " + byteToDouble);
        System.out.println();
        System.out.println("short value        : " + shortValue);
        System.out.println("short -> int       : " + shortToInt);
        System.out.println("short -> long      : " + shortToLong);
        System.out.println("short -> float     : " + shortToFloat);
        System.out.println("short -> double    : " + shortToDouble);
        System.out.println();
        System.out.println("char value         : '" + charValue + "'");
        System.out.println("char -> int        : " + charToInt);
        System.out.println("char -> long       : " + charToLong);
        System.out.println("char -> float      : " + charToFloat);
        System.out.println("char -> double     : " + charToDouble);
        System.out.println();
        System.out.println("int value          : " + intValue);
        System.out.println("int -> long        : " + intToLong);
        System.out.println("int -> float       : " + intToFloat);
        System.out.println("int -> double      : " + intToDouble);
        System.out.println();
        System.out.println("long value         : " + longValue);
        System.out.println("long -> float      : " + longToFloat);
        System.out.println("long -> double     : " + longToDouble);
        System.out.println();
        System.out.println("float value        : " + floatValue);
        System.out.println("float -> double    : " + floatToDouble);
        System.out.println();
        System.out.println("Summary:");
        System.out.println("- Implicit type casting is automatic from smaller to larger types.");
        System.out.println("- It is safe because there is no loss of information in the widening conversion.");
        System.out.println("- Java performs these conversions internally without explicit casts.");
    }
}

/*
Sample output:
Java Implicit Type Casting Example
----------------------------------
byte value         : 42
byte -> short      : 42
byte -> int        : 42
byte -> long       : 42
byte -> float      : 42.0
byte -> double     : 42.0

short value        : 32000
short -> int       : 32000
short -> long      : 32000
short -> float     : 32000.0
short -> double    : 32000.0

char value         : 'A'
char -> int        : 65
char -> long       : 65
char -> float      : 65.0
char -> double     : 65.0

int value          : 123456
int -> long        : 123456
int -> float       : 123456.0
int -> double      : 123456.0

long value         : 123456789
long -> float      : 1.23456792E8
long -> double     : 1.23456789E8

float value        : 3.14
float -> double    : 3.14

Summary:
- Implicit type casting is automatic from smaller to larger types.
- It is safe because there is no loss of information in the widening conversion.
- Java performs these conversions internally without explicit casts.
*/
