package code.day05;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class c3_Dropdown {
    //task1
    //1. Open Chrome browser
    //2. Go to "http://the-internet.herokuapp.com/"
    //3 click on dropdown
    //confirm default selected dropdown is "Please select an option"
    //task2
    //1. Open Chrome browser
    //2. Go to "http://the-internet.herokuapp.com/"
    //3 click on dropdown
    //choose  option 2 from dropdown
    //choose option 1 from dropdown
    //choose option 2 from dropdown

    WebDriver driver;

    @BeforeClass
    public void beforeClass(){ System.out.println("Before class is running"); }
    @AfterClass
    public void AfterClass(){ System.out.println("After class is running"); }
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/");
    }
    @Test
    public void TC1_verifyDefaultOptionInDropdown(){
        System.out.println("TC1 is running");
        //2. Go to "http://the-internet.herokuapp.com/" //done
        //3 click on dropdown
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();

        //confirm default selected dropdown is "Please select an option"
        WebElement dropDownBox=driver.findElement(By.id("dropdown"));
        //we use select method here
        Select dropdown=new Select(dropDownBox);

        String defaultOption=dropdown.getFirstSelectedOption().getText();
        String expectedDefault="Please select an option";

        System.out.println("default option is:"+defaultOption);
        Assert.assertEquals(defaultOption,expectedDefault,"default option not\"Please select an option\"");

    }
    @Test
    public void TC2_verifyOptionFromDropdown() throws InterruptedException {
        System.out.println("TC2 is running");
        //task2
        //1. Open Chrome browser   done
        //2. Go to "http://the-internet.herokuapp.com/"  done
        //3 click on dropdown
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();

        //select dropdowns are created by using <Select> tag in HTML
        //and if it is select dropdown you can handle by using Select class
        WebElement dropDownBox=driver.findElement(By.id("dropdown"));
        Select dropDown=new Select(dropDownBox);
        Thread.sleep(2000);
        //choose option2
        dropDown.selectByVisibleText("Option 2");
        Thread.sleep(2000);
        //choose option1
        dropDown.selectByValue("1");
        Thread.sleep(2000);
        //choose option2
        dropDown.selectByIndex(2);

    }

    @AfterMethod
    public void closing(){
        driver.close();
    }
}
