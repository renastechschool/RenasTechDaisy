package code.day27;

public class CarTester {

    public static void main(String[] args) {
        //Car c = new Car();
        Tesla t = new Tesla();
        t.moveForward();

        BMW b = new BMW();
        b.moveForward();
    }
}

//abstract classes can never be instantiated.
//We can never create the object of an abstract class
abstract class Car{

    //an abstract method just tells the behaviour or functionality of the object.
    //It does not specify the actual implementation details
    //An abstract method must be overridden by the first concrete chils class in the inheritance hierarchy
    abstract void moveForward() ;//overridden method
}

//Abstract classes can be used via inheritance
//Tesla "is-a" Car    ; Inheritance "is-a" relationship
//A concrete or regular class cannot have an abstract method.
//A concrete must override all the abstract methods which it inherits
class Tesla extends Car{
    void moveForward(){//overriding method OR override
        System.out.println("Tesla is moving forward automatically..");
    }
}

class BMW extends Car{
    void moveForward(){
        System.out.println("BMW is moving forward..");
    }
}
