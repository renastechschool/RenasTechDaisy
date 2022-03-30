##Scenario Outline Homework:
@TC_2
Scenario Outline: Verify that we can add customers http://demo.guru99.com/telecom/index.html
Given The user wants to see Guru demo site
When The user wants to add a customer
Then The users wants to verify "Add Customer" header
Then The user wants to enter background check as "<bCheck>"
Then The user wants to enter billingaddress as "<fName>" and "<lName>" and "<email>" and "<address>" and "<pNumber>"
  And The wants to verify message as "Access Details to Guru99 Telecom"
  Examples:
    |bCheck |fName |lName| email           |address     |pNumber  |
    |Done   |Joe   |Dave |joedave@gmail.com|10 fake st  |123456789|
    |Pending|Jason |Dave |jason@gmail.com  |11 fake st  |789654123|