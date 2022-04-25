package students.ogun;


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

public class lab6 {
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



    }}

