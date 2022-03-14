package code.day1_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_browserNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
     //   driver.navigate().to("https://www.facebook.com");
        driver.manage().window().fullscreen();
        driver.get("https://www.apple.com");
        Thread.sleep(5000);
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        //it will close the tabs
       // driver.close();
        driver.quit();






    }
}
