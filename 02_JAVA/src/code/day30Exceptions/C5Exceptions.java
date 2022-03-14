package code.day30Exceptions;

public class C5Exceptions {
    public static void main(String[] args) {



        try {
            System.out.println("hello");
            Thread.sleep(1000);
            System.out.println("Hi");
        }
        catch(Exception e){
            System.out.println("This is the catch block");
        }

        System.out.println("slaw");


    }
}
