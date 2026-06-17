Arrays in Java

1. Definition of Array
An array is a data structure that stores multiple values of the same data type in contiguous memory locations.
In Java, arrays are treated as objects, and each element can be accessed using an index.

Example:
int[] numbers = {10, 20, 30, 40};

2. Why Arrays are required
Arrays are required because they help store many values together.
They make it easier to manage large amounts of data.
They also allow access to elements using index values.

Example:
int[] marks = {80, 90, 70};
System.out.println(marks[0]);   // prints 80

3. Advantages of Arrays
- Store multiple values in one variable.
- Easy to access elements using index.
- Efficient for handling large data collections.
- Useful for loops and sorting operations.

4. Disadvantages of Arrays
- Arrays have fixed size once created.
- All elements must be of the same data type.
- Inserting or deleting elements is difficult.
- Memory may be wasted if size is larger than needed.

5. Syntax of Array Declaration
DataType[] arrayName;

Example:
int[] age;
String[] names;

6. Array Initialization
Arrays can be initialized in two ways:

(a) Declaration + Initialization
int[] numbers = {1, 2, 3, 4};

(b) Using new keyword
int[] numbers = new int[4];
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;

7. Accessing Array Elements
Each element is accessed using its index.
Index starts from 0.

Example:
int[] numbers = {10, 20, 30};
System.out.println(numbers[0]); // 10
System.out.println(numbers[2]); // 30

8. Length Property
The length property is used to find the size of an array.

Example:
int[] numbers = {5, 10, 15, 20};
System.out.println(numbers.length); // prints 4

Summary
Arrays are used to store multiple values of the same type.
They are helpful for organizing and accessing data efficiently.
