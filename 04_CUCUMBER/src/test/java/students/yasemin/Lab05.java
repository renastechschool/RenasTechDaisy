package students.yasemin;

public class Lab05 {
    /*
    My framework is BDD, which uses Cucumber to write tests in the feature files, and organize test suites like @smoke, and @regression.
    My feature files are written in Gherkin language to make them easy to understand for non-technical people.
    My framework generates HTML reports with exact steps from the feature file.
   In my framework; Other than feature files, I have a runner class that runs my tests and helps to generate codes for step definition from my feature files.
   It also contains locations that show where my feature files and StepDefs (Glue) are
   Step definition classes where I have my methods to execute feature files, Driver class is designed as Singleton. Configuration Reader and properties file.
   I also have page classes where I locate my elements for each page.
   Besides, these, I have utility pages where I store my reusable codes.
   Lastly, I have a hook class that implements my codes which run before and after all my tests this is where I invoke my TakeScreenShot for each failure.
   I have a runner class this is where I run all of the tests with JUnit. This class includes @Cucumber options and @runWith which include Plugins; it is used to configure what reports I want to generate and where to put them.
   Tags; I can specify the test I would like to run here.
   Features; To specify the path of the feature files. And Glue; This is where to look for step definitions.
   The hook is part of the glue as well.  My framework supports Data-Driven testing using Apache POI, Scenario Outline, excel, and files.




     */
}
