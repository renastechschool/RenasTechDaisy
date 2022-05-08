package students.ogun.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import students.ogun.Utils.configurationReader;
import students.ogun.Utils.driver;

public class login_page {

    @Test
    public void tc1(){

        driver.getDriver().get(configurationReader.getProperties("url"));
        WebElement header= driver.getDriver().findElement(By.xpath("//h2[@class='barone']"));
        Assert.assertTrue(header.isDisplayed());
        WebElement userid =driver.getDriver().findElement(By.name("uid"));
        WebElement password = driver.getDriver().findElement(By.name("password"));
        userid.sendKeys(configurationReader.getProperties("username"));
        password.sendKeys(configurationReader.getProperties("password"));
        driver.getDriver().findElement(By.name("btnLogin")).click();

    }
}
