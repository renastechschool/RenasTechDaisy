# Implicit and  Explicit Wait in Selenium WebDriver
In Selenium, “Waits” play an important role in executing tests. In this tutorial, you will learn various aspects and difference between Implicit and Explicit wait in Selenium.

## Why Do We Need Waits In Selenium?
Most of the web applications are developed using Ajax and Javascript. When a page is loaded by the browser the elements which we want to interact with may load at different time intervals.

Not only it makes this difficult to identify the element but also if the element is not located it will throw an “ElementNotVisibleException” exception. Using Selenium Waits, we can resolve this problem.

Let’s consider a scenario where we have to use both implicit and explicit waits in our test. Assume that implicit wait time is set to 20 seconds and explicit wait time is set to 10 seconds.

Suppose we are trying to find an element which has some “ExpectedConditions “(Explicit Wait), If the element is not located within the time frame defined by the Explicit wait(10 Seconds), It will use the time frame defined by implicit wait(20 seconds) before throwing an “ElementNotVisibleException“.

## Selenium Web Driver Waits

### 1) Implicit Wait
### 2) Explicit Wait

#Implicit Wait in Selenium
The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws a “No Such Element Exception”. The default setting is 0. Once we set the time, the web driver will wait for the element for that time before throwing an exception.

Selenium Web Driver has borrowed the idea of implicit waits from Watir.

In the below example we have declared an implicit wait with the time frame of 10 seconds. It means that if the element is not located on the web page within that time frame, it will throw an exception.

To declare implicit wait in Selenium WebDriver:

Implicit Wait syntax:
```
driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
```
```
package guru.test99;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class AppTest {

	protected WebDriver driver;
	@Test
	public void guru99tutorials() throws InterruptedException 
	{
	System.setProperty ("webdriver.chrome.driver",".\\chromedriver.exe" );
	driver = new ChromeDriver(); 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	String eTitle = "Demo Guru99 Page";
	String aTitle = "" ;
	// launch Chrome and redirect it to the Base URL
	driver.get("http://demo.guru99.com/test/guru99home/" );
	//Maximizes the browser window
	driver.manage().window().maximize() ;
	//get the actual value of the title
	aTitle = driver.getTitle();
	//compare the actual title with the expected title
	if (aTitle.equals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
	//close browser
	driver.close();
}
}
```
Implicit wait will accept 2 parameters, the first parameter will accept the time as an integer value and the second parameter will accept the time measurement in terms of SECONDS, MINUTES, MILISECOND, MICROSECONDS, NANOSECONDS, DAYS, HOURS, etc.

## Explicit Wait in Selenium
The Explicit Wait in Selenium is used to tell the Web Driver to wait for certain conditions (Expected Conditions) or maximum time exceeded before throwing “ElementNotVisibleException” exception. It is an intelligent kind of wait, but it can be applied only for specified elements. It gives better options than implicit wait as it waits for dynamically loaded Ajax elements.

Once we declare explicit wait we have to use “ExpectedConditions” or we can configure how frequently we want to check the condition using Fluent Wait. These days while implementing we are using Thread.Sleep() generally it is not recommended to use.

n the below example, we are creating reference wait for “WebDriverWait” class and instantiating using “WebDriver” reference, and we are giving a maximum time frame of 20 seconds.
## Explicit Wait syntax:
```
WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
package guru.test99;
```
```

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AppTest2 {
protected WebDriver driver;
@Test
public void guru99tutorials() throws InterruptedException
{
System.setProperty ("webdriver.chrome.driver",".\\chromedriver.exe" );
driver = new ChromeDriver();
WebDriverWait wait=new WebDriverWait(driver, 20);
String eTitle = "Demo Guru99 Page";
String aTitle = "" ;
// launch Chrome and redirect it to the Base URL
driver.get("http://demo.guru99.com/test/guru99home/" );
//Maximizes the browser window
driver.manage().window().maximize() ;
//get the actual value of the title
aTitle = driver.getTitle();
//compare the actual title with the expected title
if (aTitle.contentEquals(eTitle))
{
System.out.println( "Test Passed") ;
}
else {
System.out.println( "Test Failed" );
}
WebElement guru99seleniumlink;
guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
guru99seleniumlink.click();
}

}
```

## The following are the Expected Conditions that can be used in Selenium Explicit Wait

### 1) alertIsPresent()
### 2) elementSelectionStateToBe()
### 3)elementToBeClickable()
### 4)elementToBeSelected()
### 5)frameToBeAvaliableAndSwitchToIt()
### 6)invisibilityOfTheElementLocated()
### 7)invisibilityOfElementWithText()
### 8)presenceOfAllElementsLocatedBy()
### 9)presenceOfElementLocated()
### 10)textToBePresentInElement()
### 11)textToBePresentInElementLocated()
### 12)textToBePresentInElementValue()
### 13)titleIs()
### 14)titleContains()
### 15)visibilityOf()
### 16)visibilityOfAllElements()
### 17)visibilityOfAllElementsLocatedBy()
### 18)visibilityOfElementLocated()
