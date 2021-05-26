package classe;

import classe.behavior.impl.PaypalStrategy;
import classe.behavior.impl.SellingObserver;
import classe.data.Company;
import classe.data.Livre;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestSuite
{
    /**
     * Default constructor for test class CompanyTest
     */

    protected AddressTest addressTest;
    protected CompanyTest companyTest;
    protected PaiementStrategyTest paymentTest;
    protected SellingObserverTest sellingTest;
    protected LibrairieTest librairieTest;

    public TestSuite()
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
        addressTest = new AddressTest();
        addressTest.setUp();
        companyTest = new CompanyTest();
        companyTest.setUp();
        paymentTest = new PaiementStrategyTest();
        paymentTest.setUp();
        sellingTest = new SellingObserverTest();
        sellingTest.setUp();
        librairieTest = new LibrairieTest();
        librairieTest.setUp();

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
    public void test()
    {
        addressTest.testSetter();
        companyTest.testSuite();
        paymentTest.testUpdate();
        sellingTest.testUpdate();
        librairieTest.test();

    }

    
    
}
