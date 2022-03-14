# Java List
List in Java provides the facility to maintain the ordered collection. It contains the index-based methods to insert, update, delete and search the elements. It can have the duplicate elements also. We can also store the null elements in the list.

The List interface is found in the java.util package and inherits the Collection interface. It is a factory of ListIterator interface. Through the ListIterator, we can iterate the list in forward and backward directions. The implementation classes of List interface are ArrayList, LinkedList, Stack and Vector. The ArrayList and LinkedList are widely used in Java programming. The Vector class is deprecated since Java 5.

## Java List Methods
(Method and Description below)
### void add(int index, E element)	
It is used to insert the specified element at the specified position in a list.
###boolean add(E e)	
It is used to append the specified element at the end of a list.
###boolean addAll(Collection<? extends E> c)	
It is used to append all of the elements in the specified collection to the end of a list.
###boolean addAll(int index, Collection<? extends E> c)	
It is used to append all the elements in the specified collection, starting at the specified position of the list.
###void clear()	
It is used to remove all of the elements from this list.
###boolean equals(Object o)	
It is used to compare the specified object with the elements of a list.
###int hashcode()	
It is used to return the hash code value for a list.
###E get(int index)
It is used to fetch the element from the particular position of the list.
###boolean isEmpty()	
It returns true if the list is empty, otherwise false.
###int lastIndexOf(Object o)	
It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
###Object[] toArray()	
It is used to return an array containing all of the elements in this list in the correct order.
###<T> T[] toArray(T[] a)	
It is used to return an array containing all of the elements in this list in the correct order.
###boolean contains(Object o)	
It returns true if the list contains the specified element
###boolean containsAll(Collection<?> c)	
It returns true if the list contains all the specified element
###int indexOf(Object o)	
It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
###E remove(int index)	
It is used to remove the element present at the specified position in the list.
###boolean remove(Object o)	
It is used to remove the first occurrence of the specified element.
###boolean removeAll(Collection<?> c)	
It is used to remove all the elements from the list.	
###void replaceAll(UnaryOperator<E> operator)	
It is used to replace all the elements from the list with the specified element.	
###void retainAll(Collection<?> c)	
It is used to retain all the elements in the list that are present in the specified collection.
###E set(int index, E element)	
It is used to replace the specified element in the list, present at the specified position.
###void sort(Comparator<? super E> c)	
It is used to sort the elements of the list on the basis of specified comparator.
####Spliterator<E> spliterator()	
It is used to create spliterator over the elements in a list.
###List<E> subList(int fromIndex, int toIndex)	
It is used to fetch all the elements lies within the given range.
###int size()	
It is used to return the number of elements present in the list.
# Java List vs ArrayList
List is an interface whereas ArrayList is the implementation class of List.

### How to create List
The ArrayList and LinkedList classes provide the implementation of List interface. 

### How to convert Array to List
We can convert the Array to List by traversing the array and adding the element in list one by one using list.add() method.

### How to convert List to Array
We can convert the List to Array by calling the list.toArray() method. 

### How to convert List to Array
We can convert the List to Array by calling the list.toArray() method. 

### How to Sort List
There are various ways to sort the List, here we are going to use Collections.sort() method to sort the list element. The java.util package provides a utility class Collections which has the static method sort(). Using the Collections.sort() method, we can easily sort any List.