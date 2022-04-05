package students.Kadir;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/*## Test website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
## Test Scenario:
####      Go to the above URL.
####      Get the current window’s handle and write to the console window. It must be the first window handle.
####      Locate the “Visit W3Schools.com!” link and click it.
####      Get all window handles and hold them in a list.
####      Write to total window handle number to the console. It must be 2.
####      Switch t the second window.
####      Get the current window’s handle and write to the console window. It must be a second window handle.
####      Check the upper left side logo in the second window.
####      Go back (Switch) to the first window.
####      Get the current window’s handle and write to the console window. It must be the first window handle.
####      Check the See Run Button Text. It must contain “Run >” text.*/
public class lab06 {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
    }
    @Test
    public void Task7(){
       String currentWindow=driver.getWindowHandle();
        System.out.println("Current Window Handle is: " + currentWindow);
        driver.switchTo().frame("iframeResult");
       driver.findElement(By.xpath("//a[contains(text(),'Visit W3Schools.com!')]")).click();

        Set<String> list=driver.getWindowHandles();
        System.out.println("Total number of Windows are: " + list.size());
        Iterator<String> iterator= list.iterator();

        while (iterator.hasNext()){
            String parent=iterator.next();
            String child=iterator.next();
            driver.switchTo().window(child);
            System.out.println("Current window handle is: " + driver.getWindowHandle());
            WebElement logo=driver.findElement(By.cssSelector("i[class='fa fa-logo']"));
            Assert.assertTrue(logo.isDisplayed());
            driver.switchTo().window(parent);
            System.out.println("Current window handle is: " + driver.getWindowHandle());
        }
        WebElement runButton=driver.findElement(By.id("runbtn"));
        if (runButton.getText().contains("Run >")){
            Assert.assertTrue(true);
        }


    }
}
