/**
 * ============================================================================
 * Program Name : Right Triangle Repeated Alphabet Pattern
 * Description  : Prints a Right Triangle Repeated Alphabet Pattern
 *                using nested for loops and ASCII value conversion.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * A
 * B B
 * C C C
 * D D D D
 * E E E E E
 * ============================================================================
 */

public class RightTriangleRepeatedAlphabetPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Display the title of the program.
        System.out.println("Right Triangle Repeated Alphabet Pattern\n");

        // The outer loop controls the total number of rows.
        // Variable 'i' represents the current row number.
        for (int i = 1; i <= rows; i++) {

            // Calculate the alphabet corresponding to the current row.
            //
            // ASCII Value Explanation:
            //
            // A = 65
            // B = 66
            // C = 67
            // D = 68
            // E = 69
            //
            // Formula:
            // (char)(64 + i)
            //
            // Row 1 -> A
            // Row 2 -> B
            // Row 3 -> C
            // Row 4 -> D
            // Row 5 -> E
            char alphabet = (char) (64 + i);

            // The inner loop controls the number of alphabets
            // printed in the current row.
            // Variable 'j' represents the current column number.
            for (int j = 1; j <= i; j++) {

                // Print the calculated alphabet
                // followed by a space.
                System.out.print(alphabet + " ");
            }

            // Move the cursor to the next line
            // after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message.
        System.out.println("Right Triangle Repeated Alphabet Pattern Printed Successfully.");
    }
}
