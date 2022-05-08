package students.HasanTasdemir;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab05 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("783435467674");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.accept();
    }
}
