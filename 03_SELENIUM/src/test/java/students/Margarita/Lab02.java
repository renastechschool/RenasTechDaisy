package students.Margarita;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab02 {
    public static void main(String[] args) {
        //1- Open a chrome browser
        // 2- Go to: https://google.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        //3- Write "orange" in search box
        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("orange");
        //4- Click google search button
        driver.findElement(By.cssSelector("div[class='CqAVzb lJ9FBc'] input[name='btnK']")).click();
        //5- Verify title:
        //Expected: Title should start with "orange" word
        String title = driver.getTitle();
        String expectedTitle = "orange";
        if (title.contains(expectedTitle)){
            System.out.println("Title verification has passed/ contains -orange-");
        }else
            System.out.println("Title verification has failed/ no contains -orange-");


        //6-navigate back
        driver.navigate().back();
        //7-write banana in search box
        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("banana");
        driver.findElement(By.cssSelector("div[class='CqAVzb lJ9FBc'] input[name='btnK']")).click();
        //8-verify title contains banana
        String Title2 = driver.getTitle();
        String expectedTitle2 = "banana";
        if (Title2.contains(expectedTitle2)){
            System.out.println("Title passed it contains -banana-");
        }else
            System.out.println("Title failed it no contains -banana-");

    }
}
