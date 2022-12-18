package classloading;

//import classloading.WaysToLoadClass;

public class WaysToLoadClassRunner {

	public static void main(String[] args) {
		System.out.println("started");
		//System.out.println(WaysToLoadClass.test());
		//System.out.println(WaysToLoadClass.field);
		//no need to load class: compiler hardcodes it as it is final
		//hence static block wont be called
		System.out.println(WaysToLoadClass.finalField);
	}
}
