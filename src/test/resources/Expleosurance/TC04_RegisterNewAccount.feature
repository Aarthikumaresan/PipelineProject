@All_Scenarios
Feature: Aarthi_Feb062025_ExpleoInsurance_Register New Account

  Scenario Outline: user register the new account
    Given useris on the login page with valid credential
    When user clicks the register new account
    And user enters the "<email>" and "<password>" and "<checkpassword>"
    And user clicks Register button
    And user click Navigate to login page
    And user enters Email and Password
    Then user navigate to the dashboard page

    Examples: 
      | email             | password   | checkpassword |
      | aarthi17@gmail.com | Aarthi@123 | Aarthi@123    |

      