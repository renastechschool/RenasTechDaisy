package code.day9;

public class C1Revision {

    public static void main(String[] args) {


        int a = 10 ;
        int b = 20;

        System.out.println("Before swapping:\na="+a+"\nb="+b);
        //a  = total of both a and b
        a = a + b;

        //From the total of both a and b, remove the original value of b,
        //so that b just has the original value of a
        b = a - b ;

        //from the total of a and b if the original value of a i.e. the current
        //value of b is subtracted, so now a has the original value of b
        a = a - b;

        System.out.println("After swapping:\na="+a+"\nb="+b);
    }
}
