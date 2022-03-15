# Class is the collection of objects. 
Class is not a real-world entity it is just only templates and prototypes or blueprints. Class does not occupy memory. We can write a custom class as per our choice for an illustration purpose a sample is shown in the program below as a helper class.

### Example:


// Java Program to Creating our Own Custom Class

// Importing input output classes
import java.io.*;

// Class 1
// Helper class
class Employee {

//Member variables of this class
//first attribute
    int id;
    // second attribute
    int salary;
    // third attribute
    String name;
 
Member function of this class
 
    // METHOD 1
    public void printDetails()
    {
        // Print and display commands
        System.out.println("My id is " + id);
        System.out.println("This is my name " + name);
    }
 
    // Method 2
    public int getSalary()
    {
 
        // Simply returning the salary
        return salary;
    }
}

// Class 2
// Main class
class Custom {

    // Main driver method
    public static void main(String[] args)
    {
 
        // Display message only
        System.out.println("This is the custom class");
 
        // Creating object of custom class in the main()
        // method Instantiating a new Employee object
        Employee harry = new Employee();
 
        // Again creating object of custom class and
        // instantiating a new Employee object
        Employee robin = new Employee();
 
        // Initializing values for first object created
        // above
        harry.id = 23;
        harry.salary = 100000;
        harry.name = "Ritu bhatiya";
 
        // Initializing values for second object created
        // above
        robin.id = 25;
        robin.salary = 150000;
        robin.name = "Amit thripathi";
 
        // Printing object attributes by
        // calling the method as defined in our class
        harry.printDetails();
        robin.printDetails();
 
        // Calling the method again of our class and
        // storing it in a variable
        int salary = robin.getSalary();
 
        // Print and display the above salary
        System.out.println("Salary of robin : " + salary
                           + "$");
 
        System.out.println("ID : " + harry.id);
    }
}



Output
This is the custom class
My id is 23
This is my name Ritu bhatiya
My id is 25
This is my name Amit thripathi
Salary of robin : 150000$
ID : 23
 