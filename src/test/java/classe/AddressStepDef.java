package classe;
import static org.junit.jupiter.api.Assertions.*;

import classe.data.Address;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddressStepDef {
    private Address address;

    @Given("I have an object of class Address")
    public void i_have_an_object_of_class_Address() throws PendingException {
        // Write code here that turns the phrase above into concrete actions
        address = new Address();
    }

    @When("I set address to {string}")
    public void i_set_address_to(String addressStr) throws PendingException {
        // Write code here that turns the phrase above into concrete actions
        address.setAddress(addressStr);
    }

    @Then("the object has address value {string}")
    public void the_object_has_address_value(String addressStr) throws PendingException {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(address.getAddress(), addressStr);
    }

    @When("I set its postcode to {int}")
    public void i_set_its_postcode_to(int value) throws PendingException {
        // Write code here that turns the phrase above into concrete actions
        address.setPostcode(value);
    }

    @Then("the object has postcode value {int}")
    public void the_object_has_postcode_value(int value) throws PendingException {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(address.getPostcode(), value);
    }
}
