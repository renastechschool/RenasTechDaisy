package code.day16;

import java.util.Scanner;

public class C4ArrayDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float temp[] = new float[10];




        /*System.out.println("Enter temperature of temp[0]:");
        temp[0] = scan.nextFloat() ;
        System.out.println("Entered temperature is: " + temp[0]);*/

        //input all the 10 temperatures from the user

        System.out.println("Enter the temperatures of 10 cities ");

        for(int i=0; i< temp.length; i++){
            temp[i] = scan.nextFloat() ;
        }

        System.out.println("\nEntered temperatures are:");
        for(int i=0; i<temp.length ;  i++){
            System.out.println(temp[i]);
        }

    }
}
