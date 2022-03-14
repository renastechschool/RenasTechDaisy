# Constructors in Java
Types of constructors
Default Constructor
Parameterized Constructor
Constructor Overloading
Does constructor return any value?
Copying the values of one object into another
Does constructor perform other tasks instead of the initialization
In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.

It is a special type of method which is used to initialize the object.

Every time an object is created using the new() keyword, at least one constructor is called.

It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.

There are two types of constructors in Java: no-arg constructor, and parameterized constructor.

Note: It is called constructor because it constructs the values at the time of object creation. It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn't have any.

## Rules for creating Java constructor
There are two rules defined for the constructor.

1. Constructor name must be the same as its class name
2. A Constructor must have no explicit return type
3. A Java constructor cannot be abstract, static, final, and synchronized.

## Types of Java constructors
There are two types of constructors in Java:

1. Default constructor (no-arg constructor)
2. Parameterized constructor


### Java Default Constructor
A constructor is called "Default Constructor" when it doesn't have any parameter.

Syntax of default constructor:
```
<class_name>(){}  
```
### Example of default constructor
In this example, we are creating the no-arg constructor in the Bike class. It will be invoked at the time of object creation.
Java Program to create and call a default constructor:  
```
class Bike1{  
//creating a default constructor  
Bike1(){System.out.println("Bike is created");}  
//main method  
public static void main(String args[]){  
//calling a default constructor  
Bike1 b=new Bike1();  
}  
}  
```

Q) What is the purpose of a default constructor?
The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.

## Java Parameterized Constructor
A constructor which has a specific number of parameters is called a parameterized constructor.

Why use the parameterized constructor?
The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.

## Constructor Overloading in Java
In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.

Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.

## Difference between constructor and method in Java
There are many differences between constructors and methods. They are given below.

### Java Constructor	
1. A constructor is used to initialize the state of an object.	
2. A constructor must not have a return type.	
3. The constructor is invoked implicitly.	
4. The Java compiler provides a default constructor if you don't have any constructor in a class.	
5. The constructor name must be same as the class name.
### Java Method
1. The method name may or may not be same as the class name.
2. A method is used to expose the behavior of an object.
3. A method must have a return type.
4. The method is invoked explicitly.
5. The method is not provided by the compiler in any case.

Check out an example of this at javatpoint.com/java-constructor 

#Java Copy Constructor
There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor in C++.

There are many ways to copy the values of one object into another in Java. They are:

1. By constructor
2. By assigning the values of one object into another
3. By clone() method of Object class.

## Copying values without constructor
We can copy the values of one object into another by assigning the objects values to another object. In this case, there is no need to create the constructor.

### Q)  Does constructor return any value?
Yes, it is the current class instance (You cannot use return type yet it returns a value).

### Q)  Can constructor perform other tasks instead of initialization?
Yes, like object creation, starting a thread, calling a method, etc. You can perform any operation in the constructor as you perform in the method.

###  Q)  Is there Constructor class in Java?
Yes.

### Q)  What is the purpose of Constructor class?
Java provides a Constructor class which can be used to get the internal information of a constructor in the class. It is found in the java.lang.reflect package.