package sealedclass1;

import sealedclass2.CashPayment;
import sealedclass2.PaytmPayment;

public sealed interface Payment permits CashPayment,PaytmPayment{

	public void pay();
}
