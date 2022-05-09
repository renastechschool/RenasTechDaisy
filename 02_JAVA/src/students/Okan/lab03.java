package students.Okan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab03 {
    //    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
    //
    //            if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
    //
    //            if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
    //
    //            if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
    public static void main(String[] args) {
        List<Integer> divisible15=new ArrayList<>();
        List<Integer> divisible3=new ArrayList<>();
        List<Integer> divisible5=new ArrayList<>();
        for(int i=1;i<100;i++){
            if(i%3 ==0 && i%5==0){
                divisible15.add(i);
            }
            else if(i%3==0 && i%15!=0)
            {
                divisible3.add(i);
            }
            else if(i%15!=0 && i%5==0){
                divisible5.add(i);
            }
        }
        System.out.print("Divisible by 15:  ");
        for(int i=0; i<divisible15.size(); i++){
            System.out.print(divisible15.get(i)+"  ");
        }
        System.out.print("\nDivisible by 5:  ");
        for(int i=0; i<divisible5.size(); i++){
            System.out.print(divisible5.get(i)+"  ");
        }
        System.out.print("\nDivisible by 3:  ");
        for(int i=0; i<divisible3.size(); i++){
            System.out.print(divisible3.get(i)+"  ");
        }

    }
}
