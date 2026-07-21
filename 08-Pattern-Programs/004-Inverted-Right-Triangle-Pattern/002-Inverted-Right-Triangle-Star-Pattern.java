/**
 * ============================================================================
 * Program Name : Inverted Right Triangle Star Pattern
 * Description  : Prints an Inverted Right Triangle Star Pattern
 *                using nested for loops.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * * * * *
 * * * *
 * * *
 * *
 * *
 * ============================================================================
 */

public class InvertedRightTriangleStarPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Display the title of the program.
        System.out.println("Inverted Right Triangle Star Pattern\n");

        // The outer loop controls the rows.
        // It starts from the maximum number of rows
        // and decreases to one.
        for (int i = rows; i >= 1; i--) {

            // The inner loop controls the number of stars
            // printed in the current row.
            // Variable 'j' represents the current column.
            for (int j = 1; j <= i; j++) {

                // Print a star followed by a space.
                System.out.print("* ");
            }

            // Move the cursor to the next line
            // after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message after printing the pattern.
        System.out.println("Inverted Right Triangle Star Pattern Printed Successfully.");
    }
}
