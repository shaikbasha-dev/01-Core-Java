Strings in Java

1. Definition of String
A String in Java is a sequence of characters used to store text.
It is one of the most commonly used data types in Java.

2. How Strings are created
Strings can be created in three ways:
The first string is created using the new keyword.
The second string is created from a character array.
The third string is created using a string literal.

Example:
String name1 = "Aman";
String name2 = new String("Aman");

3. String is immutable
Once a String object is created, its value cannot be changed.
Any operation like concatenation creates a new String.

Example:
String s = "Java";
s = s + " Programming";

4. String concatenation
Strings can be joined using + operator.

Example:
String first = "Hello";
String second = "World";
System.out.println(first + " " + second);

5. String methods
Some important String methods are:
- length()
- charAt(index)
- concat()
- equals()
- equalsIgnoreCase()
- toUpperCase()
- toLowerCase()
- trim()
- substring()
- replace()
- indexOf()
- lastIndexOf()
- contains()
- startsWith()
- endsWith()

6. Example of String methods
String s = "Java Programming";
System.out.println(s.length());
System.out.println(s.charAt(0));
System.out.println(s.toUpperCase());
System.out.println(s.substring(0, 4));

7. Comparison of Strings
Strings should be compared using equals() instead of ==.

Example:
String a = "Java";
String b = "Java";
System.out.println(a.equals(b));

8. StringBuffer and StringBuilder
StringBuffer and StringBuilder are used when we need to modify strings frequently.
- StringBuffer is synchronized and thread-safe.
- StringBuilder is faster and not synchronized.

9. Difference between String, StringBuffer, and StringBuilder
- String: immutable
- StringBuffer: mutable, thread-safe
- StringBuilder: mutable, faster than StringBuffer

10. Important points about Strings
- Strings are stored as objects in Java.
- Strings are used for text processing.
- String methods do not modify the original string directly.

11. Sample program
String name = "Rahul";
System.out.println("Hello " + name);

12. Summary
Strings are used to store text in Java.
They are immutable, support many built-in methods, and are widely used in programming.
