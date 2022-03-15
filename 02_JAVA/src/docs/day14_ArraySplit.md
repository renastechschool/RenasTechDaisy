# Java String split()
The java string split() method splits this string against given regular expression and returns a char array.

## Signature
There are two signature for split() method in java string.
```
public String split(String regex)  
and,  
public String split(String regex, int limit)  
```

## Parameter
regex : regular expression to be applied on string.

limit : limit for the number of strings in array. If it is zero, it will returns all the strings matching regex.

## Returns
array of strings

## Throws
PatternSyntaxException if pattern for regular expression is invalid


## Java String split() method with regex and length example
```
public class SplitExample2{  
public static void main(String args[]){  
String s1="welcome to split world";  
System.out.println("returning words:");  
for(String w:s1.split("\\s",0)){  
System.out.println(w);  
}  
System.out.println("returning words:");  
for(String w:s1.split("\\s",1)){  
System.out.println(w);  
}  
System.out.println("returning words:");  
for(String w:s1.split("\\s",2)){  
System.out.println(w);  
}

}}  
```
