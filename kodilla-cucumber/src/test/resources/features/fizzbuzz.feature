Feature: FizzBuzzGame
  As a user
  I want to get a specific word based on the divisibility of a number
  So that I can understand if it’s divisible by 3, 5, both or neither

  Scenario Outline: Check FizzBuzz logic for a number
    Given I have the number <number>
    When I check the FizzBuzz result
    Then I should get "<result>"

    Examples:
      | number | result     |
      | 3      | Fizz      |
      | 5      | Buzz      |
      | 15     | FizzBuzz  |
      | 2      | None      |
      | 30     | FizzBuzz  |
      | 9      | Fizz      |
      | 10     | Buzz      |
      | 7      | None      |
