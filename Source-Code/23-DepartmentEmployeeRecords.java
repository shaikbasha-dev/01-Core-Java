// Program to demonstrate a Jagged Array in Java

import java.util.Scanner; // Imports the Scanner class for reading user input

public class DepartmentEmployeeRecords { // Declares the DepartmentEmployeeRecords class

    public static void main(String[] args) { // Main method where program execution starts

        // Creates a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // Prompts the user to enter the number of departments
        System.out.print("Enter the Number of Departments: ");

        // Reads the number of departments
        int numberOfDepartments = scanner.nextInt();

        // Creates a jagged array
        int[][] employeeIds = new int[numberOfDepartments][];

        // Creates each row with a different size
        for (int department = 0; department < numberOfDepartments; department++) {

            // Prompts the user to enter the number of employees
            System.out.print("Enter the Number of Employees in Department " + (department + 1) + ": ");

            // Reads the number of employees
            int numberOfEmployees = scanner.nextInt();

            // Allocates memory for the current department
            employeeIds[department] = new int[numberOfEmployees];

        } // Ends the first for loop

        // Displays a message for entering employee IDs
        System.out.println("\nEnter Employee IDs:");

        // Reads employee IDs using nested loops
        for (int department = 0; department < employeeIds.length; department++) {

            // Iterates through the employees of the current department
            for (int employee = 0; employee < employeeIds[department].length; employee++) {

                // Prompts the user to enter the employee ID
                System.out.print("Department " + (department + 1) + ", Employee " + (employee + 1) + " ID: ");

                // Stores the employee ID in the jagged array
                employeeIds[department][employee] = scanner.nextInt();

            } // Ends the inner for loop

        } // Ends the outer for loop

        // Displays the employee records
        System.out.println("\nDepartment Employee Records");

        // Displays a separator line
        System.out.println("----------------------------");

        // Displays the stored employee IDs
        for (int department = 0; department < employeeIds.length; department++) {

            // Displays the department number
            System.out.print("Department " + (department + 1) + " : ");

            // Displays all employee IDs in the current department
            for (int employee = 0; employee < employeeIds[department].length; employee++) {

                // Displays the employee ID
                System.out.print(employeeIds[department][employee] + " ");

            } // Ends the inner for loop

            // Moves the cursor to the next line
            System.out.println();

        } // Ends the outer for loop

        // Closes the Scanner object to release system resources
        scanner.close();

    } // Ends the main method

} // Ends the DepartmentEmployeeRecords class
