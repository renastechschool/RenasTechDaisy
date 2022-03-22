package code.day04;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class c1_ImplicitWait {
    public static void main(String[] args) {
        //1.open browser
        //2.go to the page https://www.vinexponewyork.com/
        //3.click on attend button
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.vinexponewyork.com/");
        //we are giving drriver a option to wait until page loadded
        //as soon as your weblement loadded it will move on next step
        //it is not going to wait until 10 sn
        //if this was thread.sleep no matter it will always wait for 10 sn
        //Implicit wait will effect all code block where we use it
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //3.click on attend button
        driver.findElement(By.cssSelector("a[href='/attend/']")).click();
    }
}
