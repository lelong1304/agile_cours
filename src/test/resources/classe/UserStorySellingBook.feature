Feature:
  Scenario Outline: Book was sold
    Given : <Company> own some <Livre> 
    When : <Livre> was sold
    Then : The <revenue> of <Company> is updated by selling the book
   
    Examples:
      | company  | book         | price  |
      | c1       | learn piano  | 25     |
      | c1       | learn boxing | 35     |
