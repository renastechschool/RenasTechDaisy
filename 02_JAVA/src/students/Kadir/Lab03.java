package students.Kadir;
// Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
// if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
// if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
// if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

public class Lab03 {
    public static void main(String[] args) {
        int num=100;
        System.out.print("Divisible by 15: ");
        divisibleBy15(num);
        System.out.println();
        System.out.print("Divisible by 3: ");
        divisibleBy3(num);
        System.out.println();
        System.out.print("Divisible by 5: ");
        divisibleBy5(num);

    }

    public static void divisibleBy15(int num){
        for (int i=1 ;i<=num ;i++){
            if (i%15==0){
                System.out.print(i + " ");
            }
        }

    }
    public static void divisibleBy3(int num){
        for (int i=1 ;i<=num ;i++){
            if ((i%3==0) && (i%15!=0)){
                System.out.print( i + " ");
            }
        }

    }
    public static void divisibleBy5(int num) {
        for (int i = 1; i <= num; i++) {
            if ((i % 5 == 0) && (i % 15 != 0)) {
                System.out.print(i + " ");
            }
        }
    }

}
