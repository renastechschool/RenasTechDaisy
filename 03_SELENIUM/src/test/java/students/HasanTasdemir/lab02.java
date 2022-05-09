package students.HasanTasdemir;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab02 {
    @Test
    public void TC_Lan02() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("orange");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("btnK")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "orange";
        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Title verification is succeed. The title starts with 'orange' word.");
        } else {
            System.out.println("Title verification is failed. The title does not start with 'orange' word.");
        }
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("banana");
        driver.findElement(By.name("btnK")).click();
        if (driver.getTitle().contains("banana")) {
            System.out.println("Title verification is succeed. The title contains 'banana' word.");
        } else {
            System.out.println("Title verification is failed. The title does not contains 'banana' word.");
        }
        driver.quit();
    }
}
