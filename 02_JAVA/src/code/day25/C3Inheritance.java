package code.day25;
/*
When one object acquires all the properties and behaviors of a parent object,
 it is known as inheritance.
 It provides code reusability. It is used to achieve runtime polymorphism.
 */
public class C3Inheritance {
    public static void main(String[] args) {

        Child c = new Child() ;
        System.out.println(c.a);
        System.out.println(c.j);
        c.show();
    }
}

class Parent{
    //instance variable or property
    int a=10;
    //behaviour of the parent
    void show(){ System.out.println("Hello") ; }
}

class Child extends Parent{
    int j=20;
}