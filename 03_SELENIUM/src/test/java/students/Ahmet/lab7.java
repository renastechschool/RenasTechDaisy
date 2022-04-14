package students.Ahmet;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

/*
## POM Example TEST - Share Github Link for this
####    Step 1) Go to Guru99 Demo Site   http://demo.guru99.com/V4/
####    Step 2) In Login page check text "Guru99 Bank" is present
####    Step 3) Login into application  with given credentials(you need to enter your email in order to get credentials in advance)
####    Step 4) Verify that the Home page contains text as "Manger Id: mngr368294"
####    Step 5) Click on new customer button and verify you are in New Customer Entry Page
####    Step 6) Fill the information for new customer
####    Step 7) Verify new customer added successfully


##//    Hint-TestNG :
####  //Pages : In this task you will need to create 3 pages class
           //First one for login page where you need to locate : username,password,Login and Guru99 Bank text
            //Second page is for home page, and you need to locate : text Manger Id
            //Third page is for New Customer Entry Page where you need to locate : customer information boxes such as name,adrees,gender,email,password etc.
####        //Configuration File
            //store username,password , and url
####        //Utils
            //use our ready utils such as readingproperties,driver, browser utils
####        //Base
            //use our ready testbase classes.
####        //Testing
            // while testing first you will verify "Guru99 Bank" is present
            // then you need to Log in into application
            // then verify Home page contains text as "Manger Id: mngr368294"
            // click on new customer tab then verify title contains New Customer Entry Page
            // fills all information to be able to create a customer
            // verify the message customer registered successfully.
 */
public class lab7 {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
    }

    @Test
    public void TC1_guru(){
        WebElement element = driver.findElement(By.xpath("//h2[@class='barone']"));
        String actualText = element.getText();
        String expectedText = "Guru99 Bank";
        Assert.assertEquals(actualText, expectedText, "Failed.Guru99 Bank is not present");
        System.out.println("Visible Text: " + actualText);

        WebElement ID = driver.findElement(By.xpath("//input[@type='text']"));
        ID.sendKeys("mngr397424");
        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("tyreqAz");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        WebElement visibleTx = driver.findElement(By.xpath("//td[.='Manger Id : mngr397424']"));
        Assert.assertTrue(visibleTx.getText().contains("Manger Id : mngr397424"), "Failed. Home Page doesn't contain Manger Id : mngr397424");
        System.out.println("VisibleTx: " + visibleTx.getText());

        WebElement newCustomer = driver.findElement(By.xpath("//a[@href='addcustomerpage.php']"));
        newCustomer.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Guru99 Bank New Customer Entry Page";
        Assert.assertEquals(actualTitle, expectedTitle, "Title verification is failed");

        WebElement Id = driver.findElement(By.xpath("//input[@type='text']"));
        Id.sendKeys("George");
        WebElement Gender = driver.findElement(By.xpath("//input[@type='radio']"));
        Gender.click();
        WebElement DateOfBirth = driver.findElement(By.xpath("//input[@type='date']"));
        DateOfBirth.sendKeys("05/25/1990");
        WebElement Address = driver.findElement(By.name("addr"));
        Address.sendKeys("171 Park Avenue");
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("New York City");
        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("New York");
        WebElement Pin = driver.findElement(By.name("pinno"));
        Pin.sendKeys("123456");
        WebElement phoneNumber = driver.findElement(By.name("telephoneno"));
        phoneNumber.sendKeys("0123456789");
        WebElement email = driver.findElement(By.name("emailid"));
        email.sendKeys("info10@renastech.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("12345renas");
        WebElement submitButton = driver.findElement(By.name("sub"));
        submitButton.click();

        WebElement success = driver.findElement(By.xpath("//p[.='Customer Registered Successfully!!!']"));
        String actual = success.getText();
        String expected = "Customer Registered Successfully!!!";
        Assert.assertEquals(actual, expected, "Customer added verification has failed.");

    }

    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
     }
}