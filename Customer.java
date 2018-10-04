package org.cap.demo;

import java.util.Arrays;

public class Customer {

	 private int CustomerId;
	 private String CustomerName;
	 private  Address address;
	 private Account[] accounts=new Account[5];
	 private String MobileNo;
	 private String emailId;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
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
	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", address=" + address
				+ ", accounts=" + Arrays.toString(accounts) + ", MobileNo=" + MobileNo + ", emailId=" + emailId + "]";
	}
	public Customer(int customerId, String customerName, Address address, Account[] accounts, String mobileNo,
			String emailId) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		this.address = address;
		this.accounts = accounts;
		MobileNo = mobileNo;
		this.emailId = emailId;
	}
	public Customer() {
		super();
	}
    
	

	

}