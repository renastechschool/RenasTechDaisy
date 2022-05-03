package students.serkan;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Lab002 {
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

        WebDriver driver;
        @BeforeMethod
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver =new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        }
        @Test
        public void tc1() throws InterruptedException {
            driver.get("https://google.com");
            WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
            searchbox.sendKeys("orange");
            WebElement submit= driver.findElement(By.name("btnK"));
            submit.click();
            String title= driver.getTitle();
            String expectedtitle = "orange";
            if (expectedtitle.startsWith("orange")){
                System.out.println("At the right address");
            }else
                System.out.println("You are lost");
            driver.navigate().back();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@name='q']")).sendKeys("banana");
            driver.findElement(By.name("btnK")).click();
            String title1= driver.getTitle();
            if (title1.contains("banana")){
                System.out.println("Nays!!");
            }else System.out.println("You will never be able to become a tester");
        }

}
