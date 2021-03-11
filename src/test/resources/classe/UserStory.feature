Feature:
  Scenario: Set Capital for Company
    Given I have a Company
    When I set capital to 100.0
    Then I should get the value of capital is 100.0

  Scenario Outline: I want to add some amount to the current capital of an existing company
    Given I have an existing company with <capital>
    When I provide the value for <amount>
    Then I have a new capital is <capital2>
    Examples:
      | capital | amount | capital2 |
      | 100.0 | 100.0 | 200.0 |