package bank_system;

import java.util.List;

/**
 * Class is for keeping track of accounts,
 * staff, money in the bank
 */

public class Bank {
	
	private List<Account> accounts;
	private List<Staff> staffMembers;
	private List<Customer> customers;
	private int totalMoney;
	
	public Bank(List<Account> accounts, List<Staff> staffMembers, List<Customer> customers) {
		
		this.accounts = accounts;
		this.staffMembers = staffMembers;
		this.customers= customers;
		totalMoney = 0;
	}

	/**
	 * 
	 * @return list of accounts in the bank
	 */
	public List<Account> getAccounts() {
		return accounts;
	}

	/**
	 * 
	 * @param account which adds an account to the bank
	 */
	public void addAccount(Account account) {
		accounts.add(account);
	}

	/**
	 * 
	 * @return list of staff in the bank
	 */
	public List<Staff> getStaffMembers() {
		return staffMembers;
	}

	/**
	 * 
	 * @param staffMember which adds staff to the bank
	 */
	public void addStaffMembers(Staff staffMember) {
		staffMembers.add(staffMember);
	}

	/**
	 * 
	 * @return money in the bank
	 */
	public int getTotalMoney() {
		return totalMoney;
	}
	
	/**
	 * 
	 * @param adds money to money in the bank
	 */

	public void updateTotalMoney(int totalMoney) {
		totalMoney += totalMoney;
	}

	/**
	 * @return the customers
	 */
	public List<Customer> getCustomers() {
		return customers;
	}

	/**
	 * @param customers the customers to set
	 */
	public void addCustomers(Customer customer) {
		customers.add(customer);
	}
	
	

}
