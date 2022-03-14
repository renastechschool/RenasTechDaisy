package code.day12;

import java.util.Scanner;

public class C4Demo {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

       /* System.out.println("Enter a word");
        String word = scan.next();

        //to consume the new line character
        scan.nextLine() ;


        System.out.println(word);

        System.out.println("Enter the address");

        String name = scan.nextLine() ;
        System.out.println(name);
    */

       /* String str = "Hello" ;
        char ch = str . charAt(1) ;
        System.out.println(ch);//e
        System.out.println(str.charAt(0));//H
        System.out.println(str.charAt(2));//l
        int len = str.length() ;
        System.out.println(len);//5
        //length of a string is the no. of characters in that string
        //length can be obtained by length()
        System.out.println(str.length());//5
        System.out.println(str);

        */

        /*
        WAP to enter a string from the user and print all its characters and the
        length of that string.
        (HINT: Use Scanner and for loop)
         */
        System.out.println("Enter a string");
        String str = scan.nextLine() ;

        //for(int j=0; j<=str.length()-1; j++)
        //last index of a string is its length - 1
        for(int j=2; j<str.length(); /*j++*/){
            System.out.println(str.charAt(j));
            j++;
        }

        System.out.println(str.length());//5

    }
}
