package classe;

import classe.behavior.impl.SellingObserver;
import classe.data.Company;
import classe.data.Livre;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BookStepDef {

    Company company;
    Livre livre1;
    Livre livre2;
    Livre livre3;    
	SellingObserver s1;
	@Given(": I want to find the cheapest <Livre>")
	public void i_want_to_find_the_cheapest_livre() {
		 livre1 = new Livre("learn piano",25);
		 livre2 = new Livre("learn guitar",30);
		 livre3 = new Livre("learn boxing",35);
		 s1 = new SellingObserver(company);
	     livre1.attach(s1);
	     livre2.attach(s1);
	     livre3.attach(s1);
	    //throw new io.cucumber.java.PendingException();
	}

	@When(": I do a search in the booklist of <Company>")
	public void i_do_a_search_in_the_booklist_of_company() {
	    
	    //throw new io.cucumber.java.PendingException();
	}
	@Then(": I buy the <Livre> with the lowest <LivrePrix>")
	public void i_buy_the_livre_with_the_lowest_livre_prix() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}