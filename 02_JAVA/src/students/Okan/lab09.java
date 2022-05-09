package students.Okan;

import java.util.ArrayList;
import java.util.List;

public class lab09 {
    //        Given a list of people' names: "Amed", "hello", Eric", "mike".....
    //        Write a java operation to remove all the names named hello
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Okan");
        names.add("Murat");
        names.add("Ercan");
        names.add("Hello");
        names.add("Hasan");
        names.add("hello");
        names.add("Sahin");
        for (String name:names){
            System.out.println(name);
        }
        System.out.println("**********************************");
        System.out.println("After removed hello from list");
        names.removeIf(name -> name.equalsIgnoreCase("Hello"));
        for (String name:names){
            System.out.println(name);
        }

    }
}
