Feature:
   Scenario: 
    Given : <Company> own some <Livre> 
    When : <Livre> was sold
    Then : The <revenue> of <Company> is updated
   
       Examples: 
      | company  | book         | price  | revenu 
      | c1       | learn piano  | 25     | 25
      | c1       | learn boxing | 35     | 60