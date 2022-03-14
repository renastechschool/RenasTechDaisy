package code.day9_properties_JS;

import code.base.TestBase2;
import code.utilities.BrowserUtils;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c4_driverUtilPractice extends TestBase2 {

    //go to google
    //search for hello
    //veriffy title contains helllo

    @Test
    public void Tc1_practice() throws InterruptedException {
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));
        WebElement searchBox=DriverUtil.getDriver().findElement(By.name("q"));

        String searchItem=PropertiesReadingUtil.getProperties("google_searchData");
        searchBox.sendKeys(searchItem+ Keys.ENTER);


        BrowserUtils.wait(2);
        System.out.println(DriverUtil.getDriver().getTitle());
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(searchItem));
    }
}
