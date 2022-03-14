package code.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_Google_Title_Verification {
    public static void main(String[] args) {
        //Task
        //1.Open Chrome Browser
        //2.Go to google
        //3.Verify title : Expected : Google

        //1.Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        //2.Go to google
        driver.get("https://www.google.com");

        //3.Verify title : Expected : Google

        String expectedTitle="Google";
        String actualTitle=driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Google Title verification has passed");
        }else{
            System.out.println("Google Title verification has failed");

        }
        System.out.println("Browser title is:"+ actualTitle);




    }
}
