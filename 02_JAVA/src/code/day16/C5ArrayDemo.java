package code.day16;

import java.util.Scanner;

public class C5ArrayDemo {

    public static void main(String[] args) {

        /*
        WAP to enter the size of the
        array, from the user. Then create an array of that size.
        Then input all the values of the array from the user.
        Then print all the values of the array.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the array size");
        int a;
        a = scan.nextInt();
        int arr[] = new int[a];
        System.out.println("enter the values");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("entered values are: ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
