package classe;

import static org.junit.Assert.assertEquals;

import classe.behavior.impl.PaypalStrategy;
import classe.behavior.impl.SellingObserver;
import classe.data.Company;
import classe.data.Livre;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EnterpriseStepDef {
    Company company;
    Livre livre;
    Livre livre2;
	SellingObserver s1;

    @Given(": <Company> own some <Livre>")
	public void company_own_some_livre() {
	    company = new Company("c1");
	    livre = new Livre("learn piano",25);
	    livre2 = new Livre("learn boxing",35);
	    s1 = new SellingObserver(company);
        livre.attach(s1);
        livre2.attach(s1);
	    //throw new io.cucumber.java.PendingException();
	}

	@When(": <Livre> was sold")
	public void livre_was_sold() {
		livre.pay(new PaypalStrategy("idExemple", "passwordExemple"));
	    //throw new io.cucumber.java.PendingException();
	}
	@Then(": The <revenue> of <Company> is updated")
	public void the_revenue_of_company_is_updated() {
	    s1.update(livre);
	    //throw new io.cucumber.java.PendingException();
	}

}
