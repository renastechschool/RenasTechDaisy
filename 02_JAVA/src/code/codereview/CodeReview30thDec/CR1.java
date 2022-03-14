package code.codereview.CodeReview30thDec;

import java.util.Scanner;

public class CR1 {

    /*
     - WAP to enter a 1-D array and print the
        smallest number in that array
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();

        int arr[] = new int[size] ;
        System.out.println("Enter " + size  + " elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt() ;
        }

        int smallest = arr[0];
        int largest = arr[0] ;

        for(int i=1; i<arr.length; i++){
            if(arr[i]<smallest) smallest = arr[i];
            if(arr[i]>largest)  largest = arr[i] ;
        }

        System.out.println("Smallest=" + smallest);
        System.out.println("Largest=" + largest);

    }
}
