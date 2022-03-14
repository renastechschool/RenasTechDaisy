package code.day13;

import java.util.Scanner;

public class C7StringDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter a string:");
        String str= scan.next() ;
        scan.nextLine() ;
        System.out.println(str);

        System.out.println("Enter a string:");
        String str1 = scan.nextLine() ;
        System.out.println(str1);
    }
}
