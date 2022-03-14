package code.day26;

public class C3Inheritance {

    public static void main(String[] args) {
       /* Base b = new Base() ;
        b.show() ;
        new Child() . show() ;*/

        //Below prints a from the Child class.
        //variable a from the Child class hides the variable a from the Base class
        //This concept is called Data Hiding (Base class's variable hiding)
        System.out.println(new Child() . a );
    }
}

class Base{
    int a = 10;
     void show(){
         System.out.println("Hello");
     }
}

class Child extends Base{
    int a = 20;
    int b=30;
    void show(){
        System.out.println("Hi");
    }
}