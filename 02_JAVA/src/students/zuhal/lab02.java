package src.students.zuhal;

import java.util.Arrays;

public class lab02 {
    /*
 ## Lab 02 -    (Array) Find Minimum ,MAX
 //    Write a method that can find the maximum number
 from an int Array
  */
    public static void main(String[]args){
        int[] nums={6, 15, 3, 26, 17, 44, 34, 65, 70};
        Arrays.sort(nums);
        System.out.println("Minimum = " + nums[0]);
        System.out.println("Maximum = " + nums[nums.length-1]);

    }
}
