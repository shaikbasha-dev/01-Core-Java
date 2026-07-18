// Program to generate the multiplication table of a given number using a for loop

import java.util.Scanner; // Imports the Scanner class for reading user input

public class MultiplicationTableGenerator { // Declares the MultiplicationTableGenerator class

    public static void main(String[] args) { // Main method where program execution starts

        // Creates a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompts the user to enter a number
        System.out.print("Enter a Number: ");

        // Reads the number entered by the user
        int number = scanner.nextInt();

        // Displays the heading of the multiplication table
        System.out.println("\nMultiplication Table of " + number);

        // Displays a separator line
        System.out.println("------------------------------");

        // Executes the loop from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // Displays the multiplication table
            System.out.println(number + " x " + i + " = " + (number * i));

        } // Ends the for loop

        // Closes the Scanner object to release system resources
        scanner.close();

    } // Ends the main method

} // Ends the MultiplicationTableGenerator class
