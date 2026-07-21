/**
 * ============================================================================
 * Program Name : Inverted Right Triangle Alphabet Pattern
 * Description  : Prints an Inverted Right Triangle Alphabet Pattern
 *                using nested for loops.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * A B C D E
 * A B C D
 * A B C
 * A B
 * A
 * ============================================================================
 */

public class InvertedRightTriangleAlphabetPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Display the title of the pattern.
        System.out.println("Inverted Right Triangle Alphabet Pattern\n");

        // The outer loop controls the rows.
        // It starts from the maximum number of rows
        // and decreases to one.
        for (int i = rows; i >= 1; i--) {

            // The inner loop controls the number of alphabets
            // printed in the current row.
            // Variable 'j' represents the current column position.
            for (int j = 1; j <= i; j++) {

                // Convert the current column number into
                // its corresponding uppercase alphabet.
                char alphabet = (char) (64 + j);

                // Print the generated alphabet followed by a space.
                System.out.print(alphabet + " ");
            }

            // Move the cursor to the next line
            // after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message after printing the pattern.
        System.out.println("Inverted Right Triangle Alphabet Pattern Printed Successfully.");
    }
}
