@All_Scenarios
Feature: Quate Generation
  Author: Aarthi

  Scenario: Validating the Quate Generation Page
    Given user login the page with valid credential
    When user click the quate generation
    And user select the policy type
    And user enter the Coverage Amount
    And user enter Customer Age
    And user click generate quote
    Then user print the msgs