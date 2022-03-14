package code.studyhalls.st03_02_2022;

public class CastingDemo {

    public static void main(String[] args) {


        byte b = 10 ;

        System.out.println(b);
        
        double d = 9/(double)10 ;
        d = 9 / 10.0 ;
        System.out.println(d);


        //autoboxing: Implicit conversion of a primitive
        //numeric value to its wrapper object
        Integer i = 50 ;


        //auto-unboxing: Implicit conversion of a wrapper object
        //to its corresponding primitive type
        int p =  i  ;

    }
}
