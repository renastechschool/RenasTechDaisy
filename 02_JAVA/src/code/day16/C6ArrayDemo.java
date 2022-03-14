package code.day16;

import java.util.Scanner;

public class C6ArrayDemo {

    public static void main(String[] args) {

        /*
        WAP to enter the size of a double array.
       Then input the     values of the array and
       find the sum and average of all the values.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt() ;
        double arr[] = new double[size] ;

        System.out.println("Enter the elements of the array:");
        //for inputting the double values
        for(int i=0; i<size ; i ++){
            System.out.print("arr["+i+"] = ");
            arr[i] = scan.nextDouble() ;
        }

        double sum = 0.0 ;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i] ;
        }

        System.out.println("Sum = " + sum +
                "\nAverage = " + (sum/arr.length) );

    }
}
