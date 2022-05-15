package initblocks;

//Init Block is used to initialize instance fields of class
//Why we have constructors
//we must know that compiler call all the init blocks one by one before any constructor call
//so common code need not to be duplicated and kept here in init block
public class InitBlockReason {
	
	//be it static or instance once assigned can not reassing on class level directly
	static int a = 23;
	int b=a;
	//not possible ro reassign instance or static field
	//a=29;

	private  int id;
	
	public InitBlockReason() {
		System.out.println("no args constructor called");
	}
	
	public InitBlockReason(int id) {
		System.out.println("int constructor called");
		this.id=id;
	}
	//steps : first super constructor completes -> init variable from top to down and then constructor code
	//hence any common code can be kept here at one go and all constructor will get this excecuted: no duplicate code in constructor
	{
		System.out.println("init block called");
	}
	
	public static void main(String[] args) {
		InitBlockReason one = new InitBlockReason();
		
		System.out.println();
		
		InitBlockReason two = new InitBlockReason(23);
	}
}
