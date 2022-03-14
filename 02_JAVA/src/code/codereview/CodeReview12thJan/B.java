package code.codereview.CodeReview12thJan;

public class B {

    static{
        new A();
        System.out.println("batman");
    }
    public static void main(String[] args) {
        new A();
    }

    {
        System.out.println("red");
    }
}
