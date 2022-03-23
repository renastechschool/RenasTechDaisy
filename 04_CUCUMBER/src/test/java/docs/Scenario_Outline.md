

Data Tables in Cucumber are quite interesting and can be used in many ways. DataTables are also used to handle large amounts of data. They are quite powerful but not the most intuitive as you either need to deal with a list of maps or a map of lists. Most of the people get confused with Data tables & Scenario outline, but these two works completely differently.


Scenario Outline:

This uses Example keyword to define the test data for the Scenario
This works for the whole test
Cucumber automatically run the complete test the number of times equal to the number of data in the Test Set
Test Data:

# Feature: Learn data table
###Scenario Outline: Cucumber Data Table
Given Table with example:
###| FirstName  | _FirstName_  |
### | MiddleName | _MiddleName_ |
### | LastName   | _LastName_   |
Examples:
### | FirstName | MiddleName | LastName |
### | Priyank   | B          | Shah     |
### | Mansi     | P          | Shah     |