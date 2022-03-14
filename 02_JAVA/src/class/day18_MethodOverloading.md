# Method Overloading in Java
Different ways to overload the method
By changing the no. of arguments
By changing the datatype
Why method overloading is not possible by changing the return type
Can we overload the main method
method overloading with Type Promotion
If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

If we have to perform only one operation, having same name of the methods increases the readability of the program.

Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.

So, we perform method overloading to figure out the program quickly.

java method overloading
### Advantage of method overloading
Method overloading increases the readability of the program.

### Different ways to overload the method
There are two ways to overload the method in java

1. By changing number of arguments
2. By changing the data type




### 1. Method Overloading:changing no. of arguments
  
 In this example, we have created two methods, first add() method performs addition of two numbers and second add method performs addition of three numbers.

### 2. Method Overloading: changing data type of arguments
   In this example, we have created two methods that differs in data type. The first add method receives two integer arguments and second add method receives two double arguments.

### Q) Why Method Overloading is not possible by changing the return type of method only?
In java, method overloading is not possible by changing the return type of the method only because of ambiguity. 

### Can we overload java main() method?
Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM calls main() method which receives string array as arguments only. 

### Example of Method Overloading with Type Promotion in case of ambiguity
If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.

