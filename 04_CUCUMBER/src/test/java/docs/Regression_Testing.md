# Regression testing

Regression testing is a software testing practice that ensures an application still functions as expected after any code changes, updates, or improvements. Regression testing is responsible for the overall stability and functionality of the existing features.

 Regression Testing is nothing but a full or partial selection of already executed test cases which are re-executed to ensure existing functionalities work fine.

This testing is done to make sure that new code changes should not have side effects on the existing functionalities. It ensures that the old code still works once the latest code changes are done.

##In this tutorial, we will learn

### 1) Need of Regression Testing
### 2) How to do Regression Testing
### 3) Selecting test cases for regression testing
### 4) Regression Testing Tools
### 5) Regression Testing and Configuration Management
### 6) Difference between Re-Testing and Regression Testing
### 7) Challenges in Regression Testing
### 8) Practical Application of Regression Testing Example with a Video
## Need of Regression Testing

The Need of Regression Testing mainly arises whenever there is requirement to change the code and we need to test whether the modified code affects the other part of software application or not. Moreover, regression testing is needed, when a new feature is added to the software application and for defect fixing as well as performance issue fixing.

##How to do Regression Testing
In order to do Regression Testing process, we need to first debug the code to identify the bugs. Once the bugs are identified, required changes are made to fix it, then the regression testing is done by selecting relevant test cases from the test suite that covers both modified and affected parts of the code.

Software maintenance is an activity which includes enhancements, error corrections, optimization and deletion of existing features. These modifications may cause the system to work incorrectly. Therefore, Regression Testing becomes necessary. Regression Testing can be carried out using the following techniques:

## Regression Testing


### 1) Retest All
This is one of the methods for Regression Testing in which all the tests in the existing test bucket or suite should be re-executed. This is very expensive as it requires huge time and resources.
### 2) Regression Test Selection
Regression Test Selection is a technique in which some selected test cases from test suite are executed to test whether the modified code affects the software application or not. Test cases are categorized into two parts, reusable test cases which can be used in further regression cycles and obsolete test cases which can not be used in succeeding cycles.

### 3) Prioritization of Test Cases
Prioritize the test cases depending on business impact, critical & frequently used functionalities. Selection of test cases based on priority will greatly reduce the regression test suite.
# Selecting test cases for regression testing
It was found from industry data that a good number of the defects reported by customers were due to last minute bug fixes creating side effects and hence selecting the Test Case for regression testing is an art and not that easy.  Effective Regression Tests can be done by selecting the following test cases –

1) Test cases which have frequent defects
2) Functionalities which are more visible to the users
3) Test cases which verify core features of the product
4) Test cases of Functionalities which has undergone more and recent changes
5) All Integration Test Cases
6) All Complex Test Cases
7) Boundary value test cases
8) A sample of Successful test cases
9) A sample of Failure test cases
# Regression Testing Tools
If your software undergoes frequent changes, regression testing costs will escalate. In such cases, Manual execution of test cases increases test execution time as well as costs. Automation of regression test cases is the smart choice in such cases.  The extent of automation depends on the number of test cases that remain re-usable for successive regression cycles.

Following are the most important tools used for both functional and regression testing in software engineering:

1) Avo Assure
   
2) Telerik Test Studio

3) testRigor

4) Subject7
  
5) Eggplant
   
# Regression Testing and Configuration Management
Configuration Management during Regression Testing becomes imperative in Agile Environments where a code is being continuously modified. To ensure effective regression tests, observe the following :

1) Code being regression tested should be under a configuration management tool
2) No changes must be allowed to code, during the regression test phase.  Regression test code must be kept immune to developer changes.
3) The database used for regression testing must be isolated. No database changes must be allowed
# Difference between Re-Testing and Regression Testing:
Retesting means testing the functionality or bug again to ensure the code is fixed. If it is not fixed, Defect needs to be re-opened. If fixed, Defect is closed.

Regression testing means testing your software application when it undergoes a code change to ensure that the new code has not affected other parts of the software.

Also, Check out the complete list of differences over here.

# Challenges in Regression Testing:

Following are the major testing problems for doing regression testing:

1) With successive regression runs, test suites become fairly large.  Due to time and budget constraints, the entire regression test suite cannot be executed
2) Minimizing the test suite while achieving maximum Test coverage remains a challenge
3) Determination of frequency of Regression Tests, i.e., after every modification or every build update or after a bunch of bug fixes, is a challenge.
Practical Application of Regression Testing Example with a Video


## Conclusion:
An effective regression strategy, save organizations both time and money. As per one of the case study in banking domain, regression saves up to 60% time in bug fixes(which would have been caught by regression tests) and 40%  in money.



