# Selenium Locators

Selenium WebDriver- Locating Strategies
Just like Selenium IDE, WebDriver uses the same set of locating strategies for specifying location of a particular web element.

Since, we are using WebDriver with java; each locating strategy has its own command in Java to locate the web elements.
Following are the types of locators supported by Selenium Webdriver:



### 1. ID       
driver.findElement(By.id(<Element ID>))
### 2. Name
driver.findElement(By.name(<Element name>))
### 3. Class Name
driver.findElement(By.className(<ElementClass>))
### 4. TagName
driver.findElement(By.Tagname(<htmltagname>))
### 5. LinkText 
driver.findElement(By.partialLinkText(<linktext>))
### 6. PartialLinkText
driver.findElement(By.id(<ElementID>))
### 8. CSS Selector
driver.findElement(By.cssSelector(<cssSelector>))
### 9. Xpath
driver.findElement(By.xpath(<xpath>))