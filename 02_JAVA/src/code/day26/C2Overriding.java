package code.day26;

public class C2Overriding {
    public static void main(String[] args) {
        Apple a = new Apple();
        System.out.println( a.getPrice() );
    }
}

//super class/ parent class/ Base class
class Fruit{
    int price  = 10;

}

//sub classs/ child class/ Derived class
class Apple extends Fruit{
    //int price = 20;

    int getPrice(){
        return price ;
    }
}
