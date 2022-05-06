public class ConstructorOverloading{

	//overloading rules like method shuld be followed
	
	String name;
	
	int id;
	
	static int currentId;
	
	//can be used for super copy, other constructor internally can call this
	ConstructorOverloading(int id,String name){
		this.id=id;
		this.name=name;
		
		//can also call method from here
		print();
	}
	
	//same method argumentts and hence wont compile
	//ConstructorOverloading(int id,String name){
		
		//arguments are change due to order hene wwill work but it is bad
		/*ConstructorOverloading(String name,int id){
		this.id=id;
		this.name=name;
	}*/
	
	//good for client flexiblity
	ConstructorOverloading(String name){
		//first line should be super or this  other code and then super or this wont work
		//currentId++;
		
		//lets not do duplication and call other constructor
		
		this(++currentId,name);
		
	}
	
	void print(){
		
		System.out.println("name is "+name+", id is "+id);
	}
	
	public static void main(String... args){
	
		ConstructorOverloading _1 = new ConstructorOverloading(1,"kanishk");
		//ConstructorOverloading _2 = new ConstructorOverloading("debu",2);
		ConstructorOverloading _2 = new ConstructorOverloading(2,"debu");
		
		//moved to constructor as it can call instance as well as static method
		//_1.print();
		//_2.print();
		
				ConstructorOverloading _10 = new ConstructorOverloading("kaka");
		
		ConstructorOverloading _11 = new ConstructorOverloading("dhaba");
		
		//_10.print();
		//_11.print();
		
		
	}

}