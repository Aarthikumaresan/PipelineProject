@All_Scenarios
Feature: TC12_Aarthi_Jan22025_ExpleoInsurance_Insurance Fields without DOB
  Author: Aarthi

  Scenario: Validation of New Insurance Fields without giving Address
    Given user login the page with valid credential
    When User Clicks the new insurance Tab
    And User enters all the Fields Without DOB
    And User click the Submit button
    Then user geting error message after submit the button
