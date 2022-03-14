package code.operatorsPrac;
//Unary plus andUnary minus operators
public class UnaryDemo {

    public static void main(String[]ap){

        int i = 10;
        System.out.println(i);
        int j = - 20;
        System.out.println(j);
        int k = + 30;
        System.out.println(k);

        System.out.println( 10 - -10);

        i = -20 +  +6  * -2 ;
        //i = -20 + -12
        //i = -20 -12
        //i = -32
        System.out.println(i);

    }
}
