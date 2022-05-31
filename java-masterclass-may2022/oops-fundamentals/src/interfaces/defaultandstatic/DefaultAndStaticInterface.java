package interfaces.defaultandstatic;

public interface DefaultAndStaticInterface {

	void greet();
	
	default void defaultShreeRam() {
		System.out.println("interface default says jai shree sita ram");
		
		//magic within interface this is possible
		staticShreeRam();
	}
	
	static void staticShreeRam() {
		System.out.println("interface static says jai shree sita ram");
		
		//not possible
		//defaultShreeRam();
	}
}
