package students.Elif;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class labo01 {
    public static void main(String[] args) {
//        ##Task 1
//#### Go to https://www.etsy.com/
//#### Maximize window
//#### title doesnt contains "Smile"
//#### Verify Current Url
//
//##Task 2
//#### Go to https://www.amazon.com/
//#### Verify title
//#### Verify Current Url
//#### Navigate Back
//#### Refresh
//#### Quit browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

    }
}
