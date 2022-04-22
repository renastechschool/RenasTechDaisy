package students.Margarita;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab05 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        //2) Enter Any Customer id.
        driver.findElement(By.name("cusid")).sendKeys("Malagueña");
        Thread.sleep(2000);
        //3) After entering the customer ID, Click on the “Submit” button.
        driver.findElement(By.name("submit")).click();
        Thread.sleep(2000);
        //4) Reject/accept the alert.
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
