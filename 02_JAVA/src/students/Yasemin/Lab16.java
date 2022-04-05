package students.Yasemin;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab16 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(4);
        arr.add(7);
        arr.add(3);
        arr.add(1);

        System.out.println("all array lis elements");
        System.out.println(arr);

        arr.remove(2);
        System.out.println("after remove 3. elements");
        System.out.println(arr);


        arr.clear();
        System.out.println();

        arr.isEmpty();

        if (arr.isEmpty()) {
            System.out.println("my array is empty");

        } else {
            System.out.println("my array list is not empty");
        }

        LinkedList<Integer> ar = new LinkedList<>();

        ar.add (17);
        ar.add(34);
        ar.add(2);
        ar.add(68);

        System.out.println(ar);

        System.out.println("last element " + ar.getLast());

        System.out.println("first element " + ar.getFirst());

    }
}

