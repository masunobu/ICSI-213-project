package project4;

/**
 * Design an ADT Address book that can be used to maintain contact information of friends and families.
 * and two references, one for each of the node's children.
 * @author Naganobu Masuda
 * @version 1.0
 */
public class Address {
	
	public String street;
	
	public String city;
	
	public String state;
	
	public String zipcode;
	
	public Address(){
		this.street = null;
		this.city = null;
		this.state = null;
		this.zipcode = null;
	}
	
	public Address(String street, String city, String state, String zipcode){
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	/**
	 * returns the name of street
	 * @return the name of street
	 */
	public String getStreet(){
		return this.street;
	}
	/**
	 * returns the name of city
	 * @return the name of city
	 */
    public String getCity(){
    	return this.city;
    }
	/**
	 * returns the name of state
	 * @return the name of state
	 */
    public String getState(){
    	return this.state;
    }
	/**
	 * returns the name of zipcode
	 * @return the name of zipcode
	 */
    public String getZipcode(){
    	return this.zipcode;
    }
	/**
	 * changes the name of street
	 * @param the name of street
	 */
    public void setStreet(String street){
    	this.city = street;
    }
	/**
	 * changes the name of city
	 * @param the name of city
	 */
    public void setCity(String city){
    	this.city = city;
    }
	/**
	 * changes the name of state
	 * @param the name of state
	 */
    public void setState(String state){
    	this.state = state;
    }
	/**
	 * changes the name of zipcode
	 * @param the name side of zipcode
	 */
    public void setZipcode(String zipcode){
    	this.zipcode = zipcode;
    }
    
    /**
	 * represents the name of street, city, state and zipcode
	 * @return the name of street, city, state and zipcode
	 */
    public String toString() { 
        return this.street + "\t" + this.city + "\t" + this.state + "\t" + this.zipcode;
    }
}
