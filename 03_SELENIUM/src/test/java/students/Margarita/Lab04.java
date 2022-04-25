package students.Margarita;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lab04 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //go to http://demo.guru99.com/test/newtours/register.php
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        //click on country dropdown and select Barbados with Select Method
        WebElement CountryDropdown = driver.findElement(By.name("country"));
        CountryDropdown.click();
        Select dropdown = new Select(CountryDropdown);
        dropdown.selectByVisibleText("BARBADOS");
        Thread.sleep(3000);
        dropdown.selectByIndex(9);
        Thread.sleep(3000);
        dropdown.selectByValue("MEXICO");
        Thread.sleep(3000);
    }
}
