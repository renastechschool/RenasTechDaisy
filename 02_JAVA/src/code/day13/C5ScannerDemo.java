package code.day13;

import java.util.Scanner;

public class C5ScannerDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value to be checked");

        //below if condition checks can the value entered be
        //stored in a double type variable
        if(scan.hasNextDouble()){
            System.out.println("You have entered a valid double value");
            System.out.println("Scanning the entered value and putting it in a variable");

            double d =  scan.nextDouble();
        }


        //System.out.println("Invalid data entered");


    }
}
