package students.Yasemin;

public class Lab15 {
    public static void main(String[] args) {
        Child c1= new Child();
        c1.message();
        Child2 c2 = new Child2();
        c2.message();
        Parent p = new Child();
        p.message();
        //--------------------------------------------------------------------------------------------//
        BankA a = new BankA();
        System.out.println(a.getBalance());
        BankB b = new BankB();
        System.out.println(b.getBalance());
        Bank c = new BankC();
        System.out.println(c.getBalance());
        //-----------------------------------------------------------------------------------
        Animals animals = new Cats();
        animals.cats();
        Animals animals1 = new Dogs();
        animals1.dogs();

        //-----------------------------------------------------------------------------------
        Area area =new Area();
        System.out.println(area.rectangleArea(5,3));
        System.out.println(area.squareArea(5));
        System.out.println(area.circleArea(3));


    }
}
abstract class Parent{
    abstract void message();
}
class Child extends Parent{
    void message(){
        System.out.println("This is first subclass");
    }
}
class Child2 extends Parent{
    void message(){
        System.out.println("This is second subclass");
    }
}
//-----------------------------------------------------------------------------------
abstract class Bank{
    int balance = 500;
    abstract int getBalance();

}
class BankA extends Bank{
    public int getBalance(){
        balance = balance + 100;
        return balance;
    }
}
class BankB extends Bank{
    public int getBalance(){
        balance = balance + 150;
        return balance;
    }
}
class BankC extends Bank{
    public int getBalance(){
        balance = balance + 200;
        return balance;
    }
}
//-----------------------------------------------------------------------------------
abstract class Animals{
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals{
    void cats(){
        System.out.println("Cats meow");
    }
    void dogs(){}
}

class Dogs extends Animals{
    void dogs(){
        System.out.println("Dogs bark");
    }
    void cats(){}

}
//-----------------------------------------------------------------------------------

abstract class Shape{
    abstract int rectangleArea(int length,int breadth);
    abstract int squareArea(int side);
    abstract double circleArea(int radius);
}

class Area extends Shape{
    int rectangleArea (int length,int breadth){
        return length*breadth;
    }
    int squareArea(int side){
        return side*side;
    }
    double circleArea(int radius){
        final double pi = 3.14;
        return pi*radius*radius;
    }

}
