@SingleCollection
Feature: Automated Single Collection End 2 End Test
Description: The purpose of this feature is to test End 2 End Single Collection Integration

Scenario: Client processes Single Collection through Client Self Serve
Given User is on Home Page
When User enter Login Credentials
And User click on Login button
And User click on Single Collection button
And User enter Item number Of Items
And User click the delivery type
And User enter Customer Name
And User enter Customer Reference Number
And User click on Enter Address Manually Button
And User enter Full Address Details
And User enter Customer Telephone Number
And User enter Customer Email Address
And User enter Extra collection notes
And User enter Special Instructions
And User click the collection date
And User click on continue button
And User click on Submit button