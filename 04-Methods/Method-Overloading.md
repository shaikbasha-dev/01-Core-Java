/* Method Overloading

Definition
Method overloading means having multiple methods in the same class with the same name but different parameters.
The methods can differ in the number, type, or order of arguments.

Note
Java calls the correct method based on the arguments passed during the call. */

public class MethodOverloading {                 // class declaration
    public static void main(String[] args) {     // main method starts execution
        add(10, 20);                            // call add() with two integers
        add(10, 20, 30);                        // call add() with three integers
        add(10.5, 20.5);                        // call add() with two doubles
    }                                            // end of main method

    public static void add(int a, int b) {       // overloaded method 1
        int sum = a + b;                         // calculate sum
        System.out.println("Sum of two integers: " + sum); // print result
    }                                            // end of add(int, int)

    public static void add(int a, int b, int c) { // overloaded method 2
        int sum = a + b + c;                     // calculate sum
        System.out.println("Sum of three integers: " + sum); // print result
    }                                            // end of add(int, int, int)

    public static void add(double a, double b) { // overloaded method 3
        double sum = a + b;                      // calculate sum
        System.out.println("Sum of two doubles: " + sum); // print result
    }                                            // end of add(double, double)
}                                                // end of class

/*
Output
Sum of two integers: 30
Sum of three integers: 60
Sum of two doubles: 31.0

Explanation
In this example, the same method name add() is used three times.
Java decides which version of add() to run based on the arguments passed.

Pseudocode
START
    add(10, 20)
    add(10, 20, 30)
    add(10.5, 20.5)
END

add(int a, int b)
    print a + b
END

add(int a, int b, int c)
    print a + b + c
END

add(double a, double b)
    print a + b
END

Code Explanation
- public class MethodOverloading
  Declares the class.

- public static void main(String[] args)
  Starting point of the program.

- add(10, 20);
  Calls the version of add() that accepts two integers.

- add(10, 20, 30);
  Calls the version of add() that accepts three integers.

- add(10.5, 20.5);
  Calls the version of add() that accepts two doubles.

- public static void add(int a, int b)
  Overloaded method with two int parameters.

- public static void add(int a, int b, int c)
  Overloaded method with three int parameters.

- public static void add(double a, double b)
  Overloaded method with two double parameters.

Additional Notes
- Method overloading is compile-time polymorphism.
- It helps us use the same method name for similar tasks.
- The parameter list must be different for each overloaded method.
*/
