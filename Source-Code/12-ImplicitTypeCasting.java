// Program to demonstrate Implicit Type Casting (Widening Conversion) in Java

public class ImplicitTypeCasting { // Declares the public class named ImplicitTypeCasting

    public static void main(String[] args) { // Main method where program execution starts

        byte byteValue = 100; // Declares and initializes a byte variable

        short shortValue = byteValue; // Implicitly converts byte to short

        int intValue = shortValue; // Implicitly converts short to int

        long longValue = intValue; // Implicitly converts int to long

        float floatValue = longValue; // Implicitly converts long to float

        double doubleValue = floatValue; // Implicitly converts float to double

        System.out.println("Implicit Type Casting (Widening Conversion)"); // Prints the program heading

        System.out.println("-------------------------------------------"); // Prints a separator line

        System.out.println("Byte Value   : " + byteValue); // Displays the byte value

        System.out.println("Short Value  : " + shortValue); // Displays the short value

        System.out.println("Int Value    : " + intValue); // Displays the int value

        System.out.println("Long Value   : " + longValue); // Displays the long value

        System.out.println("Float Value  : " + floatValue); // Displays the float value

        System.out.println("Double Value : " + doubleValue); // Displays the double value

    } // Ends the main method

} // Ends the ImplicitTypeCasting class
