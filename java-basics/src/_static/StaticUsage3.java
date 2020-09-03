package _static;

public class StaticUsage3 {
	public static void main(String[] args) {
		// StaticChildClass obj1 = new StaticChildClass(23);
		// StaticChildClass obj2 = new StaticChildClass(24);

		StaticSuperClass obj1 = new StaticChildClass(23);
		StaticSuperClass obj2 = new StaticChildClass(24);

		obj1.instanceMethod();
		obj1.staticMethod();

		obj2.instanceMethod();
		obj2.staticMethod();

		// anonymous inner class
		final int lapela = 23;
		//should not do as it shud beffecively fina

		StaticSuperClass objAnonymous = new StaticSuperClass(33) {
			public void instanceMethod() {
				//effectively final
				//lapela = 10;
				System.out.println("jai shree ram from instance method from anoymous class "+lapela);
				// bith static and isntance variables can be used
				// staticProperty=99;
			}
			// wont be able to use this

			public void newMethod() {

			}
		};
		objAnonymous.instanceMethod();
	}

}
