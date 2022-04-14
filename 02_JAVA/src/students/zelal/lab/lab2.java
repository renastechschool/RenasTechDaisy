package students.zelal.lab;

import java.util.Arrays;

public class lab2 {


    public static void main(String[] args) {




        // ## Lab 02 -    (Array) Find Minimum ,MAX
        //    Write a method that can find the maximum number from an int Array
        int[] a = {3, 550, 298, -28, -85, 356};
        //System.out.println(maxValueOfArray(i));


        for (int i = 0; i <= a.length - 1; i++) {
            Arrays.sort(a);
        }
        int b = a[a.length - 1];
        System.out.println(b);

        System.out.println(maxNumber(a));
    }


    // with methods
    public static int  maxNumber(int[] arr){


        int max= arr[0];

        for (int i = 0; i < arr.length ; i++) {


            if ( arr[i] > max){

                max= arr[i];
            }

        }

        return  max;

    }


}