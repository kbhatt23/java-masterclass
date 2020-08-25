package overridingrules;

public class FakeFather {

	public void fakeMethod(long num1, int num2) {

	}

	public void fakeMethod(Integer num1, int num2) {

	}

//overloading rule
//any method shud not have existingn method name and argumens st same as already defined method
//just changing return type wont help
	public /* int */ void fakeMethod(int num1, int num2) {

	}
}

class FakeChild extends FakeFather {
	// overloaded
	private void fakeMethod(double num1, int num2) {

	}

	/* private */ public void fakeMethod(Integer num1, int num2) {

	}
}