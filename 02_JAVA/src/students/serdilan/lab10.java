package students.serdilan;

import java.util.ArrayList;
import java.util.Collections;

public class lab10 {
    //    Write a method that can sort the ArrayList in descending order without using the sort method
    public static void main(String[] args) {
sort();
    }
    public static void sort() {
        // Get the ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("Unsorted ArrayList: "
                + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted ArrayList "
                + "in Descending order : "
                + list);
    }


}
