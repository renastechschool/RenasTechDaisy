package students.ruken;

import java.util.Arrays;

public class lab9 {
    public static void main(String[] args) {
            // ## Lab 10 (ArrayList) sorting in descending order
            //  Write a method that can sort the ArrayList in descending order without using the sort method
        int[] array = new int[] { 9, 29, 2015, 24, 11, 1988, 2, 6, 21, 72, 47, 73};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int srt = 0;
                if (array[i] > array[j]) {
                    srt = array[i];
                    array[i] = array[j];
                    array[j] = srt;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
