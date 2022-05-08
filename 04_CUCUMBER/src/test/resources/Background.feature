Feature: we explain how background works

Background: User navigates to Orange HRM dashboard
Given The user wants to go to orangeHRM application
When The user wants to enter username and password
Then The user wants to click login
And The user should be able to navigate dashboard


  @test1
  Scenario: User wants to add employee
Then The user wants to go to PIM page
Then The user wants to see add employee page
Then The user wants to add user name as "Hasan"
Then The user wants to add last name as "atug"
Then The user wants to save the information
Then The user should be able to see "Personal Details"

  @test2
    Scenario: add new personal
      Then The user wants to go to PIM page
      Then The User wants to see add employee page
        |FirstName|Serdilann124545312233  |
        |LastName |Jerryy123123145423|
      Then The user wants to add login details
        |User Name   | jacyyy|
        |Password    |Erkan!125555 |
        |Status      |Disabled   |
      Then The user wants to save the information
      Then The user should be able to see "Personal Details"

