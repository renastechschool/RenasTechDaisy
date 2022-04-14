package students.Kadir;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import students.Kadir.Utils_lab07.Driver;

public class Lab07_Home_Page {

    @Test()
    public void homePage(){
        String verify= Driver.getDriver().findElement(By.xpath("//td[contains(text(),'Manger Id : mngr392385')]")).getText();
        Assert.assertEquals(verify,"Manger Id : mngr392385");

    }
}
