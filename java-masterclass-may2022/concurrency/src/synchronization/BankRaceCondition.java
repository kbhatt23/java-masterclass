package synchronization;

public class BankRaceCondition {

	public static void main(String[] args) {
		System.out.println(10000000/100);
		BankAccount bankAccount = new BankAccount(10000000, 1);
		Thread john =new Thread(new WithdrawTask(bankAccount));
		Thread anita =new Thread(new WithdrawTask(bankAccount));
		
		john.start();
		anita.start();
		
		try {
			john.join();
			anita.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("final account balance "+bankAccount.getBalance());
	}
}

class WithdrawTask implements Runnable{
	private BankAccount bankAccount;
	
	public WithdrawTask(BankAccount bankAccount) {
		this.bankAccount=bankAccount;
	}
	
	public void run() {
		for(int a =0 ; a < 10000 ; a++) {
		//withdraw 100 rs
		this.bankAccount.withdraw(100);
		}
	}
}
