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
      | 100.0   | 100.0  | 200.0    |

  Scenario Outline: I want to set the address for an existing company
    Given I have a Company object company and an Address object address1 whose address is <addressStr> and postcode is <postcodeValue>
    When I assign address1 to Company's address
    Then the company's address is set to address1 that should have address string is <addressStr> and postcode is <postcodeValue>
    Examples:
      | addressStr | postcodeValue |
      | "Paris"    | 75000         |
