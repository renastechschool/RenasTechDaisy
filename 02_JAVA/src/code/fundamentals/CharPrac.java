package code.fundamentals;

public class CharPrac {

    public static void main(String[]ap){
        /*
        * Java uses UNICODE.
        * UNICODE is a standard which specifies that
        * there is a unique number corresponding to each
        * character that we type on the
        * laptop, computer, mobile etc. devices.
        *
        * */

       /* char symbol1 = 'a';// a: 97
        System.out.println(symbol1);
        char ch = 98;
        System.out.println(ch);// b
        ch = 122;
        System.out.println(ch);*/

        char c = 97 ;
        System.out.println(c);

        /**
        Symbols     UNICODE unique number OR code points
         0 to 9     48 to 57
         A to Z     65 to 90
         a to z     97 to 122
         */

        //Range of Char
        //0 to 65535
        char ch1 = 48;
        //below statement prints the symbol
        //coresponding to number 48
        System.out.println(ch1);
        ch1 = 49;
        System.out.println(ch1);




    }
}
