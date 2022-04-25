package students.ogun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class lab2 {
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
