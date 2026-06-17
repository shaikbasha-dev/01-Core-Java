/* 1. No return type no argument

Definition
A method with **no return type** does not send back any value.  
A method with **no arguments** does not receive any input values. */

public class Method1 {
    public static void main(String[] args) {   // main method starts execution
        findSum();                             // call the method findSum()
    }

    public static void findSum() {             // method with no return type and no arguments
        int a = 10;                            // declare and initialize variable a
        int b = 20;                            // declare and initialize variable b
        int sum = a + b;                       // calculate sum of a and b
        System.out.println("Sum: " + sum);    // print the result
    }
}

/* 
Output
Sum: 30


Explanation
In this example, the `findSum()` method:
- does not accept any parameters
- does not return any value (`void`)
- uses its own local variables to calculate the sum

The `main()` method calls `findSum()` to execute it.

Pseudocode
```text
START
    call findSum()
END

findSum()
    a = 10
    b = 20
    sum = a + b
    print sum
END
```

Code Explanation
- `public class Method1`  
  Declares the class.

- `public static void main(String[] args)`  
  The starting point of the program.

- `findSum();`  
  Calls the method.

- `public static void findSum()`  
  Defines a method that has no return type (`void`) and no arguments.

- `int a = 10;` and `int b = 20;`  
  Declares variables.

- `int sum = a + b;`  
  Calculates the sum.

- `System.out.println("Sum: " + sum);`  
  Displays the result.

Additional Notes
- `void` means the method does not return any value.
- A method with no arguments is still useful if it performs work using only internal variables.
- Your logic is correct; the only thing that needed improvement was the wording and formatting.

*/
