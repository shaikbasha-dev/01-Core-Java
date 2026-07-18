// Program to demonstrate Explicit Type Casting (Narrowing Conversion) in Java

public class ExplicitTypeCasting { // Declares the public class named ExplicitTypeCasting

    public static void main(String[] args) { // Main method where program execution starts

        double doubleValue = 123.99; // Declares and initializes a double variable

        float floatValue = (float) doubleValue; // Explicitly converts double to float

        long longValue = (long) floatValue; // Explicitly converts float to long

        int intValue = (int) longValue; // Explicitly converts long to int

        short shortValue = (short) intValue; // Explicitly converts int to short

        byte byteValue = (byte) shortValue; // Explicitly converts short to byte

        System.out.println("Explicit Type Casting (Narrowing Conversion)"); // Prints the program heading

        System.out.println("--------------------------------------------"); // Prints a separator line

        System.out.println("Double Value : " + doubleValue); // Displays the double value

        System.out.println("Float Value  : " + floatValue); // Displays the float value

        System.out.println("Long Value   : " + longValue); // Displays the long value

        System.out.println("Int Value    : " + intValue); // Displays the int value

        System.out.println("Short Value  : " + shortValue); // Displays the short value

        System.out.println("Byte Value   : " + byteValue); // Displays the byte value

    } // Ends the main method

} // Ends the ExplicitTypeCasting class
