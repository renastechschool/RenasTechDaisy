# Java Map Interface
A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry. A Map contains unique keys.

A Map is useful if you have to search, update or delete elements on the basis of a key.

## Java Map Hierarchy
There are two interfaces for implementing Map in java: Map and SortedMap, and three classes: HashMap, LinkedHashMap, and TreeMap. 

A Map doesn't allow duplicate keys, but you can have duplicate values. HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.

A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method. See the Class and Description below.


### HashMap	
HashMap is the implementation of Map, but it doesn't maintain any order.
### LinkedHashMap	
LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
### TreeMap	
TreeMap is the implementation of Map and SortedMap. It maintains ascending order.

## Map.Entry Interface
Entry is the subinterface of Map. So we will be accessed it by Map.Entry name. It returns a collection-view of the map, whose elements are of this class. It provides methods to get key and value.

