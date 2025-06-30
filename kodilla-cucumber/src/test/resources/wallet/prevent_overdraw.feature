Feature: Prevent users from taking out more money than their wallet contains

  Scenario: User tries to take out more money than their balance
    Given I have deposited $100 in my wallet
    When I request $200
    Then nothing should be dispensed
    And wallet balance should remain $100
