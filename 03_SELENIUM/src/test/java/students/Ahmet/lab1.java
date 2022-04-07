package students.Ahmet;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
 /*
 Task 1
#### Go to https://www.etsy.com/
#### Maximize window
#### title doesnt contain "Smile"
#### Verify Current Url

##Task 2
#### Go to https://www.amazon.com/
#### Verify title
#### Verify Current Url
#### Navigate Back
#### Refresh
#### Quit browser
  */
public class lab1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");

        String unexpectedTitle="Smile";
        String actualTitle= driver.getTitle();

        if(actualTitle.contains(unexpectedTitle)){
            System.out.println("Test Failed!");
        }else{
            System.out.println("Test Passed! The title doesn't contain smile");
        }
        String actualUrlETSY = driver.getCurrentUrl();
        String expectedUrlETSY = "https://www.etsy.com/";
        Assert.assertEquals(actualUrlETSY,expectedUrlETSY,"Current Url for ETSY verification Failed");

        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com/");
        String expectedtitle="Amazon.com. Spend less. Smile more.";
        String actualtitle= driver.getTitle();
        Assert.assertEquals(actualtitle,expectedtitle,"The title verification Failed");

        String actURL= driver.getCurrentUrl();
        String expURL = "https://www.amazon.com/";
        Assert.assertEquals(actURL,expURL,"Current URL verification is failed");

        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.quit();

    }
}
