// Program to demonstrate a One-Dimensional (1D) Array in Java

import java.util.Scanner; // Imports the Scanner class for reading user input

public class StudentMarksManager { // Declares the StudentMarksManager class

    public static void main(String[] args) { // Main method where program execution starts

        // Creates a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // Prompts the user to enter the number of students
        System.out.print("Enter the Number of Students: ");

        // Reads the number of students
        int numberOfStudents = scanner.nextInt();

        // Creates a one-dimensional array to store student marks
        int[] studentMarks = new int[numberOfStudents];

        // Displays a message for entering student marks
        System.out.println("\nEnter Student Marks:");

        // Reads the marks of all students using a for loop
        for (int index = 0; index < studentMarks.length; index++) {

            // Prompts the user to enter the marks for each student
            System.out.print("Student " + (index + 1) + " Marks: ");

            // Stores the entered marks in the array
            studentMarks[index] = scanner.nextInt();

        } // Ends the for loop for input

        // Displays the heading for stored marks
        System.out.println("\nStudent Marks");

        // Displays a separator line
        System.out.println("-------------");

        // Displays all stored marks using a for loop
        for (int index = 0; index < studentMarks.length; index++) {

            // Displays each student's marks
            System.out.println("Student " + (index + 1) + " Marks : " + studentMarks[index]);

        } // Ends the for loop for display

        // Closes the Scanner object to release system resources
        scanner.close();

    } // Ends the main method

} // Ends the StudentMarksManager class
