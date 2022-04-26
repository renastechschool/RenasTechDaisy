package students.Ikbal;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class Lab003 {
    /*####1. Open Chrome browser
####2. Go to https://demo.guru99.com/test/radio.html
####3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
####4. Click to checkbox3
####5. Verify checkbox3 is selecte*/




        WebDriver driver;
        @BeforeMethod
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        @Test
        public void tc2(){
            driver.get("https://demo.guru99.com/test/radio.html");
            List<WebElement> chkbx=driver.findElements(By.xpath("//input[@type='checkbox']"));


            for (WebElement element:chkbx){
                if (element.isSelected()){
                    System.out.println("Checkboxs have already been explored");
                }else System.out.println("checkboxs are innocent");
            }
            WebElement box3 = driver.findElement(By.id("vfb-6-2"));
            box3.click();
            boolean chckbx3 = box3.isSelected();
            if (chckbx3){
                System.out.println("Box selection is passed");
            }else System.out.println("Give up, please");

        }
}
