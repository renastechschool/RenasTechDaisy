package students.zelal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class lab01 {
    public static void main(String[] args) {


//    ##Task 1
//        #### Go to https://www.etsy.com/

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.etsy.com/");

        //#### Maximize window
        driver.manage().window().maximize();



//#### title doesnt contains "Smile"
        String actualTitle = driver.getTitle();
        Assert.assertTrue(!actualTitle.contains("Smile"));

//            #### Verify Current Url
        String actualURL= driver.getCurrentUrl();
        String expectedURL="https://www.etsy.com/";
        Assert.assertEquals(actualURL,expectedURL);
//
//##Task 2
//            #### Go to https://www.amazon.com/

        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        String title= driver1.getTitle();
        System.out.println(title);
//            #### Verify title
        String expectedTitle="Amazon.com. Spend less. Smile more.";
        Assert.assertEquals(title,expectedTitle);

//#### Verify Current Url

        Assert.assertEquals(driver1.getCurrentUrl(), "https://www.amazon.com/");
//#### Navigate Back
        driver1.navigate().back();
//#### Refresh
        driver1.navigate().refresh();
//#### Quit browser
        driver1.quit();


    }
}
