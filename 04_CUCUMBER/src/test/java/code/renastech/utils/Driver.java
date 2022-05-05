package code.renastech.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    public static WebDriver driver ;
    private static String browser = ConfigurationsReader.getProperties("browser");
    public static WebDriver getDriver(){

            if (driver == null) {
                switch (browser) {
                    case "chrome":
                        System.out.println("=======Starting Chrome Driver=======");
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        break;
                    case "firefox":
                        System.out.println("=======Starting Firefox Driver=======");
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                    case "headless":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                        break;
                    case "edge":
                        System.out.println("=======Starting Edge Driver=======");
                        WebDriverManager.edgedriver().setup();
                        driver = new EdgeDriver();
                        break;
                }
            }

        return driver;
    }
    public static void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

}
