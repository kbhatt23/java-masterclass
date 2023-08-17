package sealedclass2;

import sealedclass1.Payment;

public final class PaytmPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("paytm payment");
	}

}
