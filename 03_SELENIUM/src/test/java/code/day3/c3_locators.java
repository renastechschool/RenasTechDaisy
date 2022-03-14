package code.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_locators {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/selenium-xpath.html");
        driver.manage().window().maximize();
        // Xpath second way /tagname[.='text'] --looks for exact text match for any attribute
        WebElement TestingHeader=driver.findElement(By.xpath("//b[.='Testing']"));
        System.out.println(TestingHeader.getText());
        //Absolute xpath method
        WebElement TestingHeader2=driver.findElement(By.xpath("html/body/div[4]/div[1]/div/h4[1]/b"));
        System.out.println(TestingHeader2.getText());
    }
}
