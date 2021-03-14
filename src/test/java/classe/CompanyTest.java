package classe;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classe.Address;
import classe.Company;
import junit.framework.TestSuite;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    /**
     * Default constructor for test class CompanyTest
     */
    
    protected Company total;
    protected Company bnp;
    protected Address addressParis;
    protected Address addressNanterre;
    protected List<Company> listCompany=new ArrayList<Company>();

    
    public CompanyTest()
    {
        
    }
    @BeforeEach
    public void setUp()
    {
    	addressParis = new Address("13 rue de Paris", 75001);
    	addressNanterre = new Address("10 avenue d'italie", 92220);
        total = new Company(100,10);
        bnp = new Company(120, 30, addressParis);
        listCompany.add(bnp);
    }

    @Test
    public void testScaleCapital()
    {
        float scaleAmount = 50;
        float amoutVerified = scaleAmount + total.getCapital();
        total.scaleCapital(scaleAmount);
        assertEquals(total.getCapital(), amoutVerified);
    }
    @Test
    public void testScaleStock()
    {
        float scaleAmount = 50;
        float amoutVerified = scaleAmount + total.getStockPrice();
        total.scaleStockPrice(scaleAmount);
        assertEquals(total.getStockPrice(), amoutVerified);
    }
    @Test
    public void testSetAddress()
    {
    	total.setAddress(addressParis);
        assertEquals(total.getAddress(), addressParis);
    }
    @Test
    public void testSetCapital()
    {
    	float newCapital = 120;
    	total.setCapital(newCapital);
        assertEquals(total.getCapital(), newCapital);
    }
    @Test
    public void testSetStockPrice()
    {
    	float newStockPrice = 120;
    	total.setStockPrice(newStockPrice);
        assertEquals(total.getStockPrice(), newStockPrice);
    }
    @Test
    public void testGetter()
    {
        assertEquals(bnp.getStockPrice(), 30);
        assertEquals(bnp.getCapital(), 120);
        assertEquals(bnp.getAddress(), addressParis);

    }
    @Test
    public void testEqualsImplementation()
    {
    	Company c = new Company(120, 30, addressParis);
    	assertTrue(c.equals(bnp));
    }
    @Test
    public void testListCompany()
    {
    	int sizeListInitially = listCompany.size();
    	Company c = new Company(120, 30, addressParis);
    	listCompany.add(c);
    	assertEquals(listCompany.size(),sizeListInitially+1);
    }
    @Test
    public void testRobustesse()
    {	
    	total.setAddress(addressParis);
    	listCompany.add(total);
    	for (Company company : listCompany) {
    		assertTrue(company.getAddress().equals(addressParis));
    	}
    }
    
}
