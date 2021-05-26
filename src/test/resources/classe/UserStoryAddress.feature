Feature:
  Scenario: Set an address to class Address
    Given I have an object of class Address
    When I set address to "Paris"
    Then the object has address value "Paris"

  Scenario: Set a postcode to class Address
    Given I have an object of class Address
    When I set its postcode to 75000
    Then the object has postcode value 75000






