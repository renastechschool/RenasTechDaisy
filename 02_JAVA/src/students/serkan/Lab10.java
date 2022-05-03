package students.serkan.Lab;

import java.util.Arrays;

public class Lab10 {
    public static void main(String[] args) {
        // ## Lab 10 (ArrayList) sorting in descending order
        //    Write a method that can sort the ArrayList in descending order without using the sort method

        int[] arr = new int[] { 25, 6, 25, 144, 271, 95, 11, 4, 33, 7, 17, 275 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
