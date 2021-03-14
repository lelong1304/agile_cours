package classe;
import static org.junit.jupiter.api.Assertions.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepdefs {
    Company company;
    @Given("I have a Company")
    public void i_have_a_calculator() throws PendingException{
        company = new Company();
    }

    @When("I set capital to {float}")
    public void i_set_capital_to(Float val) throws PendingException {
        company.setCapital(val);
    }

    @Then("I should get the value of capital is {float}")
    public void i_should_get_the_value_of_capital_is(Float val) throws PendingException{
        assertEquals(company.getCapital(),val);
        //throw new PendingException();
    }

    @Given("I have an existing company with {float}")
    public void i_have_an_existing_company_with(Float val) throws PendingException {
        company = new Company();
        company.setCapital(val);
    }

    @When("I provide the value for {float}")
    public void i_provide_the_value_for(Float val) throws PendingException {
        company.scaleCapital(val);
    }

    @Then("I have a new capital is {float}")
    public void the_value_is_added_to_the_current_of_the_company(Float val2) throws PendingException{
        assertEquals(company.getCapital(),val2);
    }



}
