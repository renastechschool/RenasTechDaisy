package code.day7;

import code.utilities.SmartBearUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c4_SmartBearNegativeTest {
    //1- Open a chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- enter incorrect username
    //4- enter wrong password
    //5- click login button
    //6- verify error message displayed :Invalid Login or Password.
    //Note : create another utils method under SmartBearUtil class called negativeLoginForSmartBear
    //this method should cover step3,4,5

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Test(dataProvider ="testData")
    public void TC1_NegativeTest(String userID, String passwordID){
        SmartBearUtils.negativeLoginForSmartBear(driver,userID,passwordID);

        //6- verify error message displayed :Invalid Login or Password.
        WebElement errorMessage=driver.findElement(By.className("error"));
        Assert.assertTrue(errorMessage.isDisplayed());

    }

    @DataProvider(name = "testData")
    public static Object[][] wrongUserCredentials(){

        return new Object[][]{
                {"Zelal", "test"},
                {"Ogun","mike"},
                {"Sara","Tester"},
                {"Eren","Kefo"},
                {"Tester","test"}

        };



    }



}
