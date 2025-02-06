@All_Scenarios
Feature: Aarthi_Jan272025_ExpleoInsurance_Admin Panel

  Scenario Outline: Delete the Manager Users
    Given user login the page with valid credential
    When user clicks the Admin panel
    And user clicks manage users
    Then user delete the button