package students.Okan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
# TASK: Google search
#### 1- Open a chrome browser
#### 2- Go to: https://google.com
#### 3- Write "orange" in search box
#### 4- Click google search button
#### 5- Verify title:
#### Expected: Title should start with "orange" word
#### 6-navigate back
#### 7-write banana in search box
#### 8-verify title contains banana.
 */
public class lab02 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test
    public void lab02() throws InterruptedException {
        driver.get("https://google.com");
        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("orange");
        driver.findElement(By.name("btnK")).click();
        String actualTitle= driver.getTitle();
        String expected="orange";

        System.out.println(actualTitle);
        if(actualTitle.startsWith(expected)){
            System.out.println(actualTitle+" is start with "+ expected   +"\nVerification Successful!!! ");
        }else
            System.out.println(actualTitle+" DOES NOT start with "+ expected   +"\nVerification FAILED!!! ");

        driver.navigate().back();
        Thread.sleep(3000);

    System.out.println("**************************************************");
    WebElement searchBox2= driver.findElement(By.name("q"));
    searchBox2.sendKeys("banana");
    driver.findElement(By.name("btnK")).click();
    String actualTitle2= driver.getTitle();
    String containTitle="banana";
    if(actualTitle2.contains(containTitle)){
        System.out.println(actualTitle2+" Verification is Successful!!!");
    }
    else
        System.out.println(actualTitle2+" Verification is FAILED");
}
    @AfterMethod
    public void close(){
        System.out.println("TEST COMPLETED!!!!!!");
    }

}
