package code.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SeleniumPracticeExplicitlyWaitPage extends BasePage {

    @FindBy(xpath = "//button[@onclick='timedText()']")
    public WebElement timerButton;
    @FindBy(id="demo")
    public WebElement DefaultText;
    @FindBy(xpath = "//p[.='WebDriver']")
    public WebElement webDriverText;


    public void clickTimerButton(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(timerButton)).click();
    }

    public void getDefaultText(){
        System.out.println("default text is:"+DefaultText.getText());
    }

    public WebElement getWebDriverText(){
        webDriverWait.until(ExpectedConditions.visibilityOf(webDriverText));
        return webDriverText;

    }







}
