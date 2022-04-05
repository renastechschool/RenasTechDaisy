package students.serdilan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class lab03 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
        List<WebElement> listOfCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement element:listOfCheckbox){
            if (element.isSelected()){
                System.out.println("checkbox is selected");
            }
            else
                System.out.println("all the checkboxs are not selected");
        }
      WebElement checkbox3=driver.findElement(By.id("vfb-6-2"));
        checkbox3.click();
        boolean ischeckbox3Selected=checkbox3.isSelected();
        if(ischeckbox3Selected)
        {
            System.out.println("Checkbox3 verification has passed");
    }else {
        System.out.println("Checkbox3 is not selected");
    }
    }
}
