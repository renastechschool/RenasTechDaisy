package students.ruken;

public class lab5 {
    public static void main(String[] args) {
        //  ## Lab 06 -(Numbers) Factorial Number
        //  Write a return method that returns the
        //  factorial number of any given number
        int i, factorial = 5;
        int number=78;
        for ( i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + " is "+ factorial);
    }
}

