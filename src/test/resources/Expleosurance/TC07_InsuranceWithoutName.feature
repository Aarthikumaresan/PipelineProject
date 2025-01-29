@All_Scenarios
Feature: TC07_Insurance Fields without name
  Author: Aarthi

  Scenario: Validation of New Insurance Fields without giving name
    Given user login the page with valid credential
    When User Clicks the new insurance Tab
    And User enters all the Fields Without name
    And User click the Submit button
    Then user gettin error message after submit the button
