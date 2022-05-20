package inheritance.package1;

public class PowerFulClass {

	// private means no one can access apart from this class and inner class

	// rule is same for inheritance as well as object invocation or class invocation

	private int privateVariable = 23;

	private int privateMethod() {
		return privateVariable;
	}

	int defaultVariable = 101;

	int defaultMethod() {
		return defaultVariable;
	}

	protected int protectedVariable = 7;

	protected int protectedMethod() {
		return protectedVariable;
	}

	protected static int protectedStaticVariable = -1;

	protected static int protectedStaticMethod() {
		return protectedStaticVariable;
	}

	static int defaultStaticVariable = 109;

	static int defaultStaticMethod() {
		return defaultStaticVariable;
	}

	private static int privateStaticVariable = 99;

	private static int privateStaticMethod() {
		return privateStaticVariable;
	}

	public static void main(String[] args) {
		// this class can call private members as well

		System.out.println(privateStaticVariable);
		System.out.println(privateStaticMethod());

		PowerFulClass obj = new PowerFulClass();
		System.out.println(obj.privateVariable);
		System.out.println(obj.privateMethod());
	}
}
