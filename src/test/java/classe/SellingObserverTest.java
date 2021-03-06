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
 * The testAddLivre class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SellingObserverTest
{
    /**
     * Default constructor for testAddLivre class CompanyTest
     */

    protected Company company;
    protected Livre livre;
    protected PaypalStrategy payment;
    protected SellingObserver seller;

    public SellingObserverTest()
    {
        
    }

    /**
     * Sets up the testAddLivre fixture.
     *
     * Called before every testAddLivre case method.
     */
    @BeforeEach
    public void setUp()
    {
        company = new Company("Company A");
        livre = new Livre("A", 25);
        payment = new PaypalStrategy("email", "password");
        seller = new SellingObserver(company);

    }

    /**
     * Tears down the testAddLivre fixture.
     *
     * Called after every testAddLivre case method.
     */
    @AfterEach
    public void tearDown()
    {
        
    }
    
    @Test
    public void testUpdate()
    {
        float revenueBefore = company.getRevenue();
        float delta;
        livre.attach(seller);
        livre.pay(payment);
        delta = company.getRevenue() - revenueBefore;
        assertEquals(livre.getPrice(), delta, 0.1);
    }

    
    
}
