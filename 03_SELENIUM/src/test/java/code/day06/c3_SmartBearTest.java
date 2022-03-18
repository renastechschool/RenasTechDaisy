package code.day06;

import code.utilities.SmartBearUtils;
import code.utilities.WebDriverUtil;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c3_SmartBearTest {
    //1- Open a chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- Login
    //4. Click on Order
    //5. Select familyAlbum from product, set quantity to 5
    //6. Click to “Calculate” button
    //7. Fill address Info with JavaFaker
    //8. Click on “visa” radio button
    //9. Generate card number using JavaFaker
    //10Enter expiration date
    //11. Click on “Process”
    //12.Verify success message “New order has been successfully

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        //1- Open a chrome browser
        //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //3- Login
        SmartBearUtils.logInForSmartBear(driver);
    }

    @Test
    public void TC1(){
//4. Click on Order
        WebElement orderLink=driver.findElement(By.xpath("//a[.='Order']"));
        orderLink.click();
        //5. Select familyAlbum from product, set quantity to 5
        Select dropDownProduct= new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        dropDownProduct.selectByVisibleText("FamilyAlbum");

        WebElement quantity=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
       quantity.sendKeys(Keys.BACK_SPACE);
       //you can use quantity.clear method
        quantity.sendKeys("5");
        //6. Click to “Calculate” button
        WebElement CalculateButton=driver.findElement(By.xpath("//input[@value='Calculate']"));
        CalculateButton.click();

        //7. Fill address Info with JavaFaker
        Faker faker=new Faker();
        WebElement customerName=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement streetName=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement city=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement state= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zip=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        customerName.sendKeys(faker.name().fullName());
        streetName.sendKeys(faker.address().streetAddress());
        city.sendKeys(faker.address().cityName());
        state.sendKeys(faker.address().state());
        zip.sendKeys(faker.address().zipCode().replaceAll("-",""));

        //8. Click on “visa” radio button

        WebElement visaButton=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaButton.click();
        //9. Generate card number using JavaFaker
        WebElement cardNumber=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));
        //10Enter expiration date
        WebElement exp=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']"));
        exp.sendKeys("02/24");
        //11. Click on “Process”
        WebElement processButton=driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processButton.click();

        //12.Verify success message “New order has been successfully added.” is displayed.
        WebElement successMessage=driver.findElement(By.xpath("//strong"));

        Assert.assertEquals(successMessage.getText(),"New order has been successfully added.");
    }

}
