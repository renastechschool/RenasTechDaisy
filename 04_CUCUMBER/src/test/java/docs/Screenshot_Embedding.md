# Cucumber Report | Taking Screenshot & Embedding Inside

"As an Automation Tester / Stakeholder,
I want screen shots for all Test Failures under Cucumber Report
So that I can have better debugging/understanding of failed tests."

#Why Screenshots?
Screenshot plays a vital role especially at the time of test failure. Assuming that we are running tests on Jenkins (CI environment) and that is too on headless mode (Non GUI Execution). Once test execution got completed, it will be really helpful if we have screen shots for the test failures for better debugging purpose. Isn’t It?
###Solution:
Cucumber itself doesn’t provide functionality for taking screenshots, but it does make it possible to embed them in the report. 
If we are using Selenium webdriver with Cucumber, Following is the command to take screenshot in Selenium:
```
// Selenium - Command to take screenshot
// Returns byte[]
((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)
```
If we see Problem statement carefully, we only need to capture / embed screenshot if test got FAILED. In such cases, we should have our code written under @After annotation.

See complete implement for Selenium:
```
public void tearDown(Scenario scenario) {
if (scenario.isFailed()) {
// Take a screenshot...
final byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
// embed it in the report.
scenario.embed(screenshot, "image/png");
}
}
```

Output:
We have solved our Problem statement and now we are able to capture screen shot and embeded within cucumber report in case of test failure.