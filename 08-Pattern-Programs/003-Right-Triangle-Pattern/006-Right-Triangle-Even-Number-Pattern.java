/**
 * ============================================================================
 * Program Name : Right Triangle Even Number Pattern
 * Description  : Prints a Right Triangle Even Number Pattern using nested loops.
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * 2
 * 2 4
 * 2 4 6
 * 2 4 6 8
 * 2 4 6 8 10
 * ============================================================================
 */

public class RightTriangleEvenNumberPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Display the program title.
        System.out.println("Right Triangle Even Number Pattern\n");

        // The outer loop controls the number of rows.
        // Variable 'i' represents the current row number.
        for (int i = 1; i <= rows; i++) {

            // The inner loop controls the number of columns.
            // Variable 'j' represents the current position in the row.
            for (int j = 1; j <= i; j++) {

                // Calculate the current even number.
                int evenNumber = j * 2;

                // Print the calculated even number followed by a space.
                System.out.print(evenNumber + " ");
            }

            // Move the cursor to the next line after completing the current row.
            System.out.println();
        }

        // Indicate successful completion of the program.
        System.out.println("\nPattern Printed Successfully.");
    }
}
