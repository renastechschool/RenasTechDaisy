package students.Okan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
/*
#### Step 1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
#### Step 2) Enter Any Customer id.
#### Step 3) After entering the customer ID, Click on the “Submit” button.
#### Step 4) Reject/accept the
 */
public class lab05 {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }
    @Test
    public void lab05(){
        WebElement CstmrIDSrchBx=driver.findElement(By.name("cusid"));
        CstmrIDSrchBx.sendKeys("64623126");
        driver.findElement(By.name("submit")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
}
