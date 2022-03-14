package code.day30Exceptions;
public class C10ThrowsDemo {
    public static void main(String[] args) throws InterruptedException{
        //A calling chain or the stack trace is the sequence in which the methods are called and how the
        //stack frames are put in the stack area
        //Unchecked Exceptions are automatically forwarded/thrown in the calling chain
        //To forward checked exceptions in the calling chain, throws keyword is used
        //calling chain can be traced back by going to the method from where the current method is called
        show() ;    System.out.println("Namaste");
    }

    static void show() throws InterruptedException{
        System.out.println("hello");
        play();
    }

    static void play() throws InterruptedException{
        System.out.println("Hi");
        //int j = 10/0;
        Thread.sleep(1000) ;
        System.out.println("chao");
    }
}
