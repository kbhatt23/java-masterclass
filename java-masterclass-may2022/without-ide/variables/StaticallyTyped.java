public class StaticallyTyped{
	//java is top down and hence wont work
		//int b = a+1;
	int a = 23;
	
	static int autoStatic;
	static int autoInit;
	
	//reassignment can not happen at field level
	//a=32;
	int b = a+1;
	
	public static void main(String... args){
		int number = 23;
		
		//once data type is defined we can not redefine data type of same variable
		//String number = "23";
		
		StaticallyTyped obj = new StaticallyTyped();
		System.out.println("number: "+number);
		System.out.println("a: "+obj.a+", b: "+obj.b);
		
		//if one item is String it is always concat unlike forced
		
				System.out.println(obj.a + 2 + " says jai shree ram");
				
				System.out.println("autoInit: "+obj.autoInit);
				System.out.println("autoStatic: "+autoStatic);
				
				
				
				
		
	}
}