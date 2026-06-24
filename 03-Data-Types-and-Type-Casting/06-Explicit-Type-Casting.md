/*
 * Headline: Java Program Demonstrating Explicit Type Casting
 *
 * This program shows explicit type casting in Java, where the programmer
 * forces a conversion from a larger primitive type to a smaller primitive type.
 * It includes examples for long, int, float, double, and char conversions.
 */

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        // Pseudocode:
        // 1. Declare a long value and cast it to int, short, and byte.
        // 2. Declare a double value and cast it to float, long, int, and short.
        // 3. Declare a float value and cast it to int and short.
        // 4. Declare an int value and cast it to byte.
        // 5. Declare a char value and cast it to byte, short, and int.
        // 6. Print the original and cast values with labels.

        // Explanation:
        // - Explicit type casting is required when converting a larger type to a smaller type.
        // - This is also called narrowing conversion.
        // - The cast operator is written in parentheses before the target type.

        // long to smaller types
        long longValue = 9876543210L;
        int longToInt = (int) longValue;
        short longToShort = (short) longValue;
        byte longToByte = (byte) longValue;

        // double to smaller types
        double doubleValue = 12345.6789;
        float doubleToFloat = (float) doubleValue;
        long doubleToLong = (long) doubleValue;
        int doubleToInt = (int) doubleValue;
        short doubleToShort = (short) doubleValue;

        // float to smaller integer types
        float floatValue = 98.76f;
        int floatToInt = (int) floatValue;
        short floatToShort = (short) floatValue;

        // int to byte
        int intValue = 260;
        byte intToByte = (byte) intValue;

        // char to numeric types
        char charValue = 'Z';
        byte charToByte = (byte) charValue;
        short charToShort = (short) charValue;
        int charToInt = (int) charValue;

        // Print explicit conversions
        System.out.println("Java Explicit Type Casting Example");
        System.out.println("----------------------------------");
        System.out.println("long value           : " + longValue);
        System.out.println("long -> int          : " + longToInt);
        System.out.println("long -> short        : " + longToShort);
        System.out.println("long -> byte         : " + longToByte);
        System.out.println();
        System.out.println("double value         : " + doubleValue);
        System.out.println("double -> float      : " + doubleToFloat);
        System.out.println("double -> long       : " + doubleToLong);
        System.out.println("double -> int        : " + doubleToInt);
        System.out.println("double -> short      : " + doubleToShort);
        System.out.println();
        System.out.println("float value          : " + floatValue);
        System.out.println("float -> int         : " + floatToInt);
        System.out.println("float -> short       : " + floatToShort);
        System.out.println();
        System.out.println("int value            : " + intValue);
        System.out.println("int -> byte          : " + intToByte);
        System.out.println();
        System.out.println("char value           : '" + charValue + "'");
        System.out.println("char -> byte         : " + charToByte);
        System.out.println("char -> short        : " + charToShort);
        System.out.println("char -> int          : " + charToInt);
        System.out.println();
        System.out.println("Summary:");
        System.out.println("- Explicit type casting is needed for narrowing conversions.");
        System.out.println("- Data may be lost or changed during the conversion.");
        System.out.println("- Use the cast operator, e.g. (int) value.");
    }
}

/*
Sample output:
Java Explicit Type Casting Example
----------------------------------
long value           : 9876543210
long -> int          : 1410065402
long -> short        : -17582
long -> byte         : 90

double value         : 12345.6789
double -> float      : 12345.679
double -> long       : 12345
double -> int        : 12345
double -> short      : 12345

float value          : 98.76
float -> int         : 98
float -> short       : 98

int value            : 260
int -> byte          : 4

char value           : 'Z'
char -> byte         : 90
char -> short        : 90
char -> int          : 90

Summary:
- Explicit type casting is needed for narrowing conversions.
- Data may be lost or changed during the conversion.
- Use the cast operator, e.g. (int) value.
*/
