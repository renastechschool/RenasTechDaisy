package code.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class c3_DifferentBrowsersSetup {
    public static void main(String[] args) {
        //FireFox Browser
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver=new FirefoxDriver();
//        driver.get("https://www.google.com");

        //Edge Browser
        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();



    }
}
