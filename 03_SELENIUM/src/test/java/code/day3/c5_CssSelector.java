package code.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c5_CssSelector {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        //Css selector locator

        driver.findElement(By.cssSelector("input[dir='auto']")).sendKeys("Tv");
        //        3-tagname#value # means id in css
//            driver.findElement(By.id("twotabsearchtextbox"));
//            driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
//          input#twotabsearchtextbox
        driver.findElement(By.cssSelector("input#input#twotabsearchtextbox"));
    }
}
