# Smoke Testing Deployments using Cucumber

Developers love tests: testing, quality, and inspection tools. Modern testing practices yield automated tests for code and means to run them constantly while developing an application. When the app hits production, the operations team often have a different set of tools for monitoring the health of everything from disk space to requests per second to service health. To get the tested code into the well-monitored production environment, you need to deploy it, and that's where smoke testing comes in.

###But What Is Smoke Testing?
Smoke testing is non-exhaustive software testing aimed at ensuring that the most crucial functions of an application meet expectations, but skipping on the finer details. Smoke testing your deployments simply means having a test suite you can run very quickly against your production environment just after your deployment to make sure you've not broken everything.

You can write your smoke tests with whatever tool you choose, but I'm going to show some simple examples using the Ruby tool: Cucumber. I've found Cucumber useful for smoke tests as it makes it very simple for everyone involved, including project manager and business stakeholders, to understand what is being tested. Cucumber is useful because smoke tests need to be very fast and targeted to be useful, which means making judgements about what is critical, which requires a common language for communicating what is critical and how it should be tested.

I'm going to run this example using jruby in order to use another great tool, Celerity, which is a jruby wrapper around a headless browser. You don't have use Celerity to do this; lots of people use the Webrat library to make web requests instead. I like Celerity because it can execute the javascript on a page, meaning you can test more complex applications and more complete functionality.

## AN EXAMPLE
First we need a few dependencies. Here are the instructions for installing on a recent version of Ubuntu, although any system you can run jruby on should be fine.
```
apt-get install jruby
jruby -S gem update --system
jruby -S gem install jruby-openssl gherkin cucumber celerity rspec
```
Next we create a cucumber feature file in features/homepage.feature, which describes in a structured but human readable format exactly what we're testing.
```
Feature: Homepage
So we can keep existing users happy
Visitors to the site
Should be able to login

Scenario: Check login box appears when login button is clicked
Given I'm on the homepage
When I click the login button
Then I should see the login box
```

You don't have to use cucumber for writing smoke tests, but I find it useful because I can easily discuss what is being tested with other non-developers simply by sharing the feature file contents (above).

Next we write the actual code that makes the test work.
```
require 'rubygems'
require 'celerity'
require 'rspec'

BROWSER = Celerity::Browser.new
TIMEOUT = 20

# this is a simple utility function I use to find content on a page
# even if it might not appear straight away
def check_for_presence_of(content)
begin
timeout(TIMEOUT) do
sleep 1 until BROWSER.html.include? content
end
rescue Timeout::Error
raise "Content not found in #{TIMEOUT} seconds"
end
end

Given /^I'm on the homepage$/ do
BROWSER.goto("http://www.freeagentcentral.com")
end

When /^I click the login button$/ do
check_for_presence_of "Log In"
BROWSER.div(:id, "login_box").visible?.should == false  
BROWSER.link(:id, "login_link").click
end

Then /^I should see the login box$/ do
BROWSER.div(:id, "login_box").visible?.should == true
end
```


To run the feature we've just created just run the following command in the directory where you created the files - cucumber looks for a 'features' directory.
```
jruby -S cucumber
```
This should output test results showing what ran and whether it passed:
```
Feature: Marketing Site
So we can keep existing users happy
Vistors to the site
Should be able to login

Scenario: Check login box appears when login button is clicked # features/homepage.feature:6
Given I'm on the homepage             # features/steps/homepage.rb:1
When I click the login button         # features/steps/homepage.rb:5
Then I should see the login box       # features/steps/homepage.rb:11

1 scenario (1 passed)
3 steps (3 passed)
0m8.411s
```
Cucumber provider a number of other output formats that might also be useful (html, etc), and Cucumber Nagios has an output formatter for the nagios plugin format, too:
```
% jruby -S gem install cucumber-nagios
% jruby -S cucumber --format Cucumber::Formatter::Nagios
CUCUMBER OK - Critical: 0, Warning: 0, 3 okay | passed=3; failed=0; nosteps=0; total=3
```