package students.Kadir;
//    Write a return method that can reverse
//            number and return it as int

import java.util.Arrays;

public class Lab07 {
    public static void main(String[] args) {
        //solution1
        int num = 3678;
        String str=Integer.toString(num);
        String[] split=str.split("");
        //char[] ch=str.toCharArray();
        int reverse=0;
        for (int i=split.length-1 ; i>=0 ;i--){
            reverse=Integer.parseInt(split[i]);
            System.out.print(reverse+"");
        }
        System.out.println();
        reverseDigit(num);

    }
//solution 2
    public static void reverseDigit(int num){
        int reverse=0;
        while (num>0){
            reverse=reverse*10 + num%10;      //80+7=870 =8763
            num=num/10;
        }
        System.out.println(reverse);
    }
}