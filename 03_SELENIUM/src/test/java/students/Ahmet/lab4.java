package students.Ahmet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
/*
#### go to http://demo.guru99.com/test/newtours/register.php
#### click on country dropdown and select Barbados with Select Method
#### Use 3 different Select Method (visible text,index,value)
#### and switch to another countries as you wish
 */

public class lab4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");

      //  WebElement dropdown = driver.findElement(By.name("country"));
        Select select = new Select(driver.findElement(By.name("country")));
        select.selectByVisibleText("BARBADOS");
        select.selectByValue("BARBADOS");
        select.selectByIndex(19);

        select.selectByIndex(3);
        select.selectByValue("AUSTRIA");
        select.selectByVisibleText("DENMARK");

    }
}
