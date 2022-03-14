package code.day4;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class c4_TestNG {
@BeforeMethod
    public void setup(){
    System.out.println("Before Method is Running"); }
@AfterMethod
    public void closing(){
    System.out.println("After Method is Running"); }
    @Test
    public void TC1_test(){
        System.out.println("test 1 is running"); }

    @Test
    public void TC2_test(){
            System.out.println("test 2 is running"); }
            @Test
    public void TC3_test(){
        System.out.println("test 3 is running");
    }



}
