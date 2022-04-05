package students.serdilan;

import java.util.ArrayList;
import java.util.Iterator;

public class lab09 {
    //        Given a list of people' names: "Amed", "hello", Eric", "mike".....
    //        Write a java operation to remove all the names named hello
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Amed");
        list.add("hello");
        list.add("Eric");
        list.add("mike");
        list.add("hello");
        for(String name:list){
            System.out.println("name is :"+name);
        }

        Iterator itr=list.iterator();
        while (itr.hasNext())
        {
            String removedElement = (String)itr.next();
            if (removedElement=="hello")
                itr.remove();
        }
        System.out.println("after the removed:");
        for(String name:list){
            System.out.println("name is :"+name);
        }
    }
}

