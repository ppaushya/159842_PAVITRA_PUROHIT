package org.cap.demo;


import java.time.LocalDate;

public class Transaction {

	private int transId;
	private LocalDate transDate;
	private double transAmount;
	private String transType;
	private long accountNo;
	private Account account;
	public Transaction() {
		super();
	}
	@Override
	public String toString() {
		return "Transaction [transId=" + transId + ", transDate=" + transDate + ", transAmount=" + transAmount
				+ ", transType=" + transType + ", accountNo=" + accountNo + ", account=" + account + "]";
	}
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public LocalDate getTransDate() {
		return transDate;
	}
	public void setTransDate(LocalDate transDate) {
		this.transDate = transDate;
	}
	public double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transactionType) {
		this.transType = transactionType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Transaction(int transId, LocalDate transDate, double transAmount,String transType, long accountNo,
			Account account) {
		super();
		this.transId = transId;
		this.transDate = transDate;
		this.transAmount = transAmount;
		this.transType = transType;
		this.accountNo = accountNo;
		this.account = account;
	}
	
}