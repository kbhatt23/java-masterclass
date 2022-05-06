public class ConstructorAndInheritance{

//few rules before inheritance
		String name;
		ConstructorAndInheritance(String name){
			
			//here auto no arg super constructor call happens
			this.name = name;
			
		}
		
		ConstructorAndInheritance(){
			
		//first line can either be super (whihc happen automatically)
		//or can be this for overloading constructor
		
		//int ka = 23;
		
		this("RANDOM");
			
			//after this/super we can have anything
			int ka=23;
		}
		
		void print(){
			System.out.println("name is "+name);
		}
	public static void main(String... args){
	ConstructorAndInheritance one = new ConstructorAndInheritance("waah");
	
one.print();	

ConstructorAndInheritance two  = new ConstructorAndInheritance();
two.print();
	}
	
}