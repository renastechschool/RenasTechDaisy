package students.ruken;

public class lab4 {
    public static void main(String[] args) {
        //  ## Lab 05 -   (String) Sum of Digits in a string
        //  Write a method that can return
        //  the sum of the digits in a string
        String str = "r54u12k964e152n";
        char[] R = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < R.length; i++) {
            if (Character.isDigit(R[i])) {
                System.out.print("Digits in a String : " + R[i]);
                System.out.println();
                int a = Integer.parseInt(String.valueOf(R[i]));
                sum = sum + a;
            }
        }
        System.out.println("Sum of Digits is the : " + sum);
    }
}

