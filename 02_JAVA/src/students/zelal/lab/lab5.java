package students.zelal.lab;

public class lab5 {
    public static void main(String[] args) {
        //    ## Lab 05 -     (String) Sum of Digits in a string
        //    Write a method that can return
        //    the sum of the digits in a string
        String str1 = "h12j6k7h5g39f";

        char[] c = str1.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                System.out.print("Digits in the String : " + c[i]);
                System.out.println();
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }
        System.out.println("Sum of Digits is : " + sum);

    }
}
