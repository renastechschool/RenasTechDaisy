# HTML Report

We do test execution in order to understand the stability of a product, so be it manual test or an automated test, it is very important to generate a concise report that can depict the stability of a product. Hence, while we are automating our test scenario with Cucumber, it is essential to know, how better we can generate our Cucumber test reports. As we know that Cucumber is a BDD framework, it does not have a fancy reporting mechanism.

In order to achieve this, we need to integrate Cucumber with other open source tool like Ant/Junit. Here, we will take examples of JUnit further because, it provides support for Java language.

Let’s look into the details of different report format, which is available and easy to use −

# Pretty Format (HTML Report)
Pretty Format generates the Cucumber test report in the HTML format, i.e. an HTML file. It is the most readable report format. It generates the report in the same way as it is a feature file, so tracing is also made easy. Also, you can specify the location where you want this report to be placed after the test execution. It can be −

### Local Directory − 
We can specify target directory for report as any local directory of the machine where the test will run.

### Server Directory − 
Also we have a provision to specify a target directory as any directory on the server, which is publically accessible. This generally helps when we want our clients/stakeholders to view the test results at any given point of time.

##Example
Let’s automate an example of a pretty format.

**Step 1** − Create a package named CucumberReport under src/test/java

**Step 2** − Create a feature file named cucumberReport.feature

Write the following text within the file and save it.

**Feature** − Cucumber Report

## This is to check test result for Pass test case

Scenario: Login functionality exists

Given I have opened the browser

When I open Facebook website

Then Login button should exist

## This is to check test result for Failed test case

Scenario: Forgot password exists

Given I have open the browser

When I open Facebook website

Then Forgot password link should exist

Note − Here scenario first will pass, whereas the second scenario will fail. So that we can witness how the pass and failed report looks like.

**Step 3** − Create a step definition file.

Select and right-click on the package outline.

Click on ‘New’ file.

Give the file name as cucumberReport.java

Write the following text within the file and save it.
```
package CucumberReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class cucumberReport {
WebDriver driver = null;

@Given("^I have open the browser$")
public void openBrowser() {
driver = new FirefoxDriver();
}

@When("^I open Facebook website$")
public void goToFacebook() {
driver.navigate().to("https://www.facebook.com/");
}

@Then("^Login button should exits$")
public void loginButton() {
if(driver.findElement(By.id("u_0_v")).isEnabled()) {
System.out.println("Test 1 Pass");
} else {
System.out.println("Test 1 Fail");
}
}

@Then("^Forgot password link should exist$")
public void forgotPWD() {
if(driver.findElement(By.id("")).isEnabled()) {
System.out.println("Test 1 Pass");
} else {
System.out.println("Test 1 Fail");
}
}
}
```
**Step 4** − Create a runner class file.

Create a runner class named runTest.java inside the package.

Write the following code. Save the file.
```
package CucumberReport;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
format = {"pretty", "html:target/Destination"} )

//Specifying pretty as a format option ensure that HTML report will be generated.
//When we specify html:target/Destination - It will generate the HTML report

inside the Destination folder, in the target folder of the maven project.

public class runTest { }
```
1) Run the test using option

    A) Select runTest.java file from package explorer.

    B) Right-click and select the option, Run as.

    C) Select JUnit test.

The report will be there named as “Index.html”.

Open Index.html with web browser.

