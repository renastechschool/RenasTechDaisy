package code.day4;

import org.testng.Assert;
import org.testng.annotations.*;

public class c6_TestNGExample {

    @BeforeClass
    public void setupClass(){
        System.out.println("Before class is running");
    }
    @AfterClass
    public void setupAfterClass(){
        System.out.println("After class is running");
    }
    @BeforeMethod
    public void setup(){
        System.out.println("Before Method is running");
    }
    @AfterMethod
    public void closing(){
        System.out.println("After method is running");
    }

    @Test(priority = 3)
    public void TC1_1(){
        System.out.println("Test 1 is running");
    }
    @Test(priority = 1)
    public void TC3_3(){
        System.out.println("Test3 is running");

        String actualWord="New York";
        String expectedWord="Ohio";
        Assert.assertEquals(actualWord,expectedWord);
    }
    @Test(priority = 2)
    public void TC2_2(){
        System.out.println("Test2 is running");
        String name1="Alex";
        String name2="Alex";
        //if assertion is failed next line of code will not execute
        Assert.assertEquals(name1,name2);

    }




}
