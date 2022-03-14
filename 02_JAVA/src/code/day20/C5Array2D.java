package code.day20;

import java.util.Scanner;

public class C5Array2D {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int arr[][] = new int[2][3];

        System.out.println("Enter the elements:");
        for(int[] a : arr){
            for(int i=0; i<a.length; i++){
                a[i] = scan.nextInt();
            }
        }

        System.out.println("Entered elements are:");
        for(int[] a : arr){
            for(int i :  a ){
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }
}
