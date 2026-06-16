// Display program showing a programming language name and release year

public class Display { // Define class named Display
    public static void main(String[] args) { // Main method: program entry point
        String name = "Java"; // Declare a String variable name and assign "Java"
        int year = 1995; // Declare an integer variable year and assign 1995
        System.out.println("Programming Langauge: " + name); // Print label and name with concatenation
        System.out.println("Year: " + year); // Print label and year with concatenation
    } // End of main method
} // End of class Display

/* 
Output
Programming Langauge: Java
Year: 1995

Pseudocode
Start program
Declare string variable name with value "Java"
Declare integer variable year with value 1995
Print Programming Langauge:  followed by the value of name
Print Year:  followed by the value of year
End program

Code Explanation
public class Display { ... }
Defines a class named Display.
public static void main(String[] args) { ... }
Defines the main method, the entry point for Java execution.
String name = "Java";
Creates a string variable named name and stores "Java" in it.
int year = 1995;
Creates an integer variable named year and stores 1995.
System.out.println("Programming Langauge: " + name);
Prints a message combining text and the name value, then moves to a new line.
System.out.println("Year: " + year);
Prints a message combining text and the year value, then moves to a new line.
 */
