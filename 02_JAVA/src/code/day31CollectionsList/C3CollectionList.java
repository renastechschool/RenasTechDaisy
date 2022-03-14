package code.day31CollectionsList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class C3CollectionList {

    /*
    A collection is a group of objects represented as a single entity
    */

    public static void main(String[] args) {
        /*
        Underlying data structure for the array list is resizable or growable array.
        Array list is a dynamic array
         */
        ArrayList al = new ArrayList() ;
        Collection c = new ArrayList() ;

        List list = new ArrayList() ; //upcasting
        System.out.println(list);
        list.add("hello");  System.out.println(list);
        list.add("hi");   System.out.println(list);
        list.add("slaw"); System.out.println(list);
        list.add(2.2);System.out.println(list);
        list.add(null) ;    System.out.println(list);
        list.add(5);    System.out.println(list);
        System.out.println(list);

        list.remove("hi") ;
        System.out.println(list);
        System.out.println(list.contains("Hello"));
        System.out.println(list.contains("hello"));
       // list.clear();
        System.out.println(list);

        //String s = (String)list.get(2);

    }
}
