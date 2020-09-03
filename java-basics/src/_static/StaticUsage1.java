package _static;

public class StaticUsage1 {
	public static void main(String[] args) {
		StaticSuperClass obj1 = new StaticSuperClass(11);
		obj1.instanceProperty=33;
		obj1.staticProperty=99;
		
		StaticSuperClass obj2 = new StaticSuperClass(11);
		obj2.instanceProperty=34;
		obj2.staticProperty=101;
		
		System.out.println(obj1.instanceProperty);
		System.out.println(obj2.instanceProperty);
		
		System.out.println(obj1.staticProperty);
		System.out.println(obj2.staticProperty);
	}

}
