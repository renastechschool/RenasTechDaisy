package code.day09_properties_JS;

import code.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class c3_JSExamples extends TestBase {

    @Test
    public void TC1_handling_Window_with_js_Executer(){
        driver.get("https://www.youtube.com");
        // 1- We create javascriptExecutor object and we cast our WebDriver type instance into JavascriptExecutor type.
        ((JavascriptExecutor)driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://facebook.com','_blank');");

        Set<String> windows=driver.getWindowHandles();

        for(String window:windows){
            driver.switchTo().window(window);
            String currentWindow=driver.getWindowHandle();
            System.out.println("current window="+currentWindow);
            System.out.println("title="+driver.getTitle());
        }
    }

    @Test
    public void scrollDownJS(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.get("http://demo.guru99.com/test/guru99home/");

        js.executeScript("window.scrollBy(0,1000)");

          /*
        The syntax of ScrollBy() methods is :

        executeScript("window.scrollBy(x-pixels,y-pixels)");
        x-pixels is the number at x-axis,
        it moves to the left if number is positive and
        it move to the right if number is negative .
        y-pixels is the number at y-axis,
        it moves to the down if number is positive and
        it move to the up if number is in negative .
         */
    }

}
