package code.day29Polymorphism_accessModifiers;

public class C7AccessModifiersInOverriding {
    public static void main(String[] args) {
        Child c = new Child() ;
        c.show() ;
    }

}

/*
For method overriding to happen, overriding method must have the access modifier
stronger or equal to the overridden method
 */
class Base{
    //overridden
     protected void show(){
        System.out.println("hello");
    }
}

class Child extends Base{
    //overriding method or override
     public   void show(){
        System.out.println("hi");
    }
}
