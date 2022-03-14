package code.day31CollectionsList;

import java.util.ArrayList;
import java.util.List;

public class C4CollectionGeneric {

    public static void main(String[] args) {
        //ArrayList
        //-duplicates are allowed in the array list
        //-null insertion is possible in an ArrayList
        //-insertion order is preserved in the ArrayList
        //Below statement creates a list which can only store strings
        //as the generic type mentioned is the String type
        //List<String> list = new ArrayList<>() ;
        List<String> list = new ArrayList<String>() ;
        list.add("Hello");
        list.add("hi");
        list.add("slaw") ;
        list.add("hi") ;
        list.add("hi") ;
        list.add("hi") ;
        list.add(null) ;
        //list.add(2.5) ;
        System.out.println(list);
    }
}
