package code.day13;

//imports Scanner class from the java.util package to the
//current class
import java.util.Scanner;

public class C4ScannerDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an int number");

        //below if condition is true if the user doesn't enter a valid int number
        while(! scan.hasNextInt()  ){

            String str = scan.nextLine() ;

            System.out.println("Entered string is : "  + str);
            System.out.println("Enter a valid int number:");
        }

        System.out.println("Thanks for entering a valid int number");
        int i = scan.nextInt() ;
        System.out.println("Entered number is " + i);

    }
}
