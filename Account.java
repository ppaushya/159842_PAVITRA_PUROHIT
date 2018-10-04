package org.cap.demo;


import java.time.LocalDate;

public class Account {

	private long accountNo;
	private AccountType accountType;
	private LocalDate openingDate;
	private double openingBalance;
	public Account() {
		super();
	}
	public Account(long accountNo, AccountType accountType, LocalDate openingDate, double openingBalance) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.openingDate = openingDate;
		this.openingBalance = openingBalance;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public LocalDate getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}
	public double getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountType=" + accountType + ", openingDate=" + openingDate
				+ ", openingBalance=" + openingBalance + "]";
	}
	
	
	

}
