package initblocks;

public class StaticAndInitBlocksFlowParent {

	static {
		System.out.println("Parent static block 1");
	}
	
	{
		System.out.println("parent init block 1");
	}
	
	public StaticAndInitBlocksFlowParent() {
		System.out.println("Parent Constructor called.");
	}
	
	static {
		System.out.println("Parent static block 2");
	}
	
	{
		System.out.println("parent init block 2");
	}
	
}
