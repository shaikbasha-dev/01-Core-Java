// Program to demonstrate a Three-Dimensional (3D) Array in Java

import java.util.Scanner; // Imports the Scanner class for reading user input

public class ClassroomAttendanceTracker { // Declares the ClassroomAttendanceTracker class

    public static void main(String[] args) { // Main method where program execution starts

        // Creates a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // Prompts the user to enter the number of classrooms
        System.out.print("Enter the Number of Classrooms: ");

        // Reads the number of classrooms
        int numberOfClassrooms = scanner.nextInt();

        // Prompts the user to enter the number of students in each classroom
        System.out.print("Enter the Number of Students in Each Classroom: ");

        // Reads the number of students
        int numberOfStudents = scanner.nextInt();

        // Prompts the user to enter the number of working days
        System.out.print("Enter the Number of Working Days: ");

        // Reads the number of working days
        int numberOfDays = scanner.nextInt();

        // Creates a three-dimensional array to store attendance
        int[][][] attendance = new int[numberOfClassrooms][numberOfStudents][numberOfDays];

        // Displays instructions for entering attendance
        System.out.println("\nEnter Attendance (1 = Present, 0 = Absent)");

        // Reads attendance using three nested loops
        for (int classroom = 0; classroom < numberOfClassrooms; classroom++) {

            // Iterates through each student
            for (int student = 0; student < numberOfStudents; student++) {

                // Iterates through each day
                for (int day = 0; day < numberOfDays; day++) {

                    // Prompts the user to enter attendance
                    System.out.print("Classroom " + (classroom + 1) + ", Student " + (student + 1) + ", Day " + (day + 1) + ": ");

                    // Stores the attendance in the 3D array
                    attendance[classroom][student][day] = scanner.nextInt();

                } // Ends the innermost for loop

            } // Ends the middle for loop

        } // Ends the outer for loop

        // Displays the stored attendance
        System.out.println("\nAttendance Report");

        // Displays a separator line
        System.out.println("--------------------------");

        // Displays attendance using three nested loops
        for (int classroom = 0; classroom < numberOfClassrooms; classroom++) {

            // Displays the classroom number
            System.out.println("Classroom " + (classroom + 1));

            // Iterates through each student
            for (int student = 0; student < numberOfStudents; student++) {

                // Displays the student number
                System.out.print("Student " + (student + 1) + " : ");

                // Iterates through each day
                for (int day = 0; day < numberOfDays; day++) {

                    // Displays the attendance value
                    System.out.print(attendance[classroom][student][day] + " ");

                } // Ends the innermost for loop

                // Moves the cursor to the next line
                System.out.println();

            } // Ends the middle for loop

            // Prints a blank line between classrooms
            System.out.println();

        } // Ends the outer for loop

        // Closes the Scanner object to release system resources
        scanner.close();

    } // Ends the main method

} // Ends the ClassroomAttendanceTracker class
