package initblocks;

//sequnce of calls that compiler do for static,init and constructor blocks
public class StaticAndInitBlocksFlow extends StaticAndInitBlocksFlowParent{

	
	static {
		System.out.println("child static block 1");
	}
	
	{
		System.out.println("child init block 1");
	}
	
	public StaticAndInitBlocksFlow() {
		System.out.println("Child Constructor called.");
	}
	
	public StaticAndInitBlocksFlow(int id) {
		System.out.println("Child int Constructor called.");
	}
	
	static {
		System.out.println("child static block 2");
	}
	
	{
		System.out.println("child init block 2");
	}
	
	public static void main(String[] args) {
		StaticAndInitBlocksFlow one  = new StaticAndInitBlocksFlow();
		
		//Sequence of calls
		//Static blokc of super top to down -> static blocks of child top to down
		// -> init block of super -> constructor of super -> init block of child -> construtor of child
		
		//also make a note that static block will get called only once per jvm call
		System.out.println(one);
		System.out.println();
		
		//now static blocks wont be executed
		StaticAndInitBlocksFlow two  = new StaticAndInitBlocksFlow(2);
		
	}
}
