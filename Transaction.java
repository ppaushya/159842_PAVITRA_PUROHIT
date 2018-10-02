import java.sql.Date;

public class Transaction {

	int transId;
	Date transDate;
	double transAmount;
	char transType;
	long accountNo;
	String accountSummary;
	public Transaction() {
		super();
	}
	public Transaction(int transId, Date transDate, double transAmount, char transType, long accountNo,
			String accountSummary) {
		super();
		this.transId = transId;
		this.transDate = transDate;
		this.transAmount = transAmount;
		this.transType = transType;
		this.accountNo = accountNo;
		this.accountSummary = accountSummary;
	}
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}
	public char getTransType() {
		return transType;
	}
	public void setTransType(char transType) {
		this.transType = transType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountSummary() {
		return accountSummary;
	}
	public void setAccountSummary(String accountSummary) {
		this.accountSummary = accountSummary;
	}
	
	
	

}
