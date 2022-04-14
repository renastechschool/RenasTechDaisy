package code.day08;

import code.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class c3_Windows extends TestBase {


    @Test
    public void TC1_MultiWindows(){
        driver.get("https://renas-practice.herokuapp.com/home");
        //click on elements
        driver.findElement(By.id("selenium-Elements")).click();

        // click on windows
        driver.findElement(By.id("WindowsII")).click();

        System.out.println("Before Clicking new window title:"+driver.getTitle());

        WebElement openWindowButton=driver.findElement(By.id("open-window"));
        openWindowButton.click();
        //After clicking, now we have 2 windows
        //be able to work on second window change selenium focus on next window

        Set<String> allWindows=driver.getWindowHandles();//store all windows

        List<String>windowList=new ArrayList<>();
        for(String NewWindow:allWindows){
            windowList.add(NewWindow);
            driver.switchTo().window(NewWindow);
            System.out.println("after switch get title: "+driver.getTitle());
        }

        driver.switchTo().window(windowList.get(1));
        System.out.println("after switching get title "+driver.getTitle());

        //click on second windows contact link
        //span[.='Contact']
        //span[.='Contact'])[1]
                // (//span[.='Contact' and @class='elementor-icon-list-text'])[1]
        driver.findElement(By.xpath("(//span[.='Contact' and @class='elementor-icon-list-text'])[1]")).click();

    }

}
