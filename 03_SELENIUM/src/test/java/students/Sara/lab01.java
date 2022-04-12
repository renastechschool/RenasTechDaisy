package students.Sara;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class lab01 {//2

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");

        String actTitle=driver.getTitle();
        String expectedTitle="amazon";


        Assert.assertEquals(actTitle,expectedTitle,"fail");
        System.out.println("browser title is :"+actTitle);


        String actURL= driver.getCurrentUrl();
        String expectedurl="https://www.amazon.com";


        Assert.assertEquals(actURL,expectedurl,"fail");

        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();





        //1
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.etsy.com/");

            String exTitle="Smile";
            String acTitle=driver.getTitle();

            if(!actTitle.equals(exTitle)) System.out.println("passed");
            else System.out.println("verfication failed");
            System.out.println("browser title is :"+acTitle);
}}
