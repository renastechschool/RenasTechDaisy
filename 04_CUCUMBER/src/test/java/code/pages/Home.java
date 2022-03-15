package code.pages;

import code.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static code.utils.BrowserUtils.staticWait;

public class Home extends BrowserUtils {
    public Home(){ PageFactory.initElements(driver,this); }

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNow;


    public void setBuyNow(){
        staticWait(2);
        buyNow.click();
    }

}
