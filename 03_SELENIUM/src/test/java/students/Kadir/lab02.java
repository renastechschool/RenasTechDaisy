package students.Kadir;
/*# TASK: Google search
#### 1- Open a chrome browser
#### 2- Go to: https://google.com
#### 3- Write "orange" in search box
#### 4- Click google search button
#### 5- Verify title:
#### Expected: Title should start with "orange" word
#### 6-navigate back
#### 7-write banana in search box
#### 8-verify title contains banana.*/

import code.utilities.DriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab02  {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize(); //Maximize window
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Test
    public void Task3() {
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("orange");
        driver.findElement(By.cssSelector("div[class='CqAVzb lJ9FBc'] input[name='btnK']")).click();
       String actualTitle=driver.getTitle();
       if (actualTitle.startsWith("orange")){
           Assert.assertTrue(true);
       }
      driver.navigate().back();
       driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("banana");
        driver.findElement(By.cssSelector("div[class='CqAVzb lJ9FBc'] input[name='btnK']")).click();
        String actual=driver.getTitle();
        if (actual.contains("banana")){
            Assert.assertTrue(true);
        }
    }


}
