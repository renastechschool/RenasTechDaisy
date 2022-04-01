package students.Kadir;
//    Write a method that can sort the ArrayList
  //        in descending order without using the sort method

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class Lab10 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList( Arrays.asList(5, 15, 0, -5, 7));
        for (int i = 0; i < arr.size(); i++) {
            for (int j =arr.size()-1; j>i; j--) {
                int tem=arr.get(i);
                if (arr.get(i)<arr.get(j)){
                    arr.set(i,arr.get(j));
                    arr.set(j,tem);
                }
            }
        }
        for (Integer descending : arr){
            System.out.println(descending);
        }
    }
}