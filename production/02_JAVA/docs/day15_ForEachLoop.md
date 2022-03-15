# Java For-each Loop | Enhanced For Loop
The Java for-each loop or enhanced for loop is introduced since J2SE 5.0. It provides an alternative approach to traverse the array or collection in Java. It is mainly used to traverse the array or collection elements. The advantage of the for-each loop is that it eliminates the possibility of bugs and makes the code more readable. It is known as the for-each loop because it traverses each element one by one.

The drawback of the enhanced for loop is that it cannot traverse the elements in reverse order. Here, you do not have the option to skip any element because it does not work on an index basis. Moreover, you cannot traverse the odd or even elements only.

But, it is recommended to use the Java for-each loop for traversing the elements of array and collection because it makes the code readable.

## Advantages
It makes the code more readable.
It eliminates the possibility of programming errors.
## Syntax
The syntax of Java for-each loop consists of data_type with the variable followed by a colon (:), then array or collection.
```
for(data_type variable : array | collection){  
//body of for-each loop  
}  
```
### How it works?
The Java for-each loop traverses the array or collection until the last element. For each element, it stores the element in the variable and executes the body of the for-each loop.

## For-each loop Example: Traversing the array elements
```
//An example of Java for-each loop  
class ForEachExample1{  
public static void main(String args[]){  
//declaring an array  
int arr[]={12,13,14,44};  
//traversing the array with for-each loop  
for(int i:arr){  
System.out.println(i);  
}  
}   
}  
```