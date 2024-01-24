package bank_system;

/**
 * This class is responsible for keeping track of staff
 * in the bank, the id, names and total salary they are paid
 */
public class Staff {
	
	private int id;
	private String name;
	private int salary;
	
	/**
	 * constructor for creating a new staff object
	 * @param id 
	 * @param name
	 * @param salary
	 */
	public Staff(int id, String name, int salary) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	/**
	 * 
	 * @return staff id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id sets the id of staff
	 */

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
