package students.Okan;

import java.util.Scanner;

public class lab06 {

    public static void main(String[] args) {
        //    Write a return method that returns the
        //factorial number of any given number
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scanner.nextInt();
        System.out.println("factorial of the "+number+": "+factorial(number));

    }

    public static int factorial(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;

    }
}
