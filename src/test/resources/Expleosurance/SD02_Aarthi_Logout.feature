@All_Scenarios
@Sauce_Demo
Feature: User logout functionality

  Scenario: logout the page
    Given User should enter valid "<username>" and "<password>"
    When User clicks the Login button
    And User should be login successfully
    And user clicks the Arrow
    Then user click the logout