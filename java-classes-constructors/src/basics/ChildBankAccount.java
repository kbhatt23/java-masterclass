package basics;

public class ChildBankAccount extends BankAccount{
//below construcor is needed
	//or else in bankaccount class forcefully creates no arg constructor
	public ChildBankAccount(String customerName, String email, double balance, String phoneNumber) {
		super(customerName, email, balance, phoneNumber);
		// TODO Auto-generated constructor stub
	}

}
