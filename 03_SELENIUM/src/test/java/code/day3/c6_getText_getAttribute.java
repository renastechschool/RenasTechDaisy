package code.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c6_getText_getAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement gmailButton=driver.findElement(By.linkText("Gmail"));

        System.out.println("gmail button text is:"+gmailButton.getText());
        System.out.println("gmail button href attribute is:"+gmailButton.getAttribute("href"));
    }
}
