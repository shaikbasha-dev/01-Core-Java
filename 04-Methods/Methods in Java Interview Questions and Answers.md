# Interview Questions and Answers

## Methods in Java

### Q1. What is a method in Java?

Answer:
A method is a block of code written to perform a specific task. It can be called whenever required.

---

### Q2. Why are methods used?

Answer:

* Code reusability
* Reduces code duplication
* Improves readability
* Simplifies debugging
* Makes maintenance easier

---

### Q3. What are the two types of methods in Java?

Answer:

1. Predefined Methods
2. User Defined Methods

---

### Q4. What are predefined methods?

Answer:

Methods already defined by Java are called predefined methods.

Examples:

* println()
* print()
* equals()
* toLowerCase()
* toUpperCase()

---

### Q5. What are user defined methods?

Answer:

Methods created by the programmer according to requirements are called user defined methods.

---

### Q6. Which method is automatically called by JVM?

Answer:

```java
public static void main(String[] args)
```

The JVM automatically calls the main() method.

---

### Q7. What is the syntax of a method?

Answer:

```java
returnType methodName(parameters){
    // statements
}
```

Example:

```java
public static void display(){
}
```

---

## Types of Methods

### Q8. How many types of methods are there based on syntax?

Answer:

There are four types:

1. No Return Type No Argument
2. No Return Type With Argument
3. Return Type No Argument
4. Return Type With Argument

---

## No Return Type No Argument

### Q9. What is a no return type no argument method?

Answer:

It does not take parameters and does not return any value.

Example:

```java
void display(){
    System.out.println("Hello");
}
```

---

### Q10. Which keyword is used when a method does not return any value?

Answer:

```java
void
```

---

## No Return Type With Argument

### Q11. What is a no return type with argument method?

Answer:

The method accepts parameters but does not return any value.

Example:

```java
void show(int a){
    System.out.println(a);
}
```

---

### Q12. What is a parameter?

Answer:

A parameter is a variable declared in the method definition.

Example:

```java
void add(int a, int b)
```

Here `a` and `b` are parameters.

---

### Q13. What is an argument?

Answer:

An argument is the value passed during method call.

Example:

```java
add(10,20);
```

10 and 20 are arguments.

---

## Return Type No Argument

### Q14. What is a return type no argument method?

Answer:

It returns a value but does not accept parameters.

Example:

```java
int getNumber(){
    return 100;
}
```

---

### Q15. Which keyword is used to return a value?

Answer:

```java
return
```

Example:

```java
return sum;
```

---

### Q16. Can a void method return a value?

Answer:

No.

A void method cannot return any value.

---

## Return Type With Argument

### Q17. What is a return type with argument method?

Answer:

The method accepts parameters and returns a value.

Example:

```java
int add(int a,int b){
    return a+b;
}
```

---

### Q18. What is the output?

```java
int result = add(10,20);
```

Answer:

30

---

### Q19. Is return statement mandatory in non-void methods?

Answer:

Yes.

A method with return type must return a value.

---

## Method Overloading

### Q20. What is method overloading?

Answer:

Method overloading means defining multiple methods with the same name but different parameter lists.

---

### Q21. On what basis does Java differentiate overloaded methods?

Answer:

Java differentiates overloaded methods by:

* Number of parameters
* Type of parameters
* Order of parameters

---

### Q22. Can methods be overloaded by changing only return type?

Answer:

No.

Changing only return type is not method overloading.

Incorrect:

```java
int add()
double add()
```

---

### Q23. Example of method overloading?

Answer:

```java
add(int a,int b)

add(int a,int b,int c)

add(double a,double b)
```

---

### Q24. What is compile time polymorphism?

Answer:

Method overloading is called compile time polymorphism because the compiler decides which method to call.

---

### Q25. Can main() method be overloaded?

Answer:

Yes.

main() method can be overloaded.

Example:

```java
public static void main()

public static void main(int a)
```

But JVM calls only:

```java
public static void main(String[] args)
```

---

### Q26. Difference between method overloading and overriding?

Answer:

Method Overloading

* Same class
* Same method name
* Different parameters
* Compile time polymorphism

Method Overriding

* Parent and Child class
* Same method signature
* Runtime polymorphism

---

### Q27. What is a method signature?

Answer:

Method name + parameter list is called method signature.

Example:

```java
add(int,int)
```

---

### Q28. Can methods have multiple parameters?

Answer:

Yes.

Example:

```java
void display(String name,int age,double salary)
```

---

### Q29. Can one method call another method?

Answer:

Yes.

Example:

```java
public static void main(String[] args){
    display();
}
```

---

### Q30. Why are methods important in Java?

Answer:

Methods are important because:

* Reuse code
* Reduce duplication
* Improve readability
* Simplify maintenance
* Make programs modular

---

### Q31. Which method topic is frequently asked in interviews?

Answer:

* Types of Methods
* Difference between Parameters and Arguments
* Return keyword
* void keyword
* Method Overloading
* Method Signature
* main() Method
* Compile Time Polymorphism
