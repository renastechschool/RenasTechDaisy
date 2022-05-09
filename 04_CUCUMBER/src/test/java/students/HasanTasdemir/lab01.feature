Feature: Lab01

  Scenario: Verify that the user can order a product
    Given The user wants to navigate website
    When  The user wants to click on insurance button
    Then The user wants to click on Get a Quote button
    And The user wants to start fill up the information

  Scenario: Verify that the user should be able to select only one option in finance detail.
    Given The user wants to navigate website
    When The user wants to click on insurance button
    Then The user wants to click on Get a Quote button
    And The user clicks on finance details and select only one option in finance detail.

  Scenario: Verify that when you complete application you should be able to see "Let us call you" button
    Given The user wants to navigate website
    When The user wants to click on insurance button
    Then The user wants to click on Get a Quote button
    And The user wants to select vehicle year and make and model
    Then The user should be able to select finance details
    And The user wants to type in driving distance and if applicable select driving options
    When The user should be able to choose start coverage date
    Then The user wants to click saving and discounts
    And The user should be able to type in driver's license number
    When The user should be able to select the driver's license history
    Then The user should be able to click on submit button
    And The user should be able to click on Let us call you button



