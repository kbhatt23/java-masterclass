package constantspecific;

public enum PaymentStrategyV2 {
	CREDIT_CARD {
		public void pay(double price) {
			System.out.println("credit card payment completed");
		}
	},
	DEBIT_CARD {
		public void pay(double price) {
			System.out.println("debit card payment completed");
		}
	},
	NETBANKING {
		public void pay(double price) {
			System.out.println("netbanking payment completed");
		}
	},
	PAYPAL {
		public void pay(double price) {
			System.out.println("paypal payment completed");
		}
	}
	, GPAY{
		public void pay(double price) {
			System.out.println("GPAY payment completed");
		}
	}
	;

	public abstract void pay(double price);

	public static void main(String[] args) {
		PaymentStrategyV2 creditCard = PaymentStrategyV2.CREDIT_CARD;

		creditCard.pay(23.23d);

		// but in case a new payment staregy comes
		// if dev forget adding code in pay method: that will lead to runtime exception
		// it might be too late of a miss and a dangerous miss

		PaymentStrategyV2.GPAY.pay(66.4d);
	}
}
