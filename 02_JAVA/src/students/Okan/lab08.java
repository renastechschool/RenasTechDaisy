package students.Okan;

import java.util.Scanner;

public class lab08 {
    public static void main(String[] args) {
        //    Write a return method that returns the
        //  Fibonacci of any given number

        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scn.nextInt();
        System.out.println(fibonacci(number));

    }
    public static int fibonacci(int number){
        int result=0,nbr=0,nexNumber=1;
        for(int i=0; i<number; i++){
            result=nbr+nexNumber;
            nbr=nexNumber;
            nexNumber=result;
            System.out.print(result+" ");
        }

        return result;
    }
}
