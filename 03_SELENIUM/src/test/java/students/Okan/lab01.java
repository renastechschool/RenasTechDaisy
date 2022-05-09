package students.Okan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab01 {
    /*
    ##Task 1
#### Go to https://www.etsy.com/
#### Maximize window
#### title doesn't contains "Smile"
#### Verify Current Url

##Task 2
#### Go to https://www.amazon.com/
#### Verify title
#### Verify Current Url
#### Navigate Back
#### Refresh
#### Quit browser
     */
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(priority = 1)
    public void Task01(){
        driver.get("https://www.etsy.com/");
        String actualTitle= driver.getTitle();
        String containTitle="Smile";
        if(actualTitle.contains(containTitle)){
            System.out.println(driver.getTitle()+"  contains Smile world!!!");
        }else
            System.out.println(driver.getTitle()+ "  DOES NOT contain Smile world!!!");

        String current_URL= driver.getCurrentUrl();
        System.out.println("Current URL:"+current_URL);

    }
    @Test(priority = 2)
    public void Task02() throws InterruptedException {
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);
        String actualTitle= driver.getTitle();
        String expectedTitle="Amazon.com";
        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println(actualTitle+" Verification Completed \n TEST PASSED");
        }
        else
            System.out.println("Actual title is: "+actualTitle+"\n TEST FAILED");

        String current_URL= driver.getCurrentUrl();
        System.out.println("Current URL:"+current_URL);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();

    }
    @AfterMethod
    public void close(){
        System.out.println("TEST COMPLETED!!!!!!");
    }

}
