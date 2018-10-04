package org.cap.demo;

public class AccountTransaction {

	public static long generateAccountNo() {
		return (long)(Math.random()*1000)/10;
	}
	
	public boolean isValidAccount(long accountNo,Customer customer) {
		boolean flag=false;
		
		for(Account account:customer.getAccounts()) {
			if(account!=null) {
				if(account.getAccountNo()==accountNo) {
					flag=true;
					break;
				}
			}
		}
		
		return flag;
		
	}
	
public Account findAccount(long accountNo,Customer customer) {
		
		
		for(Account account:customer.getAccounts()) {
			if(account!=null) {
				if(account.getAccountNo()==accountNo) {
					return account;
				}
			}
		}
		
		return null;
	}
	
	
	
}
