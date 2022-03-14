package code.day15;

import java.util.Scanner;

public class C1Demo {

    public static void main(String[] args) {

        String s = "shell" ;

        String str  = s.replace("sh" , "p");

        System.out.println(s + "\n" + str);

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter a string");
        String s2 = scan.nextLine();

        System.out.println(
                s2.replace('s', '$')
        );

    }
}
