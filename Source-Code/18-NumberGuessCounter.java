// Program to guess a secret number using a while loop

import java.util.Scanner; // Imports the Scanner class for reading user input

public class NumberGuessCounter { // Declares the NumberGuessCounter class

    public static void main(String[] args) { // Main method where program execution starts

        // Creates a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // Stores the secret number
        int secretNumber = 25;

        // Stores the user's guess
        int guessedNumber = 0;

        // Counts the number of attempts
        int attemptCount = 0;

        // Displays the game title
        System.out.println("===== Number Guessing Game =====");

        // Repeats until the correct number is guessed
        while (guessedNumber != secretNumber) {

            // Prompts the user to enter a guess
            System.out.print("Enter Your Guess: ");

            // Reads the guessed number
            guessedNumber = scanner.nextInt();

            // Increments the attempt counter
            attemptCount++;

            // Checks whether the guessed number is smaller than the secret number
            if (guessedNumber < secretNumber) {

                // Informs the user to guess a higher number
                System.out.println("Too Low! Try Again.");

            }
            // Checks whether the guessed number is greater than the secret number
            else if (guessedNumber > secretNumber) {

                // Informs the user to guess a lower number
                System.out.println("Too High! Try Again.");

            }
            // Executes when the guessed number is correct
            else {

                // Displays the success message
                System.out.println("Congratulations! You guessed the correct number.");

                // Displays the total number of attempts
                System.out.println("Total Attempts : " + attemptCount);

            }

        } // Ends the while loop

        // Closes the Scanner object to release system resources
        scanner.close();

    } // Ends the main method

} // Ends the NumberGuessCounter class
