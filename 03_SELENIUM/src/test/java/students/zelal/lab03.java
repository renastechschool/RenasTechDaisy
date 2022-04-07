package students.zelal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class lab03 {
    public static void main(String[] args) {

//        ####1. Open Chrome browser
//####2. Go to https://demo.guru99.com/test/radio.html
//####3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//####4. Click to checkbox3
//####5. Verify checkbox3 is selected

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        List<WebElement> allcheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));

        boolean checked=false;

        for(WebElement eachCheckbox:allcheckbox){
            if(!eachCheckbox.isSelected()){
                checked=true;
            }else {
                checked= false;
            }
            Assert.assertTrue(checked=true,"hata");

        }
        WebElement checkbox=driver.findElement(By.xpath("//input[@value='checkbox3']"));
        checkbox.click();
        Assert.assertTrue(checkbox.isSelected());




    }
}
