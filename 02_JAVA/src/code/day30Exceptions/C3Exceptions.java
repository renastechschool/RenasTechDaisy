package code.day30Exceptions;

public class C3Exceptions {

    static int i;
    public static void main(String[] args) {


            show() ;

    }

    private static void show() {
        System.out.println(i++);
        show();
    }
}
