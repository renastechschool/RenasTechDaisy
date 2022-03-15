package code.pages;

import code.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMHome extends BrowserUtils {
    public OrangeHRMHome(){ PageFactory.initElements(driver,this); }

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    private WebElement dashboardMessage;


    public void setDashboardMessage(){
        Assert.assertEquals("Dashboard",dashboardMessage.getText());
    }
}
