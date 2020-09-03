package _static;

public class StaticUsage2 {
	public static void main(String[] args) {
		StaticChildClass obj1 = new StaticChildClass(23);
	StaticChildClass obj2 = new StaticChildClass(24);
	
	obj1.instanceProperty=99;
	obj2.instanceProperty=100;
	obj2.staticProperty=55;
	obj1.staticProperty=66;
	
	System.out.println(obj1.instanceProperty);
	System.out.println(obj2.instanceProperty);
	System.out.println(obj1.staticProperty);
	System.out.println(obj2.staticProperty);
		}

}
