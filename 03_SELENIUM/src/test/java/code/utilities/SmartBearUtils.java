package code.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtils {

    public static void logInForSmartBear(WebDriver driver){

        //3- Enter username --->Tester
        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        //4- Enter password --->test
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        //5- Click “Login” button
        WebElement login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();
    }

    public static void negativeLoginForSmartBear(WebDriver driver,String userID,String passwordID){
        //3- Enter username --->Tester>>>Invalid Username
        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys(userID);
        //4- Enter password --->test>>invalid Password
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys(passwordID);
        //5- Click “Login” button
        WebElement login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();
    }
    public static void verifyStreet(WebDriver driver,String streetName){
        //to locate all table //table[@id='ctl00_MainContent_orderGrid']
        //to locate all table row table[@id='ctl00_MainContent_orderGrid']//tr
        //to locate 4. row //table[@id='ctl00_MainContent_orderGrid']//tr[4]
        //to locate all street //table[@id='ctl00_MainContent_orderGrid']//tr//td[6]
    List<WebElement> streetList=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[6]"));

    for (WebElement eachStreet:streetList){

        if(eachStreet.getText().equals(streetName)){
            Assert.assertTrue(eachStreet.getText().equals(streetName));
            return;
        }
    }

    Assert.fail("Street name:"+streetName+"is not present on the table");
}}
