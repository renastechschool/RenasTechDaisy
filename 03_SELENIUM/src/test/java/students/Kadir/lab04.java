package students.Kadir;

/*#### go to http://demo.guru99.com/test/newtours/register.php
#### click on country dropdown and select Barbados with Select Method
#### Use 3 different Select Method (visible text,index,value)
#### and switch to another countries as you wish*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab04 {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
    }
    @Test
    public void task5(){
        WebElement country=driver.findElement(By.cssSelector("select[name='country']"));
        Select selectCountry=new Select(country);
        selectCountry.selectByVisibleText("BARBADOS");
        selectCountry.selectByValue("TURKEY");
        selectCountry.selectByIndex(45);

    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
