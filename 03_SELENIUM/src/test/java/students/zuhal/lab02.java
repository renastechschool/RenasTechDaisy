package students.zuhal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        System.out.println();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("orange");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='gNO89b'][1]")).click();
        String title = driver.getTitle();
        System.out.println(title);
        if(title.startsWith("orange")){
            System.out.println("Verification has passed");
        }
        else{
            System.out.println("Verification has failed");
        }
        driver.navigate().back();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("banana");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='gNO89b'][1]")).click();
        String title2 = driver.getTitle();
        if (title2.contains("banana")){
            System.out.println("Verification has passed");
        }
        else{
            System.out.println("Verification has failed");
        }




    }
}
