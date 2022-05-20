package polymorphism.notoverridden;

public class NotOverridenClient {

	public static void main(String[] args) {
		
		ParentNotOverridenExample parent = new ParentNotOverridenExample();
		
		//10
		System.out.println(parent.instanceVariable);
		
		//10
		System.out.println(parent.instanceMethod());
		
		//100
		System.out.println(parent.staticVariable);
		
		//100
		System.out.println(parent.staticMethod());
		
		
		System.out.println("--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--==-=-=--");
		
		
		ParentNotOverridenExample child1 = new ChildNotOverridenExample();
		
		//10
		System.out.println(child1.instanceVariable);
		
		//11
		System.out.println(child1.instanceMethod());
		
		//100
		System.out.println(child1.staticVariable);
		
		//100
		System.out.println(child1.staticMethod());
		
		System.out.println("--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--==-=-=--");
		
		
		ChildNotOverridenExample child2 = new ChildNotOverridenExample();
		//11
		System.out.println(child2.instanceVariable);
		
		//11
		System.out.println(child2.instanceMethod());
		
		//101
		System.out.println(child2.staticVariable);
		
		//101
		System.out.println(child2.staticMethod());
		
	}
}
