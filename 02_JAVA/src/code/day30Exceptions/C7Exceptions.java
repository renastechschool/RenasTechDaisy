package code.day30Exceptions;

public class C7Exceptions {

    public static void main(String[] args) {

        System.out.println("hi");
        int arr[] = new int [2];
        System.out.println("Hello");
        arr[10] = 50 ;

        //No statement executes after we get an exception,
        //and it's not handled
        System.out.println("Bye");


    }
}
