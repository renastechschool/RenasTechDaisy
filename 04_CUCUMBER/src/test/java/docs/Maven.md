# How to create Cucumber Maven project 
We will be using Cucumber setup in Eclipse (using Maven). The steps mentioned in the IntelliJ Cucumber tutorial section still remain the same. Hence, you can use either of the IDEs as per your convenience. This is the primary reason why we covered these two IDEs in this introductory blog of the Cucumber Selenium tutorial series.

### Step 1

Navigate to File > New > Project.

### Step 2

From the dialog, expand Maven; select Maven Project and click on Next.

### Step 3

Select the checkbox to Create a Simple Project and click on the Next button.

### Step 4

Enter the details like the Group ID and Artifact ID,  version, packaging, and Name and then click on the Finish button.

You will see your Maven project under the project explorer.

pom.xml will contain package information for resolving the Cucumber and Selenium dependencies.

### Step 5

Click on the pom.xml tab at the extreme right. You will see an XML file that contains all the project details.

### Step 6

Fetch the maven dependencies from the Maven Repository and add the dependencies manually in pom.xml. 

Save the project. Your Maven project is all set to be used to run Cucumber tests using Selenium WebDriver. 

