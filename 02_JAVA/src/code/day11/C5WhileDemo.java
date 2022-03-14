package code.day11;

import java.util.Scanner;

public class C5WhileDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your city: ");
        String city ;
        //to enter a  string without a white space, we use next method
        city = scan.next();
        System.out.println("You live in " + city);
        scan.nextLine();
        /*System.out.println("Enter your city, again: ");
        city = scan.nextLine() ;
        System.out.println("You live in " + city);*/

        String name;
        System.out.println("Enter your full name: ");
        name= scan.nextLine() ;
        System.out.println("Your name is " + name);

    }
}
