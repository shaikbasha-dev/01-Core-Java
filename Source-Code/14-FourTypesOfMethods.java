// Program to demonstrate all four types of methods in Java

public class FourTypesOfMethods { // Declares the public class named FourTypesOfMethods

    // Method 1: No Return Type and No Arguments
    void displayWelcomeMessage() { // Method does not accept arguments and does not return a value
        System.out.println("Method 1: No Return Type and No Arguments"); // Displays the method type
        System.out.println("Welcome to Java Programming."); // Prints a welcome message
    } // Ends Method 1

    // Method 2: No Return Type but With Arguments
    void displayStudentDetails(String studentName, int studentAge) { // Method accepts arguments but does not return a value
        System.out.println("Method 2: No Return Type but With Arguments"); // Displays the method type
        System.out.println("Student Name : " + studentName); // Displays the student's name
        System.out.println("Student Age  : " + studentAge); // Displays the student's age
    } // Ends Method 2

    // Method 3: Return Type but No Arguments
    String getCollegeName() { // Method does not accept arguments but returns a String value
        return "ABC Engineering College"; // Returns the college name
    } // Ends Method 3

    // Method 4: Return Type and With Arguments
    int calculateSum(int firstNumber, int secondNumber) { // Method accepts arguments and returns their sum
        return firstNumber + secondNumber; // Returns the sum of two numbers
    } // Ends Method 4

    // Main method where program execution starts
    public static void main(String[] args) {

        // Creates an object to access non-static methods
        FourTypesOfMethods methodObject = new FourTypesOfMethods();

        // Calls Method 1
        methodObject.displayWelcomeMessage();

        System.out.println(); // Prints a blank line

        // Calls Method 2
        methodObject.displayStudentDetails("Mahaboob Basha", 25);

        System.out.println(); // Prints a blank line

        // Calls Method 3 and stores the returned value
        String collegeName = methodObject.getCollegeName();

        // Displays the returned value
        System.out.println("Method 3: Return Type but No Arguments");
        System.out.println("College Name : " + collegeName);

        System.out.println(); // Prints a blank line

        // Calls Method 4 and stores the returned value
        int sum = methodObject.calculateSum(25, 15);

        // Displays the returned value
        System.out.println("Method 4: Return Type and With Arguments");
        System.out.println("Sum : " + sum);

    } // Ends the main method

} // Ends the FourTypesOfMethods class
