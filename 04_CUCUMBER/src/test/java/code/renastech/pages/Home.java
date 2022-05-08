package code.renastech.pages;

import code.renastech.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends BrowserUtils {
    public Home(){ PageFactory.initElements(driver,this); }

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNow;


    public void setBuyNow(){
        staticWait(2);
        buyNow.click();
    }

}
