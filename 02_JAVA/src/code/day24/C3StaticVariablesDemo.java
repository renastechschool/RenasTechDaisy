package code.day24;

public class C3StaticVariablesDemo {

//Static variables
//
// When a variable is declared as static, then a single copy of variable is created
// and shared by all objects at class level. Static variables are also called class variables.
// All instances i.e. objects of the class share the same static variable.
//
//We can create static variables at class-level only.
// Infact, both the static and non-static variables are declared at the class level.
//static: class member, can be called through the class as it is associated with the class name
//there is only one copy of the static variable, shared by all objects
//
//            prefers to be called through class name
//
//            static ONLY accepts static - No direct entry of instance member inside static
//
//
//    static members:
//            1. static variable (class variables)
//            2. static methods
//            3. static initializer block OR static block OR static initialization block
//            4. static nested class
//

//static variable: declared outside any method block with static keyword.
//there is only one copy of static variable , shared by all objects

    int i = 25; // instance
    int n = 10; //instance
    static int s = 100;//static variable: declared outside any method block with the static keyword.

    //init block
    {
        System.out.println("Namaste");
    }

    //static block
    static {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        C3StaticVariablesDemo object1 = new C3StaticVariablesDemo();
        new C3StaticVariablesDemo(60);
        System.out.println(s + j);
    }

    static int j = 20;

    //a static block OR static initializer OR static initialization block
    static {
        System.out.println("Hello");
    }

    //init block: If we want to perform some common task, before the constructor is executed, write that code in the init block
    {
        System.out.println("slaw");
    }

    C3StaticVariablesDemo(){}
    C3StaticVariablesDemo(int i) {
        System.out.println("Hi");
    }
}