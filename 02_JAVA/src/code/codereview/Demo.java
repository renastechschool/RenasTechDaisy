package code.codereview;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner ta = new Scanner(System.in);

        System.out.println("Please enter ");

        int array[][] = new int[7][10];

        for (int i = 0; i < array.length; i++) {

            int big = array[i][0];
            int small = array[i][0] ;
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = ta.nextInt();

                if (big < array[i][j]) {

                    big = array[i][j];
                }
            }
            System.out.println("Biggest number is  " + big);
            System.out.println();
        }

    }


}
