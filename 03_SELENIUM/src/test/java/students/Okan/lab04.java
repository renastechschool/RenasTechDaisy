package students.Okan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
#### go to http://demo.guru99.com/test/newtours/register.php
#### click on country dropdown and select Barbados with Select Method
#### Use 3 different Select Method (visible text,index,value)
#### and switch to another countries as you wish
 */
public class lab04 {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void lab04() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        WebElement country=driver.findElement(By.name("country"));
        Select Country=new Select(country);
        Country.selectByVisibleText("BARBADOS");
        Thread.sleep(2000);
        Country.selectByValue("MOZAMBIQUE");
        Thread.sleep(2000);
        Country.selectByIndex(100);
    }
}
