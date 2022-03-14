package code.day32IteratorSet;

import java.util.*;

public class C2ListClasses {

    //  List is parent interface of ArrayList, LinkedList and the Vector
    //  Vector is a legacy class. Practically it's rarely used.
    //    List is an interface it's not a class so you can't create object of list
    //    //
    //    //        Collection (I) : extended by List(I),Set(I),Queue(I)
    ////
    ////        Lıst(I): implemented by ArrayList(C),LınkedList(C),Vector(C)
    ////
    ////        ArrayList(C): Internally uses array. Underlying data structure is resizable array or growable array
    //                          or dynamic array
    ////
    ////        LinkedList(C): each object is doubly linked i.e. each object contains 2 references- one for the previous object
    //                  and one fir the next object
    ////                Doubly linked == removing adding functions are faster
    ////
    ////        Vector(C): array based class, is synchronized  ,only prefer in multi thread
    ////              Synchronized: used for achiving thread-safety
    ////                      adv=thread safe
    ////                      disadv= slower
    ////                 thread: process of operating system scheduling object
    ////             --extended by Stack(C) : array based class ,is synchorized,last in first out order
    ////        pop(): LIFO, returns the last object from the stack and removes it from stack
    //
    //
    //    //List general points ;
    //    1. List are allowing duplicates objects
    //    2. order : list will keep the insertion order.
    //    3. null elements : list will allow you to use any number of null elements;
    //    4. list has dynamic size

    public static void main(String[] args) {
//        List<Integer> numberlist= new List<Integer>()
        //you cant create object from interfaces

        List<Integer> list = new ArrayList<>(); //polymorphism achieved via upcasting
        list.add(25);
        list.add(25);    //    //1.List allows duplicate objects

        System.out.println(list);

        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Hello");
        words.add(null);
        words.add(null);
        words.add(null);    // null elements : list will allow you to use any number of null elements;
        System.out.println(words);


        List<Integer> list2 = new LinkedList<>();//upcasting: polymorphic reference
        list2.add(20);
        list2.add(10);
        list2.add(20);
        list2.add(15);
        list2.add(15);
        //4.list has dynamic size
        list2.remove(0);

        //2.order : list will keep the insertion order.
        System.out.println(list2);


        //Vector is a legacy class rarely used for practical purposes
        List<Integer> list3 = new Vector<>();//polymorphic reference
        list3.add(20);
        list3.add(20);
        list3.add(40);
        list3.add(40);
        System.out.println(list3);


        //
        Stack<Integer> numbers = new Stack<>();//
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(5);
        numbers.add(5);

        System.out.println(numbers);
        //       pop(): LIFO, returns the last pushed(topmost) object from the stack and removes
        //       it from stack
        Integer number = numbers.pop();
        System.out.println("number = " + number);
        System.out.println(numbers);



    }
}
