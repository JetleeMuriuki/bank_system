package bank_system;

public class Customer {
	
	private String customerid;
	private String customername;
	
	public Customer(String customerid, String customername) {
		this.customerid = customerid;
		this.customername = customername;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}
	
	
	

}
