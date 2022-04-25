package students.Margarita;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Lab03 {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://demo.guru99.com/test/radio.html
        driver.get("https://demo.guru99.com/test/radio.html");
        //3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)

        List<WebElement>Checkboxes = driver.findElements(By.id("vfb-6-1"));

        //4. Click to checkbox3
        //5. Verify checkbox3 is selected
        WebElement Checkbox3 = driver.findElement(By.id("vfb-6-2"));
        Checkbox3.click();
        if (Checkbox3.isSelected()){
            System.out.println("Checkbox3 is selected");
        }else
            System.out.println("Checkbox3 is not selected");
    }


}
