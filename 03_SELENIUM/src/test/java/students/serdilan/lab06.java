package students.serdilan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class lab06 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='https://www.w3schools.com']")).click();
        Set<String> allWindows=driver.getWindowHandles();
        List<String> windowList=new ArrayList<>();
        int number=0;
        for(String NewWindow:allWindows){
            windowList.add(NewWindow);
            driver.switchTo().window(NewWindow);
           number++;
        }
        System.out.println("total window handle number is "+number);
        System.out.println(driver.getWindowHandle());
        Thread.sleep(2000);
        driver.switchTo().window(windowList.get(0));
        System.out.println(driver.getWindowHandle());
        WebElement runbutton=driver.findElement(By.id("runbtn"));
        String buttonText=runbutton.getText();
        if (buttonText.contains("Run ❯"))
        {
            System.out.println("run button contains Run ❯");
        }
        else{
            System.out.println("run button doesn't contains Run ❯");
            System.out.println("actual button text is : "+buttonText);
        }


    }
}
