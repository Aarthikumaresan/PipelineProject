@All_Scenarios
Feature: TC06_Forgot Password

  Scenario Outline: user enters the forgot password
    Given useris onthe login page with valid credential
    When user click the forgot password
    And user enters "<email>" and "<newpassword>" and "<confirmpassword>"
    And user clicks the reset opassword
    And user navigate to the login page
    And user enter the valid username and password
    Then user click submit button
