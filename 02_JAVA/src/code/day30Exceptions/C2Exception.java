package code.day30Exceptions;

public class C2Exception {
    public static void main(String[] args) {

        System.out.println("Hi") ;

        //below statement gives ArithmeticException
        //public class ArithmeticException extends RuntimeException
        //Exceptions in Java are represented via classes and objects.
        int i =    10 /0     ;


        /*
        Corresponding to all the exceptional events, there are inbuilt classes in Java.
        When at runtime, JVM encounters an exceptional event(some abnormal programmatic situation ), it
        finds the corresponding exception class and creates its object and throws it to the program.
        Then it's unto the programmer to catch that exception object or not to catch it.
        If the programmer catches or handles the Exception, then the program terminates normally.
        Else, the program abnormally or abruptly terminates.
         */
        System.out.println("Hello");


    }
}
