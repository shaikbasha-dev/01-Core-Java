/* 3. Return type, no argument

Definition
A method with a return type sends back a value to the caller.
A method with no arguments does not receive any input values. */

public class Method3 {                           // class declaration
    public static void main(String[] args) {     // main method starts execution
        int result = getNumber();                // call getNumber() and store its return value
        System.out.println(result);              // print the returned value
    }                                            // end of main method

    public static int getNumber() {              // method with return type int and no arguments
        int a = 10;                              // declare and initialize variable a
        int b = 20;                              // declare and initialize variable b
        int sum = a + b;                         // calculate sum
        return sum;                              // return the sum to the caller
    }                                            // end of getNumber method
}                                                // end of class

/*
Output
30

Explanation
In this example, the getNumber() method:
- has a return type int
- does not take any arguments
- calculates and returns the sum of two numbers

The main() method calls getNumber() and stores the result in a variable.

Pseudocode
START
    result = getNumber()
    print result
END

getNumber()
    a = 10
    b = 20
    sum = a + b
    return sum
END

Code Explanation
- public class Method3
  Declares the class.

- public static void main(String[] args)
  The starting point of the program.

- int result = getNumber();
  Calls the method and stores the returned value.

- public static int getNumber()
  Defines a method that returns an int and has no arguments.

- return sum;
  Sends the value back to the caller.

Additional Notes
- A method with a return type must use the return keyword to send a value.
- The returned value can be stored in a variable or used directly.
*/
