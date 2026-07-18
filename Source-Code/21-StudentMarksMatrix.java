// Program to demonstrate a Two-Dimensional (2D) Array in Java

import java.util.Scanner; // Imports the Scanner class for reading user input

public class StudentMarksMatrix { // Declares the StudentMarksMatrix class

    public static void main(String[] args) { // Main method where program execution starts

        // Creates a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // Prompts the user to enter the number of students
        System.out.print("Enter the Number of Students: ");

        // Reads the number of students
        int numberOfStudents = scanner.nextInt();

        // Prompts the user to enter the number of subjects
        System.out.print("Enter the Number of Subjects: ");

        // Reads the number of subjects
        int numberOfSubjects = scanner.nextInt();

        // Creates a two-dimensional array to store student marks
        int[][] studentMarks = new int[numberOfStudents][numberOfSubjects];

        // Displays a message for entering student marks
        System.out.println("\nEnter Student Marks:");

        // Reads the marks using nested for loops
        for (int row = 0; row < numberOfStudents; row++) {

            // Reads the marks for each subject
            for (int column = 0; column < numberOfSubjects; column++) {

                // Prompts the user to enter the marks
                System.out.print("Student " + (row + 1) + ", Subject " + (column + 1) + " Marks: ");

                // Stores the entered marks in the array
                studentMarks[row][column] = scanner.nextInt();

            } // Ends the inner for loop

        } // Ends the outer for loop

        // Displays the heading
        System.out.println("\nStudent Marks Matrix");

        // Displays a separator line
        System.out.println("---------------------");

        // Displays the stored marks using nested for loops
        for (int row = 0; row < numberOfStudents; row++) {

            // Displays the student number
            System.out.print("Student " + (row + 1) + " : ");

            // Displays the marks of each subject
            for (int column = 0; column < numberOfSubjects; column++) {

                // Displays each subject mark
                System.out.print(studentMarks[row][column] + "\t");

            } // Ends the inner for loop

            // Moves the cursor to the next line
            System.out.println();

        } // Ends the outer for loop

        // Closes the Scanner object to release system resources
        scanner.close();

    } // Ends the main method

} // Ends the StudentMarksMatrix class
