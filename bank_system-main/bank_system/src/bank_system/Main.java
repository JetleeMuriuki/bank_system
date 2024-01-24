package bank_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<>();
		List<Staff> staffMembers = new ArrayList<>();
		List<Customer> customers = new ArrayList<>();
		
		/**
		 * create an instance of the bank
		 */
		Bank Bima = new Bank(accounts, staffMembers , customers);
		
		/**
		 * Add customers to the bank
		 */
		Customer customer1 = new Customer("001","Tess");
		Customer customer2 = new Customer("002","Jetlee");
		
		Bima.addCustomers(customer1);
		Bima.addCustomers(customer2);
		
		/**
		 * add accounts to the bank
		 */
		Account account1 = new Account("100", customer1);
		Account account2 = new Account("101", customer2);
		
		Bima.addAccount(account1);
		Bima.addAccount(account2);
		
		/**
		 * adding staff to the bank
		 */
		Staff staff1 = new Staff(1, "Kalavi", 20000);
		Staff staff2 = new Staff(2, "Mwangi", 22000);
		
		Bima.addStaffMembers(staff1);
		Bima.addStaffMembers(staff2);
		
		/**
		 * add managers to the bank
		 * 
		 */
		Manager manager1 = new Manager(3, "Robert", "IT", 45000);
		
		Bima.addStaffMembers(manager1);
		displayBankDetails(Bima);
		}
	
	public static void displayBankDetails(Bank bank) {
		System.out.println("Bank details");
		System.out.println("Customers: ");
		displayCustomers(bank.getCustomers());
		System.out.println("\nAccounts: ");
		displayAccounts(bank.getAccounts());
		System.out.println("\nStaffmembers: ");
		displayStaffMembers(bank.getStaffMembers());
	}
	private static void displayCustomers(List<Customer> customers) {
		for (Customer customer : customers) {
			System.out.println("Customer id: " + customer.getCustomerid() + "Name: " + customer.getCustomername());
		}
	}

	private static void displayAccounts(List<Account> accounts) {
		for (Account account : accounts) {
			System.out.println("Account Number: " + account.getaccountNumber() + "Owner: " + account.getaccountOwner());
		}
	}

	private static void displayStaffMembers(List<Staff> staffMembers) {
		for (Staff staff : staffMembers) {
			System.out.println("Staff ID: " + staff.getId() + "Name: " + staff.getName());
		}
	}
}

