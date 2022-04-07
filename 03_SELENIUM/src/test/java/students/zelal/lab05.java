package students.zelal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab05 {
    public static void main(String[] args) {

//        #### Step 1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
//#### Step 2) Enter Any Customer id.
//#### Step 3) After entering the customer ID, Click on the “Submit” button.
//#### Step 4) Reject/accept the alert.

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        WebElement CustomerId = driver.findElement(By.xpath("//input[@type='text']"));
        CustomerId.sendKeys("123456");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.switchTo().alert().accept();
        driver.close();


    }
}
