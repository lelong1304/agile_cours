package classe.data;

import classe.behavior.Observer;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Company
{
    // instance variables - replace the example below with your own
    private String name;
    private float capital;
    private float stockPrice;
    private Address address;
    private float revenue;

    /**
     * Constructor for objects of class Company
     */
    public Company()
    {
        // initialise instance variables
        this.capital = 0;
        this.stockPrice = 0;
        this.address = null;
    }
    public Company(String name)
    {
        // initialise instance variables
        this.name = name;
        this.capital = 0;
        this.stockPrice = 0;
        this.address = null;
        this.revenue = 0;
    }

    
    public Company(float capital, float price)
    {
        this.capital = capital;
        this.stockPrice = price;
        this.address = null;
    }    
    
    public Company(float capital, float price, Address address)
    {
        this.capital = capital;
        this.stockPrice = price;
        this.address = address;
    }   


    public void setCapital(float amount)
    {
        this.capital = amount;
    }
    public void setStockPrice(float amount)
    {
        this.stockPrice = amount;
    }
    
    public float getCapital()
    {
        return this.capital;
    }
    
    public float getStockPrice()
    {
        return this.stockPrice;
    }
    
    public void scaleCapital(float amount)// we rename to addCapital, it's more generic
    {
        this.capital += amount;
    }
    
    public float scaleStockPrice(float amount)
    {
        return this.stockPrice += amount;
    }
    
    public void setAddress(Address address)
    {
        this.address = address;
    }
    public Address getAddress()
    {
        return this.address;
    }
    

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (Float.floatToIntBits(capital) != Float.floatToIntBits(other.capital))
			return false;
		if (Float.floatToIntBits(stockPrice) != Float.floatToIntBits(other.stockPrice))
			return false;
		return true;
	}

	@Override
    public String toString()
    {
        return "Company has of "+ this.capital +" capital and is situated at: " + this.address.toString() + "\n Stock price: " + this.stockPrice;
    }
}
