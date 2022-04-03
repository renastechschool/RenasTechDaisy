package students.Okan;

import java.util.ArrayList;

public class Lab01 {
    public static void main(String[] args) {

        //    Write a return  method that can find the unique characters from the String
        //
        //    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

        String str = "AAABBBCCCDEF";
        char unique;
        for (int i = 0; i < str.length(); i++) {
            unique= str.charAt(i);
            if (str.indexOf(unique) == str.lastIndexOf(unique)) {
                System.out.print(unique);
            }
        }

    }
    }
