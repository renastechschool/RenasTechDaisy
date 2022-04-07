package src.students.zuhal;

import java.util.Arrays;

public class lab10 {
    public static void main(String[] args) {
    /*
            Lab 10 (ArrayList) sorting in descending order
            Write a method that can sort the ArrayList
            in descending order without using the sort method
     */
        System.out.println("Lotto Winner");
        int[] arr = new int[] { 45, 5, 24, 32, 28, 38, };
        for (int i = 0; i < arr.length; i++) {
            for (int b = i + 1; b < arr.length; b++) {
                int tmp = 0;
                if (arr[i] > arr[b]) {
                    tmp = arr[i];
                    arr[i] = arr[b];
                    arr[b] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
