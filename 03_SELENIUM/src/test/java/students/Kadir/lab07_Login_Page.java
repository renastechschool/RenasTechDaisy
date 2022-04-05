package students.Kadir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import students.Kadir.Utils_lab07.ConfigurationsReader;
import students.Kadir.Utils_lab07.Driver;

public class lab07_Login_Page {


    @Test
    public void login(){
        Driver.getDriver().get("http://demo.guru99.com/V4/");
        WebElement guru99Bank=Driver.getDriver().findElement(By.xpath("//h2[contains(text(),'Guru99 Bank')]"));
        Assert.assertTrue(guru99Bank.isDisplayed());
        Driver.getDriver().findElement(By.cssSelector("input[name='uid']")).sendKeys(ConfigurationsReader.getProperty("userId"));
        Driver.getDriver().findElement(By.cssSelector("input[name='password']")).sendKeys(ConfigurationsReader.getProperty("userPassword"));
        Driver.getDriver().findElement(By.cssSelector("input[value='LOGIN']")).click();
    }
}
