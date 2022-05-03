package students.serkan;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class Lab004 {
/*#### go to http://demo.guru99.com/test/newtours/register.php
#### click on country dropdown and select Barbados with Select Method
#### Use 3 different Select Method (visible text,index,value)
#### and switch to another countries as you wish*/


        WebDriver driver;

        @BeforeMethod
        public void setUp(){

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        @Test
        public void tc2() throws InterruptedException {
            driver.get("http://demo.guru99.com/test/newtours/register.php");

            WebElement country= driver.findElement(By.name("country"));
            country.click();

            Select dropdown = new Select(country);
            dropdown.selectByVisibleText("BARBADOS");

            Thread.sleep(2000);
            dropdown.selectByIndex(12);
            Thread.sleep(2000);
            dropdown.selectByValue("JAPAN");



        }
}
