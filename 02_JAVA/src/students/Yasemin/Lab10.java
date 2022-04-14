package students.Yasemin;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows of the array");
        int r = scan.nextInt();

        System.out.println("Enter the number of columns of the array");
        int c = scan.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter the elements of the array");


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Entered the elements ");
        int sum=0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");

                sum += arr[i][j];

            }

            System.out.println();
        }
        System.out.println("Sum is:" + sum + " Average is : " + (sum/arr.length));
    }
}
