package students.ruken;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab8 {
    public static void main(String[] args) {
        //    ## Lab 09 -     (ArrayList) Remove "hello"
        //    Given a list of people' names: "Amed", "hello", Eric", "mike".....
        //    Write a java operation to remove all the names named hello
        String[] str_array = {"Amed","hello","Eric","mike","ruken","hello"};
        List<String> list = new ArrayList<String>(Arrays.asList(str_array));
        for (int i=0; i <= list.size()-1; i++){
            list.remove("hello");
        }
        System.out.println(list);
    }
}

