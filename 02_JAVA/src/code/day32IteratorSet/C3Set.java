package code.day32IteratorSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C3Set {
    public static void main(String[] args) {
        //Set is an interface
        //Duplicates are not allowed in a set object

        //if you have the list of numbers that you don't want to store duplicate ones  which collection type you will use ?
        //set will be preferred

        //List<String> letters = new ArrayList<>();
        Set<String> letters = new HashSet<>();

        //Hashset (underlying data structure is a hash table)
        //accept null values
        //it doesn't accept duplicates
        //it has sort logic, but it is not always from small to large
        //insertion order is not preserved
        letters.add("a");
        letters.add("a");
        letters.add("b");
        letters.add("e");
        letters.add("c");
        letters.add("d");
        letters.add("a");
        letters.add(null);
        letters.add(null);
        letters.add(null);
        System.out.println("HashSet:" + letters);//[null, a, b, c, d, e]


        Set<String> letters2 = new LinkedHashSet<>();
        //LinkedHashSet(underlying Data Structure : Hash table and linked list implementation )
        //it doesn't accept duplicates
        //it does not sort
        //accept null values
        //insertion order is preserved
        letters2.add("a");
        letters2.add("a");
        letters2.add("b");
        letters2.add("e");
        letters2.add("c");
        letters2.add("d");
        letters2.add("a");
        letters2.add(null);
        System.out.println("LinkedHashSet:" + letters2);//[a, b, e, c, d, null]



        Set<String> letters3 = new TreeSet<>();
        //TreeSet(Underlying Data Structure: Red Black Tree)
        //it doesn't accept duplicate values
        //it does not accept null values- NullPointerException
        //it is going to sort from small to large
        letters3.add("a");
        letters3.add("a");
        letters3.add("b");
        letters3.add("e");
        letters3.add("c");
        letters3.add("d");
        letters3.add("a");
        //letters3.add(null); NullPointerException
        System.out.println("TreeSet:" + letters3);//[a, b, c, d, e]


        // we want to store list of numbers in one collection type
        //             that is not going to accept duplicates
        //             also it will sort (from smallest to largest)

        //ideas ://treeset , arraylist (-) , priortyqueue (-) ,hashset
        //arraylist : is not going work . Because it accepts duplicate values
        //priortyquee : is not going work . Because it accepts duplicate value
        //hashset  : may work but not always because it has own sort logic

        //accept dublicate and keep insertion order
        //set wont work (set doesnt accept dublicates)
        //list and quee accept dublicates
        //any type of list will work and you can also use Dequee (not preferd)

        //we want to store list of numbers in one collection type
        //that is not going to accept duplicates
        //it will accept one null

        //ideas : TreeSet , HashSet ,LinkedHashSet
        //since i dont want to accept duplicates only option left is set
        //and TreeSet not accepting null
        //result is : HashSet or LinkedHashSet
    }
}