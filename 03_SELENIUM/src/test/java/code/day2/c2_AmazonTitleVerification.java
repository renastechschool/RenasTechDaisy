package code.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_AmazonTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //Task - 2
        //Open Chrome Browser
        //Go to google
        //Navigate back
        //Navigate forward
        //Navigate to https://www.amazon.com
        //Verify title contains : Smile


        //Open Chrome Browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        //Go to google
        driver.get("https://www.google.com");
        //Navigate back
        Thread.sleep(2000);
        driver.navigate().back();
        //Navigate forward
        Thread.sleep(2000);
        driver.navigate().forward();
        //Navigate to https://www.amazon.com
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com");

        //Verify title contains : Smile

        String containsTitle="Smile";
        String actualTitle=driver.getTitle();

        if(actualTitle.contains(containsTitle)){
            System.out.println("Amazon Title verification has passed");
        }else {
            System.out.println("Amazon Title verification has failed");
            System.out.println("Actual Title:"+ actualTitle);
        }




    }
}
