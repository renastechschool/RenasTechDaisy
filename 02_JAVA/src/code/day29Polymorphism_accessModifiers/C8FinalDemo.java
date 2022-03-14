package code.day29Polymorphism_accessModifiers;

/*
final in Java
--------------
final variables cannot be changes
final methods cannot be overridden
final classes cannot be inherited
 */
public class C8FinalDemo {
    public static void main(String[] args) {
        final int a = 10;
        //a final variable cannot be changed i.e. once it gets a value, it's fixed
        //a++; error
    }
}


class A{
    //a final method cannot be overridden
    final void show(){
        System.out.println("Hello");
    }
}

class B extends A{


   /* void show(){
        System.out.println("Hi");
    }*/
}

final class C{}

//a final class cannot be inherited
//class D extends C{}