/*
## Headline
One-Dimensional Array in Java

## Definition
A one-dimensional array is used to store multiple values of the same data type in a single row.
It helps in storing and accessing data using index values.

## Program to store student names and ages
*/

import java.util.Scanner;

public class OneDArrayDemo {
    public static void main(String[] args) {
        // Step 1: Declare and initialize a string array using hard coding (without loop)
        String[] names = new String[5];
        names[0] = "Aman";
        names[1] = "Riya";
        names[2] = "Karan";
        names[3] = "Neha";
        names[4] = "Rahul";

        // Step 2: Print the stored names using hard coding (without loop)
        System.out.println("Names using hard coding without loop:");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        // Step 3: Declare and initialize an integer array using hard coding (without loop)
        int[] ages = new int[5];
        ages[0] = 18;
        ages[1] = 19;
        ages[2] = 20;
        ages[3] = 21;
        ages[4] = 22;

        // Step 4: Print the stored ages using hard coding (without loop)
        System.out.println("Ages using hard coding without loop:");
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

        // Step 5: Create a Scanner object for soft coding input
        Scanner sc = new Scanner(System.in);

        // Step 6: Declare arrays for soft coding (without loop)
        String[] softNames = new String[5];

        // Step 7: Take names as input from user using soft coding (without loop)
        System.out.println("Enter 5 student names:");
        softNames[0] = sc.nextLine();
        softNames[1] = sc.nextLine();
        softNames[2] = sc.nextLine();
        softNames[3] = sc.nextLine();
        softNames[4] = sc.nextLine();

        // Step 9: Print names entered using soft coding (without loop)
        System.out.println("Names using soft coding without loop:");
        System.out.println(softNames[0]);
        System.out.println(softNames[1]);
        System.out.println(softNames[2]);
        System.out.println(softNames[3]);
        System.out.println(softNames[4]);

        int[] softAges = new int[5];

        // Step 8: Take ages as input from user using soft coding (without loop)
        System.out.println("Enter 5 student ages:");
        softAges[0] = sc.nextInt();
        softAges[1] = sc.nextInt();
        softAges[2] = sc.nextInt();
        softAges[3] = sc.nextInt();
        softAges[4] = sc.nextInt();

        // Step 10: Print ages entered using soft coding (without loop)
        System.out.println("Ages using soft coding without loop:");
        System.out.println(softAges[0]);
        System.out.println(softAges[1]);
        System.out.println(softAges[2]);
        System.out.println(softAges[3]);
        System.out.println(softAges[4]);

        // Step 10A: Consume the leftover newline character
        sc.nextLine();

        // Step 11: Declare arrays for hard coding using loop
        String[] loopNames = new String[5];

        // Step 12: Store hard-coded names using loop
        String[] hardNameList = {"Aman", "Riya", "Karan", "Neha", "Rahul"};
        for (int i = 0; i < hardNameList.length; i++) {
            loopNames[i] = hardNameList[i];
        }

        // Step 14: Print names using hard coding with loop
        System.out.println("Names using hard coding with loop:");
        for (int i = 0; i < loopNames.length; i++) {
            System.out.println(loopNames[i]);
        }

        int[] loopAges = new int[5];

        // Step 13: Store hard-coded ages using loop
        int[] hardAgeList = {18, 19, 20, 21, 22};
        for (int i = 0; i < hardAgeList.length; i++) {
            loopAges[i] = hardAgeList[i];
        }

        // Step 15: Print ages using hard coding with loop
        System.out.println("Ages using hard coding with loop:");
        for (int i = 0; i < loopAges.length; i++) {
            System.out.println(loopAges[i]);
        }

        // Step 16: Take soft-coded names using loop
        System.out.println("Enter 5 student names for loop input:");
        for (int i = 0; i < 5; i++) {
            loopNames[i] = sc.nextLine();
        }

        // Step 18: Print names using soft coding with loop
        System.out.println("Names using soft coding with loop:");
        for (int i = 0; i < loopNames.length; i++) {
            System.out.println(loopNames[i]);
        }

        // Step 17: Take soft-coded ages using loop
        System.out.println("Enter 5 student ages for loop input:");
        for (int i = 0; i < 5; i++) {
            loopAges[i] = sc.nextInt();
        }

        // Step 19: Print ages using soft coding with loop
        System.out.println("Ages using soft coding with loop:");
        for (int i = 0; i < loopAges.length; i++) {
            System.out.println(loopAges[i]);
        }

        // Step 20: Close the scanner object
        sc.close();
    }
}

/*
## Output
Names using hard coding without loop:
Aman
Riya
Karan
Neha
Rahul

Ages using hard coding without loop:
18
19
20
21
22

Enter 5 student names:
Aman
Riya
Karan
Neha
Rahul

Enter 5 student ages:
18
19
20
21
22

Names using soft coding without loop:
Aman
Riya
Karan
Neha
Rahul

Ages using soft coding without loop:
18
19
20
21
22

Names using hard coding with loop:
Aman
Riya
Karan
Neha
Rahul

Ages using hard coding with loop:
18
19
20
21
22

Enter 5 student names for loop input:
Aman
Riya
Karan
Neha
Rahul

Enter 5 student ages for loop input:
18
19
20
21
22

Names using soft coding with loop:
Aman
Riya
Karan
Neha
Rahul

Ages using soft coding with loop:
18
19
20
21
22

## Pseudocode
START
    declare String array names of size 5
    assign names manually
    print names
    declare int array ages of size 5
    assign ages manually
    print ages

    create Scanner object
    declare String array softNames of size 5
    take 5 student names from user
    print softNames
    declare int array softAges of size 5
    take 5 student ages from user
    print softAges

    declare String array loopNames of size 5
    declare String array hardNameList
    use for loop to store names
    print names using loop

    declare int array loopAges of size 5
    declare int array hardAgeList
    use for loop to store ages
    print ages using loop

    take names and ages again using loop
    print them
END

## Code Explanation
- String[] names = new String[5] creates a one-dimensional string array for storing student names.
- int[] ages = new int[5] creates a one-dimensional integer array for storing student ages.
- Array index values start from 0 and go up to size - 1.
- System.out.println() is used to display the stored values.
- Scanner is used to take input from the user.
- The for loop is used to repeat the same task for all array elements.
- The loop condition i < array.length helps avoid out-of-range errors.

## Summary
A one-dimensional array stores multiple values of the same type in a single list.
It is useful for storing student names and ages in Java.
The program shows both hard-coded and user-input methods, with and without loops.
*/
