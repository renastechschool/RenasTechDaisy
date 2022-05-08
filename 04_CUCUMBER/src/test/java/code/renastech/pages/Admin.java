package code.renastech.pages;

import code.renastech.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin extends BrowserUtils {
    public Admin(){ PageFactory.initElements(driver,this); }



    @FindBy(id = "menu_admin_viewAdminModule")
    private WebElement adminModule;
    @FindBy(id = "menu_admin_nationality")
    private WebElement NationalitiesSection;
    @FindBy(id = "btnAdd")
    private WebElement addNationButton;
    @FindBy(id = "nationality_name")
    private WebElement addNationBox;
    @FindBy(id = "btnSave")
    private WebElement saveButton;

    public void setAdminModule(){ clickWithWait(adminModule); }
    public void setNationalitiesSection(){ clickWithWait(NationalitiesSection); }
    public void setAddNationButton(){clickWithWait(addNationButton);}
    public void setAddNationBox(String nationName){ enterText(addNationBox,nationName); }
    public void setSaveButton(){ clickWithWait(saveButton); }

}
