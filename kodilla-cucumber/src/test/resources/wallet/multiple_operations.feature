Feature: Multiple wallet operations

  Scenario: Perform several transactions in sequence
    Given I have deposited $200 in my wallet
    When I request $50
    Then $50 should be dispensed
    And wallet balance should be $150
    When I deposit $100
    Then wallet balance should be $250
    When I request $200
    Then $200 should be dispensed
    And wallet balance should be $50
