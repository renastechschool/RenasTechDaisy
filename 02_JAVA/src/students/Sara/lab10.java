package src.students.Sara;

import java.util.ArrayList;
import java.util.Collections;

public class lab10 {
    //    Write a method that can sort the ArrayList
   // in descending order without using the sort method
    public static void main(String args[]){
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("AA");
        arraylist.add("ZZ");
        arraylist.add("CC");
        arraylist.add("FF");

        /*Unsorted List: ArrayList content before sorting*/
        System.out.println("Before Sorting:");
        for(String str: arraylist){
            System.out.println(str);
        }


        Collections.sort(arraylist, Collections.reverseOrder());

        System.out.println("ArrayList in descending order:");
        for(String str: arraylist){
            System.out.println(str);
        }
    }

}
