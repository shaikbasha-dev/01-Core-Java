// Import the Scanner class to read input from the keyboard
import java.util.Scanner;

// Main class
public class SquareStarPattern {

    // Main method - Program execution starts here
    public static void main(String[] args) {

        // Create a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the size of the square
        System.out.print("Enter the size of the square: ");

        // Read the number of rows and columns
        int size = scanner.nextInt();

        // Print a blank line before displaying the pattern
        System.out.println();

        // Outer loop controls the rows
        for (int row = 1; row <= size; row++) {

            // Inner loop controls the columns
            for (int column = 1; column <= size; column++) {

                // Print one star followed by a space
                System.out.print("* ");
            }

            // Move the cursor to the next line after completing one row
            System.out.println();
        }

        // Close the Scanner object to release system resources
        scanner.close();
    }
}
