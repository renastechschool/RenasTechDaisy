package students.HasanTasdemir.labs;

import java.util.ArrayList;
import java.util.Collections;

public class lab09 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>(8);
        arrayList.add("Besiktas");
        arrayList.add("Gandalf");
        arrayList.add("hello");
        arrayList.add("Gondolin");
        arrayList.add("Sam");
        arrayList.add("Melkor");
        arrayList.add("Beren");
        arrayList.add("hello");
        System.out.println("Before removing: ");
        System.out.println(arrayList);
        System.out.println();
        System.out.println("After removing: ");
        arrayList.removeAll(Collections.singleton("hello"));
        System.out.println(arrayList);
    }
}