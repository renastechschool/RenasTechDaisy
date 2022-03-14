package code.day10_actions;

import code.base.TestBase2;
import code.utilities.BrowserUtils;
import code.utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class c2_Dropdown extends TestBase2 {


    @Test
    public void TC1_test() throws InterruptedException {
        DriverUtil.getDriver().get("https://exchange.sandbox.gemini.com/register/institution");
        WebElement dropdown=DriverUtil.getDriver().findElement(By.id("countryDropdown"));

        dropdown.sendKeys("Canada");
        BrowserUtils.wait(4);
        dropdown.sendKeys(Keys.ARROW_DOWN);
        dropdown.sendKeys(Keys.ENTER);

    }
}
