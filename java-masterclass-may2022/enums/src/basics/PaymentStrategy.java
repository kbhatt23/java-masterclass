package basics;

public enum PaymentStrategy {
	CREDIT_CARD, DEBIT_CARD, NETBANKING, PAYPAL
	, GPAY
	;
	
	
	// we can implement strategy/constant specific behavior like below
	//create constant instance method
	
	public void pay(double price) {
		System.out.println("paying amount "+price);
		
		switch (this) {
		case CREDIT_CARD:
			System.out.println("credit card payment completed");
			break;
		case DEBIT_CARD:
			System.out.println("credit card payment completed");
			break;
		case NETBANKING:
			System.out.println("credit card payment completed");
			break;
		case PAYPAL:
			System.out.println("credit card payment completed");
			break;
			
		//dev might forget to add adjacent startegy code here
		//compiler suport needed to ensure dev never make mistake
		default:
			throw new IllegalStateException("Payment method: "+this+" not supported.");
		}
	}
	
	public static void main(String[] args) {
		PaymentStrategy creditCard = PaymentStrategy.CREDIT_CARD;
		
		creditCard.pay(23.23d);
		
		//but in case a new payment staregy comes
		// if dev forget adding code in pay method: that will lead to runtime exception
		//it might be too late of a miss and a dangerous miss
		
		PaymentStrategy.GPAY.pay(66.4d);
	}
}
