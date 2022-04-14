package students.zuhal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://etsy.com");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Smile";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("verification failed");
        }
        else{
            System.out.println("verification passed");

        }
        driver.navigate().to("https://amazon.com");
        String amazonTitle = driver.getTitle();
        System.out.println(amazonTitle);
        String expectedTitle2 = "Amazon.com. Spend less. Smile more.";
        if (amazonTitle.contains(expectedTitle2)){
            System.out.println("title verification has passed");
        }
        else{
            System.out.println("verificaiton has failed");

        }
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.quit();
    }

}
