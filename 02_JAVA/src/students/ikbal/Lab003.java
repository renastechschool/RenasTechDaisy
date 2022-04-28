package students.ikbal;

public class Lab003 {
    public static void main(String[] args) {
        //    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
        //
        //    if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
        //
        //   if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
        //
        //   if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
        //


        int num = 100;
        System.out.print("DivisibelBy15");
        for (int i = 1; i < num; i++) {
            if ((i % 15 == 0) && (i % 5 == 0) && (i % 3 == 0)) {
                System.out.print("  " + i);
            }
        }
        System.out.print("\nDivisibelBy3");
        for (int i=1; i<num; i++){
            if ((i%3==0)&&(i%15!=0)){
                System.out.print("  "+i);
            }
        }
        System.out.print("\nDivisibelBy5");
        for (int i=1; i<num;i++){
            if ((i%5==0)&&(i%15!=0)){
                System.out.print("  "+i);
            }
        }
    }
}

