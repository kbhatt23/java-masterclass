package polymorphism.notoverridden;

public class SuperSubClassDemo {

	public static void main(String[] args) {
		SubClass childOne = new SubClass();
		System.out.println(childOne.instanceVariable);
		System.out.println(childOne.instanceMethod());
		System.out.println(childOne.staticVariable);
		System.out.println(childOne.staticMethod());
		//11
		//11
		//101
		//101
		
		System.out.println("===============================");
		
		SuperClass childTwo = new SubClass();
		System.out.println(childTwo.instanceVariable);
		System.out.println(childTwo.instanceMethod());
		System.out.println(childTwo.staticVariable);
		System.out.println(childTwo.staticMethod());
		//10
		//11
		//100
		//100		
		
		System.out.println("===============================");
		
		SuperClass parent = new SuperClass();
		System.out.println(parent.instanceVariable);
		System.out.println(parent.instanceMethod());
		System.out.println(parent.staticVariable);
		System.out.println(parent.staticMethod());

		//10
		//10
		//100
		//100		
	}
}
