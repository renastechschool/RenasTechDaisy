# Page Object Model with Selenium and Cucumber

Let's create a BDD Framework for the testing of web applications using Page Object Model . This framework consists of:

### Cucumber Java – 6.8.1
### Cucumber JUnit4 – 6.8.1
### Java 11
### Maven – 3.8.1
### Selenium – 3.141.59

#What Is Page Object Model (POM)?

Page Object model is an object design pattern in Selenium, where web pages are represented as classes, and the various elements on the page are defined as variables in the class and all possible user interactions can then be implemented as methods in the class.

##What is Cucumber?

Cucumber is one such open source tool, which supports Behavior Driven Development(BDD). In simple words, Cucumber can be defined as a testing framework, driven by plain English. It serves as documentation, automated tests, and a development aid – all in one.

## Steps to setup Cucumber Test Automation Framework using Page Object Model

### Download and Install **Java** on system
### Download and setup Eclipse IDE on system
### Setup Maven on System
### Create a new Maven Project
### Create a source folder – src/test/resources to create test scenarios in Feature file
### Add Selenium and Cucumber dependencies to the project
### Add Maven Compiler Plugin
### Create a feature file under src/test/resources
### Create the Step Definition class or Glue Code for the Test Scenarios
### 1) 
Create a Java Class for each page where define WebElements as variables using Annotation @FindBy and Create methods for actions performed on WebElements.
### 2) 
Create a Java Class called Definition where we will create the Test Code related to Given,When, Then of Feature file
### Create a Cucumber Runner class
### Run the tests from JUnit
### Run the tests from Command Line
### Cucumber Report Generation

Step 1- Download and Install Java

Cucumber and Selenium needs Java to be installed on the system to run the tests. Click here to know How to install Java.

Step 2 – Setup Maven

To build a test framework, we need to add a number of dependencies to the project. Click here to know How to install Maven.

Step 3 – Create a new Maven Project

File -> New Project-> Maven-> Maven project-> Next -> Enter Group ID & Artifact ID -> Finish

Step 4 – Create source folder src/test/resources to create test scenarios in Feature file

A new Maven Project is created with 2 folders – src/main/java and src/test/java. To create test scenarios, we need a new source folder called – src/test/resources. To create this folder, right click on your maven project ->select New ->Java and then Source Folder.

Step 5 – Add Selenium and Cucumber dependencies to the project

Step 6 – Add Maven Compiler Plugin

The compiler plugin is used to compile the source code of a Maven project. This plugin has two goals, which are already bound to specific phases of the default lifecycle:

### compile – compile main source files
### testCompile – compile test source files

Step 7 – Create a feature file under src/test/resources

Create a folder with name features. Now, create the feature file in this folder. The feature file should be saved with extension .feature. This feature file contain the test scenarios created to test the application. The Test Scenarios are written in Gherkins language in the format of Given, When, Then, And, But.

Step 8 – Create the Step Definition class or Glue Code for the Test Scenario

Create a Java Class for each page where define WebElements as variables using Annotation
@FindBy and Create methods for actions performed on WebElements. Here, I’m going to create 2 classes – Login and Home.

Step 9 – Create the Step Definition class or Glue Code for the Test Scenario

Create a Java Class for each page where define WebElements as variables using Annotation @FindBy and Create methods for actions performed on WebElements. Here, I’m going to create 2 classes – Login and Home.
```
@FindBy(name = "txtUsername")
WebElement userName;
```

It also create methods for the action to be performed on these webelements as shown below:-

public void login(String strUserName, String strPassword) {

           // Fill user name
           this.setUserName(strUserName);
  
           // Fill password
           this.setPassword(strPassword);
  
           // Click Login button
           this.clickLogin();
     }
}

The initElements is a static method of PageFactory class which is used to initialize all the web elements located by @FindBy annotation.Only after the WebElements are initialized, they can be used in the methods to perform actions.

```
public Login(WebDriver driver) {
this.driver = driver;
// This initElements method will create all WebElements
PageFactory.initElements(driver, this);
}
```

Step 9 – Create a JUnit Cucumber Runner class to execute the test scenarios
```
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = {
"src/test/resources/features/HRMLoginPage.feature" }, glue = "com.cucumber.pageobjectmodel")
public class CucumberRunnerTest {

}
```

Step 10 – Run the tests from JUnit

You can execute test script by right clicking on TestRunner class -> Run As JUnit.

Step 11 – Run the tests from Command Line

Step 12 – Cucumber Report Generation

To get Cucumber Test Reports, add cucumber.properties under src/test/resources and add the below instruction in the file.

```
cucumber.publish.enabled=true
```

That’s it! Congratulations on making it through. Happy Learning!!


