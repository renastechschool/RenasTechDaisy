package code.codereview.CodeReview30thDec;

import java.util.Scanner;

public class CR2 {

    public static void main(String[] args) {
        /*
        - WAP to enter a 2-D array and print the
        smallest and the largest number in that array
         */

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter the dimensions of the 2 D array");

        int arr[][] = new int[scan.nextInt()][scan.nextInt()] ;

        System.out.println("Enter the elements of the 2D Array");

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Entered array is:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }


        int smallest = arr[0][0];
        int largest = arr[0][0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
               if(arr[i][j]<smallest) smallest = arr[i][j];
               if(arr[i][j]>largest) largest = arr[i][j];
            }
            System.out.println();
        }

        System.out.println("Smallest = "+smallest);
        System.out.println("Largest = "+largest);

    }
}
