package banking;
/**
 * Represents checking and savings of bank account for customer.
 * @author barno
 *
 */

public class BankAccount {
	// instance variables
	
	/**
	 * Type of account (checking or saving).
	 */
	
	String accountType;
	
	/**
	 * Balance for bank account
	 */
	double balance;
	
	/**
	 * Customer for this account
	 */
	Customer customer;
	//constructor
	
	/**
	 * Creates a bank account of given type for given customer.
	 * @param aacountType
	 * @param customer
	 */
	public BankAccount(String aacountType, Customer customer) {
		this.accountType = accountType;
		this.customer = customer;
	}
	
	// methods
	
	/**
	 * Deposits at given account 
	 * @param amount to add to balance
	 */
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	/**
	 * Withdraws given amount from the balance 
	 * @param amount
	 * @throws Exception
	 */
	
	public void  withdraw(double amount) throws Exception {
		if (amount > this.balance) {
			throw new Exception("Amount is greater than available balance");
		}
		this.balance += amount;
	}
	
	/**
	 * Return account type and balance 
	 * @return
	 */
	public String getAccountInfo() {
		return this.accountType + ": " + this.balance;
	}
	
	/**
	 * return customer name and bank account and address for this account.
	 * @return string with info
	 */
	
	public String getCustomerinfo() {
		return this.customer.getName() + " from " + this.customer.getAddress();
	}

}
