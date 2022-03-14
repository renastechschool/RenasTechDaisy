package code.day32IteratorSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C1Iterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() ;
        list.add(10); list.add(20) ; list.add(30) ; list.add(40) ;

        System.out.println("Using for each loop");
        for(Integer i :  list)
            System.out.println(i);

        System.out.println("\nUsing for loop");
        for(int j=0; j<list.size(); j++)
            System.out.println(list.get(j));

        //iterator is a way to scroll through OR access OR traverse  OR iterate through all
        //the elements of the List
        //An iterator object is like a cursor for Collection elements

        //System.out.println(list);
        System.out.println("\nUsing Iterator");
        Iterator<Integer> i = list.iterator() ;

        while(i.hasNext()){

            Integer element = i . next() ;
            System.out.println(element);
        }

        i = list.iterator();
        while(i.hasNext()){

            Integer element = i . next() ;
            System.out.println(element);
        }

    }
}
