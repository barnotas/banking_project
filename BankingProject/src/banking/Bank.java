package banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts.
 * @author barno
 *
 */

public class Bank {
	

	public static void main(String[] args) {
		// crates new intances of bank class
		Bank bank = new Bank();
		
		// calls the run method in the bank class 
		bank.run();
	}
	
	/**
	 * Runs the program by initializing and managing, bank accounts and customers.
	 */
	
	public void run() {
		System.out.println("Wellcome to the Bank! What is your name?");
		
		Scanner scanner = new Scanner(System.in);
		
		// get next customer name 
		String name = scanner.next();
		
		System.out.println("Hello " + name + "! We are creating checking and saving accounts for you.");
		
		// create customer with given name 
		Customer customer = new Customer(name);
		
		// get address 
		System.out.println("What is your address?");
		String address = scanner.next();
		// set address 
		customer.setAddress(address);
		
		// create checking for customer
		
		BankAccount checkingAccount = new BankAccount("checking", customer);
		
		BankAccount savingAccount = new BankAccount("checking", customer);
		
		//get and prints customer info
		System.out.println();
		System.out.println("Customer info: ");
		System.out.println(checkingAccount.getCustomerinfo());
		
		System.out.println("checking account: ");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Saving account: ");
		System.out.println(savingAccount.getAccountInfo());
		
		//deposits
		
		System.out.println();
		System.out.println("Amount (demical) to deposit into your checking account?");
		double amount = scanner.nextDouble();
		checkingAccount.deposit(amount); // deposit into checking account
		
		System.out.println();
		System.out.println("Amount (demical) to deposit into your saving account ");
		amount = scanner.nextDouble();
		savingAccount.deposit(amount);
		
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingAccount.getAccountInfo());
		
		//withdrawls
		System.out.println();
		System.out.println("Amount (demical) to withdraw from your account");
		amount = scanner.nextDouble();
		
		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		 // from saving 
		try {
			savingAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		//prints new balances 
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingAccount.getAccountInfo());
		
		scanner.close();	
	}

}
