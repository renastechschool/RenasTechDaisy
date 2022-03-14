package code.day32IteratorSet;

import java.util.PriorityQueue;
import java.util.Queue;

public class C4Queue {
    //  //        Queue<String> q=new Queue<String>();  Quee is interface
    //    //   Queue(I):
    //    does not have index number ,
    //    size dynamic ,
    //    it accepts duplicates,
    //    first in first out order.
    //    Pool() Poll(): removes the first object in the queue.

    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        //FIFO
        //it will sort in queue logic
        //it is not always going to sort from small to large
        //it has own sort logic
        //In a queue, elements are entered from the rear
        //and elements are removed from the front
        numbers.add(20);
        numbers.add(20);
        numbers.add(1);
        numbers.add(11);
        numbers.add(200);
        numbers.add(15);
        numbers.add(3);


        System.out.println(numbers);//[1, 11, 3, 20, 200, 20, 15]

        Integer number = numbers.poll(); // no index in quee it is going to pool first in number (FIFO)
        System.out.println("number = " + number);
        System.out.println(numbers);


       /* Queue<Integer> numbers2 = new ArrayDeque<>();//FIFO // no sort logic

        numbers2.add(20);
        numbers2.add(20);
        numbers2.add(1);
        numbers2.add(11);
        numbers2.add(200);
        numbers2.add(15);
        numbers2.add(3);

        System.out.println(numbers2);//[20, 20, 1, 11, 200, 15, 3]
        Integer number2 = numbers2.poll();
        System.out.println("number2 = " + number2);
        System.out.println(numbers2);

        */
    }
}