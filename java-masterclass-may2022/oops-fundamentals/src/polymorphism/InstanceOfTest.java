package polymorphism;

public class InstanceOfTest {

	public static void main(String[] args) {
		//this one not possibl;e hence error occurs
		//ChildOne fake = new GrandFather();
		instanceOFTest(new GrandFather());
		instanceOFTest(new Father());
		instanceOFTest(new ChildTwo());
		instanceOFTest(new ChildOne());
	}
	
	public static void instanceOFTest(GrandFather grandFather) {
		//can invoke method only present in grandFather
		
		//or else type cast
		if(grandFather instanceof ChildOne)
			((ChildOne)grandFather).bakwaasFeature();
		else
			System.out.println("not supported");
		
	}
}
