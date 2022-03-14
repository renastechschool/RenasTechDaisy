package code.day24;

public class C2StaticExample {

    //static variables are also called class variables
    static int j=20;

    int i=10;
    public static void main(String[] args) {
        new C2StaticExample() . show();
        System.out.println(++j);
        int k=30;
    }

    //instance method are behaviour of an object
    void show(){
        System.out.println("hi");
    }

    static int m1(){
        return 10;
    }

    C2StaticExample(){
        System.out.println("Hello");
    }
}
