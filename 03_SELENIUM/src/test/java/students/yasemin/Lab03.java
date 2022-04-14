package students.yasemin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Lab03 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(" https://demo.guru99.com/test/radio.html");
        WebElement checkbox1= driver.findElement(By.xpath("//input[@value='checkbox1']"));
        if(!checkbox1.isSelected()) {
            System.out.println("checkbox1 verification passed");
        }
        else {
            System.out.println("checkbox1 verification failed");}
        WebElement checkbox2= driver.findElement(By.xpath("//input[@value='checkbox2']"));
        checkbox2.click();
        if(checkbox2.isSelected()) {
            System.out.println("checkbox2 verification passed");
        }
        else {
            System.out.println("checkbox2 verification failed");}
        driver.quit();

    }


}



