Arrays Interview Questions and Answers
Q1. What is an array in Java?

Answer:
An array is a data structure used to store multiple values of the same data type in contiguous memory locations.

Example:

int[] arr = {10, 20, 30, 40};
Q2. Why are arrays required in Java?

Answer:

To store multiple values using a single variable.
Easy to manage large amounts of data.
Faster access using indexes.
Useful with loops and sorting.
Q3. What are the advantages of arrays?

Answer:

Stores multiple values in one variable.
Fast access using index.
Memory efficient for fixed-size data.
Easy to traverse using loops.
Q4. What are the disadvantages of arrays?

Answer:

Fixed size.
Same data type only.
Insertion and deletion are difficult.
Memory wastage may occur.
Q5. How do you declare an array in Java?

Answer:

int[] numbers;
String[] names;
Q6. How do you initialize an array?

Answer:

Method 1:

int[] arr = {1,2,3,4};

Method 2:

int[] arr = new int[4];
Q7. What is the default value of an int array?

Answer:

0
Q8. What is the default value of a String array?

Answer:

null
Q9. What is the index of the first element in an array?

Answer:

The first index is:

0
Q10. What is ArrayIndexOutOfBoundsException?

Answer:

It occurs when we try to access an index outside the array range.

Example:

int[] arr = {10,20};

System.out.println(arr[5]);
One Dimensional Array
Q11. What is a One-Dimensional Array?

Answer:

A One-Dimensional Array stores elements in a single row.

Example:

int[] marks = {80,90,70};
Q12. How do you find the size of an array?

Answer:

Using:

array.length

Example:

arr.length
Q13. How do you traverse an array?

Answer:

Using for loop.

for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
Two Dimensional Array
Q14. What is a Two-Dimensional Array?

Answer:

A Two-Dimensional Array stores data in rows and columns.

Example:

int[][] matrix = new int[2][3];
Q15. Which loops are used to traverse a 2D array?

Answer:

Nested loops.

for(int i=0;i<rows;i++){

    for(int j=0;j<cols;j++){

    }

}
Q16. Where are 2D arrays used?

Answer:

Matrix operations
Tables
Student marks
Game boards
Three Dimensional Array
Q17. What is a Three-Dimensional Array?

Answer:

A Three-Dimensional Array stores data in three levels.

Example:

String[][][] schoolData;
Q18. Give an example of a 3D array.

Answer:

School → Class → Students

schoolData[0][1][2]
Jagged Array
Q19. What is a Jagged Array?

Answer:

A Jagged Array is an array of arrays where each row can have different sizes.

Example:

int[][] arr = {

{1,2},

{3,4,5},

{6,7,8,9}

};
Q20. What is the advantage of a Jagged Array?

Answer:

It saves memory because every row can have a different size.

Q21. Is a Jagged Array possible in Java?

Answer:

Yes.

Java supports Jagged Arrays because arrays are objects.

Search Element
Q22. How do you search an element in an array?

Answer:

By comparing each element using loops.

Example:

for(int i=0;i<arr.length;i++){

    if(arr[i]==key){

       found=true;

    }

}
Q23. Which searching technique is used in your Search Element program?

Answer:

Linear Search.

Q24. What is Linear Search?

Answer:

Linear Search checks elements one by one until the element is found.

Q25. What is the time complexity of Linear Search?

Answer:

O(n)
Matrix Programs
Q26. What is a Matrix?

Answer:

A Matrix is a rectangular arrangement of rows and columns.

Example:

1 2 3
4 5 6
Q27. How do you store a matrix in Java?

Answer:

Using a 2D array.

int[][] matrix = new int[rows][cols];
Q28. How do you read matrix values from the user?

Answer:

Using Scanner and nested loops.

Scanner sc = new Scanner(System.in);
Q29. Which class is used for taking array input?

Answer:

Scanner

Package:

java.util.Scanner
Q30. Which array topics are frequently asked in interviews?

Answer:

Array definition
Advantages and disadvantages
One Dimensional Array
Two Dimensional Array
Three Dimensional Array
Jagged Array
Array length
Default values
Search Element
Linear Search
Matrix programs
ArrayIndexOutOfBoundsException
