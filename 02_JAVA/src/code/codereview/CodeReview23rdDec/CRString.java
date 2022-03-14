package code.codereview.CodeReview23rdDec;

import java.util.Scanner;

public class CRString {
    /*
    WAP to count the number of digits, lower case alphabets,
    upper case alphabets, special characters(like %,* etc) and
    spaces in a string.
    Unicode values corresponding to the digits are 48 to 57.
    OUTPUT:
    ------
    Enter a string:
    Hello 123*&
    Digits in the entered string: 3
    Upper case letters: 1
    Lower case letters: 4
    Spaces: 1
    Special characters: 2

    Press y to continue or any other key to stop

     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please write in a String : ");
        String name = scn.nextLine();
        int lower_case=0, upper_case=0, digits=0, sp_char=0, spaces=0 ;

        for (int j = 0; j < name.length(); j++) {

            char ch = name .charAt(j);
            if(ch>=48 && ch<=57)  digits++;

            else if(ch>=97 && ch<=122) lower_case++;

            else if(ch>=65 && ch<=90) upper_case++ ;

            else if(ch==32)  spaces++;
            else if( (ch>=33 && ch<=47)  || (ch>=58 && ch<=64) ||
                    (ch>=91 && ch<=96)  || (ch>=123 && ch<=126) ) sp_char++ ;
        }
        System.out.println("Digit count :" + digits);
        System.out.println("Lower case count: " + lower_case);
        System.out.println("Upper Case count:" + upper_case);
        System.out.println("Spaces count : " + spaces);
        System.out.println("Special Characters count: " + sp_char);

    }
}
