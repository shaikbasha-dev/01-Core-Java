/**
 * ============================================================================
 * Program Name : Right Triangle Reverse Alphabet Pattern
 * Description  : Prints a Right Triangle Reverse Alphabet Pattern
 *                using nested for loops.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * Z
 * Z Y
 * Z Y X
 * Z Y X W
 * Z Y X W V
 * ============================================================================
 */

public class RightTriangleReverseAlphabetPattern {

    /**
     * The main() method is the starting point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Display the title of the program.
        System.out.println("Right Triangle Reverse Alphabet Pattern\n");

        // Outer loop controls the number of rows.
        // Variable 'i' represents the current row.
        for (int i = 1; i <= rows; i++) {

            // Inner loop controls the number of alphabets printed
            // in the current row.
            // Variable 'j' represents the current column.
            for (int j = 1; j <= i; j++) {

                // Calculate the reverse alphabet.
                //
                // ASCII Value Explanation:
                //
                // Z = 90
                // Y = 89
                // X = 88
                // W = 87
                // V = 86
                //
                // Formula:
                // (char)(91 - j)
                //
                // j = 1 → 91 - 1 = 90 → Z
                // j = 2 → 91 - 2 = 89 → Y
                // j = 3 → 91 - 3 = 88 → X
                // j = 4 → 91 - 4 = 87 → W
                // j = 5 → 91 - 5 = 86 → V
                char reverseAlphabet = (char) (91 - j);

                // Print the calculated reverse alphabet
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
        System.out.println("Right Triangle Reverse Alphabet Pattern Printed Successfully.");
    }
}
