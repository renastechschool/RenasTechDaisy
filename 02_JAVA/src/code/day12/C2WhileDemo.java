package code.day12;

import java.util.Scanner;

public class C2WhileDemo {
    /*
    WAP which enters a number from the user and prints it until
    -1 is entered.

    OUTPUT
    ------
    6
    6 is entered
    3
    3 is entered
    -46
    -46 is entered
    -1
    Good Bye!!
     */

    public static void main(String[] args) {

        System.out.println("Printing numbers:");
        int i;  Scanner scan = new Scanner(System.in);

        while(true){
            i = scan.nextInt();
            if(i==-1) {
                System.out.println("Good Bye!!");
                break;
            }

            System.out.println(i + " is entered");
        }
    }
}
