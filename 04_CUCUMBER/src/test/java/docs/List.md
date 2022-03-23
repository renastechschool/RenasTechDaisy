Cucumber Data Table Converted to List 



In here will be an example of a Cucumber data table – converted to a list. 

While Cucumber can be thought of as a “testing” tool, the intent of the tool is to support BDD. This means that the “tests” (plain text feature descriptions with scenarios) are typically written before anything else and verified by business analysts, domain experts, etc. non technical stakeholders. The production code is then written outside-in, to make the stories pass.

Cucumber itself is written in Ruby, but it can be used to “test” code written in Ruby or other languages including but not limited to Java, C# and Python.

Example:
```
| firstName | lastName | age |
| Thomas | Brown | 30 |
| Perry | Wilson | 26 |
| Ashley | William | 27 |

java type: List<List<String>>

The natural representation of list of a list of strings is shown below.

[
[ "firstName", "lastName", "age" ],
[ "Thomas", "Brown", "30" ],
[ "Perry", "Wilson", "26" ],
[ "Ashley", "William", "27" ]
]
```

## Prerequisites
Java at least 1.8, Cucumber 1.2.5/6.10.3, Junit 4.12/5.8.0-M1, Maven 3.6.3

In this example I will show you how you can use cucumber’s nice feature that helps us to use tables in our scenarios. The table can easily be converted to a list or map that you can use in your step.

## Project Setup
Create a maven based project in your favorite tool or IDE. The name of the project is java-cucumber-three-column-data-table-to-list.

If you want to use maven based project then you can use below pom file:


```
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>

	<groupId>com.roytuts</groupId>
	<artifactId>java-cucumber-three-column-data-table-to-list</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<maven.compiler.source>12</maven.compiler.source>
		<maven.compiler.target>12</maven.compiler.target>
	</properties>

	<dependencies>
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>6.10.3</version>
		</dependency>

		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>6.10.3</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>5.8.0-M1</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.junit.vintage</groupId>
			<artifactId>junit-vintage-engine</artifactId>
			<version>5.8.0-M1</version>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.1</version>
			</plugin>
		</plugins>
	</build>
</project>
```

## Test Resources
Create src/test/resources folder, if it already does not exist, for putting the resource files.

Do right-click on the project and go New -> Source Folder. Give Folder name: as src/test/resources and click on Finish button.

## Feature File
Create a feature files called bonuslist.feature under src/test/resources/cuke/flow/feature with the below content:

```
Feature: An organization pays bonus to its employees due to outstanding profit
"""
The organization also calculates how much extra money it has to pay
to its employees in the financial year
"""
Scenario: An organization pays bonus based on designations
Given an organization has 100000 employees
When it pays bonus according to the designation
| designation | bonus |  noOfEmployees  |
|      HR     |  1000 |       100       |
|      PM     | 50000 |      5000       |
|   Sr. Dev   | 25000 |     15000       |
|   Jr. Dev   | 15000 |     79900       |
Then the organization has to pay total extra Rs. 1823600000 to 100000 employees
```

## Test Runner Class
Create a cucumber test runner class as shown below:

```
package com.roytuts.cuke.flow;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Cucumber 1.2.5
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//Cucumber 1.2.5

@RunWith(Cucumber.class)
@CucumberOptions(features = {
"classpath:cuke/flow/feature/bonuslist.feature" }, glue = "com.roytuts.cuke.flow.steps", monochrome = true, plugin = {
"pretty", "html:target/cucumber", "json:target/Cucumber.json", "junit:target/Cucumber.xml" })
public class CukeBonusListRunner {

}
```

In the above class we have configured below features using @CucumberOptions:

### features – 
location of the feature file
### glue – 
the package where the step definition class will be written
### monochrome – 
we want the output in console in human readable format
### plugin – 
in what format and where we want the generated output file
