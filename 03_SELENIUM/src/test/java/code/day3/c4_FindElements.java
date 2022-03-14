package code.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class c4_FindElements {
    public static void main(String[] args) {
        //1. Open Chrome browser
        //2. Go to https://www.apple.com
        //3. Click to iPhone
        //4. Print out the texts of all links

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.apple.com");
        driver.manage().window().maximize();

        //3. Click to iPhone
        //xpath has abilty to go also from child parent
        driver.findElement(By.xpath("//span[.='iPhone']/..")).click();

        //4. Print out the texts of all links
        //print out all links
        //count of links that doesnt have text
        //count of links that has text
        //a tag has all the link
        //I am using tag name locator
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));

        int linkWithText=0;
        int linkWithoutText=0;

        for(WebElement eachLink:allLinks){
            String elementToText=eachLink.getText();
            System.out.println(elementToText);

            if(elementToText.isEmpty()){
                linkWithoutText++;
            }else {
                linkWithText++;
            }

        }
        System.out.println("link With Text="+linkWithText);
        System.out.println("link Without Text="+linkWithoutText);
        System.out.println("all the link size="+allLinks.size());

    }
}
