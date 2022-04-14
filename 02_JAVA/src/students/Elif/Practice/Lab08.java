package students.Elif.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
//        ## Lab 08 - Calculations
//        ___
//
//        Create a program that uses these formulas below
//
//## Objective
//
//        Write these programs
//                -------------------------------------------------------------------------------------
//
//### 1)WAP to input the makers of following five subjects from the user and print the Percentage and result based on that percentage.
//```
//        Georgian, English, Maths, Science, Computers. Marks should be out of 100.
//        Percentage=(Marks of all 5 subjects/500)*100.
//        Percentage 		Result
//	<40			FAIL
//                >=40 and <50		THIRD
//                >=50 and <60		SECOND
//                >=60 and <75		FIRST
//                >75			FIRST WITH DISTINCTION
//```
//
        int Class1Grade = 65;
        int Class2Grade = 76;
        int Class3Grade = 80;
        int Class4Grade = 70;
        int Class5Grade = 78;
        int percentage = (Class1Grade + Class2Grade + Class3Grade + Class4Grade + Class5Grade) / 5;
        if (percentage < 40) {
            System.out.println("FAIL");
        } else if (percentage >= 40 && percentage < 50) {
            System.out.println("THIRD");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("SECOND");
        } else if (percentage >= 60 && percentage < 75) {
            System.out.println("FIRST");
        } else if (percentage >= 75 && percentage <= 100) {
            System.out.println("FIRST WITH DISTINCTION");
        } else System.out.println("Invalid Grade Percentage");

//### 2) WAP to enter a number and check if its a palindrome or not.
        String str = "123456", reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }


//### 3) WAP to enter three numbers from the keyboard and print the smallest and largest of those numbers.
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = in.nextInt();
        System.out.print("Input second number: ");
        int y = in.nextInt();
        System.out.print("Input third number: ");
        int z = in.nextInt();
        if (x >= y && x >= z){System.out.println( x + " is the maximum number.");}
        if (y >= x && y >= z){System.out.println( y + " is the maximum number.");}
        if (z >= x && z >= y){System.out.println( z + " is the maximum number.");}
        if (x <= y && x <= z){System.out.println( x + " is the smallest number.");}
        if (y <= x && y <= z){System.out.println( y + " is the smallest number.");}
        if (z <= x && z <= y){System.out.println( z + " is the smallest number.");}

    }
}
