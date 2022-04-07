package students.Ahmet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
####1. Open Chrome browser
####2. Go to https://demo.guru99.com/test/radio.html
####3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
####4. Click to checkbox3
####5. Verify checkbox3 is selected
 */
public class lab3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");

        WebElement checkBox1=driver.findElement(By.id("vfb-6-0"));
        if (!checkBox1.isSelected()) {
            System.out.println("Checkbox1 verification has passed");
        } else {
            System.out.println("Checkbox1 selected verification is failed");
        }
        WebElement checkBox2=driver.findElement(By.id("vfb-6-1"));
        if (!checkBox2.isSelected()) {
            System.out.println("Checkbox2 verification has passed");
        } else {
            System.out.println("Checkbox2 selected verification is failed");
        }
        WebElement checkBox3 = driver.findElement(By.id("vfb-6-2"));
        checkBox3.click();
        // checkbox3 is selected
        if (checkBox3.isSelected()) {
            System.out.println("Checkbox3 Verification has passed");
        } else {
            System.out.println("Checkbox3 Verification has failed");
        }
    }
}