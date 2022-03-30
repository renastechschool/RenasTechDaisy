package students.yasemin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab01 {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.etsy.com/");
        String actualTitle=driver.getTitle();
        String expectedTitle="Smile";

        System.out.println("Current Url is:"+ driver.getCurrentUrl());
       Thread.sleep(2000);
       driver.navigate();

    }


}