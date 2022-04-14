package students.Yasemin;

import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=scan.nextLine();
        String[] words = str.split(" ");


        for (int i =words.length ; i>0 ; i--) {

            System.out.print(words[i - 1] + " ");

        }


        System.out.println(" ");
        String sentence = "Java is fun";
        String [] word =sentence.split(" ");


        for (int i = words.length-1; i >= 0 ; i--) {
            String reverseSentence =word[i] + " ";

            System.out.print(reverseSentence);
        }


    }
}
