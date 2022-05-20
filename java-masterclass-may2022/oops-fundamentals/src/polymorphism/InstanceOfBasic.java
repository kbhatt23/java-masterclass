package polymorphism;

public class InstanceOfBasic {

	public static void main(String[] args) {
		//instanceof means actual object checking
		//if checked for child , for child object and father object returns true
		
		GrandFather grandFather  = new GrandFather();
		
		// instanceof returns true when actual object is itself or parent but false for all other case including child object
		System.out.println(grandFather instanceof GrandFather);
		
		System.out.println(grandFather instanceof Object);
		
		System.out.println(grandFather instanceof ChildOne);
		
		Object a=23;
	}
}
