package code.day3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_Locators {
    public static void main(String[] args) {

        //  //1- Open a chrome browser and go to google
        //        //2- Click to Gmail link from top right
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    //linkText locator
    //driver.findElement(By.linkText("Gmail")).click();

    //PartialLinkText locator
    // driver.findElement(By.partialLinkText("Gm")).click();

        //Classname Locator
        driver.findElement(By.className("gb_d")).click();







    }}

