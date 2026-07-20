// Import the Scanner class to read user input
import java.util.Scanner;

// Main class
public class SquareBinaryPattern {

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

            // Inner loop controls the columns
            for (int column = 1; column <= size; column++) {

                // Check whether the column number is odd or even
                if (column % 2 == 1) {

                    // Print 1 for odd columns
                    System.out.print("1 ");

                } else {

                    // Print 0 for even columns
                    System.out.print("0 ");
                }
            }

            // Move to the next line after completing one row
            System.out.println();
        }

        // Close the Scanner object
        scanner.close();
    }
}
