public class ConstructorAndSuperThisRules{

//few rules before inheritance
		String name;
		ConstructorAndSuperThisRules(String name){
			//cyclic call wont complile
			//this();
			//here auto no arg super constructor call happens
			this.name = name;
			
		}
		
		ConstructorAndSuperThisRules(){
			
		//first line can either be super (whihc happen automatically)
		//or can be this for overloading constructor
		
		//int ka = 23;
		
		this("RANDOM");
			
		//can not call this multiple time or same with super
//this("ANOTHER");		
			//after this/super we can have anything
			int ka=23;
		}
		
		void print(){
			System.out.println("name is "+name);
		}
	public static void main(String... args){
	ConstructorAndSuperThisRules one = new ConstructorAndSuperThisRules("waah");
	
one.print();	

ConstructorAndSuperThisRules two  = new ConstructorAndSuperThisRules();
two.print();
	}
	
}