package code.day12;

import java.util.Scanner;

public class C6ScannerDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int i; boolean flag =true;


        while(flag) {
            if (scan.hasNextInt()) {
                i = scan.nextInt();
                System.out.println("Entered number is " + i);
                break ;
            }
            System.out.println("Invalid entry! Please enter again!!");
        }
    }
}
