# Working with Windows/Tabs in Selenium

When testing requires you to work with multiple open windows or tabs, Selenium is here to help. A new window or tab usually opens when a user clicks on a button or link which triggers the new page that loads to be open in a new window or tab. Whether it is a window or tab that opens depends on the browser you are using. No matter whether you have a new tab or a new window that opens, the methods presented in this post for working with them behave exactly the same. They make no distinctions in regards to what was open (a tab or window).

How can you tell that the page that opens when clicking on a link opens in a new window/tab? By inspecting the links’ ‘target’ attribute. If the value of this attribute is ‘_blank’, than the page that will open will be inside a new window/tab. If there is no ‘target’ specified, or its’ values are different than ‘_blank’, no new window/tab will be open when clicking on this link.

The methods that Selenium provides when working with windows/tabs are as follows: ‘getWindowHandles()’ which returns handles to all currently open windows/tabs (windows which were opened through the driver instance); ‘getWindowHandle()’ which gets the handle to the window in focus (the current window you are working with); ‘window()’ used as ‘driver.switchTo().window(windowHandle)’ which allows to bring another window into focus, in order to interact with the page opened in that window.

## 1. getWindowHandles()
   When you have several open windows, in order to switch from one to the other to allow for page interaction, you will need to have a way of identifying the windows you are trying to switch to. Each window or tab has a value associated to it, called a handle. The handle is nothing more than a unique set of characters that identifies it, like a label. The result of calling the ‘getWindowHandles()’ method from Selenium is: all the handles of the open windows as a Java Set of String values. Calling this method from a test can be done in the following manner:
```
driver.getWindowHandles()
```

If you wish to store the result of calling this method, in order to access the handles later in a test, you can use a variable of type Set of String values:
```
Set<String> setOfWindowHandles = driver.getWindowHandles();
```
Using the handles returned by this method in tests is exemplified in the examples section of this post

One very important aspect to mention is that the window handles returned by the ‘getWindowHandles()’ are only of those windows opened by the automated tests you are running. As you already know, in order to open a page in a browser, you must first initialize (or start) the browser. When you are doing this, you are actually initializing a ‘driver’ instance. Therefore any new page which opens while you are interacting with this driver instance will also be related to the driver instance. Therefore, the ‘getWindowHandles()’ method only returns driver related window handles. Any other browser windows that are open independent of the ‘driver’ are not returned by this method. For example, if before running a test which opens a browser, you already had some browser windows open, their handles are not returned by this method.

## 2. getWindowHandle()
   If you need to get a handle to the currently focused window, in order to switch back to it later in a test, you can use the ‘getWindowHandle()’ method. It will return the handle to the currently focused driver instance window as a String.
```
driver.getWindowHandle()
```
As you will need this handle later on in the test (that is why you would call this method in the first place), you can store to it to a String variable:
```
String currentWindowHandle = driver.getWindowHandle();
```
## 3. switchTo().window()
   Now that you have a way of identifying the open driver instance windows/tabs, they are useful for being able to switch the focus to the desired ones. In order to switch to a window, if you already have its handle saved in variable , you can just pass the variable as parameter to the ‘window()’ method as follows:

driver.switchTo().window(handle);
In case you stored all the window handles in a Set, you will need to iterate through the Set, in order to get to the handle you need, and use that handle as parameter to calling the ‘window()’ method. See the Examples paragraph.

An important thing to remember is that when you are providing a non existent value for the handle as parameter to the ‘window()’ method, you will get a ‘NoSuchWindowException’ exception. This means that you either got the handle wrong (you manually typed it for some reason and did not type the value of an existing handle), or the handle is not valid anymore (the corresponding window was closed between the time the handle was generated and the time when you are trying to switch to it).

# Examples Setup
The tests from the upcoming examples will be performed on the following setup: a main page will be opened, named ‘mainPage.html’ (which you can find in my Github repository at the following location: https://github.com/iamalittletester/selenium-tutorial/blob/master/src/main/resources/mainPage.html). On this main page, there are two links (<a> tags). One of them opens a second page in a new window/tab, whose name is ‘secondPage.html’ (the HTML code for this page can be found at the following location: https://github.com/iamalittletester/selenium-tutorial/blob/master/src/main/resources/secondPage.html). The other link opens a third page, with the name ‘thirdPage.html’ (which can be found in the following location: https://github.com/iamalittletester/selenium-tutorial/blob/master/src/main/resources/thirdPage.html)

