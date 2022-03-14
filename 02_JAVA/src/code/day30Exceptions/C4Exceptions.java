package code.day30Exceptions;

public class C4Exceptions {

    public static void main(String[] args) {
        /*
        checked exceptions are known to the Java's compiler.
        The compiler will not compile the program if it finds that a particular
        piece of code will give the checked Exception at runtime.
        Checked Exceptions can occur if we try to call a method or create an object
        i.e. when a constructor runs
         */

        /*
		Below method call could throw an Exception at runtime so compiler
		 will not compile the below statement. Such exceptions, which are
		 known to the compiler and are checked by the compiler at compilation
		  time are called checked exceptions
		*/
        //this statement gives a compilation error
        //Thread . sleep(1000);

        int j = 10 / 0 ;
    }
}
