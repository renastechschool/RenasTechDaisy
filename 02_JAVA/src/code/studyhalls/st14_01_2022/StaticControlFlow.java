package code.studyhalls.st14_01_2022;
public class StaticControlFlow {
    static { method();  System.out.println("Another Static Block");  }
    static boolean b=true;
    static String st="kadir";

    StaticControlFlow() {
        System.out.println("Merhaba");
        method();
        System.out.println("Class");
    }
    { System.out.println("Slaw");  }
    public static void main(String[] args) {
        System.out.println(i*j);
        new StaticControlFlow();
        method();
        System.out.println("Method");
    }

    static { System.out.println("Static Block");  method();  }
    static double j=15;
    static int i = 10;
    static void method() {
        System.out.println(i);
        System.out.println(j);
        System.out.println(st);
        System.out.println(b);

    }

}