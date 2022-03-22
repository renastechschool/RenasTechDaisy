# How to use Parameters in BDD Gherkin Script
Let’s work with the following BDD Gherkin Script:

### Scenario:  SQAT Email Functionality
### Given [ I navigate to Centric's SQAT Practice  ]
### When [ I enter my contact information ]
### And [ I hit submit ]
### Then [ I will receive a Thank You message ]

You will notice the steps are highlighted in yellow. If you recall, that is Cucumber telling us it cannot find corresponding step definitions for each. So we need to create the corresponding step definitions (you can add these to the existing step definitions file).

If you ran the .feature file and copy and pasted the four new steps into the step definition file, you will notice a lot of red:

```
When (/^I enter "(.*?)" in the "(.*?)" field$/) **do** |arg1, arg2|  **pending** # _express the regexp above with the code you wish you had_ **end**

And (/^I enter "(.*?)" in the "(.*?)" field$/) **do** |arg1, arg2|  **pending** # _express the regexp above with the code you wish you had_ **end**

And (/^I enter "(.*?)" in the "(.*?)" field$/) **do** |arg1, arg2|  **pending** # _express the regexp above with the code you wish you had_ **end**

And (/^I enter "(.*?)" in the "(.*?)" field$/) **do** |arg1, arg2|  **pending** # _express the regexp above with the code you wish you had_ **end**
```
Hovering the cursor over the red tells you that “several step definitions with the same name were found.” And if you look at each step, you will see that Cucumber is right. Each step is identical. So it doesn’t know which one to use.

# Working With Step Definitions and Parameters
As your Cucumber framework grows, these kind of error messages can be frustrating because the matching step definition might be hard to find. Fortunately for us, our Cucumber framework is still small. The solution is to simply remove three of the four duplicate steps.

Your step definition has two parameters:

### arg1, 
which takes the text entered
### arg2, 
which takes the field you wish to enter the text into

The values of each are handled by Regular Expressions. We’re not going to get into Regular Expressions here because they are far too complicated.

Just know that when we use the parameter (.*?) it will allow any value to be passed to the step definition. The value being passed down will be treated as a String variable by Cucumber regardless of what you pass.

The values captured in arg1 and arg2 can now be manipulated and used by WebDriver. That means arg1 can be directly passed to WebDriver; arg2, however, needs some manipulation. To do this, I will use a simple if-then-else statement:
```
And(/^I enter "([^"]*)" in the "([^"]*)" field$/) do |arg1, arg2|
    if arg2.eql?('Name')
        @browser.text_field(:name => 'input_1').set(arg1) #Name
    elsif arg2.eql?('Email')
        @browser.text_field(:name => 'input_2').set(arg1) #Email
    elsif arg2.eql?('Phone')
        @browser.text_field(:name => 'input_6').set(arg1) #Phone
    elsif arg2.eql?('Message')
        @browser.textarea(:name => 'input_3').set(arg1) #Message
    else
        assert('cannot find the field')
    end
end
```

Go ahead and run your .feature file. It should be all green. You have just created a step definition that can be used to populate ANY text field you come across on the web.

Parameters can be an extremely powerful and useful tool for agile testing teams. They enable you to write similar steps in a specific way so the step definition can be reused. As a result, scripts can be generated very fast and automated equally as fast.

