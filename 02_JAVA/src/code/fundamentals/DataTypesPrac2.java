package code.fundamentals;
public class DataTypesPrac2 {
    public static void main(String[]sl){

        /*
            8 PRIMITIVE DATA TYPES IN JAVA
            Types       Size
            -----       ------
            byte        1 byte (8 bits)         -128 to 127
            short       2 bytes (16 bits)       -32,768 to 32,767
            int         4 bytes (32 bits)       -2,147,483,648 to 2,147,483,647
            long        8 bytes (64 bits)       -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float       4 bytes (32 bits)
            double      8 bytes (64 bits)
            char        2 bytes (16 bits)
            boolean     depends on the internal implementation
        * */

        byte b = 10 ;
        System.out.println(b);
        b = 120;
        System.out.println(b);  //b = 128;
        byte age = 50;

        short s = 200;
        System.out.println(s);

        int salary = 5640575;

       // int phone_number = 88998785465;


        //TO specify a long literal we use the suffix L
        long phone_number = 88998785465L;

       /* Any constant value in Java is called a literal.
       By default all integral values within the range of int are treated as int literals.
       If we use a literal within the range of int, the literal is by default
        treated as an int literal, so suffix L is not required.
        */


    }
}
