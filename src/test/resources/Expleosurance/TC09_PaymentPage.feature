@All_Scenarios
Feature: Aarthi_Jan232025_ExpleoInsurance_Payment Page
  Author: Aarthi

  Scenario: Making payment on payment page
    Given user login the page with valid credential
    When user click Payment Page
    And user Enter Policy Amount
    And user clicks calculate premium
    And user print the msg
    And user click the proceed to pay
    Then user handle the alert msg
