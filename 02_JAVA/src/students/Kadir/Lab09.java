package students.Kadir;
//        Given a list of people' names: "Amed", "hello", Eric", "mike".....
//        Write a java operation to remove all the names named hello

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lab09 {
    public static void main(String[] args) {
        ArrayList<String> arrays=new ArrayList<String>();
        arrays.add("gijjj");
        arrays.add("hello");
        arrays.add("Volkan");
        arrays.add("hello");
        arrays.add("Kadir");
        arrays.add("Adem");
        arrays.removeAll(Collections.singletonList("hello"));

        for (String array : arrays) {
            System.out.println(array);
        }

        }


    }

