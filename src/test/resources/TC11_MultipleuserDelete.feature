@All_Scenarios
Feature: Multiple Delete Policy

  Scenario Outline: multiple deletes the insurance policy
    Given user is on the login page with valid credentials
    When user select the policy
    And user delete the policy
    Then policy should be deleted in the dashboard
    
    
    Examples:
    |arthi1@gmail.com|

    