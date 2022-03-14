package code.day29Polymorphism_accessModifiers;

public class InterfaceTester {
    public static void main(String[] args) {
        System.out.println(Demo.a);
        System.out.println(Demo.j);  //Demo.j = 30 ;
    }
}

interface My{

    //All variables of an interface are by default public , static and final.
    //These are called constants.
    int a = 10  ;
    public int j = 20;
    static int k = 30 ;
    final int h = 40 ;
    public static int g = 50;
    static final int s = 60 ;
    public static final int w = 70 ;

}

class Demo implements My{

}