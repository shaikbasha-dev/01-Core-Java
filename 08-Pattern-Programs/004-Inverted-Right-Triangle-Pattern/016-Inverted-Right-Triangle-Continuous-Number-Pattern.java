/**
 * ============================================================================
 * Program Name : Inverted Right Triangle Continuous Number Pattern
 * Description  : Prints an Inverted Right Triangle Continuous Number Pattern
 *                using nested for loops.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * 1 2 3 4 5
 * 6 7 8 9
 * 10 11 12
 * 13 14
 * 15
 * ============================================================================
 */

public class InvertedRightTriangleContinuousNumberPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Declare and initialize the continuous number counter.
        int currentNumber = 1;

        // Display the title of the pattern.
        System.out.println("Inverted Right Triangle Continuous Number Pattern\n");

        // The outer loop controls the rows.
        // It starts from the maximum number of rows
        // and decreases to one.
        for (int i = rows; i >= 1; i--) {

            // The inner loop controls the number of values
            // printed in the current row.
            // Variable 'j' represents the current column position.
            for (int j = 1; j <= i; j++) {

                // Print the current continuous number.
                System.out.print(currentNumber + " ");

                // Increment the counter so that
                // the next printed value is consecutive.
                currentNumber++;
            }

            // Move the cursor to the next line
            // after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message after printing the pattern.
        System.out.println("Inverted Right Triangle Continuous Number Pattern Printed Successfully.");
    }
}
