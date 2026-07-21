/**
 * ============================================================================
 * Program Name : Right Triangle Continuous Number Pattern
 * Description  : Prints a Right Triangle Continuous Number Pattern
 *                using nested for loops.
 *
 * Author       : Shaik Mahaboob Basha
 *
 * Pattern:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * ============================================================================
 */

public class RightTriangleContinuousNumberPattern {

    /**
     * The main() method is the entry point of the Java program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize the total number of rows.
        int rows = 5;

        // Declare a variable to store the continuously increasing number.
        // This variable is declared outside the loops so that its value
        // is preserved throughout the execution of the program.
        int number = 1;

        // Display the title of the program.
        System.out.println("Right Triangle Continuous Number Pattern\n");

        // The outer loop controls the total number of rows.
        // Variable 'i' represents the current row number.
        for (int i = 1; i <= rows; i++) {

            // The inner loop controls the number of values
            // printed in the current row.
            // Variable 'j' represents the current column position.
            for (int j = 1; j <= i; j++) {

                // Print the current value of the continuous counter.
                System.out.print(number + " ");

                // Increment the counter so that the next number
                // is printed in the following position.
                number++;
            }

            // Move the cursor to the next line
            // after completing the current row.
            System.out.println();
        }

        // Print a blank line for better readability.
        System.out.println();

        // Display a success message after printing the pattern.
        System.out.println("Right Triangle Continuous Number Pattern Printed Successfully.");
    }
}
