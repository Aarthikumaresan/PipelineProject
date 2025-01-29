@All_Scenarios
@Sauce_Demo
Feature: User login functionality

  Scenario: print the lable
    Given User should enter valid "<username>" and "<password>"
    When User clicks the Login button
    And User should be login successfully
    Then user print the lable
   

