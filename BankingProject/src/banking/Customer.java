package banking;
/**
 * Reprents a customer of a bank
 * @author barno
 *
 */

public class Customer {
	// intances variables
	/**
	 * Name of customer
	 */
	String name;
	/**
	 * adress of customer
	 */
	String address;
	// constructor
	/**
	 * Create a customer with given name
	 * @param name of customer
	 */
	public Customer(String name) {
		// sets intance var name to given name 
		this.name = name;
	}
	// methods
	/**
	 * sets the address of customer to be given address.
	 * @param address for customer
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * returns customer's name
	 * @return name of customer
	 */
	public  String getName() {
		return this.name;
	}
	
	/**
	 * return customer's address
	 * @return address
	 */
	public String getAddress() {
		return this.address;
	}
	

}
