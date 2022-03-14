package code.day8;

public class C4Ternary {

    public static void main(String... ar) {

		/*
		variable = (boolean expression) ? value to assign if ture : value to assign if false;


			expression1   ?   expression2   :     expression3  ;


		*/

        int a = 10;
       /* String s;
        if(a<10) s="a is less than 10";
        else s="a is not less than 10";*/

        String s = (a < 10) ? "a is less than 10" : "a is not less than 10";
        System.out.println(s);


    }
}