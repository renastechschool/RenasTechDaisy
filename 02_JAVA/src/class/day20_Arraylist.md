# Java ArrayList
Java ArrayList class hierarchy
Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in the java.util package. It is like the Vector in C++.

The ArrayList in Java can have the duplicate elements also. It implements the List interface so we can use all the methods of the List interface here. The ArrayList maintains the insertion order internally.

It inherits the AbstractList class and implements List interface.

The important points about the Java ArrayList class are:

1. Java ArrayList class can contain duplicate elements.
2. Java ArrayList class maintains insertion order.
3. Java ArrayList class is non synchronized.
4. Java ArrayList allows random access because the array works on an index basis.
5. In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
6. We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases. 
7. Java ArrayList gets initialized by the size. The size is dynamic in the array list, which varies according to the elements getting added or removed from the list.
   
## Hierarchy of ArrayList class
   As shown in the above diagram, the Java ArrayList class extends AbstractList class which implements the List interface. The List interface extends the Collection and Iterable interfaces in hierarchical order.

# ArrayList class declaration
Let's see the declaration for java.util.ArrayList class.
```
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
```

# Constructors of ArrayList
## Constructor	Description
### ArrayList()	
It is used to build an empty array list.
### ArrayList(Collection<? extends E> c)	
It is used to build an array list that is initialized with the elements of the collection c.
ArrayList(int capacity)	It is used to build an array list that has the specified initial capacity.
# Methods of ArrayList

### void add(int index, E element)	
It is used to insert the specified element at the specified position in a list.
### boolean add(E e)	
It is used to append the specified element at the end of a list.
### boolean addAll(Collection<? extends E> c)	
It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
### boolean addAll(int index, Collection<? extends E> c)	
It is used to append all the elements in the specified collection, starting at the specified position of the list.
### void clear()	
It is used to remove all of the elements from this list.
void ensureCapacity(int requiredCapacity)	It is used to enhance the capacity of an ArrayList instance.
### E get(int index)	
It is used to fetch the element from the particular position of the list.
### boolean isEmpty()	
It returns true if the list is empty, otherwise false.
### Iterator()	

### listIterator()

### int lastIndexOf(Object o)	
It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
### Object[] toArray()	
It is used to return an array containing all of the elements in this list in the correct order.
### <T> T[] toArray(T[] a)	
It is used to return an array containing all of the elements in this list in the correct order.
### Object clone()	
It is used to return a shallow copy of an ArrayList.
### boolean contains(Object o)	
It returns true if the list contains the specified element.
### int indexOf(Object o)	
It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
### remove(int index)	
It is used to remove the element present at the specified position in the list.
### boolean remove(Object o)	
It is used to remove the first occurrence of the specified element.
### boolean removeAll(Collection<?> c)	
It is used to remove all the elements from the list.
### boolean removeIf(Predicate<? super E> filter)	
It is used to remove all the elements from the list that satisfies the given predicate.
protected void removeRange(int fromIndex, int toIndex)	It is used to remove all the elements lies within the given range.
### void replaceAll(UnaryOperator<E> operator)	
It is used to replace all the elements from the list with the specified element.
### void retainAll(Collection<?> c)	
It is used to retain all the elements in the list that are present in the specified collection.
### E set(int index, E element)	
It is used to replace the specified element in the list, present at the specified position.
### void sort(Comparator<? super E> c)	
It is used to sort the elements of the list on the basis of the specified comparator.
### Spliterator<E> spliterator()	
It is used to create a spliterator over the elements in a list.
### List<E> subList(int fromIndex, int toIndex)	
It is used to fetch all the elements that lies within the given range.
### int size()	
It is used to return the number of elements present in the list.
### void trimToSize()	
It is used to trim the capacity of this ArrayList instance to be the list's current size.

# Java Non-generic Vs. Generic Collection
Java collection framework was non-generic before JDK 1.5. Since 1.5, it is generic.

Java new generic collection allows you to have only one type of object in a collection. Now it is type-safe, so typecasting is not required at runtime.

Let's see the old non-generic example of creating a Java collection.
```
ArrayList list=new ArrayList();//creating old 
non-generic arraylist  
```
Let's see the new generic example of creating java collection.
```
ArrayList<String> list=new ArrayList<String>();//creating new generic arraylist  
```
In a generic collection, we specify the type in angular braces. Now ArrayList is forced to have the only specified type of object in it. If you try to add another type of object, it gives a compile-time error.

## Java ArrayList Example
FileName: ArrayListExample1.java
```
import java.util.*;  
public class ArrayListExample1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
list.add("Mango");//Adding object in arraylist    
list.add("Apple");    
list.add("Banana");    
list.add("Grapes");    
//Printing the arraylist object   
System.out.println(list);  
}  
}  
```
# Iterating ArrayList using Iterator
Let's see an example to traverse ArrayList elements using the Iterator interface.

FileName: ArrayListExample2.java
```
import java.util.*;  
public class ArrayListExample2{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("Mango");//Adding object in arraylist    
list.add("Apple");    
list.add("Banana");    
list.add("Grapes");    
//Traversing list through Iterator  
Iterator itr=list.iterator();//getting the Iterator  
while(itr.hasNext()){//check if iterator has the elements  
System.out.println(itr.next());//printing the element and move to next  
}  
}  
}
```

