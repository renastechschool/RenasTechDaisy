package students.zelal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab06 {
    public static void main(String[] args) {
//        ## Test website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
//## Test Scenario:
//####      Go to the above URL.

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");

//####      Get the current window’s handle and write to the console window. It must be the first window handle.
        WebElement openWindowButton=driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']"));
        openWindowButton.click();
        driver.getWindowHandle();

//####      Locate the “Visit W3Schools.com!” link and click it.
//####      Get all window handles and hold them in a list.
//####      Write to total window handle number to the console. It must be 2.
//####      Switch t the second window.
//####      Get the current window’s handle and write to the console window. It must be a second window handle.
//####      Check the upper left side logo in the second window.
//####      Go back (Switch) to the first window.
//####      Get the current window’s handle and write to the console window. It must be the first window handle.
//####      Check the See Run Button Text. It must contain “Run >” text.
    }
}
