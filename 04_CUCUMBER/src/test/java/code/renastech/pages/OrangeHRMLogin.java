package code.renastech.pages;

import code.renastech.utils.BrowserUtils;
import code.renastech.utils.ConfigurationsReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrangeHRMLogin extends BrowserUtils {
    public OrangeHRMLogin(){ PageFactory.initElements(driver,this); }

    @FindBy(id = "txtUsername")
    private WebElement username;
    @FindBy(id = "txtPassword")
    private WebElement password;
    @FindBy(id = "btnLogin")
    private WebElement loginbutton;

    public void setUsername(){ username.sendKeys(ConfigurationsReader.getProperties("username")); }
    public void setPassword(){
        password.sendKeys(ConfigurationsReader.getProperties("password"));
    }
    public void setLoginbutton(){
        loginbutton.click();
    }

    public void setDataFromExcel(String Username,String Password){
        username.sendKeys(Username);
        password.sendKeys(Password);
        loginbutton.click();

    }
}
