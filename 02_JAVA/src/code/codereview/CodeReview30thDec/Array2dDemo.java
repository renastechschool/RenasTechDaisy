package code.codereview.CodeReview30thDec;

import java.util.Scanner;

public class Array2dDemo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [][] array = new int[3][3];
        int sumCol=0,sumRow=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("Please enter number..");
                array[i][j]=scn.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < i+1; j++) {
                System.out.println(array[i][j]);

            }

        }

    }
}
