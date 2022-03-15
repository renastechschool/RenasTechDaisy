Feature: We are using this feature to demo class


  Scenario: Login to amazon
  Given The user wants to go to website
  When The user wants to enter username
  Then The user wants to enter password
  And The user wants to click on login button


  Scenario: Login with incorrect data
  Given The user wants to go to website
  When The user wants to enter incorrect username
  Then The user wants to enter incorrect password
  Then The user wants to click on login button


   # Create a scenario that you can login Gmail
  Scenario: Verify that login to gmail with positive credentials
    Given The user wants to go to google
    When The user wants to click gmail
    Then The user wants to enter email
    And The user wants to enter password
    Then The user wants to click login
    And The user wants to verify the first email























  #gherkin language
    # Gherkin has keywords
        # Given
        # When
        #Then
        #And
        #But

    # BDD- Behaviour Development Driven
    #Reusable
    #Readable

    #What is cucumber testing tool:
    #We can create scenario with plain language
    #The cucumber tool brings collaboration to the team
    #To start a test we need to create scenario

    #Gherking Language:
    # is plain language driven from Ruby
    # Testers can define test cases in cucumber
    # Even non technical people would understand test cases
