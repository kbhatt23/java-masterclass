package inheritance.package1;

public class AnotherClassInSamePackage extends PowerFulClass{

	public static void main(String[] args) {
		objectUsage();
		
		inheritanceUsage();
		
	}

	private static void inheritanceUsage() {
		//extends behave same way for all except package
		AnotherClassInSamePackage child = new AnotherClassInSamePackage();
		
		//private variables or method (static or init) can not be called
		
		//can not call static variable and methods
		//wont inherit and hence can not see here
		//System.out.println(AnotherClassInSamePackage.privateStaticVariable);
		//System.out.println(AnotherClassInSamePackage.privateStaticMethod());
		
		
		//private init method also not visible
		//can not inherit
		//System.out.println(child.privateVariable);
		//System.out.println(child.privateMethod());
		
		//default is accessible with no import of class and within same package
		System.out.println(AnotherClassInSamePackage.defaultStaticVariable);
		System.out.println(AnotherClassInSamePackage.defaultStaticMethod());
		
		System.out.println(child.defaultVariable);
		System.out.println(child.defaultMethod());
		
		//protected means within package same as default
				//but outside package its private except extends
		
		System.out.println(child.protectedVariable);
		System.out.println(child.protectedVariable);
	}

	private static void objectUsage() {
		//private variables or method (static or init) can not be called
		
		//can not call static variable and methods
		//System.out.println(PowerFulClass.privateStaticVariable);
		//System.out.println(PowerFulClass.privateStaticMethod());
		
		
		PowerFulClass obj  = new PowerFulClass();
		//private init method also not visible
		//System.out.println(obj.privateVariable);
		//System.out.println(obj.privateMethod());
		
		//default is accessible with no import of class and within same package
		System.out.println(PowerFulClass.defaultStaticVariable);
		System.out.println(PowerFulClass.defaultStaticMethod());
		
		System.out.println(obj.defaultVariable);
		System.out.println(obj.defaultMethod());
		
		//protected means within package same as default
				//but outside package its private except extends
		
		System.out.println(obj.protectedVariable);
		System.out.println(obj.protectedVariable);
		
	}
}
