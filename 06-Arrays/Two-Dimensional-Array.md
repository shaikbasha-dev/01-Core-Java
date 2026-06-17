/*
## Headline
Two-Dimensional Array in Java

## Definition
A two-dimensional array is used to store data in rows and columns, like a matrix.
It is mainly used when we want to store tabular data.

## Program to store matrix values using Scanner
*/

import java.util.Scanner;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        // Step 1: Create Scanner object to read matrix values
        Scanner sc = new Scanner(System.in);

        // Step 2: Ask user for number of rows
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        // Step 3: Ask user for number of columns
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        // Step 4: Declare a 2D array using the given rows and columns
        int[][] matrix = new int[rows][cols];

        // Step 5: Take matrix elements from user using nested loops
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step 6: Print the matrix in row-wise format
        System.out.println("Matrix elements are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Step 7: Close the Scanner object
        sc.close();
    }
}

/*
## Output
Enter number of rows:
2
Enter number of columns:
3
Enter elements of the matrix:
1 2 3
4 5 6
Matrix elements are:
1 2 3
4 5 6

## Pseudocode
START
    read rows
    read cols
    create 2D array matrix[rows][cols]
    for i = 0 to rows-1
        for j = 0 to cols-1
            read matrix[i][j]
        end for
    end for

    for i = 0 to rows-1
        for j = 0 to cols-1
            print matrix[i][j]
        end for
    end for
END

## Code Explanation
- int[][] matrix = new int[rows][cols] declares a two-dimensional array.
- The first index represents rows and the second index represents columns.
- Nested loops are used to read and print all elements of the matrix.
- Scanner is used to accept input from the user.

## Summary
A two-dimensional array stores data in rows and columns.
It is useful for representing matrices and tabular data in Java.
*/
