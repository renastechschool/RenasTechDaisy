package students.zuhal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03 {
    public static void main(String[] args) {
        //1. Open Chrome browser
        //2. Go to https://demo.guru99.com/test/radio.html
        //3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
        //4. Click to checkbox3
        //5. Verify checkbox3 is selected
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkBox2= driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        WebElement checkBox3=  driver.findElement(By.xpath("//input[@type='checkbox'][3]"));

        if (!checkBox1.isSelected()) {

            System.out.println("check box1  verification has passed");

        }
        else {
            System.out.println("checkbox1 verification has failed");
        }
        if (!checkBox2.isSelected()) {

            System.out.println("check box2  verification has passed");
        }
        else {
            System.out.println("checkbox2 verification has failed");
        }
        if (!checkBox3.isSelected()) {

            System.out.println("check box3  verification has passed");
        }
        else {
            System.out.println("checkbox3 verification has failed");
        }
        checkBox3.click();
        if (checkBox3.isSelected()) {

            System.out.println("checkbox3 verification has passed because checkbox3 is clicked");
        }
        else {
            System.out.println("checkbox3 verification has failed because checkbox3 is not  clicked");
        }
    }
}


