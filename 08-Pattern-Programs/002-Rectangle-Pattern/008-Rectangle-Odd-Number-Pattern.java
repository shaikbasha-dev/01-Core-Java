// Import the Scanner class to read user input
import java.util.Scanner;

// Main class
public class RectangleOddNumberPattern {

    // Main method - Program execution starts here
    public static void main(String[] args) {

        // Create a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of rows
        System.out.print("Enter the number of rows: ");

        // Read the number of rows
        int rows = scanner.nextInt();

        // Ask the user to enter the number of columns
        System.out.print("Enter the number of columns: ");

        // Read the number of columns
        int columns = scanner.nextInt();

        // Print a blank line before displaying the pattern
        System.out.println();

        // Outer loop controls the rows
        for (int row = 1; row <= rows; row++) {

            // Start the odd number from 1 for every row
            int oddNumber = 1;

            // Inner loop controls the columns
            for (int column = 1; column <= columns; column++) {

                // Print the current odd number
                System.out.print(oddNumber + " ");

                // Move to the next odd number
                oddNumber = oddNumber + 2;
            }

            // Move to the next line after completing one row
            System.out.println();
        }

        // Close the Scanner object
        scanner.close();
    }
}
