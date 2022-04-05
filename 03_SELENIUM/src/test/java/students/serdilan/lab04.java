package students.serdilan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lab04 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        WebElement dropdownBox=driver.findElement(By.xpath("//select[@name='country']"));
        dropdownBox.click();
        Select dropDown=new Select(dropdownBox);
        Thread.sleep(2000);
        dropDown.selectByVisibleText("BARBADOS");
        Thread.sleep(2000);
        dropDown.selectByIndex(5);
        Thread.sleep(2000);
        dropDown.selectByValue("TURKEY");
    }
}
