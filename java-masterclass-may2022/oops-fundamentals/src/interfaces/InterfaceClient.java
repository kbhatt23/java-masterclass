package interfaces;

public class InterfaceClient {

	public static void main(String[] args) {
		SuperInterface obj = new InterfaceRealChild();
		test(obj);
		System.out.println("\n\n\n\n");
		
		SuperInterface obj2 = new InterfaceFakeChild();
		test(obj2);
		
		//not possible to instantiate interface or abstract class
		//SuperInterface one  = new SuperInterface();
	}

	private static void test(SuperInterface obj) {
		obj.foo();
		obj.bar();
		
		if(obj instanceof InterfaceAbstractChild)
			((InterfaceAbstractChild)obj).lalla();
		
		//static and hence no need of object type
		//alwayw will be present on the interface
		System.out.println(obj.NUM);
	}
}
