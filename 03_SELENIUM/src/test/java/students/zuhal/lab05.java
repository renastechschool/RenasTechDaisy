package students.zuhal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class lab05 {
    WebDriver driver;
    //Step 1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
    //Step 2) Enter Any Customer id.
    //Step 3) After entering the customer ID, Click on the “Submit” button.
    //Step 4) Reject/accept the alert.
    @Test
    public void TC_10(){

        driver.get("http://demo.guru99.com/test/delete_customer.php");
        WebElement costumerId= driver.findElement(By.xpath("//input[@name='cusid']"));
        costumerId.sendKeys("zuhal");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();


    }


}
