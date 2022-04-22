package students.Margarita;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab01 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Go to https://www.etsy.com/
        driver.get("https://www.etsy.com/");
        // Maximize window
        driver.manage().window().maximize();
        //title doesnt contains "Smile"
        String Title = driver.getTitle();
        String expectedTitle= "Smile";
        if(Title.equals(expectedTitle)){
            System.out.println("Etsy Title verification has passed/ contains -Smile-");
        }else{
            System.out.println("Etsy Title verification has failed/ no contains -Smile-");
        }
        //Verify Current Url
        System.out.println("Current Url is:" + driver.getCurrentUrl());

        //-------------------------------------------------------------
        //Go to https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Verify title
        String actualTitle = driver.getTitle();
        System.out.println("Title:" + driver.getTitle());
        //Verify Current Url
        System.out.println("Current Url is:" + driver.getCurrentUrl());
        //Navigate Back
        driver.navigate().back();
        //Refresh
        driver.navigate().refresh();
        //Quit browser
        driver.quit();
    }
}
