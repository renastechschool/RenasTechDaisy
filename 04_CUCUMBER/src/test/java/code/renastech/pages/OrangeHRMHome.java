package code.renastech.pages;
import code.renastech.utils.BrowserUtils;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrangeHRMHome extends BrowserUtils {
    public OrangeHRMHome(){ PageFactory.initElements(driver,this); }


    private static final Logger logger= Logger.getLogger(OrangeHRMHome.class);

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    private WebElement dashboardMessage;
    @FindBy(id = "menu_pim_viewPimModule")
    private WebElement PIM;
    @FindBy(id = "menu_pim_addEmployee")
    private WebElement addEmployee;
    @FindBy(id = "firstName")
    private WebElement Name;
    @FindBy(id = "lastName")
    private WebElement LastName;
    @FindBy(id = "btnSave")
    private WebElement saveButton;
    @FindBy(xpath = "//h1[.='Personal Details']")
    private WebElement ProfileHeader;
    @FindBy(id = "chkLogin")
    private WebElement detailsBox;
    @FindBy(id = "user_name")
    private WebElement name2;
    @FindBy(id = "user_password")
    private WebElement password;
    @FindBy(id = "re_password")
    private WebElement repassword;
    @FindBy(id = "status")
    private WebElement status;



    public void setDashboardMessage(){
        Assert.assertEquals("Dashboard",dashboardMessage.getText());
    }
    public void setPIM(){ PIM.click(); }
    public void setAddEmployee(){ addEmployee.click(); }
    public void setName(String name){ Name.sendKeys(name); }
    public void setLastName(String lastname){ LastName.sendKeys(lastname); }
    public void setSaveButton(){ clickWithWait(saveButton); }
    public void setProfileHeader(String expectedHeader){
        Assert.assertEquals(expectedHeader,ProfileHeader.getText());
    }
    public void setDetailsBox(){ clickWithWait(detailsBox); }
    public void setName2(String Name2){ name2.sendKeys(Name2); }
    public void setPassword(String Password){password.sendKeys(Password);}
    public void setRepassword(String Repassword){repassword.sendKeys(Repassword);}
    public void setStatus(String Status){
        BrowserUtils.selectFromDropDown(status,Status);
        logger.info("Status is passed");
    }
}
