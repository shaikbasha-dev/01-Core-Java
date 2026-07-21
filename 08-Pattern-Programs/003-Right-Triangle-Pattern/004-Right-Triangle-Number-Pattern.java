/**
 * ============================================================================
 * Program Name : Right Triangle Number Pattern
 * Description  : Prints a Right Triangle Number Pattern using nested loops.
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * ============================================================================
 */

public class RightTriangleNumberPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Print the program title.
        System.out.println("Right Triangle Number Pattern\n");

        // Outer loop controls the number of rows.
        // Variable 'i' represents the current row number.
        for (int i = 1; i <= rows; i++) {

            // Inner loop controls the numbers printed in each row.
            // Variable 'j' represents the current column number.
            for (int j = 1; j <= i; j++) {

                // Print the current column number followed by a space.
                System.out.print(j + " ");
            }

            // Move the cursor to the next line after completing one row.
            System.out.println();
        }
    }
}
