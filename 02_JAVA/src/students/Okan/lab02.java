package students.Okan;

import java.util.Scanner;

public class lab02 {
    Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        //    Write a method that can find the maximum number
        //from an int Array
        int arr[]={22,66,43,77,1,19};
        int max=0;
        System.out.println(maxNumber(arr,max));


        }
    public static int maxNumber(int arr[],int max){
        max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
