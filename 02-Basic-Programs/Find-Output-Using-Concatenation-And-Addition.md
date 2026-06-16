// FindOutput program showing the difference between string concatenation and numeric addition in Java

public class FindOutput { // Define class named FindOutput
    public static void main(String[] args) { // Main method: program entry point
        int num1 = 20; // Declare integer variable num1 and assign 20
        int num2 = 30; // Declare integer variable num2 and assign 30
        int sum = num1 + num2; // Add num1 and num2 and store result in sum
        System.out.println("Result1: " + num1 + num2); // Concatenate strings: prints "Result1: 2030"
        System.out.println("Result2: " + (num1 + num2)); // Add first, then concatenate: prints "Result2: 50"
        System.out.println("Result3: " + sum); // Print sum variable: prints "Result3: 50"
    } // End of main method
} // End of class FindOutput

/* 
Output:
Result1: 2030
Result2: 50
Result3: 50

Pseudocode
- Start program
- Set `num1` to 20
- Set `num2` to 30
- Compute `sum` = `num1 + num2`
- Print `"Result1: "` plus `num1` plus `num2`
- Print `"Result2: "` plus the result of `(num1 + num2)`
- Print `"Result3: "` plus `sum`
- End program

Code Explanation
- `public class FindOutput { ... }`
  - Declares a class named `FindOutput`.
- `public static void main(String[] args) { ... }`
  - Declares the main method, which Java runs first.
- `int num1 = 20;`
  - Creates an integer variable named `num1` and assigns it the value `20`.
- `int num2 = 30;`
  - Creates an integer variable named `num2` and assigns it the value `30`.
- `int sum = num1 + num2;`
  - Adds `num1` and `num2`, then stores the result in `sum`.
- `System.out.println("Result1: " + num1 + num2);`
  - Because of left-to-right evaluation, this concatenates `num1` and `num2` as strings, producing `2030`.
- `System.out.println("Result2: " + (num1 + num2));`
  - The parentheses force addition first, then concatenates the result, producing `50`.
- `System.out.println("Result3: " + sum);`
  - Prints the previously computed sum value, which is `50`. */
