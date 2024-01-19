package bank_system;

public class Main {
	public static void main(String[] args) {
		Staff staff1 = new Staff(1, "Leyla", 25000);
		Staff staff2 = new Staff(2, "Jetlee", 20000);
		
		Account account1 = new Account("001", "Mwangi");
		
		System.out.println(staff2.getSalary());
		System.out.println(staff1.getName());
	}

}
