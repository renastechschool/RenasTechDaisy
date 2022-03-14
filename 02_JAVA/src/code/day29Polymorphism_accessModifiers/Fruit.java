package code.day29Polymorphism_accessModifiers;

public class Fruit {

    int price ;
    public Fruit(){ System.out.println("hello"); }

    Fruit(int price){this.price = price ; }

    private Fruit(String taste){
        System.out.println(taste);
    }

    private static void eatOrange(){
        System.out.println("Eat Orange");
    }

    //below default method can be accessed from anywhere from
    //within the same package
    static void eatApple(){
         System.out.println("Eating Apple");
    }



    protected static void eatMango(){
        System.out.println("Eating mango");
    }

    public static void eatBanana(){
        System.out.println("Eating Banana");
        new Fruit("Sweet");
    }



}
