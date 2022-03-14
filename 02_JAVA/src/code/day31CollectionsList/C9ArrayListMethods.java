package code.day31CollectionsList;

import java.util.ArrayList;
import java.util.Collections;

public class C9ArrayListMethods {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(35);
        list.add(-25);
        list.add(-100);

        //indexof(Object) will print index number of the object that you are passing
        //if that object is present in your list you will get index number
        //if object is not present you will get index as -1
       /* System.out.println(list.indexOf(100));//0
        System.out.println(list.indexOf(-25));//2
        System.out.println(list.indexOf(500));//-1
        System.out.println(list.indexOf(1));//-1

        int indexNum35 = list.indexOf(35);
        System.out.println("indexNum35 = " + indexNum35);


        System.out.println("*********");

        ArrayList<String> list2= new ArrayList<>();
        list2.add("A");
        list2.add("B");

        System.out.println(list2.indexOf("B")); //1
        System.out.println(list2.indexOf("c")); //-1

        //contains return boolean value
        System.out.println(list2.contains("B"));

        //all the methods that we use with arraylist are returniing wrapperclasses
        //you can store them in either wrapper or primitive data type
        boolean b1 = list2.contains("X"); // unboxing
        //list2.contains("X"); returns wrapper class

        System.out.println("b1 = " + b1);
*/
        ///arrays .sort
        //Collections is an library whihc is very usefull with arraylist
        //Collection is data structure

       // System.out.println("Before Sorting");
       // System.out.println("list = " + list);
        /*
        Collection vs Collections
        -------------------------
        Collection:  is the root interface of the Collections Framework Hierarchy

        Collections:  is a utility class which has various method which can be used on various
        collection Objects
        Example of other utility classes are Arrays, Math etc. These have static utility methods

         */
        Collections . sort(list);
        //System.out.println("After Sorting");
        //System.out.println("list = " + list);

        //equals method
        ArrayList<Integer> numList1=new ArrayList<>();
        numList1.add(10);
        numList1.add(20);

        ArrayList<Integer> numList2=new ArrayList<>();
        numList2.add(10);
        numList2.add(20);
        numList2.add(30);
        numList2.add(5);


        //equals method checks the equality content of the array list object
        boolean bool= numList1 . equals (numList2);
        System.out.println("bool = " + bool);
        //== operator checks the equality of the object references
        System.out.println(numList1==numList2);

        //get method
        System.out.println(numList2);
        Collections.sort(numList2);
        System.out.println(numList2);
        for (int i =0 ; i < numList2.size() ; i++){
            System.out.println("numList2.get("+i+") = " + numList2.get(i));
        }

        //isempty() checks if the List is empty returns a true if the list is empty
        //else returns false
        numList2.clear();
        System.out.println("numList2.isEmpty() = " + numList2.isEmpty());

        //size
        System.out.println("numberList2.size() = " + numList2.size());


    }
}
