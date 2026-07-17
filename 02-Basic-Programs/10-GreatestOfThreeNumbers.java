// Greatest of Three Numbers Program in Java

// Import Scanner class for reading user input
import java.util.Scanner;

// Define a public class named GreatestOfThreeNumbers
public class GreatestOfThreeNumbers {

    // Main method - JVM starts program execution from here
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the First Number  : ");
        int firstNumber = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the Second Number : ");
        int secondNumber = scanner.nextInt();

        // Prompt the user to enter the third number
        System.out.print("Enter the Third Number  : ");
        int thirdNumber = scanner.nextInt();

        System.out.println();

        // Determine the greatest number
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {

            System.out.println(firstNumber + " is the Greatest Number.");

        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {

            System.out.println(secondNumber + " is the Greatest Number.");

        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {

            System.out.println(thirdNumber + " is the Greatest Number.");

        } else {

            System.out.println("Two or more numbers are equal.");

        }

        // Close the Scanner object to release system resources
        scanner.close();

    } // End of main method

} // End of GreatestOfThreeNumbers class
