package students.zelal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class lab02 {

    public static void main(String[] args) {


//    # TASK: Google search
//#### 1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


//#### 2- Go to: https://google.com
        driver.get("https://google.com");
        driver.manage().window().maximize();

//            #### 3- Write "orange" in search box
        WebElement searchbox= driver.findElement(By.name("q"));
        searchbox.sendKeys("orange"+ Keys.ENTER);
//#### 4- Click google search utton

//#### 5- Verify title:
        String actualTitle= driver.getTitle();

//            #### Expected: Title should start with "orange" word
        Assert.assertTrue(actualTitle.startsWith("orange"));

//#### 6-navigate back
        driver.navigate().back();
//#### 7-write banana in search box
        WebElement searchbox1= driver.findElement(By.name("q"));
        searchbox1.sendKeys("banana"+ Keys.ENTER);
//#### 8-verify title contains banana.
        Assert.assertTrue(actualTitle.contains("banana"));

    }
}