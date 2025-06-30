Feature: Prevent withdrawal of invalid (negative) amounts

  Scenario: Withdraw negative amount
    Given I have deposited $200 in my wallet
    When I request $-50
    Then nothing should be dispensed
    And wallet balance should remain $200
