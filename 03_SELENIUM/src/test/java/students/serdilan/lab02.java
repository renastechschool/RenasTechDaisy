package students.serdilan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("orange");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        String expectedTitle="orange";
        String actualTitle=driver.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification has passed");
        }
        else{
            System.out.println("Title verification has failed");
            System.out.println("actualTitle="+actualTitle);
        }
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("banana"+ Keys.ENTER);
        String expectedTitle2="banana";
        String actualTitle2=driver.getTitle();
        if(actualTitle2.contains(expectedTitle2)){
            System.out.println("title passed for Banana");
        }else {
            System.out.println("Banana verification failed");
            System.out.println("actual title:" +actualTitle2);
        }
    }
}
