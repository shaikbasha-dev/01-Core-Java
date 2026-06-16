// CalculatorHC program performing basic arithmetic operations using hardcoded values

public class CalculatorHC { // Define class named CalculatorHC
    public static void main(String[] args) { // Main method: entry point of the program
        // Calculator program using hard coding
        int num1 = 100; // Declare integer variable num1 and assign 100
        int num2 = 50; // Declare integer variable num2 and assign 50
        int add = num1 + num2; // Perform addition and store result in add variable
        int sub = num1 - num2; // Perform subtraction and store result in sub variable
        int mul = num1 * num2; // Perform multiplication and store result in mul variable
        int div = num1 / num2; // Perform division and store result in div variable
        System.out.println("Addition Result: " + add); // Print addition result with label
        System.out.println("Subtraction Result: " + sub); // Print subtraction result with label
        System.out.println("Multiplication Result: " + mul); // Print multiplication result with label
        System.out.println("Division Result: " + div); // Print division result with label
    } // End of main method
} // End of class CalculatorHC

/* 
Output
Addition Result: 150
Subtraction Result: 50
Multiplication Result: 5000
Division Result: 2

Pseudocode
Start program
Set num1 to 100
Set num2 to 50
Compute add = num1 + num2
Compute sub = num1 - num2
Compute mul = num1 * num2
Compute div = num1 / num2
Print "Addition Result: " followed by add
Print "Subtraction Result: " followed by sub
Print "Multiplication Result: " followed by mul
Print "Division Result: " followed by div
End program

Code Explanation
public class CalculatorHC { ... }
Defines a class named CalculatorHC that will perform calculator operations.
public static void main(String[] args) { ... }
Declares the main method, which is the entry point for the Java program.
// Calculator program using hard coding
A comment explaining the program uses hardcoded values rather than user input.
int num1 = 100;
Creates an integer variable num1 with the value 100.
int num2 = 50;
Creates an integer variable num2 with the value 50.
int add = num1 + num2;
Performs addition of num1 and num2 and stores the result 150 in add.
int sub = num1 - num2;
Performs subtraction of num2 from num1 and stores the result 50 in sub.
int mul = num1 * num2;
Performs multiplication of num1 and num2 and stores the result 5000 in mul.
int div = num1 / num2;
Performs integer division of num1 by num2 and stores the result 2 in div.
System.out.println("Addition Result: " + add);
Prints the label and the addition result on a new line.
System.out.println("Subtraction Result: " + sub);
Prints the label and the subtraction result on a new line.
System.out.println("Multiplication Result: " + mul);
Prints the label and the multiplication result on a new line.
System.out.println("Division Result: " + div);
Prints the label and the division result on a new line.
 */

