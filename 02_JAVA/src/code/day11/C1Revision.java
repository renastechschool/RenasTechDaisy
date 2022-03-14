package code.day11;

import java.util.Scanner;

public class C1Revision {
/*
Enter a number from the user and print the numbers
from 0 to that entered number
 */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //System.out.println("Enter a number:");
        int num = sc.nextInt() ;

        for(int i=0; i<=num ; i++ )
            System.out.println(i);


    }
}
