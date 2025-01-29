@All_Scenarios
Feature: TC13_Admin Panel

  Scenario Outline: Delete the Manager Users
    Given user login the page with valid credential
    When user clicks the Admin panel
    And user clicks manage users
    Then user delete the button