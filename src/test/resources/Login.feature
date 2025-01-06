Feature: User login functionality

  Background: 
    Given the user is on the login page

  Scenario: Successful login with valid credentials
    When the user enters valid username and password
    And the user clicks on the login button
    Then the user should be redirected to the dashboard
    And quit browser1

  Scenario: UnSuccessful login with valid credentials
    When the user enters invalid username and password
    And the user clicks on the login button
    Then the error message should be displayed
    And quit browser2