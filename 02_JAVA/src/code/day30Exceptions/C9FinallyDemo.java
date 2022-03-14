package code.day30Exceptions;

public class C9FinallyDemo {

    public static void main(String[] args) {

        try{
            System.out.println("Hello");
            int i = 4/0 ;
            System.out.println("Hi");
        }
        catch(ArithmeticException e){
            System.out.println("Chao");
        }
        //the finally block is always executed, whether we get the Exception or we don't get it
        finally{
            System.out.println("Bye");
        }

    }
}
