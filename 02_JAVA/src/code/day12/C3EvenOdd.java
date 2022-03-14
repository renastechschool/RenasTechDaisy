package code.day12;

import java.util.Scanner;

public class C3EvenOdd {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("*****Even odd check*****");

        char ch = 'y';
        while(ch=='y'){

            System.out.println("Enter a number");
            int i = scan . nextInt();
            if(i%2 == 0) System.out.println(i + " is even");
            else System.out.println(i + " is odd");
            System.out.println("Enter y to continue or any other key to stop");
            ch  = scan.next() . charAt(0) ;
        }

        System.out.println("Thanks for using!!");

    }
}
