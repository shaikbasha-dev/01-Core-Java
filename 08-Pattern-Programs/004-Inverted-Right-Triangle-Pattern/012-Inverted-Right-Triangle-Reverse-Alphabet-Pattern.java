/**
 * ============================================================================
 * Program Name : Inverted Right Triangle Reverse Alphabet Pattern
 * Description  : Prints an Inverted Right Triangle Reverse Alphabet Pattern
 *                using nested for loops.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * E D C B A
 * D C B A
 * C B A
 * B A
 * A
 * ============================================================================
 */

public class InvertedRightTriangleReverseAlphabetPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Display the title of the pattern.
        System.out.println("Inverted Right Triangle Reverse Alphabet Pattern\n");

        // The outer loop controls the rows.
        // It starts from the maximum number of rows
        // and decreases to one.
        for (int i = rows; i >= 1; i--) {

            // The inner loop controls the reverse alphabets
            // printed in the current row.
            // Variable 'j' represents the current alphabet position.
            for (int j = i; j >= 1; j--) {

                // Convert the current position into
                // its corresponding uppercase alphabet.
                char reverseAlphabet = (char) (64 + j);

                // Print the generated reverse alphabet
                // followed by a space.
                System.out.print(reverseAlphabet + " ");
            }

            // Move the cursor to the next line
            // after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message after printing the pattern.
        System.out.println("Inverted Right Triangle Reverse Alphabet Pattern Printed Successfully.");
    }
}
