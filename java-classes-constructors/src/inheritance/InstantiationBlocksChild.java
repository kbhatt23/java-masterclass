package inheritance;

public class InstantiationBlocksChild extends InstantiationBlocksParent{
	private String name ="instane variable level";
	public InstantiationBlocksChild() {
		System.out.println("child constructor");
		//name="constructor level";
	}
	static
	{
		System.out.println("child static block 1");
	}
	
	{
		System.out.println("child instance block 1");
		//name = "instnace level 1";
	}
	static
	{
		System.out.println("child static block 2");
	}
	{
		System.out.println("child instance block 2");
		name = "instnace level 2";
	}
	public static void main(String[] args) {
		InstantiationBlocksChild la = new InstantiationBlocksChild();
		System.out.println("====================");
		la = new InstantiationBlocksChild();
		System.out.println("result afdter verything  "+la.name);
	}
}


class InstantiationBlocksParent{

	public InstantiationBlocksParent() {
		System.out.println("super constructor");
	}
	static
	{
		System.out.println("super static block 1");
	}
	
	{
		System.out.println("super instance block 1");
	}
	static
	{
		System.out.println("super static block 2");
	}
	{
		System.out.println("super instance block 2");
	}
}