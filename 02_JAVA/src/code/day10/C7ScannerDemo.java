package code.day10;

import java.util.Scanner;

public class C7ScannerDemo {
    public static void main(String[] args) {

        //to take data from the user create a scanner object
        Scanner scan = new Scanner(System.in);

        //System.out.println("Enter a number");

        /*
        * nextInt() method is used to enter an int number from the user
        * */
        int num =  scan . nextInt();

        System.out.println("User Entered " + num);
        System.out.println("Program terminated");

        if(num>18) System.out.println("Hello");
        else System.out.println("hi");
    }
}
