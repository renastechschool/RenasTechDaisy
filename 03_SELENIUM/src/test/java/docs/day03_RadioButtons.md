# Handling Radio buttons
In this section, you will learn how to handle radio buttons in selenium web driver.

Following are the steps to handle the radio buttons:

## Step 1: Invoke the Google Chrome browser.

The code to invoke a Google chrome browser is given below:
```
package mypack;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
public class Class1   
{  
public static void main(String[] args)   
{

        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();  
          
    }  

}  
```
## Step 2: The second step is to navigate to the website in which we need to handle the radio buttons.

I created the html file which contains the radio buttons. The code is given below:
```
<html>  
<head>  
</head>  
<body>  
<input type="radio" name="group1" value="Mango">Mango<br>  
<input type="radio" name="group1" value="Watermelon">Mango<br>  
<input type="radio" name="group1" value="Banana">Mango<br>  
<hr>  
<input type="radio" name="group2" value="Ladyfinger">Ladyfinger<br>  
<input type="radio" name="group2" value="Potato">Potato<br>  
<input type="radio" name="group2" value="Tomato">Tomato<br>  
</body>  
</html>  
```
The code for navigating to the above html file is given below:
```
package mypack;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {  
public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();  
        driver.get("file:///C:/Users/admin/Desktop/radio.html");  
        }  

}  
```

## Step 3: Select the option Banana. We will locate the Banana radio button by inspecting its HTML codes.

There are two ways of handling the radio buttons:

By using the customized path:
The code shown below handles the radio button by using the customized path.
```
package mypack;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {  
public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();  
        driver.get("file:///C:/Users/admin/Desktop/radio.html");  
        driver.findElement(By.xpath("//input[@value='Banana']")).click();  
        }  

}  
```
In the above, we use custom Xpath. Radio buttons contain a unique attribute, i.e., value, so we use the value attribute to handle the radio button.

By handling the radio buttons dynamically.
We will first calculate the number of radio buttons. The following is the line of code which calculates the number of radio buttons.
```
int a = driver.findElements(By.xpath("//input [@name='group1']")).size();
```
The above line of code calculates the number of radio buttons whose name is group1.
Now, we will handle the radio buttons by using the index of a particular radio button.
```
driver.findElements(By.xpath("//input[@name='group1']")).get(2).click();
```