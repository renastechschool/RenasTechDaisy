package code.day4;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class c3_radio_Buttons {
    public static void main(String[] args) {
        // Navigate to https://courses.letskodeit.com/practice
        // click on BMW RADIO button
        //   verify that its selected

        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // click on BMW RADIO button
        WebElement BMWRadioButton=driver.findElement(By.xpath("//input[@id='bmwradio']"));
        BMWRadioButton.click();

        boolean bmwRadioSelected=BMWRadioButton.isSelected();
        if(bmwRadioSelected){
            System.out.println("Bmw is selected");
        }else {
            System.out.println("BMW is not selected, verification has failed");
        }

        //Verify that Honda is not selected
        WebElement HondaButton=driver.findElement(By.id("hondaradio"));
        if (!HondaButton.isSelected()){
            System.out.println("Honda is not selected, test passed");

        }else {
            System.out.println("Honda button is selected, test failed");
        }

    }
}
