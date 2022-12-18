package classloading;

public class ImporterClassLoader {


	static {
		System.out.println("Runner static block");
	}
	
	public static void main(String[] args) {
		Imported.print();
	}
}

class Imported{

	static {
		System.out.println("Imported static block");
	}
	
	static void print() {
		System.out.println("jai shree sita rama lakshman hanuman");
	}
	
}
