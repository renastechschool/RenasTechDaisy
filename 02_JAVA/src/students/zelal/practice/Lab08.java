package students.zelal.practice;

import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {

//        ### 1)WAP to input the makers of following five subjects from the user and print the Percentage and result based on that percentage.
//```
//        Georgian, English, Maths, Science, Computers. Marks should be out of 100.
//        Percentage=(Marks of all 5 subjects/500)*100.
//        Percentage 		Result
//	<40			FAIL
//                >=40 and <50		THIRD
//                >=50 and <60		SECOND
//                >=60 and <75		FIRST
//                >75			FIRST WITH DISTINCTION
//```

        int Georgian = 90;
        int English= 85;
        int Maths = 75;
        int Science = 90;
        int Computers= 80;

        int Percentage = (( (Georgian+English + Maths + Science + Computers) /5));

        String result= ((Percentage < 40) ? "failed" : ( Percentage>=40 && Percentage <50 )? "THIRD" : (Percentage>=50 && Percentage <60) ? "SECOND":
                (Percentage>=60 && Percentage<75) ? "FIRST" : (Percentage>75 )? "FIRST WITH DISTINCTION" : "NOT VALID");
        System.out.println(result);
//
//### 2) WAP to enter a number and check if its a palindrome or not.

        String num= "101";
        String reversenum="";


            for(int i= num.length()-1; i>=0;--i) {

             reversenum=reversenum+num.charAt(i);
            }

            if (reversenum.equals(num)){
                System.out.println(" palindrome");
            }else {
                System.out.println("not palindrome");
            }

//### 3) WAP to enter three numbers from the keyboard and print the smallest and largest of those numbers.

        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = in.nextInt();
        System.out.print("Input second number: ");
        int y = in.nextInt();
        System.out.print("Input third number: ");
        int z = in.nextInt();
        if (x >= y && x >= z){System.out.println( x + " is the maximum number.");}
        if (y >= x && y >= z){System.out.println( y + " is the maximum number.");}
        if (z >= x && z >= y){System.out.println( z + " is the maximum number.");}
        if (x <= y && x <= z){System.out.println( x + " is the smallest number.");}
        if (y <= x && y <= z){System.out.println( y + " is the smallest number.");}
        if (z <= x && z <= y){System.out.println( z + " is the smallest number.");}
    }
}
