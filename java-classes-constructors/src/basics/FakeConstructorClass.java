package basics;

public class FakeConstructorClass {

	public FakeConstructorClass(int la1) {
	}
	public FakeConstructorClass(String ka) {
		this(23);
	}
}
