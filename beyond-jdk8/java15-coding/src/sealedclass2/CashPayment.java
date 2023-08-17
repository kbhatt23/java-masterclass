package sealedclass2;

import sealedclass1.Payment;

public final class CashPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("cash payment");
	}

}
