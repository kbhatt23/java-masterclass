package polymorphism;

public class PlymorphismTest {

	public static void main(String[] args) {
		GrandFather grandFather = new GrandFather();
		greet(grandFather);
		
		GrandFather father = new Father();
		greet(father);
		
		ChildOne childOne  = new ChildOne();
		greet(childOne);
		Father childTwo = new ChildTwo();
		greet(childTwo);
	}
	
	//polymorphic method
	//same method can be used for all child
	//code resuability no duplication
	//clean
	//more flexible future child will also behave same
	private static void greet(GrandFather grandFather) {
		grandFather.greet();
	}
}
