package classe;

import classe.behavior.PaiementStrategy;
import classe.behavior.impl.CardStrategy;
import classe.behavior.impl.PaypalStrategy;
import classe.data.Librairie;
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
public class LibrairieTest
{
    /**
     * Default constructor for test class CompanyTest
     */

    protected Librairie lib;

    public LibrairieTest()
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
        lib = new Librairie();
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
        Livre l = new Livre("A", 10);
        lib.addLivre(l);
        int n = lib.getLivreList().size();
        Livre newlyAddedLivre = lib.getLivreList().get(n-1);
        assertEquals(1, n);
        assertEquals(l.getName(), newlyAddedLivre.getName());
        assertEquals(l.getPrixLivre(), newlyAddedLivre.getPrixLivre());
    }

    
    
}
