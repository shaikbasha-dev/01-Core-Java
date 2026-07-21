/**
 * ============================================================================
 * Program Name : Inverted Right Triangle Reverse Number Pattern
 * Description  : Prints an Inverted Right Triangle Reverse Number Pattern
 *                using nested for loops.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * 5 4 3 2 1
 * 4 3 2 1
 * 3 2 1
 * 2 1
 * 1
 * ============================================================================
 */

public class InvertedRightTriangleReverseNumberPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Display the title of the pattern.
        System.out.println("Inverted Right Triangle Reverse Number Pattern\n");

        // The outer loop controls the rows.
        // It starts from the maximum number of rows
        // and decreases to one.
        for (int i = rows; i >= 1; i--) {

            // The inner loop controls the reverse numbers
            // printed in the current row.
            // Variable 'j' represents the current number being printed.
            for (int j = i; j >= 1; j--) {

                // Store the current reverse number in a separate variable.
                int reverseNumber = j;

                // Print the current reverse number followed by a space.
                System.out.print(reverseNumber + " ");
            }

            // Move the cursor to the next line
            // after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message after printing the pattern.
        System.out.println("Inverted Right Triangle Reverse Number Pattern Printed Successfully.");
    }
}
