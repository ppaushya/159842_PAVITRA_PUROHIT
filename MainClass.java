package org.cap.demo;
import org.cap.demo.Address;
import org.cap.demo.Customer;
import org.cap.demo.AccountType;
import java.time.LocalDate;
import java.util.Scanner;
import org.cap.demo.Account;
public class MainClass {

	static Scanner scan=new Scanner(System.in);
	public static Customer[] loadCustomer() {
		Customer[] customers = new Customer[5];
		Address address=new Address("123","Dunetha","daman","DAMAN");
		customers[0]=new Customer(1000,"Ram",address,new Account[5],"78978987","pahanh@hjhj");
		Account account=new Account(1234, AccountType.SAVINGS, LocalDate.now(), 35000);
		customers[0].getAccounts()[0]=account;
		
		Address address1=new Address("North Avennue", "Cross St", "Chennai", "TN");
		customers[1]=new Customer(1001, "Tom",address1 ,new Account[5],  "12453535", "tom@gmail.com");
		Account account1=new Account(16234, AccountType.CURRENT, LocalDate.now(), 15000);
		customers[1].getAccounts()[1]=account1;
		
		
		Address address2=new Address("3453", "Cross St", "MIPL", "TN");
		customers[2]=new Customer(1002, "Jerry",address2 ,new Account[5],  "12453535", "tom@gmail.com");
		Account account2=new Account(1345, AccountType.SAVINGS, LocalDate.now(), 25000);
		customers[2].getAccounts()[2]=account2;
		
		
		Address address3=new Address("West Avennue", "Cross St", "Pune", "MH");
		customers[3]=new Customer(1003, "Kamal",address3 ,new Account[5],   "43543543", "kamal@gmail.com");
		Account account3=new Account(17676, AccountType.RD, LocalDate.now(), 25000);
		customers[3].getAccounts()[3]=account3;
		
		Address address4=new Address("East Avennue", "Cross St", "Delhi", "UP");
		customers[4]=new Customer(1004, "Jasmine",address4 , new Account[5], "35235425", "jas@gmail.com");
		Account account4=new Account(156723, AccountType.SAVINGS, LocalDate.now(), 55000);
		customers[4].getAccounts()[4]=account4;
		
		return customers;
	}
	
	public static void printCustomers() {
		System.out.println("Registered Customers");
		Customer[] customers=loadCustomer();
		for(Customer customer:customers) {
			System.out.println(customer.getCustomerId()+"\t"+customer.getCustomerName()+"\t "+
		customer.getMobileNo()+"\t"+customer.getEmailId());
		}
	}
	public static Customer findCustomer(int customerId) {
		for(Customer customer:loadCustomer()) {
			if(customer.getCustomerId()==customerId)
				return customer;
		}
		return null;
	}
	
	public static void printAccountType() {
		AccountType[] types=AccountType.values();
		int count=0;
		for(AccountType type: types) {
			System.out.println(count+++"."+type);
		}
	}
	
	public static AccountType assignAccountType(int value) {
		switch(value) {
		case 1:
			return AccountType.SAVINGS;
		case 2:
			return AccountType.CURRENT;
		case 3:
			return AccountType.RD;
		case 4:
			return AccountType.FD;
		default:
			System.out.println("Invalid Account Type");
			System.exit(0);
		}
		
		return null;
	}
	

