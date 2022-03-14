package code.day33Map_GC_StringBuffer;

import java.util.LinkedHashMap;
import java.util.Map;

public class C1Map {

    /*
    map, literally means be associated with or linked to

    A Map object in Java contains mappings
    mapping: a key-value pair
    keys a always unique, duplicate keys are not allowed
    duplicate values are allowed
     */

    public static void main(String[] args) {
        /*
        An object that maps keys to values.
        A map cannot contain duplicate keys; each key can map to at most one value.
         */
        /*
        The Map interface provides three collection views, which allow a map's contents
         to be viewed as:
         -a set of keys,
         -collection of values,
         -or set of key-value mappings.
         The order of a map is defined as  the order in which the iterators on the map's collection views return their elements.
         Some map implementations,  like the TreeMap class, make specific guarantees as to their order; others,
          like the HashMap class, do not.
         */


        //LinkedHashMap "is-a" Map
        Map<Integer, String> studentInfo = new LinkedHashMap<>();
        //key :will be Integer that is student ID
        //key has to be unique

        //value : will be String, student name, it can be duplicate
        //    put(key, value): inserts key and value to map

        //Data Structure :
        //    Array (fixed size, primitives & objects)
        //    Collection (dynamic, only objects)
        //    Map (dynamic, only objects)
        //
        //Map Interface: accepts key and value. cannot be primitives.
        //                key MUST be unique
        //Map methods:
        //    put(key, value): inserts key and value to map
        //    get(key): returns the value of the given key
        //    remove(key): removes the given key, and it's value from the map
        //    size():
        //    containsKey(key): checks if the key is contained in the map. boolean
        //    containsValue(Value): checks if the value is contained in the map. boolean
        //    clear(): clears everything
        //    isEmpty(): boolean
        //    keySet(): returns all the keys from the map as Set
        //    values(): returns all the values from the map as Collection
        //    setEntry():

        // HashMap: does not keep the insertion order
        //         accepts null

        // HashTable: is synchronized, thread-safe ==> one thread at a time
        //             slower
        //             does not accept null
        //              a legacy class, rarely used

        // LinkedHashMap: keeps the insertion order as it's.
        //             put & remove are faster
        //             accepts null
        // TreeMap: sorts the keys in ascending (sorted map)
        //         does not accept null
        studentInfo  .  put(101, "Yasmin");
        studentInfo  .   put(102 , "Yasmin");
        studentInfo . put (103, "kadir") ;
        studentInfo . put( 104 , "Kefo");

        System.out.println(studentInfo);

        studentInfo . put (104 , "Aslan") ;

        System.out.println(studentInfo);

        System.out.println(  studentInfo.get(104)  );

        String val = studentInfo.get(103) ;

        //removes the mapping corresponding to the key 103
        studentInfo.remove(103) ;
        System.out.println(studentInfo);

        System.out.println(studentInfo.size());

        System.out.println( studentInfo.containsKey(105)  );

        System.out.println(studentInfo.containsValue("yasmin"));
        System.out.println(studentInfo.containsValue("Yasmin"));

        //studentInfo.clear();
        System.out.println(studentInfo);
        System.out.println(studentInfo.isEmpty());





    }

}
