Feature: Prevent invalid deposits

  Scenario: Deposit negative amount
    Given I have deposited $200 in my wallet
    When I deposit $-50
    Then wallet balance should remain $200
