/**
 * ============================================================================
 * Program Name : Right Triangle Alphabet Pattern
 * Description  : Prints a Right Triangle Alphabet Pattern using nested loops.
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 * ============================================================================
 */

public class RightTriangleAlphabetPattern {

    /**
     * The main() method is the starting point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows to print.
        int rows = 5;

        // Display the title of the pattern.
        System.out.println("Right Triangle Alphabet Pattern\n");

        // Outer loop controls the total number of rows.
        // Variable 'i' represents the current row number.
        for (int i = 1; i <= rows; i++) {

            // Inner loop controls the number of alphabets printed in each row.
            // Variable 'j' represents the current column position.
            for (int j = 1; j <= i; j++) {

                // Calculate the current alphabet using its ASCII value.
                // ASCII value of 'A' is 65.
                // Formula:
                // (char)(64 + j)
                char alphabet = (char) (64 + j);

                // Print the calculated alphabet followed by a space.
                System.out.print(alphabet + " ");
            }

            // Move the cursor to the next line after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message after printing the pattern.
        System.out.println("Right Triangle Alphabet Pattern Printed Successfully.");
    }
}
