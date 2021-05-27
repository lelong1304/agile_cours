package classe;

import classe.behavior.Observer;
import classe.behavior.impl.SellingObserver;
import classe.data.Address;
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
public class LivreTest
{
    /**
     * Default constructor for testAddLivre class CompanyTest
     */

    protected Livre livre;
    protected Observer observer;
    protected Company company;

    public LivreTest()
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
        livre = new Livre("Livre A", 25);
        company = new Company("A");
        observer = new SellingObserver(company);
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
    public void testAttach()
    {
        livre.attach(observer);
        assertEquals(1, livre.getObservers().size());

    }

    @Test
    public void testGetter()
    {
        assertEquals("Livre A", livre.getName());
        assertEquals(25, livre.getPrixLivre());
    }

    @Test
    public void testSetter()
    {
        livre.setName("Livre B");
        assertEquals("Livre B", livre.getName());
        livre.setPrixLivre(30);
        assertEquals(30, livre.getPrixLivre());
    }

    
    
}
