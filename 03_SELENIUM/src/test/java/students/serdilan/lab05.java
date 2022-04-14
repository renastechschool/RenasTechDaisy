package students.serdilan;

import code.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab05 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        WebElement enterId=driver.findElement(By.xpath("//input[@type='text']"));
        enterId.sendKeys("4");
         driver.findElement(By.xpath("//input[@type='submit']")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Alert alert2=driver.switchTo().alert();
        alert2.accept();

    }

}
