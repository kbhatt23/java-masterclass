package _static;

public class StaticChildClass extends StaticSuperClass{

	public StaticChildClass(int instanceProperty) {
		super(instanceProperty);
	}
	
	//we can not override the static method
	//however we inherit it

	public static void staticMethod() {
		System.out.println("jai shree ram from static method from child class");
		//static only can be used
		//staticProperty=99;
		//wont work
		//instanceProperty=23;
	}
	
	public  void instanceMethod() {
		System.out.println("jai shree ram from instance method from child class");
		//bith static and isntance variables can be used
		//staticProperty=99;
	}
//public    void finalInstanceMethod() {
		
	//}
}
