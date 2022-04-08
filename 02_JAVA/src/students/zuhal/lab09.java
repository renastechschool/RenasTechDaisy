package src.students.zuhal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab09 {
    /*
  Lab 09 -     (ArrayList) Remove "hello"
                Given a list of people' names: "Amed", "hello", Eric", "mike".....
                Write a java operation to remove all the names named hello
 */
    public static void main(String[] args) {
        String[] str_array = {"Amed","hello","Eric","Mike"};
        List<String> list = new ArrayList<String>(Arrays.asList(str_array));
        for(int i = 0; i <= list.size()-1; i++){
            list.remove("Amed");
        }
        System.out.println(list);

    }
}

