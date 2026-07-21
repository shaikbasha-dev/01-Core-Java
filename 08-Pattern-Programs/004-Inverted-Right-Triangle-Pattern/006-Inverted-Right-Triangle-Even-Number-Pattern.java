/**
 * ============================================================================
 * Program Name : Inverted Right Triangle Even Number Pattern
 * Description  : Prints an Inverted Right Triangle Even Number Pattern
 *                using nested for loops.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * 2 4 6 8 10
 * 2 4 6 8
 * 2 4 6
 * 2 4
 * 2
 * ============================================================================
 */

public class InvertedRightTriangleEvenNumberPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Display the title of the pattern.
        System.out.println("Inverted Right Triangle Even Number Pattern\n");

        // The outer loop controls the rows.
        // It starts from the maximum number of rows
        // and decreases to one.
        for (int i = rows; i >= 1; i--) {

            // The inner loop controls the number of even numbers
            // printed in the current row.
            // Variable 'j' represents the current column position.
            for (int j = 1; j <= i; j++) {

                // Calculate the current even number.
                int evenNumber = j * 2;

                // Print the calculated even number followed by a space.
                System.out.print(evenNumber + " ");
            }

            // Move the cursor to the next line
            // after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message after printing the pattern.
        System.out.println("Inverted Right Triangle Even Number Pattern Printed Successfully.");
    }
}
