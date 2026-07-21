/**
 * ============================================================================
 * Program Name : Floyd's Triangle Pattern
 * Description  : Prints Floyd's Triangle using nested for loops.
 *                Every number is printed in a continuous sequence.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * ============================================================================
 */

public class RightTriangleFloydsTrianglePattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Declare and initialize the continuous number counter.
        // This variable is declared outside the loops so that
        // the sequence continues across all rows.
        int number = 1;

        // Display the title of the program.
        System.out.println("Floyd's Triangle Pattern\n");

        // The outer loop controls the total number of rows.
        // Variable 'i' represents the current row number.
        for (int i = 1; i <= rows; i++) {

            // The inner loop controls the number of values
            // printed in the current row.
            // Variable 'j' represents the current column number.
            for (int j = 1; j <= i; j++) {

                // Store the current value of the counter
                // in a temporary variable for better readability.
                int currentNumber = number;

                // Print the current number followed by a space.
                System.out.print(currentNumber + " ");

                // Increment the counter so that the next
                // consecutive number is printed.
                number++;
            }

            // Move the cursor to the next line
            // after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message after printing the pattern.
        System.out.println("Floyd's Triangle Pattern Printed Successfully.");
    }
}
