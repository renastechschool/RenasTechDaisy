package code.day33Map_GC_StringBuffer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C2MapEntry {

    public static void main(String[] args) {
        /*
        A map object contains mappings(key-value pairs).
        Each individual mapping is represented as an Entry object.
        Map.Entry is an inbuilt interface in Java.
        Entry is an inner interface of the Map interface.
        So, we use it as Map.Entry

        So, we can say that a map object contains entries or mappings.
         */

        Map<String, Double> map = new HashMap<>() ;
        map.put("Banana"  , 5.5  ) ;
        map.put("Orange"  , 3.5  ) ;
        map.put("Avacado" , 10.0 ) ;
        map.put("Mango"   , 11.0 ) ;

        System.out.println(map);

        //View Map as a set of keys
        //keySet method returns set of keys in a map
        Set<String> setOfKeys = map.keySet() ;
        System.out.println("Keys of the map: ");
        for( String key :  setOfKeys){
            System.out.println(key);
        }


        //View Map as a Collection of Values
        //values method returns collection of values in a map
        Collection<Double> values =  map.values() ;
        System.out.println("Values of the map");
        for( Double value :  values){
            System.out.println(value);
        }






    }
}


// System.out.println(map.entrySet());
//entrySet method returns the set containing the Entry objects
//Returns a Set view of the mappings contained in this map
//set of key-value mappings
//Set < Map.Entry<String, Double>  > entries = map.entrySet() ;
