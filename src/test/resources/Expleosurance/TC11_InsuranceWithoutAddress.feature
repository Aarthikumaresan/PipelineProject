@All_Scenarios
Feature: Aarthi_Jan272025_ExpleoInsurance_Insurance Fields without Address
  Author: Aarthi

  Scenario: Validation of New Insurance Fields without giving Address
    Given user login the page with valid credential
    When User Clicks the new insurance Tab
    And User enters all the Fields Without Address
    And User click the Submit button
    Then user gettingg error message after submit the button
