package code.day8;

public class C3TernaryOperator {

    public static void main(String[]ap){

        int i=10, j;
        // ternary operator is like a short hand of if else block

        /*
        if(i<9)
            j=1;
        else
            j=0;
        */

        j    =    i>9    ?    1   :    0   ;


        System.out.println(j);
    }
}
