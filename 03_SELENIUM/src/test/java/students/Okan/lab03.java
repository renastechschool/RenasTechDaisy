package students.Okan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*
####1. Open Chrome browser
####2. Go to https://demo.guru99.com/test/radio.html
####3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
####4. Click to checkbox3
####5. Verify checkbox3 is selected
 */
public class lab03 {
    WebDriver driver;
    int count=0;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void lab03(){
        driver.get("https://demo.guru99.com/test/radio.html");
        List<WebElement> CheckBoxs=driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement checkbox:CheckBoxs){
            if(checkbox.isSelected()){
                count++;
            }
        }
        if(count==0){
            System.out.println("There is NO Checkbox selected on the list");
        }else
            System.out.println("Checkbox is SELECTED");
        System.out.println("--------------------------------------------");
       WebElement C3= driver.findElement(By.id("vfb-6-2"));
       C3.click();
       if(C3.isSelected()){
           System.out.println("Checkbox 3 is selected successfully!!!");
       }
    }

}
