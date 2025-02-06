@All_Scenarios
Feature: Aarthi_Jan212025_ExpleoInsurance_Delete Policy

  Scenario: user deletes the insurance policy
    Given user is on the login page with valid credentials
    When user select the policy
    And user delete the policy
    Then policy should be deleted in the dashboard
