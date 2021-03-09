package classe;

/**
 * Write a description of class Address here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Address
{
    // instance variables - replace the example below with your own
    private String address;
    private int postcode;

    /**
     * Constructor for objects of class Address
     */
    public Address()
    {
        // initialise instance variables
        
    }
    
    public Address(String address, int code)
    {
        // initialise instance variables
        this.address = address;
        this.postcode = code;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setPostcode(int code)
    {
        this.postcode = code;
    }
    
    
    public String getAddress()
    {
        return this.address;
    }
    
    public int getPostcode()
    {
        return this.postcode;
    }
    
    @Override
    public String toString()
    {
        return this.address + "\n Postcode: " + this.postcode;
    }


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (postcode != other.postcode)
			return false;
		return true;
	}
    
}
