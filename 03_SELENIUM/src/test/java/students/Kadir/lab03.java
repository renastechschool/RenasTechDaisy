package students.Kadir;
/*
* ####1. Open Chrome browser
####2. Go to https://demo.guru99.com/test/radio.html
####3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
####4. Click to checkbox3
####5. Verify checkbox3 is selected*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class lab03 {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");
    }
    @Test
    public void Task4(){
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@name='checkbox']"));
        for (WebElement checkbox : checkboxes) {
            Assert.assertFalse(checkbox.isSelected(), "None of checkBoxes are not selected");
        }
        WebElement checkbox3=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
        checkbox3.click();
        Assert.assertTrue(checkbox3.isSelected() , "CheckBoc3 is selected");


    }
}
