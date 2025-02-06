@All_Scenarios
Feature: Aarthi_Jan212025_ExpleoInsurance_Insurance Fields without email
Author: Aarthi

Scenario: Validation of New Insurance Fields without giving email
Given user login the page with valid credential
When User Clicks the new insurance Tab
And User enters all the Fields Without email
And User click the Submit button
Then user getting error message after submit the button