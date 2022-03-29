# JUnit | Testing Framework for Java
JUnit tutorial provides basic and advanced concepts of unit testing in java with examples. Our junit tutorial is designed for beginners and professionals.

It is an open-source testing framework for java programmers. The java programmer can create test cases and test his/her own code.

It is one of the unit testing framework. Current version is junit 4.

To perform unit testing, we need to create test cases. The unit test case is a code which ensures that the program logic works as expected.

The org.junit package contains many interfaces and classes for junit testing such as Assert, Test, Before, After etc.

#Types of unit testing
There are two ways to perform unit testing:

1) Manual Testing
   - If you execute the test cases manually without any tool support, it is known as manual testing. It is time consuming and less reliable.

2) Automated Testing
   - If you execute the test cases by tool support, it is known as automated testing. It is fast and more reliable.

## Annotations for Junit testing
The Junit 4.x framework is annotation based, so let's see the annotations that can be used while writing the test cases.

**@Test** annotation specifies that method is the test method.

**@Test(timeout=1000)** annotation specifies that method will be failed if it takes longer than 1000 milliseconds (1 second).

**@BeforeClass** annotation specifies that method will be invoked only once, before starting all the tests

**@Before** annotation specifies that method will be invoked before each test.

**@After** annotation specifies that method will be invoked after each test.

**@AfterClass** annotation specifies that method will be invoked only once, after finishing all the tests.

## Assert class
The org.junit.Assert class provides methods to assert the program logic.

### Methods of Assert class
The common methods of Assert class are as follows:

1) void assertEquals(boolean expected,boolean actual): checks that two primitives/objects are equal. It is overloaded.
2) void assertTrue(boolean condition): checks that a condition is true.
3) void assertFalse(boolean condition): checks that a condition is false.
4) void assertNull(Object obj): checks that object is null.
5) void assertNotNull(Object obj): checks that object is not null.


###An example of Junit framework:
```
package com.javatpoint.logic;  
public class Calculation {  
//method that returns maximum number  
public static int findMax(int arr[]){  
int max=0;  
for(int i=1;i<arr.length;i++){  
if(max<arr[i])  
max=arr[i];  
}  
return max;  
}  
//method that returns cube of the given number  
public static int cube(int n){  
return n*n*n;  
}  
//method that returns reverse words   
public static String reverseWord(String str){

        StringBuilder result=new StringBuilder();  
        StringTokenizer tokenizer=new StringTokenizer(str," ");  
  
        while(tokenizer.hasMoreTokens()){  
        StringBuilder sb=new StringBuilder();  
        sb.append(tokenizer.nextToken());  
        sb.reverse();  
  
        result.append(sb);  
        result.append(" ");  
        }  
        return result.toString();  
    }  
}  
```

###Test case scenario:
```
package com.javatpoint.testcase;

import static org.junit.Assert.assertEquals;  
import org.junit.After;  
import org.junit.AfterClass;  
import org.junit.Before;  
import org.junit.BeforeClass;  
import org.junit.Test;  
import com.javatpoint.logic.Calculation;

public class TestCase2 {

    @BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
    @Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
  
    @Test  
    public void testFindMax(){  
        System.out.println("test case find max");  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));  
    }  
    @Test  
    public void testCube(){  
        System.out.println("test case cube");  
        assertEquals(27,Calculation.cube(3));  
    }  
    @Test  
    public void testReverseWord(){  
        System.out.println("test case reverse word");  
        assertEquals("ym eman si nahk",Calculation.reverseWord("my name is khan");  
    }  
    @After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  

}  
```
