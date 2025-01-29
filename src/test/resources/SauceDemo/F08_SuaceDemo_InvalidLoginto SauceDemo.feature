@LoginPage
Feature: F08_Invalid Login to Sauce Demo
  Author: Aarthi
  Scenario: UnSuccessful login with invalid credentials
    Given User navigate to the Sauce Demo login page
    When User enter invalid Username and Password
    And An error message should be displayed
    Then Quit the browser