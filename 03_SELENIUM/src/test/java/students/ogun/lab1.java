package students.ogun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class lab1 {
    WebDriver driver;
@BeforeMethod
        public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);}
      @Test
      public void lab1(){

      driver.get("https://www.etsy.com/");
        String title = driver.getTitle();
    if (title.contains("Smile")){
        System.out.println("The title contains 'Smile'");
    }else System.out.println("The title is fine but not smiling");
   String currenturl= driver.getCurrentUrl();
   Assert.assertEquals(currenturl, "https://www.etsy.com/");
}
@Test
    public void lab1_2() {
    driver.get("https://www.amazon.com/");
    String title1 = driver.getTitle();
    System.out.println(title1);
    String expectedtitle = "Amazon.com. Spend less. Smile more.";
    Assert.assertEquals(title1, expectedtitle);
    String url = "https://www.amazon.com/";
    Assert.assertEquals(url, "https://www.amazon.com/");
    driver.navigate().back();
    driver.navigate().refresh();
    driver.quit();
}


}
