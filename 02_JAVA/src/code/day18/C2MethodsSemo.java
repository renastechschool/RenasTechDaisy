package code.day18;

public class C2MethodsSemo {


    public static void main(String[] args) {

        //using a method means calling or invoking a method
        //below statement calls the show method so show is the called method
        //and main is the calling method as show is being called from the main method
        show( ) ;
    }


    static void show(  ){
        System.out.println("This is show method");
        play() ;
    }

    static void play(){
        System.out.println("play method");
    }





}
