# Return Statement in Java
## What is a return statement in Java?
In Java programming, the return statement is used for returning a value when the execution of the block is completed. The return statement inside a loop will cause the loop to break and further statements will be ignored by the compiler.

## Returning a Value from a Method
In Java, every method is declared with a return type such as int, float, double, string, etc.

These return types required a return statement at the end of the method. A return keyword is used for returning the resulted value.

The void return type doesn't require any return statement. If we try to return a value from a void method, the compiler shows an error.

### Following are the important points must remember while returning a value:

1. The return type of the method and type of data returned at the end of the method should be of the same type. For example, if a method is declared with the float return type, the value returned should be of float type only.
2. The variable that stores the returned value after the method is called should be a similar data type otherwise, the data might get lost.
3. If a method is declared with parameters, the sequence of the parameter must be the same while declaration and method call.

### Syntax:
The syntax of a return statement is the return keyword is followed by the value to be returned.

### Returning a Class or Interface
A method can have the class name as its return type. Therefore it must return the object of the exact class or its subclass.

An interface name can also be used as a return type but the returned object must implement methods of that interface.