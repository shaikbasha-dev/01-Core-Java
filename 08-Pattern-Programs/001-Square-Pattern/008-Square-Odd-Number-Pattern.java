// Import the Scanner class to read user input
import java.util.Scanner;

// Main class
public class SquareOddNumberPattern {

    // Main method - Program execution starts here
    public static void main(String[] args) {

        // Create a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the size of the square
        System.out.print("Enter the size of the square: ");

        // Read the size from the user
        int size = scanner.nextInt();

        // Print a blank line before displaying the pattern
        System.out.println();

        // Outer loop controls the rows
        for (int row = 1; row <= size; row++) {

            // Initialize the first odd number for every row
            int oddNumber = 1;

            // Inner loop controls the columns
            for (int column = 1; column <= size; column++) {

                // Print the current odd number
                System.out.print(oddNumber + " ");

                // Move to the next odd number
                oddNumber = oddNumber + 2;
            }

            // Move to the next line after printing one complete row
            System.out.println();
        }

        // Close the Scanner object
        scanner.close();
    }
}
