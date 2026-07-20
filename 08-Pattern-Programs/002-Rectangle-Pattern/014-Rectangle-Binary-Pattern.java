// Import the Scanner class to read user input
import java.util.Scanner;

// Main class
public class RectangleBinaryPattern {

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

            // Start the binary value with 0 for every row
            int binary = 0;

            // Inner loop controls the columns
            for (int column = 1; column <= columns; column++) {

                // Print the current binary value
                System.out.print(binary + " ");

                // Toggle the binary value
                if (binary == 0) {
                    binary = 1;
                } else {
                    binary = 0;
                }
            }

            // Move to the next line after completing one row
            System.out.println();
        }

        // Close the Scanner object
        scanner.close();
    }
}
