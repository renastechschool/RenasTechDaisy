package code.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com");
        //find by ID locator
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
       // driver.findElement(By.id("nav-search-submit-button")).click();

        //Xpath locator //tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
}
