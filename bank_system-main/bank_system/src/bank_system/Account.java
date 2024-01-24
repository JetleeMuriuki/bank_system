package bank_system;

public class Account {
	
	private String accountNumber;
	private Customer accountOwner;
	private double balance;
	
	/**
	 * constructor for creating a new account object
	 * @param accountNumber  this is a unique number
	 * @param customer  the name of the owner of the account
	 */
	public Account(String accountNumber, Customer customer) {
		this.accountNumber = accountNumber;
		this.accountOwner = customer;
		this.balance = 0.0;
	}
	
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal succesful. New balance is: " + balance);
		} else {
			System.out.println("Ïnvalid withdrawal amount or insufficient balance!");
		}
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit successful. New balance is: " +balance);
		} else {
			System.out.println("Invalid deposit amount!");
		}
	}
	
	/**
	 * 
	 * @return account balance
	 */
	public double getbalance() {
		return balance;
	}
	
	/**
	 * 
	 * @return account number
	 */
			
	public String getaccountNumber() {
		return accountNumber;
	}
	
	/**
	 * 
	 * @return owner of the account
	 */
	public Customer getaccountOwner() {
		return accountOwner;
	}
}
