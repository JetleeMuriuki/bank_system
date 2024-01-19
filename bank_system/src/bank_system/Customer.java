package bank_system;

public class Customer {
	
	private int customerid;
	private String customername;
	
	public Customer(int customerid, String customername) {
		this.customerid = customerid;
		this.customername = customername;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}
	
	
	

}
