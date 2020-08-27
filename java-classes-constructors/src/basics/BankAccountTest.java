package basics;

public class BankAccountTest {
public static void main(String[] args) {
	BankAccount kanishkaccount = new BankAccount("kanishk", "kanishk@lala.com", 2, "9292929922");
	System.out.println("inital acocunt "+kanishkaccount);
	
	kanishkaccount.debit(2);
	System.out.println("final acocunt "+kanishkaccount);
	
	kanishkaccount.credit(23);
	kanishkaccount.debit(1);
	System.out.println("final proccesed acocunt "+kanishkaccount);
}
}
