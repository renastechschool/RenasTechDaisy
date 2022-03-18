# Locators :
They are helping us to locate any webelement that you see on the webpage
### 8 different locators in selenium
#### 1.name
#### 2.linktext
#### 3.partiallinktext
#### 4.id
#### 5.classname
#### 6.tagname
#### 7.css
#### 8.xpath
## 1.Name:
This locator will be looking into the whole HTML code and return the webelement with matching name attribute value
--this one fill find and return the first webelemt it finds.
syntax : driver.findElement(By.name("name attribute value")).
## 2.Linktext (equals the text)
--this locater allows us to locate links by their text
--this locater will only works if webelement has links
How do i understand if the webelemt has links ?
```
<a href="https//www.amazon.com"> Text amazon </a>

Tagname --> a
Attribute --> href
Atrribute Value https//www.amazon.com
Link text -- Text amazon
syntax : driver.findElement(By.linktext("Text amazon"));
```
## 3.Partiallinktext (contain the text)
--this locater allows us to locate links by their text
--but it doesnt need exact match for text
syntax : driver.findElement(By.partialLinktext("amazon"));
--To Search something in html
for mac click command+F
for windows ctrl+F
## 4.id
--id will locate by matching id attribute's value.
--id is unique for the specific webelement
--if if you have id and its not dynamic you should always use id .
dynamic (when you refresh if you see id value is changing that means id is dynamic )
syntax : driver.findElement(By.id("id attribute value"));
## 5.className :
--className is not unique , thats why it might have multiple values of the same attribute
--and it will return you the first one it finds
syntax : driver.findElement(By.className("class attribute value"));
----------------------DAY3 NOTES----------------------------------
# Let's try with classname
```
//        driver.findElement(By.className("gLFyf gsfi")).sendKeys("Apple");
```
#### if classname has space in it it is not good idea to use most of the case you will recive an error.
```
//        driver.findElement(By.className("gLFyf")).sendKeys("Apple");
//you can remove after space and try to locate if classname is unique
// if webelement also has classname attribute but it is not unique so it is not good idea to use.
// if id is dynamic means (when you refresh page and if you see id is changing that means is dynamic) it wont be usefull.
```
#### 6-tagNAme
--you locate using tagname itself
--the usage of this one not too much
--it is good if you want to print same tag names
for ex : if you wanna print all links in the page then you will use this method
```
driver.findElements(By.tagName(a))
driver.findElements(By.tagName(div))
getText()
```
-- this one will be getting the text of given webelemnt
-- it is returning you the text of element as a String
```
<a id="ert" href="www.amazon.com">Amazon</a>
get text method will return you Amazon.
getAttribute("atrribute name")
<a id="ert" href="www.amazon.com">Amazon</a>
getAttribute("id")
```