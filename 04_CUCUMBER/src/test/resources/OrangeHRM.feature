Feature: Orange HRM functionality scenarios

  @smoke @LoginWithoutParams @regression
  Scenario: Login to Orange HRM
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard


    @smoke @TC100
  Scenario: Add new personal
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The user wants to see add employee page
    Then The user wants to add user name as "Hasan"
    Then The user wants to add last name as "atug"
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"



    @smoke  @TC200 @regression
  Scenario: Add new personal
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard
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


      @smoke @TC300
  Scenario: Add new personal
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The user wants to see add employee page
    Then The user wants to add an employee in a list way
      |ommm1234| JerrTyyyyyy|
    Then The user wants to add login details in a list way
      |renastech123 | RenasTech2021 |Disabled |
      |   hasan     |   hasan727272 |Disabled |
      | Ruken Ruzgar|  rukenR222$   |Disabled |
      |      Mehmet |   secretpas   | Disabled |
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"



        @Scenario_Outline
        Scenario Outline:Add new nationality to Nationalities page in Orange HRM Project
          Given The user wants to go to orangeHRM application
          When The user wants to enter username and password
          Then The user wants to click login
          And The user should be able to navigate dashboard
          Then The user wants to go to Admin page
          And The user wants to go to Nationalities section
          Then The user wants to add new nationalities
          Then The user wants to add nationalities as "<Nationalities>"

          Examples:
            |Nationalities  |
            |Aramaic        |
            |Spartan        |
            |Roman          |






