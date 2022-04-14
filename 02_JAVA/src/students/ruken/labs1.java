package students.ruken;

import java.util.Arrays;

public class labs1 {
    public static void main(String[] args) {
            // ## Lab 02 -  (Array) Find Minimum ,MAX
           //  Write a method that can find the maximum number from an int Array
        int[] i={0,789,63,10,-746,483};
        System.out.println(maxValueOfArray(i));
    }
    public static int maxValueOfArray(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}

