package students.Kadir;

//    Write a method that can find the maximum number from an int Array

import java.util.Arrays;

public class LAB02 {

    public static void main(String[] args) {
        System.out.println(maxNumberofArray());
    }
    public static int maxNumberofArray(){
        int[] arr={2,10,-5,100,0};
        Arrays.sort(arr);

        return arr[arr.length-1];
    }
}

