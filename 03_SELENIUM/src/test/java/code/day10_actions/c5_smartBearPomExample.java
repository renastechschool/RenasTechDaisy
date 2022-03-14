package code.day10_actions;

import code.Pages.SmartBearLoginPage;
import code.base.TestBase2;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import org.testng.annotations.Test;

public class c5_smartBearPomExample extends TestBase2 {


    SmartBearLoginPage smartBearLoginPage;

    @Test
    public void TC1_smartBearPositiveVerification(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));

        smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username"),
                PropertiesReadingUtil.getProperties("SmartBear_password"));




    }
}
