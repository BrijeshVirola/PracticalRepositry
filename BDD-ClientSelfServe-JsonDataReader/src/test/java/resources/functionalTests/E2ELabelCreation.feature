@CreateLabel
Feature: Automated End2End Label Creation Test
  Description: The purpose of this feature is to test End 2 End Label Creation Tests

  Scenario: User create a label by entering customer parcel details
    Given User is on Home Page
    When User enter Login Credentials
    And User click on Login button
    And User click on CreateLabel button
    And User select Delivery Type
    And User select Title
    And User enter First Name
    And User enter Last Name
    And User click on Enter Address Manually button
    And User enter Full Address
    And User enter Phone Number
    And User enter Customer Reference
    And User click on Submit button
