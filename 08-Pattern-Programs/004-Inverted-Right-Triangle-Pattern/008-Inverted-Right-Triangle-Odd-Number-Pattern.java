/**
 * ============================================================================
 * Program Name : Inverted Right Triangle Odd Number Pattern
 * Description  : Prints an Inverted Right Triangle Odd Number Pattern
 *                using nested for loops.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * 1 3 5 7 9
 * 1 3 5 7
 * 1 3 5
 * 1 3
 * 1
 * ============================================================================
 */

public class InvertedRightTriangleOddNumberPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Display the title of the pattern.
        System.out.println("Inverted Right Triangle Odd Number Pattern\n");

        // The outer loop controls the rows.
        // It starts from the maximum number of rows
        // and decreases to one.
        for (int i = rows; i >= 1; i--) {

            // The inner loop controls the number of odd numbers
            // printed in the current row.
            // Variable 'j' represents the current column position.
            for (int j = 1; j <= i; j++) {

                // Calculate the current odd number.
                int oddNumber = (j * 2) - 1;

                // Print the calculated odd number followed by a space.
                System.out.print(oddNumber + " ");
            }

            // Move the cursor to the next line
            // after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message after printing the pattern.
        System.out.println("Inverted Right Triangle Odd Number Pattern Printed Successfully.");
    }
}
