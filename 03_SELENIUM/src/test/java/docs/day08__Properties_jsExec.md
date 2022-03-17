# Selenium WebDriver and Execute JavaScript
You can execute Javascript with the Selenium WebDriver. In this tutorial you will learn how you can run js directly from your Python code.

You an use selenium to do automated testing of web apps or websites, or just automate the web browser. It can automate both the desktop browser and the mobile browser.
Selenium webdriver can execute Javascript. After loading a page, you can execute any javascript you want. A webdriver must be installed for selenium to work.

All it takes to execute Javascript is calling the method execute_script(js) where js is your javascript code.

## What is JavaScript?
JavaScript is a scripting languages that was made to run on top of websites (client side). It used to be to only make a webpage interactive, but these days there are complete frameworks that let you build the front-end of apps.

## How to Execute Javascript?
Before you can use selenium, make sure it is installed and that you also have the right web driver. You can initialize selenium the way you always do.

If you load a website with Python selenium, you can manually inject JavaScript onto that page. If you named your webdriver object driver, then you can execute it like so:
```
driver.execute_script("some javascript code here");
```
The program below runs a one line javascript command after loading the page. This will show the alert box in the webpage.
from selenium import webdriver
```
driver=webdriver.Firefox()
driver.implicitly_wait(3)
driver.get("https://pythonbasics.org")
js = 'alert("Hello World")'
driver.execute_script(js)
```

This means you can also use Javascript inside selenium to click on items, like on a button.
```
from selenium import webdriver
driver = webdriver.Firefox()
driver.get("http://stackoverflow.com/questions/7794087/running-javascript-in-selenium-using-python")
driver.execute_script("document.getElementsByClassName('comment-user')[0].click()")
```
To scroll the browser window, you can use Javascript too:
```
driver.execute_script("window.scrollTo(0, document.body.scrollHeight);"
```

But of course, you can also do this the Pythonic way by using the selenium module instead.

