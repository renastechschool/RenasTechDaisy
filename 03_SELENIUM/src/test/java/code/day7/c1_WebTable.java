package code.day7;

import code.utilities.SmartBearUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_WebTable {
//    Smartbear software street verification
//       1. Open browser and login to Smartbear software
//       2. Click on View all orders
//       3. Verify Mark Smith has street as  “9, Maple Valley”

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        //1- Open a chrome browser
        //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //Login
        SmartBearUtils.logInForSmartBear(driver);

    }

    @Test
    public void TC1_VerifyMarkStreetName(){

        //       3. Verify Mark Smith has street as  “9, Maple Valley”
        WebElement markStreet=driver.findElement(By.xpath("//td[.='770077007700']//..//td[6]"));
        System.out.println("mark street name="+markStreet.getText());

        String actualStreet=markStreet.getText();
        String expected="9, Maple Valley";

        Assert.assertEquals(actualStreet,expected,"street name verification has failed");




    }


}
