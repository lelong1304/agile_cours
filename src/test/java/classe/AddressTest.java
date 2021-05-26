package classe;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classe.data.Address;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AddressTest
{
    /**
     * Default constructor for test class CompanyTest
     */
    
    protected Address addressParis;
    
    public AddressTest()
    {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    	addressParis = new Address("30 rue de Paris", 75001);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        
    }
    
    @Test
    public void testSetter()
    {
        int code = 75001;
        String addressString = "30 rue de Paris";
        Address address = new Address();
        address.setAddress(addressString);
        address.setPostcode(code);
        assertEquals(address.getAddress(), addressString);
        assertEquals(address.getPostcode(), code);
        assertEquals(address.getAddress(), addressParis.getAddress());
        assertEquals(address.getPostcode(), addressParis.getPostcode());

    }

    
    
}
