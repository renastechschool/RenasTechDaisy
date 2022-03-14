package code.day29Polymorphism_accessModifiers;

public class FruitTester {
    public static void main(String[] args) {
        Fruit.eatApple() ;
        //new Fruit("sour"); //error: private constructor
        new Fruit(20) ;

        Fruit.eatMango();
    }
}
