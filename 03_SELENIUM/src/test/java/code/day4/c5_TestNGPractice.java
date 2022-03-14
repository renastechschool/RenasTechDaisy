package code.day4;

import org.testng.annotations.*;

public class c5_TestNGPractice {
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

    @Test
    public void TC1(){
        System.out.println("Test1 is running");
    }
    @Test
    public void TC2(){
        System.out.println("Test2 is running");

    }
    @Test
    public void TC3(){
        System.out.println("Test3 is running");
    }
}
