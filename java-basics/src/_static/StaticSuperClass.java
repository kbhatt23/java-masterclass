package _static;

public class StaticSuperClass {

	public static int staticProperty =10;
	public int instanceProperty;
	public StaticSuperClass(int instanceProperty) {
		this.instanceProperty = instanceProperty;
	}
	
	public static void staticMethod() {
		System.out.println("jai shree ram from static method from super class");
		//static only can be used
		//staticProperty=99;
		//wont work
		//instanceProperty=23;
		//however object creation thing works
		//StaticSuperClass obj = new StaticSuperClass(87);
		//obj.instanceProperty=0;
	}
	public  void instanceMethod() {
		System.out.println("jai shree ram from instance method from super class");
		//bith static and isntance variables can be used
		//staticProperty=99;
	}
	
	public   final void finalInstanceMethod() {
		
	}
	
}
