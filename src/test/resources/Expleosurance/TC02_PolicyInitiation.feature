@All_Scenarios
Feature: Aarthi_Jan212025_ExpleoInsurance_Policy Initiation

  Scenario Outline: Validating the policy initiation page
    Given user is on the login page with valid credential
    When user click the policy initiation
    And user enter "<CustomerName>" and "<DataOfBirth>" and "<Email>" and "<PhoneNumber>" and "<Address>"
    And user select the gender
    And user clicks the existing policy
    And user select Policy type
    And user click valid and proceed button
    Then user navigate to new insurance page

    Examples: 
      | CustomerName | DataOfBirth | Email            | PhoneNumber | Address          |
      | Aarthi       | 28-10-2000  | aarthi@gmail.com | 98865443367 | 24,manila street |

  Scenario Outline: Validating New Insurance page using policy initiation page
    Given user is on the login page with valid credential
    When user clicks the New Insurance
    And user enters the "<Name>" and "<Email>" and "<Address>" and "<Birthdate>"
    And user clicks the Gender
    And user enters "<PolicyType>" and "<Coverage>" and "<SumInsured>" and "<Primium>"
    And user clicks the button
    Then user clicks the submit

    Examples: 
      | Name   | Email            | Address          | Birthdate  | PolicyType       | Coverage             | SumInsured | Primium |
      | Aarthi | aarthi@gmail.com | 24,manila street | 28-10-2000 | Health Insurance | Hospitalization cost |   1,00,000 |     543 |