	public static void printTransactionSummary(Transaction[] transactions) {
		System.out.println("\nTRANSACTION SUMMARY\n--------------------\n");
		
		for(Transaction transaction:transactions) {
			if(transaction!=null) {
			System.out.println(transaction.getTransDate() +"\t"
					+ transaction.getTransId()+"\t"
					+ transaction.getAccount().getAccountNo()+"\t"
					+transaction.getTransType()+"\t"
					+transaction.getTransAmount()
					);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Transaction[] transactions=new Transaction[100];
		int customerId;
		int choice;
		char myChoice;
		int accountTypeno;
		
     
		printCustomers();
		System.out.println("Enter customer ID:");
	    customerId = scan.nextInt();
	    Customer customer= findCustomer(customerId);
	do {    if(customer!=null) {
	    	System.out.println("1.CREATE NEW ACCOUNT");
	    	System.out.println("2.PERFORM TRANSACTIONS");	
	    	System.out.println("3.PRINT TRANSACTIONS");	
	    	System.out.println("ENTER YOUR CHOICE NUMBER");
	    	choice=scan.nextInt();
	    	if(choice==1) {
	    		Account account=new Account();
	    		System.out.println("ENTER ACCOUNT DETAILS:");
	    		account.setAccountNo(AccountTransaction.generateAccountNo());
	    		
	    		System.out.println("CHOOSE ACCOUNT TYPE[1,2,3,4]");
	    		printAccountType();
	    		accountTypeno = scan.nextInt();
	    		account.setAccountType(assignAccountType(accountTypeno));
	    		System.out.println("ENTER ACCOUNT OPENING DATE");
	    		System.out.println("ENTER YEAR:");
	    		int year=scan.nextInt();
	    		System.out.println("ENTER MONTH:");
	    		int month=scan.nextInt();
	    		System.out.println("ENTER DAY OF MONTH:");
	    		int dayOfMonth=scan.nextInt();
	    		
	    		LocalDate date=LocalDate.of(year, month, dayOfMonth);
	    		account.setOpeningDate(date);
	    		
	    		System.out.println("ENTER OPENING BAALNCE:");
	    		account.setOpeningBalance(scan.nextDouble());
	    		
	    		Account[] account2=customer.getAccounts();
	    		for(int i=0;i<account2.length;i++) {
	    			if(account2[i]!=account) {
	    				account2[i]=account;
	    				break;
	    			}
	    		}
	    		System.out.println(customer);
	    		
	    		
	    		
	    	}
	    	else if(choice==2) {
	    		int index=0;
	    		AccountTransaction trans=new AccountTransaction();
	    		Transaction transaction;
	    		
	    		System.out.println("CHOOSE ANY ONE OF THE ACCOUNT NO:");
	    		
	    		if(customer.getAccounts()[0]!=null) {
	    	       customer= findCustomer(customerId);
	    	       System.out.println(customer);
	    	       System.out.println(customer.getAccounts());
	    			transaction = new Transaction();
	    		}
	    		else
	    			System.out.println("THIS ACCOUNT DOES NOT EXIST");
	    		
	    		long accountNo=scan.nextLong();
	    		
	    		if(trans.isValidAccount(accountNo, customer)) {
	    			transaction=new Transaction();
	    			
	    			System.out.println("1.DEPOSIT");
	    			System.out.println("2.WITHDRAW");
	    			System.out.println("CHOOSE");
	    			int option=scan.nextInt();
	    			if(option==1)
	    				transaction.setTransType("CREDIT");
	    			else if(option==2)
	    				transaction.setTransType("DEBIT");
	    			else {
	    				System.out.println("INVALID OPTION");
	    				System.exit(0);
	    			}
	    			Account account=trans.findAccount(accountNo, customer);
					transaction.setAccount(account);
					transaction.setTransDate(LocalDate.now());
	    			
					System.out.println("Enter amount to deposit:");
					transaction.setTransAmount(scan.nextDouble());
					transactions[index]=transaction;
					index++;
	    			
	    		}
	    	}
	    	
	    	else if(choice==3) {
	    		
	    		printTransactionSummary(transactions);
	    	
	    	}
	    	
	    	
	    	else {
	    		System.out.println("INVALID RESPONSE");
	    		System.exit(0);
	    	}
	    } 
	    	else {
				System.out.println("Invalid Customer Number! Please try.");
			}
			
			System.out.println("Would you like to continue[y|n]?");
			myChoice=scan.next().charAt(0);
			
	} while(myChoice=='y'||myChoice=='Y');
}
}

			
	    	
	    

	    
		

	


