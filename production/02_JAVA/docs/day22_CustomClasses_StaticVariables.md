# Static variables in Java

1. Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.

2. There would only be one copy of each class variable per class, regardless of how many objects are created from it.

3. Static variables are rarely used other than being declared as constants. Constants are variables that are declared as public/private, final, and static. Constant variables never change from their initial value.

4. Static variables are stored in the static memory. It is rare to use static variables other than declared final and used as either public or private constants.

5. Static variables are created when the program starts and destroyed when the program stops.

6. Visibility is similar to instance variables. However, most static variables are declared public since they must be available for users of the class.

7. Default values are same as instance variables. For numbers, the default value is 0; for Booleans, it is false; and for object references, it is null. Values can be assigned during the declaration or within the constructor. Additionally, values can be assigned in special static initializer blocks.

8. Static variables can be accessed by calling with the class name ClassName.VariableName.

9. When declaring class variables as public static final, then variable names (constants) are all in upper case. If the static variables are not public and final, the naming syntax is the same as instance and local variables.

### Example
Online Demo
```
import java.io.*;
public class Employee {

// salary  variable is a private static variable
private static double salary;

// DEPARTMENT is a constant
public static final String DEPARTMENT = "Development ";

public static void main(String args[]) {
salary = 1000;
System.out.println(DEPARTMENT + "average salary:" + salary);
}
}
```
Output
This will produce the following result −

Development average salary:1000