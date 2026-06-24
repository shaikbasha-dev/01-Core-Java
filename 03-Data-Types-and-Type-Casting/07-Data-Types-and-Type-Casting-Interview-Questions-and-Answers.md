# Interview Questions and Answers

## Data Types

### Q1. What is a data type in Java?

Answer:
A data type specifies the type of value that a variable can store, such as integer, decimal, character, or boolean.

---

### Q2. How many categories of data types are there in Java?

Answer:
There are two categories:

1. Primitive Data Types
2. Non-Primitive Data Types

---

### Q3. What is a variable?

Answer:
A variable is a name given to a memory location used to store data.

Example:

int age = 25;

---

### Q4. Why are data types important?

Answer:

* They specify the type of data.
* They determine memory allocation.
* They help perform valid operations on data.

---

## Primitive Data Types

### Q5. How many primitive data types are there in Java?

Answer:

There are 8 primitive data types:

* byte
* short
* int
* long
* float
* double
* char
* boolean

---

### Q6. What is byte?

Answer:

byte is an 8-bit signed integer.

Memory Size:

1 byte

Range:

-128 to 127

---

### Q7. What is short?

Answer:

short is a 16-bit signed integer.

Memory Size:

2 bytes

---

### Q8. What is int?

Answer:

int is a 32-bit signed integer.

Memory Size:

4 bytes

Example:

int age = 25;

---

### Q9. What is long?

Answer:

long is a 64-bit signed integer.

Memory Size:

8 bytes

Example:

long number = 123456789L;

---

### Q10. What is float?

Answer:

float stores decimal values.

Memory Size:

4 bytes

Example:

float price = 25.5f;

---

### Q11. What is double?

Answer:

double stores decimal values with higher precision.

Memory Size:

8 bytes

Example:

double salary = 25000.75;

---

### Q12. What is char?

Answer:

char stores a single Unicode character.

Memory Size:

2 bytes

Example:

char grade = 'A';

---

### Q13. What is boolean?

Answer:

boolean stores only two values:

* true
* false

Example:

boolean status = true;

---

## Non Primitive Data Types

### Q14. What are non-primitive data types?

Answer:

Non-primitive data types are reference types that store references to objects.

Examples:

* String
* Array
* Class
* Interface
* Enum

---

### Q15. What is String?

Answer:

String is a sequence of characters.

Example:

String name = "Java";

---

### Q16. What is an Array?

Answer:

An array is a collection of elements of the same data type.

Example:

int[] numbers = {10,20,30};

---

### Q17. What is an Enum?

Answer:

Enum is a special class used to define fixed constants.

Example:

enum Day {
MONDAY,
TUESDAY
}

---

## Primitive vs Non Primitive

### Q18. Difference between Primitive and Non Primitive Data Types?

Answer:

Primitive:

* Stores actual value
* Fixed size
* Faster access

Non Primitive:

* Stores reference to objects
* Size may vary
* Supports methods

---

### Q19. Which is faster, primitive or non-primitive?

Answer:

Primitive data types are faster because values are stored directly.

---

### Q20. Can primitive types call methods?

Answer:

No.

Primitive types cannot call methods directly.

---

## Type Casting

### Q21. What is type casting?

Answer:

Type casting is the process of converting one data type into another.

---

### Q22. How many types of type casting are there?

Answer:

Two types:

1. Implicit Type Casting
2. Explicit Type Casting

---

## Implicit Type Casting

### Q23. What is implicit type casting?

Answer:

Implicit type casting is automatic conversion from smaller type to larger type.

It is also called:

Widening Conversion

---

### Q24. Give examples of implicit type casting.

Answer:

byte → short

short → int

int → long

long → float

float → double

---

### Q25. Is explicit cast required in implicit type casting?

Answer:

No.

Java automatically performs the conversion.

---

### Q26. Is data loss possible in implicit type casting?

Answer:

Generally no.

Because smaller type is converted into larger type.

---

### Q27. Example of implicit type casting?

Answer:

int num = 100;

float value = num;

---

## Explicit Type Casting

### Q28. What is explicit type casting?

Answer:

Explicit type casting converts larger type into smaller type manually.

It is also called:

Narrowing Conversion

---

### Q29. Why is explicit casting required?

Answer:

Because data may be lost during conversion.

Java requires the programmer to cast explicitly.

---

### Q30. Example of explicit casting?

Answer:

long num = 1000;

int value = (int) num;

---

### Q31. What is the syntax of explicit casting?

Answer:

(TargetType) variable

Example:

int x = (int) longValue;

---

### Q32. Can data loss occur in explicit casting?

Answer:

Yes.

Information may be lost when converting a larger type into a smaller type.

---

### Q33. What is the output?

int x = (int) 10.75;

System.out.println(x);

Answer:

10

The decimal part is removed.

---

### Q34. Difference between implicit and explicit casting?

Answer:

Implicit Casting

* Automatic
* Smaller to larger
* Safe conversion

Explicit Casting

* Manual
* Larger to smaller
* Data loss possible

---

### Q35. Which type casting is safer?

Answer:

Implicit type casting is safer because there is no loss of data in normal widening conversions.

---

### Q36. Is char involved in type casting?

Answer:

Yes.

char can be converted to:

* int
* long
* float
* double

Example:

char ch = 'A';

int x = ch;

Output:

65

---

### Q37. What is widening conversion?

Answer:

Conversion from smaller data type to larger data type.

Example:

int → double

---

### Q38. What is narrowing conversion?

Answer:

Conversion from larger data type to smaller data type.

Example:

double → int

---

### Q39. Which operator is used in explicit type casting?

Answer:

Cast operator.

Example:

(int)

(double)

(float)

---

### Q40. Which topic is frequently asked in Java interviews?

Answer:

* Primitive Data Types
* Non Primitive Data Types
* Memory Size of Data Types
* Implicit Type Casting
* Explicit Type Casting
* Widening Conversion
* Narrowing Conversion
* Primitive vs Non Primitive Data Types
