// GreaterOf3Num program finding the largest of three user-entered numbers

import java.util.Scanner; // Import Scanner for reading user input

public class GreaterOf3Num { // Define class named GreaterOf3Num
    public static void main(String[] args) { // Main method: program entry point
        Scanner sc = new Scanner(System.in); // Create Scanner object to read console input
        System.out.print("Please enter first number: "); // Prompt for the first number
        int num1 = sc.nextInt(); // Read first number from user
        System.out.println(); // Print blank line for spacing
        System.out.print("Please enter second number: "); // Prompt for the second number
        int num2 = sc.nextInt(); // Read second number from user
        System.out.println(); // Print blank line for spacing
        System.out.print("Please enter third number: "); // Prompt for the third number
        int num3 = sc.nextInt(); // Read third number from user
        System.out.println(); // Print blank line for spacing
        if(num1 > num2 && num1 > num3) { // If num1 is greater than both num2 and num3
            System.out.println("First number is greater among three numbers"); // Print first number is largest
        }
        else if(num2 > num1 && num2 > num3) { // Else if num2 is greater than both num1 and num3
            System.out.println("Second number is greater among three numbers"); // Print second number is largest
        }
        else { // Otherwise
            System.out.println("Third number is greater among three numbers"); // Print third number is largest
        }
        sc.close();
    } // End of main method
} // End of class GreaterOf3Num

/* 
Output:
Please enter first number: 100
Please enter second number: 50
Please enter third number: 25
First number is greater among three numbers

Please enter first number: 
Please enter second number: 
Please enter third number: 
Second number is greater among three numbers

Please enter first number: 20
Please enter second number: 65
Please enter third number: 120
Third number is greater among three numbers

Pseudocode
Start program
Create Scanner object for console input
Prompt user for first number
Read first number into num1
Prompt user for second number
Read second number into num2
Prompt user for third number
Read third number into num3
If num1 is greater than both num2 and num3:
Print first number is greatest
Else if num2 is greater than both num1 and num3:
Print second number is greatest
Else:
Print third number is greatest
End program


Code Explanation
import java.util.Scanner;
Imports the Scanner class for reading input entered by the user.
public class GreaterOf3Num { ... }
Declares the GreaterOf3Num class.
public static void main(String[] args) { ... }
Declares the main method where execution starts.
Scanner sc = new Scanner(System.in);
Creates a Scanner object that reads from the standard input stream.
System.out.print("Please enter first number: ");
Prompts the user to enter the first number.
int num1 = sc.nextInt();
Reads the entered first number and stores it in num1.
System.out.print("Please enter second number: ");
Prompts the user to enter the second number.
int num2 = sc.nextInt();
Reads the entered second number and stores it in num2.
System.out.print("Please enter third number: ");
Prompts the user to enter the third number.
int num3 = sc.nextInt();
Reads the entered third number and stores it in num3.
if(num1 > num2 && num1 > num3) { ... }
Checks if the first number is larger than both second and third.
else if(num2 > num1 && num2 > num3) { ... }
Checks if the second number is larger than both first and third.
else { ... }
Assumes the third number is the largest if neither first nor second is largest.
 */
