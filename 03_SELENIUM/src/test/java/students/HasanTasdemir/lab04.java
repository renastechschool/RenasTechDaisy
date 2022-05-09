package students.HasanTasdemir;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab04 {
    @Test
    public void TC_Lab03(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" http://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//select[@name='country']")).click();
        WebElement dropDownBox = driver.findElement(By.xpath("//select[@name='country']"));
        Select dropdown = new Select(dropDownBox);
        dropdown.selectByVisibleText("BAHAMAS");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dropdown.selectByIndex(62);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dropdown.selectByValue("UKRAINE");
        driver.quit();
    }
}
