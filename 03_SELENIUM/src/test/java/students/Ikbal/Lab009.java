package students.ikbal;

import java.util.ArrayList;

public class Lab009 {
    public static void main(String[] args) {
              //        Given a list of people' names: "Amed", "hello", Eric", "mike".....
        //        Write a java operation to remove all the names named hello
        ArrayList<String> list= new ArrayList<>();
        list.add("Amed");
        list.add("hello");
        list.add("Eric");
        list.add("mike");
        System.out.println(list);
        list.remove("hello");

        System.out.println(list);

    }

}
