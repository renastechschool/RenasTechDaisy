package students.ogun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab5 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        }

        @Test
        public void tc1(){
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        WebElement customerid = driver.findElement(By.name("cusid"));
        customerid.sendKeys("245891");
        WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();

            Alert alert = driver.switchTo().alert();


            alert.dismiss();
            // alert.accept();



    }
}
