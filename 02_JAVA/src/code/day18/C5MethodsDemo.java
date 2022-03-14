package code.day18;

public class C5MethodsDemo {

    public static void main(String[] args) {

        m1() ;

        int i = m2(5);
        System.out.println(i);
    }

    static void m1(){
        System.out.println("m1");
    }

    static int m2(int k){
        System.out.println("Poland");
        return k*k;
    }
}
