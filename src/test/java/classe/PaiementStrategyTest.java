package classe;

import classe.behavior.PaiementStrategy;
import classe.behavior.impl.CardStrategy;
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
public class PaiementStrategyTest
{
    /**
     * Default constructor for test class CompanyTest
     */

    protected PaiementStrategy payment1;
    protected PaiementStrategy payment2;
    protected float amount;

    public PaiementStrategyTest()
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
        payment1 = new PaypalStrategy("email", "password");
        payment2 = new CardStrategy("1234567890123456", "786", "12/15");
        amount = 10;
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
    public void testUpdate()
    {
        float paidAmount = payment1.pay(amount);
        float paidAmount2 = payment2.pay(amount);
        assertEquals(amount, paidAmount, 0.1);
        assertEquals(amount, paidAmount2, 0.1);
    }

    
    
}
