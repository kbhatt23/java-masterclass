package polymorphism;

public class GrandFather {

	public void greet() {
		System.out.println("GrandFather says pranaam.");
	}
	
	//only exist here in grandfather
	public void specialFeature() {
		System.out.println("grandfather special feature");
		//based on polymorphic object will be called specialzed one
		greet();
	}
}
