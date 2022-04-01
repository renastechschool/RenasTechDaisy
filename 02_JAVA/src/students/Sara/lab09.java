package src.students.Sara;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class lab09 {
    //        Given a list of people' names: "Amed", "hello", Eric", "mike".....
    //        Write a java operation to remove all the names named hello

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Amed", "hello", "Eric", "mike"));

        names.removeAll( Arrays.asList("Amed"));



        System.out.println(names);



    }}
