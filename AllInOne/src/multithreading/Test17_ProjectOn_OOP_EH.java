package multithreading;

/**
 * Develop Bank application with multi-threading features
 * 	- perform deposit() and withdraw() operations 
 *    for 3 accounts concurrently
 *    
 *    on acc1 and acc2 perform deposit() operations
 *    on acc3 perform withdraw() operation concurrently 
 *  from 3 threads
 *    
 */

class NegativeAmountException extends Exception {
	
	public static final long serialVersionUID = 1L;

	public NegativeAmountException() {

	}
	
	public NegativeAmountException(String msg) {
		super(msg);
	}
}

//InsufficientFundsException.java
class InsufficientFundsException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public InsufficientFundsException() {
		
	}
	
	public InsufficientFundsException(String msg) {
		super(msg);
	}
}

//BankAccount.java

interface BankAccount {
	void deposit(double amt) throws NegativeAmountException;
	
	void withdraw(double amt) throws NegativeAmountException, 
									   InsufficientFundsException;
	
	void currentBalance();
}

//HDFCBankAccount.java

class HDFCBankAccount implements BankAccount {
	
	private long accNum;
	private String accHName;
	private double balance;

	public HDFCBankAccount(long accNum, String accHName, double balance) {
		this.accNum = accNum;
		this.accHName = accHName;
		this.balance = balance;
	}

	@Override
	public void deposit(double amt) throws NegativeAmountException {

		if(amt<=0)
			throw new NegativeAmountException("amt can not zero or -ve value");
			
		this.balance = this.balance + amt;
		System.out.println(amt + " is deposited in account "+ accNum);
	}
	
	@Override
	public void withdraw(double amt) 
			throws NegativeAmountException, InsufficientFundsException {
		
		if(amt<=0)
			throw new NegativeAmountException("amt can not zero or -ve value");

		if(amt>balance)
			throw new InsufficientFundsException("Insufficient Funds");
		
		this.balance = this.balance - amt;
		System.out.println(amt + " is withdrawn from account "+ accNum);
	}
	
	@Override
	public void currentBalance() {
		System.out.println(accNum + " current balance: "+ balance);
		
	}
}
//depositerThread.java
class DepositerThread extends Thread {
	
	private BankAccount acc;
	private double amt;
	
	public DepositerThread(BankAccount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
	}

	@Override
	public void run() {
		try {
			acc.deposit(amt);
		}catch (NegativeAmountException  e) {
			System.out.println(e.getMessage());
		}
	}
}

//WithdraweeThread.java
class WithdraweeThread extends Thread {
	private BankAccount acc;
	private double amt;
	
	public WithdraweeThread(BankAccount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
	}

	@Override
	public void run() {
		try {
			acc.withdraw(amt);
		} catch (NegativeAmountException | InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class Test17_ProjectOn_OOP_EH {
	
	public static void main(String[] args) throws InterruptedException {
		
		HDFCBankAccount acc1 = new HDFCBankAccount(1234, "HK", 10000);
		HDFCBankAccount acc2 = new HDFCBankAccount(4567, "BK", 20000);
		HDFCBankAccount acc3 = new HDFCBankAccount(4321, "PK", 30000);

		acc1.currentBalance(); 
		acc2.currentBalance(); 
		acc3.currentBalance(); 
		
		System.out.println();
		
		DepositerThread dt1 = new DepositerThread(acc1, 5000);
		DepositerThread dt2 = new DepositerThread(acc2, 3000);
		WithdraweeThread dt3 = new WithdraweeThread(acc3, 2000);

		dt1.start();
		dt2.start();
		dt3.start();
		
		Thread.sleep(5000); //pausing main thread for 5 seconds
		System.out.println();
		
		acc1.currentBalance(); 
		acc2.currentBalance(); 
		acc3.currentBalance(); 
		
	}
}

