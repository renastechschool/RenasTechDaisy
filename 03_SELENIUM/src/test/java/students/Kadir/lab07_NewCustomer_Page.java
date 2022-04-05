package students.Kadir;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import students.Kadir.Utils_lab07.ConfigurationsReader;
import students.Kadir.Utils_lab07.Driver;

public class lab07_NewCustomer_Page {

    @Test()
    public void addNewCustomer(){
        Driver.getDriver().findElement(By.cssSelector("a[href='addcustomerpage.php']")).click();
        Driver.getDriver().findElement(By.cssSelector("a[href='addcustomerpage.php']")).click();
        String addNewCostumer=Driver.getDriver().findElement(By.xpath("//p[contains(text(),'Add New Customer')]")).getText();
        Assert.assertEquals(addNewCostumer,"Add New Customer");
        Driver.getDriver().findElement(By.cssSelector("input[name='name']")).sendKeys(ConfigurationsReader.getProperty("CustomerName"));
        Driver.getDriver().findElement(By.cssSelector("input[value='m']")).click();
        Driver.getDriver().findElement(By.id("dob")).sendKeys(ConfigurationsReader.getProperty("DOB"));
        Driver.getDriver().findElement(By.cssSelector("textarea[name='addr']")).sendKeys(ConfigurationsReader.getProperty("Address"));
        Driver.getDriver().findElement(By.cssSelector("input[name='city']")).sendKeys(ConfigurationsReader.getProperty("City"));
        Driver.getDriver().findElement(By.cssSelector("input[name='state']")).sendKeys(ConfigurationsReader.getProperty("State"));
        Driver.getDriver().findElement(By.cssSelector("input[name='pinno']")).sendKeys(ConfigurationsReader.getProperty("Pin"));
        Driver.getDriver().findElement(By.cssSelector("input[name='telephoneno']")).sendKeys(ConfigurationsReader.getProperty("MobileNumber"));
        Driver.getDriver().findElement(By.cssSelector("input[name='emailid']")).sendKeys(ConfigurationsReader.getProperty("Email"));
        Driver.getDriver().findElement(By.cssSelector("input[name='password']")).sendKeys(ConfigurationsReader.getProperty("Password"));
        Driver.getDriver().findElement(By.cssSelector("input[value='Submit']")).click();
    }
}
