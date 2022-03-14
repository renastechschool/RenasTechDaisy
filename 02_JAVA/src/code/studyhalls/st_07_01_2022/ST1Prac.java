package code.studyhalls.st_07_01_2022;

import java.util.Scanner;

public class ST1Prac {

    /*
    ********CALCULATOR********
    Enter 2 numbers
    2.2
    3
    1. Add
    2. Subtraction
    3. Multiplication
    4. Division
    5. Modulus
    Choose an option from above
    1
    Result = 5.2
    Press y to continue or any other key to stop
    n
    Thanks for using calculator
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("********CALCULATOR********");

        char ch;
        do{
            System.out.println("Enter 2 numbers");
            double num1 = scan.nextDouble() ;
            double num2 = scan.nextDouble() ;
            System.out.println("1. Add\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "5. Modulus");
            System.out.println("Choose an option from above");
            byte option=  scan.nextByte() ;

            switch(option){
                case 1 :
                    System.out.println("Result = "  + add(num1,num2) ) ;
                    break ;

                case 2 :
                    System.out.println("Result = "  + subtract(num1,num2) ) ;
                    break ;

                case 3 :
                    System.out.println("Result = "  + multiply(num1,num2) ) ;
                    break ;

                case 4 :
                    System.out.println("Result = "  + divide(num1,num2) ) ;
                    break ;

                case 5 :
                    System.out.println("Result = "  + modulus(num1,num2) ) ;
                    break ;
            }
            System.out.println("Press y to continue or any other key to stop");
            ch = scan.next() . charAt(0) ;

        }while(ch=='y' || ch=='Y') ;

        System.out.println("*****Thanks for using calculator*****");
    }

     static double multiply(double num1, double num2) {
        return num1*num2;
    }

     static double divide(double num1, double num2) {
        return num1/num2;
    }

     static double modulus(double num1, double num2) {
        return num1%num2;
    }

     static double subtract(double num1, double num2) {
        return num1-num2;
    }

     static double add(double num1, double num2) {
        return num1+num2;
    }
}
