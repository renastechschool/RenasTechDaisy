# Selenium WebDriver- Handling drop-downs
In this section, you will learn how to handle drop-downs in Selenium WebDriver.

Before proceeding with this section, let us first understand some of the basics of handling drop-downs in Selenium WebDriver.

## Select in Selenium WebDriver
The 'Select' class in Selenium WebDriver is used for selecting and deselecting option in a dropdown. The objects of Select type can be initialized by passing the dropdown webElement as parameter to its constructor.
```
WebElement testDropDown = driver.findElement(By.id("testingDropdown"));  
Select dropdown = new Select(testDropDown);  
```
### How to select an option from drop-down menu?

WebDriver provides three ways to select an option from the drop-down menu.

### 1. selectByIndex - 
It is used to select an option based on its index, beginning with 0.
```
dropdown.selectByIndex(5);
```
### 2. selectByValue - 
It is used to select an option based on its 'value' attribute.
```
dropdown.selectByValue("Database");
```
### 3. selectByVisibleText - 
It is used to select an option based on the text over the option.
```
dropdown.selectByVisibleText("Database Testing");  
```
### Let us consider a test case in which we will automate the following scenarios:

### 1)
Invoke Google Chrome Browser
### 2)
Open URL: https://www.testandquiz.com/selenium/testing.html
### 3)
Select the option "Database Testing" from the drop-down menu
### 4)
Close the browser

### Here is the sample code to set system property for Chrome driver:
```
// System Property for Chrome Driver   
System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe"); 
``` 

### We will create our test case step by step in order to give you a complete understanding of how to handle drop-downs in WebDriver.  This is where the instructor will take over and initiate the instructions online.
