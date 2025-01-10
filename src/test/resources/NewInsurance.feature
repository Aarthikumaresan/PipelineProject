@All_Scenarios
Feature: New Insurance

  Scenario Outline: user enters insurance policy details
    Given user is on the login page with valid credential
    When user clicks the New Insurance
    And user enters the "<Name>" and "<Email>" and "<Address>" and "<Birthdate>"
    And user clicks the Gender
    And user enters "<PolicyType>" and "<Coverage>" and "<SumInsured>" and "<Primium>"
    And user clicks the button
    Then user clicks the submit

    Examples: 
      | Name   | Email            | Address          | Birthdate  | PolicyType       | Coverage             | SumInsured | Primium |
      | Aarthi | aarthi@gmail.com | 24,manila street | 10/28/2000 | Health Insurance | Hospitalization cost |   1,00,000 |      10 |
