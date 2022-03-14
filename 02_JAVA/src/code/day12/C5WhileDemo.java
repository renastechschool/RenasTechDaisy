package code.day12;
import java.util.Scanner;

public class C5WhileDemo {
    /*
    WAP to check if the entered number is positive, negative or zero (HINT: Use Scanner)
    Ask the user if he wants to continue or stop(HINT: Use do-while or  a while loop)
    SAMPLE OUTPUT:
    -------------
    Enter a number: 5
    number is positive
    Do you want to continue? y/n
    y
    Enter a number: -9
    number is negative
    Do you want to continue? y/n
    y
    Enter a number: 0
    number is zero
    Do you want to continue? y/n
    n
    Thanks for using!!!:)
     */

    public static void main(String[] args) {
        char ch='y'; int num;
        Scanner scan = new Scanner(System.in) ;

        while(ch=='y' || ch=='Y'){
            System.out.println("Enter a number:");
            num = scan.nextInt();
            if(num>0) System.out.println("number is positive");
            else if(num<0) System.out.println("number is negative");
            else System.out.println("Number is zero");

            System.out.println("Press y to continue or any" +
                    " other key to stop");
            ch = scan.next() . charAt(0);
        }

        System.out.println("Thanks for using!!!:)");
    }
}
