package students.serkan;

import java.util.ArrayList;
import java.util.Collections;

public class Lab010 {
    public static void main(String[] args) {
        sort();
    }
    public static void sort(){
//    Write a method that can sort the ArrayList
     //   in descending order without using the sort method
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(2);
        arr.add(58);
        arr.add(24);
        arr.add(19);
        arr.add(91);
        arr.add(8);
        arr.add(20);
        arr.add(34);
        System.out.println(arr);
        System.out.println("List of the numbers");
        Collections.sort(arr);
        System.out.println("sorted numbers"+arr);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println("reversed numbers"+arr);
    }

}
