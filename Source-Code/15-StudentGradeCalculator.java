// Program to calculate the student's grade using the if-else-if-else statement

import java.util.Scanner; // Imports the Scanner class for reading user input

public class StudentGradeCalculator { // Declares the StudentGradeCalculator class

    public static void main(String[] args) { // Main method where program execution starts

        // Creates a Scanner object to accept input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompts the user to enter the student's marks
        System.out.print("Enter Student Marks (0 - 100): ");

        // Reads the marks entered by the user
        int marks = scanner.nextInt();

        // Checks whether the entered marks are valid
        if (marks < 0 || marks > 100) {

            // Displays an error message for invalid marks
            System.out.println("Invalid Marks! Please enter marks between 0 and 100.");

        }
        // Checks whether the student secured Grade A+
        else if (marks >= 90) {

            // Displays Grade A+
            System.out.println("Grade : A+");

            // Displays the result status
            System.out.println("Result : Outstanding");

        }
        // Checks whether the student secured Grade A
        else if (marks >= 80) {

            // Displays Grade A
            System.out.println("Grade : A");

            // Displays the result status
            System.out.println("Result : Excellent");

        }
        // Checks whether the student secured Grade B
        else if (marks >= 70) {

            // Displays Grade B
            System.out.println("Grade : B");

            // Displays the result status
            System.out.println("Result : Very Good");

        }
        // Checks whether the student secured Grade C
        else if (marks >= 60) {

            // Displays Grade C
            System.out.println("Grade : C");

            // Displays the result status
            System.out.println("Result : Good");

        }
        // Checks whether the student secured Grade D
        else if (marks >= 50) {

            // Displays Grade D
            System.out.println("Grade : D");

            // Displays the result status
            System.out.println("Result : Pass");

        }
        // Executes when the student scores below 50
        else {

            // Displays Grade F
            System.out.println("Grade : F");

            // Displays the result status
            System.out.println("Result : Fail");

        }

        // Closes the Scanner object to release system resources
        scanner.close();

    } // Ends the main method

} // Ends the StudentGradeCalculator class
