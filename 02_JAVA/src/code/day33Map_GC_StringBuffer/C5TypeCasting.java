package code.day33Map_GC_StringBuffer;

public class C5TypeCasting {

    public static void main(String[] args) {
        byte a = 10 ;
        byte b  = 20 ;

       // byte c = a + b  ; //error

        //the result of a arithmetic expression becomes an int by default
        //if there is no other bigger data type value used in
        //the expression

        //compiler resolves the below arithmetic expression at compile time
        //because it uses literals not variables
        byte d = 10 + 20 ;

    }
}
