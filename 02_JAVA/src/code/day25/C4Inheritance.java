package code.day25;

public class C4Inheritance {
    public static void main(String[] args) {
        BMW b = new BMW();  b.accelerate();
        new Car() . accelerate();
    }
}

class Car{
    void accelerate(){
        System.out.println("accelerating...");
    }
}

//Inheritance works only with the extends keyword
//BMW id the child class of the Car class
//Inheritance "is-a" relationship
//BMW IS-A Car
class BMW extends Car{

}
