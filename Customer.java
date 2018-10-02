
public class Customer {

	int CustomerId;
	String CustomerName;
	String Address;
	Account[] account;
    String MobileNo;
    String emailId;
    
	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, String address, Account[] account, String mobileNo,
			String emailId) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		Address = address;
		this.account = account;
		MobileNo = mobileNo;
		this.emailId = emailId;
	}

	public int getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}


	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public Account[] getAccount() {
		return account;
	}


	public void setAccount(Account[] account) {
		this.account = account;
	}


	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	

}
