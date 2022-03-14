package code.day25;

public class C5Inheritance {

    public static void main(String[] args) {
        //Multiple inheritance is not allowed in Java
        //Child1 c = new Child1();  c.show() ;
    }

}

class A{
    void show(){  System.out.println("Hello"); }
}

class B{
    void show(){ System.out.println("Hi");}
}

class C{
    void show(){  System.out.println("slaw"); }
}

//class Child1 extends A, B, C{}