package classloading;

public class BasicClassLoadExample {

	static {
		System.out.println("Runner static block");
	}
	
	{
		System.out.println("Runner init block");
	}
	
	public BasicClassLoadExample() {
		System.out.println("Runner constructor");
	}
	public static void main(String[] args) {
		System.out.println("jai shree sita rama lakshman hanuman");
		new BasicClassLoadExample().hello();
		System.out.println("======================");
		new BasicClassLoadExample().hello();
	}
	
	public void hello() {
		System.out.println("hello says sita rama lakshman hanuman");
	}
}
