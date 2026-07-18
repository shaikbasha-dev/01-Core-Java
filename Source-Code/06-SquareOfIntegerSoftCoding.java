// Square of an Integer (Soft Coding) Program in Java

// Import Scanner class from java.util package
import java.util.Scanner;

// Define a public class named SquareOfIntegerSoftCoding
public class SquareOfIntegerSoftCoding {

    // Main method - JVM starts program execution from here
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an Integer: ");

        // Read the integer entered by the user
        int number = scanner.nextInt();

        // Calculate the square of the integer
        int square = number * number;

        // Display the input value
        System.out.println("Number : " + number);

        // Display the calculated square
        System.out.println("Square : " + square);

        // Close the Scanner object to release system resources
        scanner.close();

    } // End of main method

} // End of SquareOfIntegerSoftCoding class
