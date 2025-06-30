Feature: Deposit zero amount

  Scenario: Deposit $0 into the wallet
    Given I have deposited $200 in my wallet
    When I deposit $0
    Then wallet balance should remain $200
