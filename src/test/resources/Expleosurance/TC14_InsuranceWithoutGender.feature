@All_Scenarios
Feature: TC14_Insurance Fields without Gender
Author: Aarthi

Scenario: Validation of New Insurance Fields without giving name
Given user login the page with valid credential
When User Clicks the new insurance Tab
And User enters all the Fields Without Gender
And User click the Submit button
Then user getting eror message after submit the button
