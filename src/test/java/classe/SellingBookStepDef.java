package classe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import classe.behavior.impl.PaypalStrategy;
import classe.behavior.impl.SellingObserver;
import classe.data.Company;
import classe.data.Livre;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SellingBookStepDef {
    private Company company;
    private Livre livre1;
    private Livre livre2;
	SellingObserver s1;
	private float revenueInitiale; 

    @Given(": <Company> own some <Livre>")
	public void company_own_some_livre() {
	    company = new Company("c1");
	    revenueInitiale = company.getRevenue();
	    livre1 = new Livre("learn piano",25);
	    livre2 = new Livre("learn boxing",35);
	    s1 = new SellingObserver(company);
        livre1.attach(s1);
        livre2.attach(s1);
	}

	@When(": <Livre> was sold")
	public void livre_was_sold() {
		livre1.pay(new PaypalStrategy("idExemple", "passwordExemple"));
	}
	@Then(": The <revenue> of <Company> is updated by selling the book")
	public void the_revenue_of_company_is_updated_by_selling_the_book() {
		assertEquals(company.getRevenue(),revenueInitiale+livre1.getPrixLivre());
	}

}
