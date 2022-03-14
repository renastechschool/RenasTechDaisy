package code.day30Exceptions;

import java.util.Scanner;

public class C6Exceptions {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt() ;
        show(i) ;// show(5) ;
        System.out.println("hello");

    }

    static void show(int n) {
        int x = 10/n;
        int arr[]  = new int[x] ;

       // try {
            arr[10] = 50;
       // }
       // catch(ArrayIndexOutOfBoundsException e){
        //    System.out.println("Exception is caught");
       // }
    }
}
