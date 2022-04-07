package students.Ahmet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
        /*
        # TASK: Google search
#### 1- Open a chrome browser
#### 2- Go to: https://google.com
#### 3- Write "orange" in search box
#### 4- Click google search button
#### 5- Verify title:
#### Expected: Title should start with "orange" word
#### 6-navigate back
#### 7-write banana in search box
#### 8-verify title contains banana.


         */

public class lab2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

       driver.findElement(By.name("q")).sendKeys("Orange");
       driver.findElement(By.xpath("//input[@type='submit']")).click();

      String expectedTitle="Orange";
      String actualTitle= driver.getTitle();
      Thread.sleep(2000);
      driver.navigate().back();
      driver.findElement(By.name("q")).sendKeys("Banana"+ Keys.ENTER);
      System.out.println("The title contain Banana "+driver.getTitle());
    }
}
