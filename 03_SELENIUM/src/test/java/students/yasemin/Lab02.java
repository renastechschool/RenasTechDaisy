package students.yasemin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("orange");
        driver.findElement(By.name("btnK")).click();

        String expectedTitle="orange";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Passed for orange");
        }else{
            System.out.println("Failed for orange");
            System.out.println(actualTitle);
        }
        driver.navigate().back();

        driver.findElement(By.name("q")).sendKeys("Banana" + Keys.ENTER);

        String expectedTitle2="Banana";
        String actualTitle2=driver.getTitle();

        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("Passed for Banana");
        }else{
            System.out.println("Failed for Banana");
            System.out.println(actualTitle);
        }

        driver.close();
    }
}
