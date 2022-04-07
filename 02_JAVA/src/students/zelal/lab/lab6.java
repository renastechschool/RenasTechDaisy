package students.zelal.lab;

public class lab6 {
    public static void main(String[] args) {
        //    ## Lab 06 -(Numbers) Factorial Number
        //    Write a return method that returns the
        //    factorial number of any given number
        int i, factorial = 1;
        int number=5;
        for ( i = 2; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+ number+" is "+factorial);
    }

}
