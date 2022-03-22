# What is Hook in Cucumber?
In Cucumber, the hook is the block of code which can be defined with each scenario in step definition file by using the annotation @Before and @After. These **@Before** and **@After** annotations create a block in which we can write the code.

Cucumber hook facilitates us to handle the code workflow better and also helps us to reduce code redundancy.

Syntax:
```
@Before setup ()  
{    
logic

} @

Scenario  
Given  
When  
And  
Then

@After cleanup (){    
logic    
} 
```   
As per the code logic, hook's job is to start and close the web driver session after a specific function/method. Hence, in actual, it is not relevant to any function/method or scenario.

## The Need of Hook
At the time of testing, we may encounter circumstances where we need to perform some conventional prerequisite steps before the testing of the test scenario.

Consider the following prerequisite to understand the kind of prerequisites which may encounter at the time of testing:

### 1) To Start a web driver
### 2) Set up of Data Base connections
### 3) Set up of test data
### 4) Set up of browser cookies
### 5) Navigation to a certain page
Similarly, there are always some prerequisite steps which may encounter after testing:

### 1) To stop the web driver
### 2) To Close DB connections
### 3) To Clear the test data
### 4) To Clear browser cookies
### 5) To Log out from the application
### 6) Printing reports or logs
### 7) Taking the screenshots of error
In order to handle these types of conventional prerequisite steps, using cucumber hook is the best option.

### Hook Annotations
Unlike TestNG Annotations, the cucumber supports only two hooks:

### @Before
### @After


As the name suggests, we can use the @Before hook with the function/method after which we need to start web driver.

**@After**

As the name suggests, we can use the @After hook with the function/method after which we need to close the web driver.

Let's understand this notion better with an example of a step definition file.

Example:
Here is an instance of a step definition file of a Maven testing project. This project is created for the testing of web application javaTpoint.

In order to use the hook, we created the step definition file named hookTest.java under the package javatpointTest.
```
package javatpointTest;

import org.openqa.selenium.By;    
import org.openqa.selenium.WebDriver;    
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given;    
import cucumber.annotation.en.Then;    
import cucumber.annotation.en.When;

public class hookDemo {   
WebDriver driver = null;

@Before public void setUp(){    
driver = new FirefoxDriver();    
}

@Given("^User navigates to javatpoint$")    
public void goToFacebook() {    
driver.navigate().to("https://www.javatpoint.com/");   
}

@When("^ user enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$" ")    
public void User_enter_Username_and_Password(String arg1, String arg2) {   
driver.findElement(By.id("emailAddress")).sendKeys(arg1);   
driver.findElement(By.id("password")).sendKeys(arg2);   
driver.findElement(By.id("u_0_v")).click();    
}

@Then("^login should be unsuccessful$")    
public void validateRelogin() {    
if(driver.getCurrentUrl().equalsIgnoreCase(   
"https://www.javatpoint.com/login.php?login_attempt=1&lwv=110")){    
System.out.println("Test Pass");    
} else {    
System.out.println("Test Failed");    
}    
driver.close();    
}

@After public void cleanUp(){    
driver.close();    
}    
}   
```

When we execute this code, the following will be the sequence of execution:

At the beginning, @Before annotation will set up the web driver and other required prerequisites to execute the test.
After setting up web driver and other prerequisites, the Given statement will be executed.
After the execution of the Given statement, the When statement will be executed.
After the execution of the When statement, the Then statement will be executed.
Now at the last, @After hook will close the web driver and do the cleanup process.
Since we know that, to execute step definition file, we should have a complete Maven testing project so first create it in eclipse.

## Tagged Hooks
The hook can also we used with tag. We can use @before and @after hooks with a specific test.

Example:
```
@Before ('@RegressionTest)

@After ('@RegressionTest)  
```
We can also use the same concept of the hook with logical and/or operator.

Example:
```
@Before ('@RegressionTest, @SmokeTest)

@After ('@RegressionTest, @SmokeTest)  
```