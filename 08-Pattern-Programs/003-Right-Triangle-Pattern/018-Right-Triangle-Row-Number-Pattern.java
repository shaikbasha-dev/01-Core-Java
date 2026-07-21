/**
 * ============================================================================
 * Program Name : Right Triangle Row Number Pattern
 * Description  : Prints a Right Triangle Row Number Pattern using nested
 *                for loops. Every row prints its own row number repeatedly.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 * ============================================================================
 */

public class RightTriangleRowNumberPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Display the title of the program.
        System.out.println("Right Triangle Row Number Pattern\n");

        // The outer loop controls the total number of rows.
        // Variable 'i' represents the current row number.
        for (int i = 1; i <= rows; i++) {

            // Store the current row number in a separate variable.
            int rowNumber = i;

            // The inner loop controls the number of values
            // printed in the current row.
            // Variable 'j' represents the current column number.
            for (int j = 1; j <= i; j++) {

                // Print the row number followed by a space.
                System.out.print(rowNumber + " ");
            }

            // Move the cursor to the next line
            // after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message after printing the pattern.
        System.out.println("Right Triangle Row Number Pattern Printed Successfully.");
    }
}
