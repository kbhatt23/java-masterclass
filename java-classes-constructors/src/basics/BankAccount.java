package basics;

public class BankAccount {
	private static final String STATE_ACTIVE = "Active";
	private static final String STATE_INACTIVE = "InActive";
	private String customerName;
	private String email;
	private double balance;
	private String accountNumber;
	private String phoneNumber;
	//state to manage if account is negative balanced or something like that
	//our business logic is we do not allow 0 balnace
	//can be active or blocked
	private String accountState;
	
	public BankAccount(String customerName, String email, double balance, String phoneNumber) {
		if(balance <= 0) {
			throw new RuntimeException("Can not have 0 or negative balance while creating account");
		}
		//could have added other validations
		this.customerName = customerName;
		this.email = email;
		this.balance = balance;
		this.phoneNumber = phoneNumber;
		this.accountNumber = RandomUtils.generateRandomString(14);
		this.accountState=STATE_ACTIVE;
	}
	
	public void debit(double debitAmount) {
		if(this.accountState.equals(STATE_INACTIVE)) {
			throw new RuntimeException("Can not debit from inactive account");
		}
		//we do not allow full balance to go
		//thats the functioanlity
		if(debitAmount > this.balance) {
			throw new RuntimeException("Can not debit the more than balance from account");
		}
		balance-=debitAmount;
		if(balance == 0) {
			this.accountState = STATE_INACTIVE;
		}
	}
	public void credit(double creditAmount) {
		if(creditAmount <= 0) {
			throw new RuntimeException("Can not credit 0 or negative amount in account");
		}
		this.balance+=creditAmount;
		if(this.accountState.equals(STATE_INACTIVE)) {
			this.accountState = STATE_ACTIVE;
		}
	}
	
	
	public String getAccountState() {
		return accountState;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getBalance() {
		return balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	@Override
	public String toString() {
		return "BankAccount [customerName=" + customerName + ", email=" + email + ", balance=" + balance
				+ ", accountNumber=" + accountNumber + ", phoneNumber=" + phoneNumber + ", accountState=" + accountState
				+ "]";
	}
	
}
