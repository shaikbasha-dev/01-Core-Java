/**
 * ============================================================================
 * Program Name : Right Triangle Binary Pattern
 * Description  : Prints a Right Triangle Binary Pattern using nested loops.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * 1
 * 1 0
 * 1 0 1
 * 1 0 1 0
 * 1 0 1 0 1
 * ============================================================================
 */

public class RightTriangleBinaryPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Display the title of the program.
        System.out.println("Right Triangle Binary Pattern\n");

        // The outer loop controls the total number of rows.
        // Variable 'i' represents the current row number.
        for (int i = 1; i <= rows; i++) {

            // The inner loop controls the number of binary digits
            // printed in the current row.
            // Variable 'j' represents the current column number.
            for (int j = 1; j <= i; j++) {

                // Declare a variable to store the binary digit.
                int binaryDigit;

                // Check whether the current column number is even.
                if (j % 2 == 0) {

                    // If the column number is even,
                    // store binary digit 0.
                    binaryDigit = 0;

                } else {

                    // Otherwise, store binary digit 1.
                    binaryDigit = 1;
                }

                // Print the generated binary digit
                // followed by a space.
                System.out.print(binaryDigit + " ");
            }

            // Move the cursor to the next line
            // after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message.
        System.out.println("Right Triangle Binary Pattern Printed Successfully.");
    }
}
