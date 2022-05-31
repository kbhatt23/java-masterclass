package interfaces.defaultandstatic;

public class DefaultAndStaticClient {

	public static void main(String[] args) {
		DefaultAndStaticInterface obj = new DefaultAndStaticImplementor();
		
		obj.greet();
		System.out.println("-=-=-=-=-=-=-");

		obj.defaultShreeRam();
		
		DefaultAndStaticInterface.staticShreeRam();

		//here also can not use static method from object or reference
		//obj.staticShreeRam();
		
	}
}
