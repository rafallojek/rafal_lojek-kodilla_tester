Feature: Prevent withdrawals from empty wallet

  Scenario: Withdraw from empty wallet
    Given I have deposited $0 in my wallet
    When I request $100
    Then nothing should be dispensed
    And wallet balance should remain $0
