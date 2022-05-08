package students.HasanTasdemir;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class lab03 {


    @Test
    public void TC_Lab03(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement all:checkBoxes){
            if(!all.isSelected()){
                System.out.println("there is no selected checkbox");
            }
        }

        WebElement checkBox3 = driver.findElement(By.id("vfb-6-2"));
        checkBox3.click();
        if (checkBox3.isSelected()){
            System.out.println("Checkbox 3 is successfully selected");
        }
        driver.quit();
    }
}
