package students.Ahmet;


import code.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class lab5 {
    // Step 1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
    // Step 2) Enter Any Customer id.
    // Step 3) After entering the customer ID, Click on the “Submit” button.
    // Step 4) Reject/accept the alert.
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("George");
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        BrowserUtils.wait(2);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
