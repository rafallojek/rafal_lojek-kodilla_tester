Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Withdraw more than available balance
    Given I have deposited $200 in my wallet
    When I request $250
    Then nothing should be dispensed
    And wallet balance should remain $200

  Scenario: Withdraw negative amount
    Given I have deposited $200 in my wallet
    When I request $-50
    Then nothing should be dispensed
    And wallet balance should remain $200

  Scenario: Withdraw from empty wallet
    Given I have deposited $0 in my wallet
    When I request $100
    Then nothing should be dispensed
    And wallet balance should remain $0

  Scenario: Multiple operations
    Given I have deposited $200 in my wallet
    When I request $50
    Then $50 should be dispensed
    And wallet balance should be $150
    When I deposit $100
    Then wallet balance should be $250
    When I request $200
    Then $200 should be dispensed

  Scenario: Deposit negative amount
    Given I have deposited $200 in my wallet
    When I deposit $-50
    Then wallet balance should remain $200
