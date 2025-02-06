@All_Scenarios
Feature: Aarthi_Jan212025_ExpleoInsurance_User login functionality

  Scenario: Successful login with valid credentials
    Given User should enter valid username and password
    When User clicks the submit button
    Then User should be redirected to the dashboard

  Scenario Outline: Validating invalid username and password
    Given User should enter invalid "<Username>" and "<Password>"
    When User clicks the submit button
    Then The error message should be displayed

    Examples: 
      | Username                         | Password   |
      | aarthi.kumaresan@expleogroup.com | Aarthi@12  |
      | aarthi.kumaresan@expleo.com      | Aarthi@123 |
      | aarthi.kumaresan@expleo.com      | Aarthi@13  |
