package project4;

/**
 * Design an ADT Address book that can be used to maintain contact information of friends and families.
 * and two references, one for each of the node's children.
 * @author Naganobu Masuda
 * @version 1.0
 */
public class Contact<E> implements Comparable<E>{

	public String name;
	
	public Address address;
	
	public String phone;
	
	public Contact(){
		this.name = null;
		this.address = null;
		this.phone = null;
	}
	
	public Contact(String name, Address address, String phone){
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public int compareTo(E o){
		return 0;
	}
	
	/**
	 * returns the string of name
	 * @return the string of name
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * returns the address
	 * @return the address
	 */
    public Address getAddress(){
    	return this.address;
    }
	/**
	 * returns the string of phone number
	 * @return the string of street
	 */
    public String getPhone(){
    	return this.phone;
    }

	/**
	 * changes the string of name
	 * @param the string of name
	 */
    public void setName(String name){
    	this.name = name;
    }
	/**
	 * changes the address
	 * @param the address
	 */
    public void setAddress(Address address){
    	this.address = address;
    }
	/**
	 * changes the string of phone number
	 * @param the string of phone number
	 */
    public void setPhone(String phone){
    	this.phone = phone;
    }
    
    /**
	 * represents the name, address and phone number
	 * @return the name of street, city, state and zipcode
	 */
    public String toString() { 
        return this.name + "\t" + this.address + "\t" + this.phone;
    }
}
