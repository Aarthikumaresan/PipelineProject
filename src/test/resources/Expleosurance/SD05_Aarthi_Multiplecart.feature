@All_Scenarios
@Sauce_Demo
Feature: Add to cart

  Scenario: add to cart the product
    Given User should enter valid "<username>" and "<password>"
    When User clicks the Login button
    And User should be login successfully
    And user click add to cart
    And user add again another product
    And user click the icon
    Then user removee the product
    

