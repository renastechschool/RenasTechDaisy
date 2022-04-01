package src.students.Sara;

public class lab03 {
    //    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.


    //            if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
    //
    //            if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
    //
    //            if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

    //

    public static void main(String args[]) {
        System.out.println("\nDivisibelBy3: ");
        for (int i=1; i<100; i++) {
            if (i%3==0 && i%15!=0)
                System.out.print(i +", ");
        }

        System.out.println("\n\nDivisibelBy5 ");
        for (int i=1; i<100; i++) {
            if (i%5==0 && i%15!=0) System.out.print(i +", ");
        }

        System.out.println("\n\nDivisibelBy15 ");
        for (int i=1; i<100; i++) {
            if (i%3==0 && i%5==0 && i%15==0) System.out.print(i +", ");
        }
        System.out.println("\n");
    }
}

