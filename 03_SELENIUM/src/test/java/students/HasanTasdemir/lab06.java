package students.HasanTasdemir;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class lab06 {
    @Test
    public void TC_Lab06() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//div[@class='CodeMirror-code']/pre[5]/span[@style='padding-right: 0.1px;']/span[4]")).sendKeys("hello");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//a[.='Visit W3Schools.com!']")).click();

        Set<String> allWindows = driver.getWindowHandles();

        System.out.println("The all windows: " + allWindows);

        List<String> windowList=new ArrayList<>();
        for(String NewWindow:allWindows){
            windowList.add(NewWindow);
            driver.switchTo().window(NewWindow);
        }
        System.out.println();
        System.out.println(driver.getWindowHandle());
        driver.findElement(By.xpath("//a[@title='Home']")).click();
        driver.switchTo().window(windowList.get(0));
        System.out.println();
        System.out.println(driver.getWindowHandle());
        WebElement runButton =driver.findElement(By.id("runbtn"));
        runButton.click();
        driver.quit();
    }
}
