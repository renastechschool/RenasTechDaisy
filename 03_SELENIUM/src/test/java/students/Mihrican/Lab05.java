package students.Mihrican;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Lab05 {

/*          #### Step 1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
            #### Step 2) Enter Any Customer id.
            #### Step 3) After entering the customer ID, Click on the “Submit” button.
            #### Step 4) Reject/accept the alert.
            */

    public class Alerts {

        WebDriver driver;
        @BeforeMethod
        public void setUp()
        {
            driver= WebDriverUtil.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://demo.guru99.com/test/delete_customer.php");
        }
        @Test
        public void Alert1()
        {
            driver.findElement(By.name("cusid")).sendKeys("76767676");
            driver.findElement(By.name("submit")).click();

            Alert alert =driver.switchTo().alert();
            alert.dismiss();
        }
    }
}

