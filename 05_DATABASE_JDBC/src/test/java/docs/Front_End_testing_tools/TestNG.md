# TestNG

TestNG is one of the most widely used open source testing framework used in automation testing suite.

This tutorial includes all topics of a testing framework such as Features, installation, running test cases, annotations, dependent test, parallel tests, before and after annotations, etc.

##What is TestNG
- TestNG is a very important framework when you are actually developing the framework from scratch level.
- TestNG provides you full control over the test cases and the execution of the test cases. Due to this reason, TestNG is also known as a testing framework.
- Cedric Beust is the developer of a TestNG framework.
- If you want to run a test case A before that as a pre-request you need to run multiple test cases before you begin a test case A. You can set and map with the help of TestNG so that pre-request test cases run first and then only it will trigger a test case A. In such way, you can control the test cases.
- TestNG framework came after Junit, and TestNG framework adds more powerful functionality and easier to use.
- It is an open source automated TestNG framework. In TestNG, NG stands for "Next Generation".
- TestNG framework eliminates the limitations of the older framework by providing more powerful and flexible test cases with help of easy annotations, grouping, sequencing and parametrizing.

# Advantages of TestNG over Junit

- In TestNG, annotations are easier to understand than Junit.
- It produces the HTML reports for implementation.
- It also generates the Logs.
- In TestNG, there is no constraint available such as @beforeclass and @afterclass which is present in Junit.
- TestNG enables you to group the test cases easily which is not possible in JUnit.
- TestNG supports three additional levels such as @Before/After suite, @Before/AfterTest, and Before/AfterGroup.
- TestNG does not extend any class. TestNG framework allows you to define the test cases where each test case is independent of other test cases.
- It allows you to run the test cases of a particular group. Let's consider a scenario where we have created two groups such as 'Smoke' and 'Regression'. - If you want to execute the test cases in a 'Regression' group, then this can only be possible in the TestNG framework.
- Parallel execution of test cases, i.e., running multiple test cases is only possible in the TestNG framework.

# Features of TestNG

- Before and After Annotatios
- XML based test Configuration
- Dependent methods
- Group
- Dependent Groups
- Parameterization of test methods
- Data driven testing
- Multithreaded execution
- Better reporting
- Open API

## Multiple Before and After annotation options
Before and after annotations are used to execute a certain set of code before and after executing the test methods. These annotations are used to set the variables or configuration before the start of the execution of test methods and clean up all the variables after the execution ends. Some of the Before and After annotations are @BeforeSuite, @BeforeTest, @BeforeGroups, @BeforeClass, etc.

## XML-based test configuration
Test suites in a Testng are mainly configured by using the XML-based file. Testng.xml file is used to organize and run the test suites. The testng.xml file is used to create the test suites by using classes, test methods, packages as well as by using the test groups. It is also used to pass the parameters to test classes or methods.

## Dependent methods
Dependency is a feature of Testng that allows a test method to depend on the single or group of test methods. Dependency works on the principle "depend-on-method" which must be either in the same class or in the inherited base class. This is the most important feature in TestNG that tells the TestNG to run the dependent test method after the execution of a given test method. You can also configure whether you want dependent test method should be executed or not even after the execution of the given test method fails.

## Groups/group of groups
TestNG groups allow you to group the test methods. By using TestNG groups, you can declare the methods in a group as well as you can declare the groups within a group. The Testng group can be used to include a certain set of groups and can exclude another set of groups.

## Dependent groups
Similar to the Dependent methods, test methods in a group can depend on the test methods of another group.

## Parameterization of test methods
One of the most important feature of TestNG is Parameterization. This feature allows you to pass the arguments as parameters and this achieved by using testng@Parameters annotation. We can pass the parameters to test methods in two ways, i.e., testng.xml file and DataProviders.

## Data-driven testing
TestNG allows users to perform data-driven testing. This testing allows users to execute the same test multiple times with multiple sets of data. To achieve the data-driven testing, DataProvider feature is used. DataProvider is a data feeder method that executes the test method with multiple sets of data.

## Multi-threaded execution
Multithreaded execution is the parallel execution of tests. Multithreading means the execution of multiple parts of software at the same time. Based on the configuration in the XML file, multiple threads are started, and test methods are executed in them. Multithreaded execution saves a lot of execution time.

## Better reporting
Testng provides XML and HTML reports by default for test execution. You can even add your own custom reports when required.

## Open API
TestNG contains the open API means API is publicly available to the developers. This feature allows you to create your custom extensions in your framework when required.

