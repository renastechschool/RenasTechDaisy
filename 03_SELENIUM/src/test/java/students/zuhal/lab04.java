package students.zuhal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class lab04 {
    WebDriver driver;
    //go to http://demo.guru99.com/test/newtours/register.php
//click on country dropdown and select Barbados with Select Method
//Use 3 different Select Method (visible text,index,value)
//and switch to another countries as you wish
    @Test
    public void TC_DropDown() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        WebElement countryDropdown = driver.findElement(By.xpath("//select[@name='country']"));

        Select select= new Select(countryDropdown);
        select.selectByIndex(237);
        Thread.sleep(2000);
        select.selectByVisibleText("AZERBAIJAN");
        Thread.sleep(200);
        select.selectByValue("ARMENIA");


    }
}
