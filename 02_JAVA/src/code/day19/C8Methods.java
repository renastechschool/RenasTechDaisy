package code.day19;

import java.util.Scanner;

public class C8Methods {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");

        System.out.println(
                add(scan.nextInt(), scan.nextInt())
        );

    }

    static int add(int a, int b){
        return a+b ;
    }

    static double subtract(double a, double b){
        return a-b;
    }

}
