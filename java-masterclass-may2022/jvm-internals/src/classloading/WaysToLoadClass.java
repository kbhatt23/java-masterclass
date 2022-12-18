package classloading;

//when object is created
//when static method is called
//when static field is called
// exception: when fields is static and final it is skipped as compiler inserts raw value at compile time itself
public class WaysToLoadClass {

	static {
		System.out.println("jai shree sita rama lakshman hanuman says static block");
	}
	
	static String test() {
		return "test";
	}
	
	static int field=99;
	
	public static final int finalField=99;
	
	
}
