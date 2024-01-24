package bank_system;
/**
 * this class manager inherits attributes from the class staff.
 */

public class Manager extends Staff {
	private String department;
	
	public Manager(int id, String name, String department, int salary) {
		super(id, name, salary);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
