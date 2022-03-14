package code.day29AccessModifier;

import code.day29Polymorphism_accessModifiers.Fruit;

public class FruitTesterOutsidePackage extends Fruit{
    public static void main(String[] args) {
        Fruit.eatBanana();
        //Fruit.eatOrange() ;

        //error: eatApple Cannot be accessed from outside package
        //Fruit.eatApple() ;

        Fruit f = new Fruit()  ;
        //Fruit f1 = new Fruit(10);  error
        //new Fruit("sweet") ;

        //Outside the protected things can only be accessed via subclasses
        Fruit.eatMango() ;


    }
}
