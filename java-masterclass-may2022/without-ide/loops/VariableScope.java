public class VariableScope{
	//scope of instance variable or static class variable is all across the class
	
	//this will be usable all across any method/constructor/init block/
	int id=23;
	
	//shadowing wont happen now as scope is same for both varibles
	//int id=99;
	//id=99;
	
	{
		//init block
		id = 24;
		
		//can call static method also
		increment();
	}
	//across any static method or static block
	static int count;
	
	static{
		count=0;
	}
	
	public static void main(String... args){
		//classLevelFieldScope();
		
		methodLevelScope();
		
	}
	static void methodLevelScope(){
		//shadow hapens here fine
		//int id = 44;
		int id = 1;
		//already in scope and hence can not recreate same
		for( ; id < 5 ; id++){
			System.out.println("loop item "+id);
		}
		//int ka = -1;
		int ka;
		if(id > 5)
			 ka=2;
		else
			ka= -1;
		
		//now it is iut of scope
		System.out.println("final item "+id);
		System.out.println("final ka "+ka);
		
	}
	static void classLevelFieldScope(){
		VariableScope obj = new VariableScope();
		obj.validate();
		
		obj = new VariableScope();
		obj.validate();
	}
	
	void validate(){
		System.out.println("id is "+id);
		System.out.println("count is "+count);
		
	}
	
	static void increment(){
		count++;
	}
	
	
}