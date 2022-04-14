package students.Elif.Lab;

import java.util.Arrays;

public class Lab02 {
    public static void main(String[] args) {
        // ## Lab 02 -    (Array) Find Minimum ,MAX
        //    Write a method that can find the maximum number from an int Array
                int[] i={3,550,298,-28,-85,356};
                System.out.println(maxValueOfArray(i));

            }
            public static int maxValueOfArray(int[] arr){
                Arrays.sort(arr);
                return arr[arr.length-1];
            }

            }

