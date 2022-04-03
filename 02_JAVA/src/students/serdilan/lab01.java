package students.serdilan;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lab01 {
    //## Lab 01 -  (String) Find the unique
    //    //    Write a return  method that can find the unique characters from the String
    //    //
    //    //    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        findUnique(str);
    }
    public static void findUnique(String str){
        char value = 0;
        String str1[] = str.split(" ");
        System.out.println(Arrays.toString(str1));

        for (int k=0;k<str1.length;k++){

            char string[] = str1[k].toCharArray();

            for (int i=0;i<string.length;i++){
                int count=0;
                for (int j=0;j<string.length;j++){
                    if(i!=j){
                        if(string[i]==string[j]){
                            count++;
                        }
                    }
                }

                if(count==0){
                    System.out.print(string[i]);
                }
            }
            System.out.print(" ");

        }
    }
}
