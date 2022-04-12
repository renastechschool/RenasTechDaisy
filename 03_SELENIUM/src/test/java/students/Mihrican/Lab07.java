package students.Mihrican;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Lab07 {

 /*   ## POM Example TEST - Share Github Link for this
####    Step 1) Go to Guru99 Demo Site   http://demo.guru99.com/V4/
####    Step 2) In Login page check text "Guru99 Bank" is present
####    Step 3) Login into application  with given credentials(you need to enter your email in order to get credentials in advance)
####    Step 4) Verify that the Home page contains text as "Manger Id: mngr368294"
####    Step 5) Click on new customer button and verify you are in New Customer Entry Page
####    Step 6) Fill the information for new customer
####    Step 7) Verify new customer added successfully */

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/");
    }
    @Test
    public void TC1(){
        WebElement guru99Bank=driver.findElement(By.xpath("//h2[contains(text(),'Guru99 Bank')]"));
        Assert.assertTrue(guru99Bank.isDisplayed());
        String userId="mngr398043";
        String password="hupezyh";
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(userId);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        driver.findElement(By.cssSelector("input[value='LOGIN']")).click();

        String verify=driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr398043')]")).getText();
        Assert.assertEquals(verify,"Manger Id : mngr398043");
        driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
        String addNewCostumer=driver.findElement(By.xpath("//p[contains(text(),'Add New Customer')]")).getText();
        Assert.assertEquals(addNewCostumer,"Add New Customer");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mihrican Aydin");
        driver.findElement(By.xpath("//input[@type='radio']")).click();
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("1984-11-01");
        driver.findElement(By.id("message3")).sendKeys("33 flower st");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("North York");
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("ON");
        driver.findElement(By.name("pinno")).sendKeys("123456");
        driver.findElement(By.name("telephoneno")).sendKeys("1234567890");
        driver.findElement(By.cssSelector("input[name='emailid']")).sendKeys("asdfgh@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("asdfgh12");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();

    }

}
