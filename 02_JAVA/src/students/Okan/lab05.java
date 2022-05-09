package students.Okan;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class lab05 {
    public static void main(String[] args) {
        //  Write a method that can return
       // the sum of the digits in a string
        digits();
    }
    public static void digits(){
        String str="hs4hbj55n32";
        char[] c=str.toCharArray();

        int sum=0;
        for(int i=0;i<c.length;i++){
            if(Character.isDigit(c[i])){
                sum+=Integer.parseInt(String.valueOf(c[i]));
            }
        }
        System.out.println(sum);
    }
}
