package synchronization;

public class BankAccount {

	//made volatile so that get call need not be synchronized
	private volatile int balance;
	
	private final int accountNumber;

	public BankAccount(int balance, int accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public synchronized void withdraw(int amount) {
		if(this.balance > 0 && this.balance >= amount)
			this.balance = this.balance - amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	
	
	
}
