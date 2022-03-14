package code.operatorsPrac;

public class ArithmeticDemo {

    public static void main(String[] args) {

        int a = 10, b=20, add, subtract, multiply, divide,  modulus;
        add = a+b;
        subtract = a-b;
        multiply = a*b;
        divide = a/b;
        modulus = a%b;
        System.out.println("a=" + a + "\nb=" + b);
        System.out.println("a+b=" + add);
        System.out.println("a-b=" + subtract);
        System.out.println("a/b=" + divide);
        System.out.println("a*b=" + multiply);
        System.out.println("a%b=" + modulus);


    }
}
