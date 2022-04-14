package students.Kadir;
/*## POM Example TEST - Share Github Link for this
####    Step 1) Go to Guru99 Demo Site   http://demo.guru99.com/V4/
####    Step 2) In Login page check text "Guru99 Bank" is present
####    Step 3) Login into application  with given credentials(you need to enter your email in order to get credentials in advance)
####    Step 4) Verify that the Home page contains text as "Manger Id: mngr368294"
####    Step 5) Click on new customer button and verify you are in New Customer Entry Page
####    Step 6) Fill the information for new customer
####    Step 7) Verify new customer added sucessfully*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab07 {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/");
    }
    @Test
    public void Task8(){
        WebElement guru99Bank=driver.findElement(By.xpath("//h2[contains(text(),'Guru99 Bank')]"));
        Assert.assertTrue(guru99Bank.isDisplayed());
        String userId="mngr392385";
        String password="ygAvAsY";
        driver.findElement(By.cssSelector("input[name='uid']")).sendKeys(userId);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        driver.findElement(By.cssSelector("input[value='LOGIN']")).click();

        String verify=driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr392385')]")).getText();
        Assert.assertEquals(verify,"Manger Id : mngr392385");
        driver.findElement(By.cssSelector("a[href='addcustomerpage.php']")).click();
        String addNewCostumer=driver.findElement(By.xpath("//p[contains(text(),'Add New Customer')]")).getText();
        Assert.assertEquals(addNewCostumer,"Add New Customer");
        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Kadir Atug");
        driver.findElement(By.cssSelector("input[value='m']")).click();
        driver.findElement(By.id("dob")).sendKeys("12281991");
        driver.findElement(By.cssSelector("textarea[name='addr']")).sendKeys("123 maint st");
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys("NYC");
        driver.findElement(By.cssSelector("input[name='state']")).sendKeys("NY");
        driver.findElement(By.cssSelector("input[name='pinno']")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[name='telephoneno']")).sendKeys("5182221515");
        driver.findElement(By.cssSelector("input[name='emailid']")).sendKeys("helloWorld123@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("HelloWorld");
        driver.findElement(By.cssSelector("input[value='Submit']")).click();



    }

}
