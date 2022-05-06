public class AutoConstructorDemo{

	int num;
	
	void print(){
		System.out.println("val is "+num);
		
	}
	
	//it ignores default no arg constructor if we define any other constructor
	AutoConstructorDemo(int la){
		num=la;
		
	}
	
	AutoConstructorDemo(){
		num=99;
		//can not return any value
		//return num;
		
		//however we can return void 
		return;
		
		//but now after return we can not add any code as it is unreachable and code wont compile
		
		//int a = 22;
	}
	
	public static void main(String... args){
		
		//no constructor defined hence it will work
		AutoConstructorDemo obj = new AutoConstructorDemo(32);
		
		obj.print();
		
		//no arg wont work until we manually add constructor
		AutoConstructorDemo obj1 = new AutoConstructorDemo();
		
		obj1.print();
		
	}

}