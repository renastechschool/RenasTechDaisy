package code.day23;

public class C5StaticInstance {

    public static void main(String[] args) {
        show();
        C5StaticInstance.show();
        Temp.m1();
        Temp  . m1() ;
        Temp t = new Temp();
        t.m1() ;// Temp . m1() ;
    }

    static void show(){
        System.out.println("Hello");
    }

    void play(){
        System.out.println("Hi");
    }
}

class Temp{
    static void m1(){
        System.out.println("Slaw");
    }
}


