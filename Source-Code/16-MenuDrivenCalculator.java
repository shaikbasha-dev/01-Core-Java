// Program to demonstrate the switch statement using a menu-driven calculator

import java.util.Scanner; // Imports the Scanner class for reading user input

public class MenuDrivenCalculator { // Declares the MenuDrivenCalculator class

    public static void main(String[] args) { // Main method where program execution starts

        // Creates a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // Prompts the user to enter the first number
        System.out.print("Enter First Number: ");

        // Reads the first number
        int firstNumber = scanner.nextInt();

        // Prompts the user to enter the second number
        System.out.print("Enter Second Number: ");

        // Reads the second number
        int secondNumber = scanner.nextInt();

        // Displays the calculator menu
        System.out.println("\n===== MENU DRIVEN CALCULATOR =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        // Prompts the user to choose an operation
        System.out.print("Enter Your Choice: ");

        // Reads the user's choice
        int choice = scanner.nextInt();

        // Executes the selected operation using the switch statement
        switch (choice) {

            // Executes when the user selects Addition
            case 1:
                System.out.println("Addition = " + (firstNumber + secondNumber));
                break;

            // Executes when the user selects Subtraction
            case 2:
                System.out.println("Subtraction = " + (firstNumber - secondNumber));
                break;

            // Executes when the user selects Multiplication
            case 3:
                System.out.println("Multiplication = " + (firstNumber * secondNumber));
                break;

            // Executes when the user selects Division
            case 4:

                // Checks whether the divisor is zero
                if (secondNumber != 0) {

                    // Displays the division result
                    System.out.println("Division = " + (firstNumber / secondNumber));

                } else {

                    // Displays an error message
                    System.out.println("Division by zero is not allowed.");

                }

                break;

            // Executes when the user selects Modulus
            case 5:

                // Checks whether the divisor is zero
                if (secondNumber != 0) {

                    // Displays the remainder
                    System.out.println("Modulus = " + (firstNumber % secondNumber));

                } else {

                    // Displays an error message
                    System.out.println("Modulus by zero is not allowed.");

                }

                break;

            // Executes when the entered choice is invalid
            default:
                System.out.println("Invalid Choice! Please select a valid option.");

        }

        // Closes the Scanner object to release system resources
        scanner.close();

    } // Ends the main method

} // Ends the MenuDrivenCalculator class
