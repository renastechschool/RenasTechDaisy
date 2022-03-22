# Cucumber - Data Tables

While working on automation, we may face variety of scenarios. Each scenario carries a different meaning and needs.

Since the beginning, we have been taking an example of login functionality for a social networking site, where we just had two input parameters to be passed. Let’s think of some more possibility. How about “New user registration” functionality? Typically, what can be the input parameters while registering a new user for a social networking site? Something like the following −

### User Name
### Email Address
### Password
### Re-enter password
### Birthdate
### Gender
### Phone number

**Feature** − New user registration.

Verify that the new user registration is unsuccessful after passing the incorrect inputs.

Given I am on a new user registration page.

When I enter the user name and an e-mail address as email address and password as, and re-enter password as and Birthdate as and Gender as and phone number as then the user registration should be unsuccessful.

It looks a bit messy at first glance. So, is there any better way to manage such chunk of inputs? Answer can be “Data Table”. Data table is a set of input to be provided for a single tag. This tag can be GIVEN, WHEN, or THEN.

Let’s write the above scenario with the help of data table and it will look like the following −

Given I am on a new user registration page

When I enter valid data on the page

### | Fields       | Values              |
### | First Name   | Tom                 |
### | Last Name              | Kenny               |
### | Email Address          | someone@someone.com |
### | Re-enter Email Address | someone@someone.com |
### | Password               | Password1           |
### | Birthdate              | 01                  |

Then the user registration should be successful.

# example
Let’s automate an example of a data table.

### Step 1 − 
Create a Maven Test Project named “DataTableTest”.

Go to File → New → Others → Maven → Maven Project → Next.

Provide group Id (group Id will identify your project uniquely across all projects).

Provide artifact Id (artifact Id is the name of the jar without version. You can choose any name which is in lowercase).

Click on Finish.

Open pom.xml −

Go to package explorer on the left hand side of Eclipse.

Expand the project CucumberTest.

Locate pom.xml file.

Right-click and select the option, Open with “Text Editor”.

Add dependency for Selenium: This will indicate Maven, which Selenium jar files are to be downloaded from the central repository to the local repository.

Open pom.xml is in edit mode, create dependencies tag (<dependencies></dependencies>), inside the project tag.

Inside the dependencies tag, create dependency tag. (<dependency></dependency>).

Provide the following information within the dependency tag.
```
<dependency> 
   <groupId>org.seleniumhq.selenium</groupId> 
   <artifactId>selenium-java</artifactId> 
   <version>2.47.1</version> 
</dependency>
```