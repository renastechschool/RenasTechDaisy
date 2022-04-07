package students.serdilan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");
        String expectedTitle="Smile";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Etsy Title verification has passed");
        }else{
            System.out.println("Etsy Title verification has failed");
        }
        System.out.println("Browser title is:"+ actualTitle);
        driver.get("https://www.amazon.com/");
        String actualTitle2=driver.getTitle();
        System.out.println(actualTitle2);
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();

    }
}
