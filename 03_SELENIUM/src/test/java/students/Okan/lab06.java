package students.Okan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/*
## Test website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
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
####      Check the See Run Button Text. It must contain “Run >” text.
 */
public class lab06 {
    WebDriver driver;
    int total=0;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void lab06() throws InterruptedException {
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        String currentWindow= driver.getWindowHandle();
        System.out.println("Current Window is: "+currentWindow);
        driver.switchTo().frame("iframeResult");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Visit')]")).click();
        Set<String> allWindows=driver.getWindowHandles();
        List<String> windowlist=new ArrayList<>();
        for (String window:allWindows)
        {
            windowlist.add(window);
            total++;
        }
        System.out.println("Total Number of Windows: "+total);
        driver.switchTo().window(windowlist.get(1));
        String newCurrentWindow=driver.getWindowHandle();
        Thread.sleep(2000);
        System.out.println("New Current Window: "+newCurrentWindow);
        WebElement logo=driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
        if(logo.isDisplayed()){
            System.out.println("Logo is present on the second page");
        }
        driver.switchTo().window(windowlist.get(0));
        Thread.sleep(2000);
        String firstCurrentWindow=driver.getWindowHandle();
       System.out.println("Switch to the first window: "+firstCurrentWindow);
        Thread.sleep(2000);
        WebElement runBtn=driver.findElement(By.id("runbtn"));
        if (runBtn.getText().contains("Run >")){
            Assert.assertTrue(true);
        }
    }
}
