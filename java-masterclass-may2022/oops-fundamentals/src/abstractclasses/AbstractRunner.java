package abstractclasses;

public class AbstractRunner {

	public static void main(String[] args) {
		//abstract class can not be instantiated
		//AbstractSuperClass obj  = new AbstractSuperClass();
		//AbstractSuperClass obj  = new AbstractSubClass();
		
		AbstractSubClass obj = new LighterConcreteClass();
		
		utilize(obj);
		System.out.println("\n\n\n\n");
		
		obj = new MobileConcreteClass();
		utilize(obj);
		
	}
	//polymorphic method
	//better ultity
	//clean code
	//no change in future
	private static void utilize(AbstractSubClass obj) {
			obj.features();
	}
}
