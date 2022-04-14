package students.ruken;

public class lab6 {
    public static void main(String[] args) {
        //  ## Lab 07 - (Number) Reverse Number
        //  Write a return method that can reverse
        //  number and return it as int
        int num = 1988, reversed = 0;
        System.out.println("actual number is : " + num);
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}

