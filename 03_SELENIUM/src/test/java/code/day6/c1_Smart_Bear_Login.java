package code.day6;

import code.utilities.BrowserUtils;
import code.utilities.SmartBearUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_Smart_Bear_Login {
    //1- Open a chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- Enter username --->Tester
    //4- Enter password --->test
    //5- Click “Login” button
    //6- Verify title equals: Web Orders

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        //1- Open a chrome browser
        //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @AfterMethod
    public void closing() throws InterruptedException {
        BrowserUtils.wait(2);
       // driver.close();
    }

    @Test
    public void TC1_LoginVerification(){
        //3- Enter username --->Tester
        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        //4- Enter password --->test
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        //5- Click “Login” button
        WebElement login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();

        //6- Verify title equals: Web Orders
        String actualTitle= driver.getTitle();
        String expectedTitle="Web Orders";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void TC2_LoginVerification(){
        SmartBearUtils.logInForSmartBear(driver);
        //6- Verify title equals: Web Orders
        Assert.assertTrue(driver.getTitle().equals("Web Orders"),"Login failed!!");
    }
}
