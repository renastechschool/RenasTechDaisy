package code.day14;

import java.util.Scanner;

public class C6StringDemo {

    public static void main(String[] args) {


      /*  String s1 = "Drum";
        System.out.println(s1.indexOf('u'));
*/
        /*
        WAP to enter a string and then ask the user the
        enter a character to find its index in the
        entered string nd print the index
        OUTPUT
        ------
        Enter a string
        Hello Bello
        Enter the character to find index for:
        e
        Index of 'e' is 1
         */
        Scanner scan  = new Scanner(System.in) ;
        System.out.println("Enter a string");
        String str=  scan.nextLine() ;//google yahoo
        System.out.println("Enter the character to find index for:");
        char ch = scan.next() . charAt(0) ;//"oguen".charAt(0) ;

        System.out.println("Using indexOf method");
        if(str.indexOf(ch) == -1)
            System.out.println("character '"  + ch+ "' is not there!");
        else
            System.out.println("Index of '"+ch+ "' is " + str.indexOf(ch));


        System.out.println("\nUsing for loop");

        for(int i=0; i<str.length(); i++){

            if(str.charAt(i)==ch){
                System.out.println("Index of '"+ch+ "' is " + i);
            }

        }








    }

}
