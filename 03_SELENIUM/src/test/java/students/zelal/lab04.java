package students.zelal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lab04 {
    public static void main(String[] args) throws InterruptedException {

//        #### go to http://demo.guru99.com/test/newtours/register.php
//#### click on country dropdown and select Barbados with Select Method
//#### Use 3 different Select Method (visible text,index,value)
//#### and switch to another countries as you wish

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
        Select select = new Select(country);
        select.selectByValue("BARBADOS");
        Thread.sleep(2000);
        select.selectByIndex(3);
        Thread.sleep(2000);
        select.selectByVisibleText("PERU");
        Thread.sleep(2000);
    }
}
