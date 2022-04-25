package students.Margarita;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Lab06 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Go to http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        //Get the current window’s handle and write to the console window. It must be the first window handle.
        String currentWindow = driver.getWindowHandle();
        System.out.println("Current Window1: "+ currentWindow);
        //Locate the “Visit W3Schools.com!” link and click it.
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='https://www.w3schools.com']")).click();
        //Get all window handles and hold them in a list.
        //Write to total window handle number to the console. It must be 2.
        Set<String>HandleList = driver.getWindowHandles();
        List<String> windowList = new ArrayList<>();
        System.out.println("Total current Windows: "+ HandleList.size());
        // Switch t the second window.
        int number=0;
        for(String NewWindow:HandleList){
            windowList.add(NewWindow);
            driver.switchTo().window(NewWindow);
            number++;
        }
        WebDriver childWind2= driver.switchTo().window(windowList.get(1));
        String childWind2Handle= childWind2.getWindowHandle();
        //Get the current window’s handle and write to the console window. It must be a second window handle.
        System.out.println("Current Window2: " +childWind2Handle );
        //Check the upper left side logo in the second window.
        WebElement logo=driver.findElement(By.cssSelector("i[class='fa fa-logo']"));
        Assert.assertTrue(logo.isDisplayed());
        //Go back (Switch) to the first window.
        // Get the current window’s handle and write to the console window. It must be the first window handle.
        //Check the See Run Button Text. It must contain “Run >” text.
        driver.switchTo().window(currentWindow);
        System.out.println("Current Window1: "+ currentWindow);
        WebElement RunButton = driver.findElement(By.id("runbtn"));
        String RunButtonText = RunButton.getText();
        if (RunButtonText.contains("Run >")){
            System.out.println("Run button contains Run ❯");
        }else
            System.out.println("Run button no contains Run ❯");
    }
}
