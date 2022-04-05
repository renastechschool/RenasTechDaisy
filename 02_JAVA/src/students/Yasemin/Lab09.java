package students.Yasemin;

import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int uppercase= 0; int lowercase=0; int space=0; int specialch=0; int num=0;

        System.out.println("Enter a string");
        String word= scan.nextLine();

        for (int i=0; i <word.length();i++ ) {

            char ch = word.charAt(i);

            if (word.charAt(i)>64 && word.charAt(i)<= 91)
                uppercase++;

            else if (ch>=96 && ch<= 123 )
                lowercase++;

            else if (ch>48 & ch <58)
                num++;

            else if (ch==32)
                space++;

            else if (ch>32 && ch<48 || ch>57 && ch<65)
                specialch++;

        }

        System.out.println("Upper case letter " + uppercase);
        System.out.println("Lower case letter " + lowercase);
        System.out.println("Digit number count "+ num);
        System.out.println("Space in the String "+ space);
        System.out.println("Special characters " +specialch);

    }
}

