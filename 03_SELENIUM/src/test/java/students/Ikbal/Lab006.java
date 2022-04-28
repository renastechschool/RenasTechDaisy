package students.Ikbal;
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
public class Lab006 {
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




        WebDriver driver;
        @BeforeMethod
        public void setUp(){

            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
        @Test
        public void tc3(){
            driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
            String current = driver.getWindowHandle();

            System.out.println("Current window handle " + current);

            // WebElement iframe = driver.findElement(By.id("iframe"));
            driver.switchTo().frame("iframeResult");
            WebElement text = driver.findElement(By.xpath("//a[.='Visit W3Schools.com!']"));
            String text1 = text.getText();

            Assert.assertEquals(text1, "Visit W3Schools.com!");
            text.click();
            Set<String> allwindows = driver.getWindowHandles();
            List<String> list= new ArrayList<>();

            System.out.println("We are currently handling "+allwindows.size()+" windows");

            for (String window : allwindows){
                list.add(window);
                driver.switchTo().window(window);
            }
            driver.switchTo().window(list.get(1));

            WebElement logo= driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
            Assert.assertTrue(logo.isDisplayed());
            driver.switchTo().window(current);
            System.out.println("current one is "+driver.getWindowHandle());

            WebElement runButton=driver.findElement(By.id("runbtn"));
            String run = runButton.getText();

            if (run.contains("Run >")) {
                System.out.println("Nays!!");
            }else System.out.println("What it contains is " + run);



        }
}
