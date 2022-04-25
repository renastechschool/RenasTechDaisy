package students.ogun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import students.ogun.Utils.browserUtils;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void closing(){
        browserUtils.wait(3);
    }
}
