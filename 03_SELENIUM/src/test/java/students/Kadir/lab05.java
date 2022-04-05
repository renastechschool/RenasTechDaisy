package students.Kadir;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
* #### Step 1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
#### Step 2) Enter Any Customer id.
#### Step 3) After entering the customer ID, Click on the “Submit” button.
#### Step 4) Reject/accept the alert.*/
public class lab05 {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }
    @Test
    public void Task6(){
         driver.findElement(By.cssSelector("input[name='cusid']")).sendKeys("HelloWorld123");
         driver.findElement(By.cssSelector("input[name='submit']")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

    }
}
