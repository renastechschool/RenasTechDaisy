package students.Sara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class lab06 {
    @Test
void tc1() {
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");

    String curWind = driver.getWindowHandle();
    System.out.println("current window handle is: " + curWind);

    WebElement w3SFrame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
    driver.switchTo().frame(w3SFrame);
    driver.findElement(By.xpath("//a[.='Visit W3Schools.com!']")).click();

    Set<String> allWindHandles = driver.getWindowHandles();
    List<String> windowsList = new ArrayList();

    System.out.println(allWindHandles.size() + " is the # of window handles");

    for (String newWin : allWindHandles) {
        windowsList.add(newWin);
        driver.switchTo().window(newWin);
    }

    WebDriver childWind2= driver.switchTo().window(windowsList.get(1));
    String childWind2Handle= childWind2.getWindowHandle();
    System.out.println("after switch the child window handle is: " +childWind2Handle );


    WebElement logoButton = driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
    Assert.assertTrue(logoButton.isDisplayed(), "logo button not present on page");

    driver.switchTo().window(curWind);
    String presentWindHan = driver.getWindowHandle();
    System.out.println("current window handle is : " + presentWindHan);

    Assert.assertEquals(presentWindHan, curWind);

    WebElement runButton = driver.findElement(By.id("runbtn"));
    String runButtonTex = runButton.getText();
    System.out.println(runButtonTex);
    Assert.assertTrue(runButtonTex.contains("Run ❯"), "run button tex not match");


}
}
