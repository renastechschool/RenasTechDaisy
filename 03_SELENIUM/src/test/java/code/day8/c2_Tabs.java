package code.day8;

import code.base.TestBase;
import code.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class c2_Tabs extends TestBase {
    //we use inheritance here

    @Test
    public void TC1_TabHandle() throws InterruptedException {
        driver.get("https://renas-practice.herokuapp.com/home");
        //click on elements
        driver.findElement(By.id("selenium-Elements")).click();
        // click on windows
        driver.findElement(By.id("WindowsII")).click();

        String currentWindow=driver.getWindowHandle();//this will store only one window

        System.out.println("current window: "+currentWindow);
        System.out.println("get Title: "+driver.getTitle() );

        WebElement openTabButton=driver.findElement(By.id("open-tab"));
        openTabButton.click();

        System.out.println("after clicking tab button title:"+driver.getTitle());

        Set<String> allwindows=driver.getWindowHandles(); //this will store all tabs(windows)
        for(String tab:allwindows){
            driver.switchTo().window(tab);
            BrowserUtils.wait(2);
            System.out.println(driver.getTitle());

        }

    }

}
