package classe;
import static org.junit.jupiter.api.Assertions.*;

import classe.data.Address;
import classe.data.Company;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CompanyStepDef {
    Company company;
    Address address;

    @Given("I have a Company")
    public void i_have_a_company() throws PendingException{
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
    public void the_value_is_added_to_the_current_of_the_company(Float val2) throws PendingException {
        assertEquals(company.getCapital(),val2);
    }


    @Given("I have a Company object company and an Address object address{int} whose address is {string} and postcode is {int}")
    public void i_have_a_Company_object_company_and_an_Address_object_address_whose_address_is_and_postcode_is(Integer int1, String string, Integer int2) throws PendingException {
        // Write code here that turns the phrase above into concrete actions
        company = new Company();
        address = new Address("Paris", 75000);

    }

    @When("I assign address{int} to Company's address")
    public void i_assign_address_to_Company_s_address(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        company.setAddress(address);

    }

    @Then("the company's address is set to address{int} that should have address string is {string} and postcode is {int}")
    public void the_company_s_address_is_set_to_address_that_should_have_address_string_is_and_postcode_is(Integer int1, String string, Integer int2) throws PendingException {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(company.getAddress().getAddress(), address.getAddress());
        assertEquals(company.getAddress().getPostcode(), address.getPostcode());
    }

    @Given("I have a Company whose capital is {float}")
    public void i_have_a_Company_whose_capital_is(float value) throws PendingException {
        // Write code here that turns the phrase above into concrete actions
        company = new Company();
        company.setCapital(100);
    }

    @Then("I should get the value of {float}")
    public void i_should_get_the_value_of(float value) throws PendingException {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(company.getCapital(), value);
    }


}