# Iterating ArrayList using For-each loop
Let's see an example to traverse the ArrayList elements using the for-each loop

FileName: ArrayListExample3.java
```
import java.util.*;  
public class ArrayListExample3{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("Mango");//Adding object in arraylist    
list.add("Apple");    
list.add("Banana");    
list.add("Grapes");    
//Traversing list through for-each loop  
for(String fruit:list)    
System.out.println(fruit);

}  
}  
```

# Get and Set ArrayList
The get() method returns the element at the specified index, whereas the set() method changes the element.

FileName: ArrayListExample4.java
```
import java.util.*;  
public class ArrayListExample4{  
public static void main(String args[]){  
ArrayList<String> al=new ArrayList<String>();  
al.add("Mango");  
al.add("Apple");  
al.add("Banana");  
al.add("Grapes");  
//accessing the element    
System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
//changing the element  
al.set(1,"Dates");  
//Traversing list  
for(String fruit:al)    
System.out.println(fruit);

}  
}  
```
# How to Sort ArrayList
The java.util package provides a utility class Collections, which has the static method sort(). Using the Collections.sort() method, we can easily sort the ArrayList.

FileName: SortArrayList.java
```
import java.util.*;  
class SortArrayList{  
public static void main(String args[]){  
//Creating a list of fruits  
List<String> list1=new ArrayList<String>();  
list1.add("Mango");  
list1.add("Apple");  
list1.add("Banana");  
list1.add("Grapes");  
//Sorting the list  
Collections.sort(list1);  
//Traversing list through the for-each loop  
for(String fruit:list1)  
System.out.println(fruit);

System.out.println("Sorting numbers...");  
//Creating a list of numbers  
List<Integer> list2=new ArrayList<Integer>();  
list2.add(21);  
list2.add(11);  
list2.add(51);  
list2.add(1);  
//Sorting the list  
Collections.sort(list2);  
//Traversing list through the for-each loop  
for(Integer number:list2)  
System.out.println(number);  
}

}  
```

## Ways to iterate the elements of the collection in Java
There are various ways to traverse the collection elements:

1. By Iterator interface.
2. By for-each loop.
3. By ListIterator interface.
4. By for loop.
5. By forEach() method.
6. By forEachRemaining() method.
# Iterating Collection through remaining ways
Let's see an example to traverse the ArrayList elements through other ways

FileName: ArrayList4.java
```
import java.util.*;  
class ArrayList4{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");

           System.out.println("Traversing list through List Iterator:");  
           //Here, element iterates in reverse order  
              ListIterator<String> list1=list.listIterator(list.size());  
              while(list1.hasPrevious())  
              {  
                  String str=list1.previous();  
                  System.out.println(str);  
              }  
        System.out.println("Traversing list through for loop:");  
           for(int i=0;i<list.size();i++)  
           {  
            System.out.println(list.get(i));     
           }  
              
        System.out.println("Traversing list through forEach() method:");  
        //The forEach() method is a new feature, introduced in Java 8.  
            list.forEach(a->{ //Here, we are using lambda expression  
                System.out.println(a);  
              });  
                
            System.out.println("Traversing list through forEachRemaining() method:");  
              Iterator<String> itr=list.iterator();  
              itr.forEachRemaining(a-> //Here, we are using lambda expression  
              {  
            System.out.println(a);  
              });  
}  
}  
```


# User-defined class objects in Java ArrayList
Let's see an example where we are storing Student class object in an array list.

FileName: ArrayList5.java
```
class Student{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
}

import java.util.*;  
class ArrayList5{  
public static void main(String args[]){  
//Creating user-defined class objects  
Student s1=new Student(101,"Sonoo",23);  
Student s2=new Student(102,"Ravi",21);  
Student s2=new Student(103,"Hanumat",25);  
//creating arraylist  
ArrayList<Student> al=new ArrayList<Student>();  
al.add(s1);//adding Student class object  
al.add(s2);  
al.add(s3);  
//Getting Iterator  
Iterator itr=al.iterator();  
//traversing elements of ArrayList object  
while(itr.hasNext()){  
Student st=(Student)itr.next();  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  
```
Output:

       101 Sonoo 23
       102 Ravi 21
       103 Hanumat 25
# Java ArrayList Serialization and Deserialization Example
Let's see an example to serialize an ArrayList object and then deserialize it.

FileName: ArrayList6.java
```
import java.io.*;  
import java.util.*;  
class ArrayList6 {

        public static void main(String [] args)  
        {  
          ArrayList<String> al=new ArrayList<String>();  
          al.add("Ravi");    
          al.add("Vijay");    
          al.add("Ajay");    
            
          try  
          {  
              //Serialization  
              FileOutputStream fos=new FileOutputStream("file");  
              ObjectOutputStream oos=new ObjectOutputStream(fos);  
              oos.writeObject(al);  
              fos.close();  
              oos.close();  
              //Deserialization  
              FileInputStream fis=new FileInputStream("file");  
              ObjectInputStream ois=new ObjectInputStream(fis);  
            ArrayList  list=(ArrayList)ois.readObject();  
            System.out.println(list);    
          }catch(Exception e)  
          {  
              System.out.println(e);  
          }  
       }  
    }         
```