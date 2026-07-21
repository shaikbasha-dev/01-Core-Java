/**
 * ============================================================================
 * Program Name : Inverted Right Triangle Number Pattern
 * Description  : Prints an Inverted Right Triangle Number Pattern
 *                using nested for loops.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 * ============================================================================
 */

public class InvertedRightTriangleNumberPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Display the title of the program.
        System.out.println("Inverted Right Triangle Number Pattern\n");

        // The outer loop controls the total number of rows.
        // It starts from the maximum number of rows
        // and decreases to one.
        for (int i = rows; i >= 1; i--) {

            // The inner loop controls the number of values
            // printed in the current row.
            // Variable 'j' represents the current column number.
            for (int j = 1; j <= i; j++) {

                // Store the current column number in a separate variable.
                int number = j;

                // Print the current number followed by a space.
                System.out.print(number + " ");
            }

            // Move the cursor to the next line
            // after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message after printing the pattern.
        System.out.println("Inverted Right Triangle Number Pattern Printed Successfully.");
    }
}
