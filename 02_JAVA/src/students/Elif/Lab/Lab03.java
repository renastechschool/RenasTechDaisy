package students.Elif.Lab;
//            ## Lab 03 -    (Numbers) Divisible by 3, 5, 15
//            Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
//
//            if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
//
//            if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
//
//            if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
//

public class Lab03 {

    public static void main(String[] args) {

        int N = 100;
        {
            System.out.print("Divisible by 3: ");
            for (int num = 0; num < N; num++) {
                if (num % 3 == 0 && num % 15 != 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.print("Divisible by 5: ");
            for (int num = 0; num < N; num++) {
                if (num % 5 == 0 && num % 15 != 0) {
                    System.out.print(num + " ");
                }

            }
            System.out.println();
            System.out.print("Divisible by 15: ");
            for (int num = 0; num < N; num++) {
                if (num % 15 == 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
