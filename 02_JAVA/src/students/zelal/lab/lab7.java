package students.zelal.lab;

public class lab7 {
    public static void main(String[] args) {
        //    ## Lab 07 -  (Number) Reverse  Number
        //    Write a return method that can reverse
        //    number and return it as int
        int num = 12345, reversed = 0;

        System.out.println("Original Number: " + num);

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
