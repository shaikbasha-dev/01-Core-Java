/**
 * ============================================================================
 * Program Name : Right Triangle Odd Number Pattern
 * Description  : Prints a Right Triangle Odd Number Pattern using nested loops.
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * 1
 * 1 3
 * 1 3 5
 * 1 3 5 7
 * 1 3 5 7 9
 * ============================================================================
 */

public class RightTriangleOddNumberPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows to print.
        int rows = 5;

        // Display the program title.
        System.out.println("Right Triangle Odd Number Pattern\n");

        // The outer loop controls the total number of rows.
        // Variable 'i' represents the current row number.
        for (int i = 1; i <= rows; i++) {

            // The inner loop controls the number of columns in the current row.
            // Variable 'j' represents the current column position.
            for (int j = 1; j <= i; j++) {

                // Calculate the current odd number.
                // Formula:
                // (2 × Column Number) − 1
                int oddNumber = (2 * j) - 1;

                // Print the calculated odd number followed by a space.
                System.out.print(oddNumber + " ");
            }

            // Move the cursor to the next line after completing the current row.
            System.out.println();
        }

        // Print a blank line for better output formatting.
        System.out.println();

        // Display a success message after printing the pattern.
        System.out.println("Right Triangle Odd Number Pattern Printed Successfully.");
    }
}
