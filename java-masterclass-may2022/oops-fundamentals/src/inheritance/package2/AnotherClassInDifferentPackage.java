package inheritance.package2;

import inheritance.package1.PowerFulClass;

public class AnotherClassInDifferentPackage extends PowerFulClass {

	public static void main(String[] args) {
		objectUsage();
		inheritanceUsage();

	}

	private static void inheritanceUsage() {
		// extends behave same way for all except package
		AnotherClassInDifferentPackage child = new AnotherClassInDifferentPackage();

		// private variables or method (static or init) can not be called

		// can not call static variable and methods
		// wont inherit and hence can not see here
		// System.out.println(AnotherClassInDifferentPackage.privateStaticVariable);
		// System.out.println(AnotherClassInDifferentPackage.privateStaticMethod());

		// private init method also not visible
		// can not inherit
		// System.out.println(child.privateVariable);
		// System.out.println(child.privateMethod());

		// default is not accessible in diff package
		// import of class ins mandaotry
		// System.out.println(AnotherClassInDifferentPackage.defaultStaticVariable);
		// System.out.println(AnotherClassInDifferentPackage.defaultStaticMethod());

		// System.out.println(child.defaultVariable);
		// System.out.println(child.defaultMethod());

		// protected means within package same as default
		// but outside package its private except extends

		System.out.println(child.protectedVariable);
		System.out.println(child.protectedVariable);

		// protected static methods are also inherited
		System.out.println(AnotherClassInDifferentPackage.protectedStaticVariable);
		System.out.println(AnotherClassInDifferentPackage.protectedStaticMethod());
	}

	private static void objectUsage() {
		// private variables or method (static or init) can not be called

		// can not call static variable and methods
		// but outside the package needs import statement
		// System.out.println(PowerFulClass.privateStaticVariable);
		// System.out.println(PowerFulClass.privateStaticMethod());

		PowerFulClass obj = new PowerFulClass();
		// private init method also not visible
		// System.out.println(obj.privateVariable);
		// System.out.println(obj.privateMethod());

		// import is amndatory as outside pacakge
		// and default members accesible only within same package classes
		// System.out.println(PowerFulClass.defaultStaticVariable);
		// System.out.println(PowerFulClass.defaultStaticMethod());

		// System.out.println(obj.defaultVariable);
		// System.out.println(obj.defaultMethod());
	}
}
