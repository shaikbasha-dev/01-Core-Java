// Even or Odd Number Program in Java

// Import Scanner class for user input
import java.util.Scanner;

// Define a public class named EvenOdd
public class EvenOdd {

    // Main method - JVM starts program execution from here
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an Integer: ");

        // Read the integer entered by the user
        int number = scanner.nextInt();

        // Check whether the number is even or odd
        if (number % 2 == 0) {

            // Executes when the remainder is zero
            System.out.println(number + " is an Even Number.");

        } else {

            // Executes when the remainder is not zero
            System.out.println(number + " is an Odd Number.");

        }

        // Close the Scanner object to release system resources
        scanner.close();

    } // End of main method

} // End of EvenOdd class
