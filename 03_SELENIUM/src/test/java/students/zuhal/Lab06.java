package students.zuhal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Lab06 {
    //http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
    //Test Scenario:
    //Go to the above URL.
    //Get the current window’s handle and write to the console window. It must be the first window handle.
    //Locate the “Visit W3Schools.com!” link and click it.
    //Get all window handles and hold them in a list.
    //Write to total window handle number to the console. It must be 2.
    //Switch t the second window.
    //Get the current window’s handle and write to the console window. It must be a second window handle.
    //Check the upper left side logo in the second window.
    //Go back (Switch) to the first window.
    //Get the current window’s handle and write to the console window. It must be the first window handle.
    //Check the See Run Button Text. It must contain “Run >” text.
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");

        System.out.println("The current window handle is: "+driver.getWindowHandle());
        driver.switchTo().frame("iframeResult ");

        WebElement handle = driver.findElement(By.xpath("//a[.='Visit W3Schools.com!']"));
        handle.click();

        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandlelist =  new ArrayList<>(windowHandles);
        System.out.println("Total window number: "+windowHandlelist.size());
        driver.switchTo().window(windowHandlelist.get(1));

        System.out.println("Current window Handle "+driver.getWindowHandle());
        WebElement visibleLogo = driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
        Assert.assertTrue(visibleLogo.isDisplayed(),"Visible logo verification is failed");
        driver.switchTo().window(windowHandlelist.get(0));

        System.out.println("Current window Handle: "+driver.getWindowHandle());
        WebElement Button = driver.findElement(By.id("runbtn"));
        Assert.assertTrue(Button.getText().contains("Run"),"Run Button verification failed");


    }


}
