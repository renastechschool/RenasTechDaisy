package students.Kadir;
/*##Task 1
  #### Go to https://www.etsy.com/
 #### Maximize window
 #### title does contains "Smile"
 #### Verify Current Url*/
/*##Task 2
        #### Go to https://www.amazon.com/
        #### Verify title
        #### Verify Current Url
        #### Navigate Back
        #### Refresh
        #### Quit browser*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab01 {
    protected  WebDriver driver;

    @BeforeMethod
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize(); //Maximize window
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void Task1(){
       driver.get("https://www.etsy.com/"); //Go to https://www.etsy.com/
        String expectedTitle=driver.getTitle();
        String actual="Smile";
        if (expectedTitle.contains(actual)){
            Assert.assertTrue(true); //title does contains "Smile"
        }
        String currentUrl=driver.getCurrentUrl();
        Assert.assertEquals("https://www.etsy.com/",currentUrl); //Verify Current Url*/
    }

    @Test
    public void Task2(){
        driver.get(" https://www.amazon.com/");
        String actualTitle= driver.getTitle();
        String expectedTitle="Amazon.com. Spend less. Smile more.";
        Assert.assertEquals(actualTitle,expectedTitle); //Verify title
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";
        Assert.assertEquals(actualUrl,expectedUrl); //Verify Current Url
        driver.navigate().back(); //Navigate Back
        driver.navigate().refresh(); //Refresh
        driver.quit(); //Quit Browser




    }
}
