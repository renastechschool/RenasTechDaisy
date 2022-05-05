package students.ogun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab7 {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void tc1(){
        driver.get("http://demo.guru99.com/V4/");

        WebElement header= driver.findElement(By.xpath("//h2[@class='barone']"));
        String text = header.getText();
        Assert.assertEquals(text,"Guru99 Bank");
        WebElement userid =driver.findElement(By.name("uid"));
        String profile= "admin123";
        String sifre = "erzincan24";
        userid.sendKeys(profile);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(sifre);
        driver.findElement(By.name("btnLogin")).click();

    }
}
