package code.day25;

public class C1Revision {

    static {
        System.out.println("Hi");
    }

    {
        System.out.println(  Demo.i  );
        System.out.println("Hello");
    }

    C1Revision(){
        Demo.i=30;
        System.out.println("slaw");
    }

    public static void main(String[] args) {
        System.out.println("chao");
        new C1Revision() ;


        System.out.println("Merhaba");
    }
}
