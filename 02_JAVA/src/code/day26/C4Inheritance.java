package code.day26;

public class C4Inheritance {

    public static void main(String[] args) {

        B b= new B();
        System.out.println( b. toString());
        System.out.println(b);

        A a = new A();
        System.out.println(a.toString());
        System.out.println(a);

        C c  = new C() ;
        System.out.println(c.toString());
        //Whenever we print a reference to an object, java
        //calls the toString method on that object
        System.out.println(c);//System.out.println(c.toString());

    }
}

class A {}

class B extends A{}

class C extends B{
    public String toString(){
        return "slaw";
    }
}





/* */