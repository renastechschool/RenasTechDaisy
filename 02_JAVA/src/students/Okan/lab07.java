package students.Okan;

import java.util.Scanner;

public class lab07 {
    public static void main(String[] args) {
        //    Write a return method that can reverse
        // number and return it as int
        reverse();

    }
    public static void reverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int reversedNumber = 0;
        int number = scanner.nextInt();
        if (number > 9) {
            do {
                int digit=number % 10;
                reversedNumber=reversedNumber*10+digit;
                number = number / 10;
            } while (number != 0);
            System.out.println("Reversed number:" + reversedNumber);
        }
    }
}
