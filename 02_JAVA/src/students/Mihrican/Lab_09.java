package students.Mihrican;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab_09 {

    //        Given a list of people' names: "Amed", "hello", Eric", "mike".....
    //        Write a java operation to remove all the names named hello

    public static void main(String[] args) {

        String[] str_array = {"Mihrican", "Idil","Cagan","Mihrican", "Hasan","Mihrican", };
        List<String> list = new ArrayList<String>(Arrays.asList(str_array));
        for (int i=0; i <= list.size()-1; i++){
            list.remove("Mihrican");
        }
        System.out.println(list);
    }
}