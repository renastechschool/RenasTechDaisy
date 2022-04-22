package students.Margarita;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import students.Kadir.Utils_lab07.ConfigurationsReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Lab07_Loginpage {

    WebDriver driver;

    @Test
    public void setup() throws FileNotFoundException {
        //1) Go to Guru99 Demo Site   http://demo.guru99.com/V4/
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/");

        //2) In Login page check text "Guru99 Bank" is present
        //3) Login into application  with given credentials
        WebElement Guru = driver.findElement(By.className("barone"));
        String TextGuru = Guru.getText();
        if (TextGuru.contains("Guru99 Bank")) {
            System.out.println("Text -Guru99 Bank- is present");
        } else
            System.out.println("Text -Guru99 Bank- is present");

        Properties properties = new Properties();
        String pathForPropertiesFile="Configurations.properties";
        FileInputStream fileInputStream=new FileInputStream(pathForPropertiesFile);
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        WebElement username = driver.findElement(By.name("uid"));
        username.sendKeys(properties.getProperty("username"));
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(properties.getProperty("password"));
        WebElement loginButton = driver.findElement(By.name("btnLogin"));
        loginButton.click();

    }
}