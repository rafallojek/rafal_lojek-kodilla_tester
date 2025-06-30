Feature: Perform multiple consecutive withdrawals

  Scenario: Withdraw amounts in steps
    Given I have deposited $300 in my wallet
    When I request $100
    Then $100 should be dispensed
    And wallet balance should be $200
    When I request $50
    Then $50 should be dispensed
    And wallet balance should be $150
