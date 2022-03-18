# What is Page Object Model?
## Page Object Model (POM) 
POM is a design pattern, popularly used in test automation that creates Object Repository for web UI elements. The advantage of the model is that it reduces code duplication and improves test maintenance.

Under this model, for each web page in the application, there should be a corresponding Page Class. This Page class will identify the WebElements of that web page and also contains Page methods which perform operations on those WebElements. Name of these methods should be given as per the task they are performing, i.e., if a loader is waiting for the payment gateway to appear, POM method name can be waitForPaymentScreenDisplay().

Starting an UI Automation in Selenium WebDriver is NOT a tough task. You just need to find elements, perform operations on it.

## Advantages of POM
### 1) Page Object Design 
Pattern says operations and flows in the UI should be separated from verification. This concept makes our code cleaner and easy to understand.
### 2) Object Repository
The Second benefit is the object repository is independent of test cases, so we can use the same object repository for a different purpose with different tools. For example, we can integrate Page Object Model in Selenium with TestNG/JUnit for functional Testing and at the same time with JBehave/Cucumber for acceptance testing.
### 3) Optimization
Code becomes less and optimized because of the reusable page methods in the POM classes.
### 4) Methods
Methods get more realistic names which can be easily mapped with the operation happening in UI. i.e. if after clicking on the button we land on the home page, the method name will be like ‘gotoHomePage()’.
## How to implement POM?
### Simple POM:

It’s the basic structure of Page object model framework where all Web Elements of the AUT and the method that operate on these Web Elements are maintained inside a class file.A task like verification should be separate as part of Test methods.

## Complete Example

## TestCase: Go to Guru99 Demo Site.