package code.day8;

import code.utilities.SmartBearUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_WebTablePractice {


    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Test
    public void TC1_StreetVerification(){
        SmartBearUtils.logInForSmartBear(driver);
        Assert.assertEquals(driver.getTitle(),"Web Orders");
    }

    @Test(dataProvider = "TestDataForStreetName")
    public void TC2_streetVerification(String streetName){
        SmartBearUtils.logInForSmartBear(driver);
        SmartBearUtils.verifyStreet(driver,streetName);
    }

    @DataProvider(name="TestDataForStreetName")
    public static Object [][] test(){
        return new Object[][]{
                {"17, Park Avenue"},
                {"44, Nibluck"},
                {"hello world"},
                {"Hey Ahmet"}};
    }
}
