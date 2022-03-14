package code.day30Exceptions;

public class C11Throw {
    public static void main(String[] args) {
        /*
        throw keyword is used to generate an exception object manually
        throw is used to represent an exception via a Java object
        For an exception class's object to be treated as an exception, throw keyword must be used after
        the Exception class's object has been created
         */
        int age = 17 ;
        if(age<18){
            System.out.println("Hello");
             throw new ArithmeticException() ;
            //System.out.println("Hi");
        }

    }
}
