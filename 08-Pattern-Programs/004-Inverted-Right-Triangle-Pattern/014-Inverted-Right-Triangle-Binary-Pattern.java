/**
 * ============================================================================
 * Program Name : Inverted Right Triangle Binary Pattern
 * Description  : Prints an Inverted Right Triangle Binary Pattern
 *                using nested for loops.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * 1 0 1 0 1
 * 1 0 1 0
 * 1 0 1
 * 1 0
 * 1
 * ============================================================================
 */

public class InvertedRightTriangleBinaryPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Display the title of the pattern.
        System.out.println("Inverted Right Triangle Binary Pattern\n");

        // The outer loop controls the rows.
        // It starts from the maximum number of rows
        // and decreases to one.
        for (int i = rows; i >= 1; i--) {

            // The inner loop controls the number of binary digits
            // printed in the current row.
            // Variable 'j' represents the current column position.
            for (int j = 1; j <= i; j++) {

                // Declare a variable to store the current binary digit.
                int binaryDigit;

                // Check whether the current column position is even or odd.
                if (j % 2 == 0) {

                    // Assign 0 for even positions.
                    binaryDigit = 0;

                } else {

                    // Assign 1 for odd positions.
                    binaryDigit = 1;
                }

                // Print the calculated binary digit followed by a space.
                System.out.print(binaryDigit + " ");
            }

            // Move the cursor to the next line
            // after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message after printing the pattern.
        System.out.println("Inverted Right Triangle Binary Pattern Printed Successfully.");
    }
}
