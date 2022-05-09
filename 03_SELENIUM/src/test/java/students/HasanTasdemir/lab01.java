package students.HasanTasdemir;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lab01 {


    @Test
    public void TC_Lab01() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Smile";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test failed");
        } else
            System.out.println("Test passed");
        System.out.println("Current url of the webpage: " + driver.getCurrentUrl());
    }

    @Test
    public void TC_Lab01_2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        String amazonTitle = driver.getTitle();
        String amazonExpectedTitle = "Amazon.com. Spend less. Smile more.";
        if (amazonTitle.equals(amazonExpectedTitle)) {
            System.out.println("Amazon title test is passed");
        } else {
            System.out.println("Amazon title test is failed");
        }
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }

}



