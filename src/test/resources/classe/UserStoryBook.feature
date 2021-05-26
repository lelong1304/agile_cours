Feature:
     Scenario: 
    Given : I want to find the cheapest <Livre>
    When : I do a search in the booklist of <Company>
    Then : I buy the <Livre> with the lowest <LivrePrix>
   
       Examples: 
      | company  | book         | price  |
      | c1       | learn piano  | 25     |
      | c1       | learn ghita  | 30     |       
      | c1       | learn boxing | 35     |

