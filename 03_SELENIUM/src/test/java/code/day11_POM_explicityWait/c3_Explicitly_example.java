package code.day11_POM_explicityWait;

import code.Pages.SeleniumPracticeExplicitlyWaitPage;
import code.base.TestBase2;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c3_Explicitly_example extends TestBase2 {

//go tto http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
    //click on timer
    //verify webdriver text gets presenttt


 SeleniumPracticeExplicitlyWaitPage seleniumPracticeExplicitlyWaitPage;
    @Test
    public void TC1_practice(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("selenium_practice_url"));
        seleniumPracticeExplicitlyWaitPage=new SeleniumPracticeExplicitlyWaitPage();
        seleniumPracticeExplicitlyWaitPage.getDefaultText();
        seleniumPracticeExplicitlyWaitPage.clickTimerButton();

        WebElement actualText=seleniumPracticeExplicitlyWaitPage.getWebDriverText();

        Assert.assertEquals(actualText.getText(),"WebDriver","WebDriver verification has failed!");
    }

}
