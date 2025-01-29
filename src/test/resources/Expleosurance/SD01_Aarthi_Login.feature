@All_Scenarios
@Sauce_Demo
Feature: User login functionality

  Scenario: Successful login with valid credentials
    Given User should enter valid "<username>" and "<password>"
    When User clicks the Login button
    Then User should be login successfully

