package code.day9_properties_JS;

import code.base.TestBase;
import code.utilities.PropertiesReadingUtil;
import code.utilities.SmartBearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class c2_SmartBearPractice extends TestBase {
    //inheritance

    //open chrome browser
    //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //click on box which belongs "charles Dodgeson"
    //click on delete button
    //verify if charles deleted from the list


   @Test
   public void TC1_CharlesDeleteVerification(){
       //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
       driver.get(PropertiesReadingUtil.getProperties("SmartBear_url"));
       SmartBearUtils.logInForSmartBear(driver);
       //click on box which belongs "charles Dodgeson"
       WebElement charlesCheckBox=driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
       charlesCheckBox.click();


       //click on delete button
       WebElement deleteCharles=driver.findElement(By.className("btnDeleteSelected"));
       deleteCharles.click();

       //verify if charles deleted from the list
       //we store all names
       List<WebElement> listOfNames=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

       //verify if charles there
       for(WebElement eachName:listOfNames){
           Assert.assertFalse(eachName.getText().equals("Charles Dodgeson"));
       }

   }


}
