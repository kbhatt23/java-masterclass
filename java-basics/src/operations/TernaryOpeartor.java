package operations;

public class TernaryOpeartor {
public static void main(String[] args) {
	int age=18;
	//always teranry orpeator has to return some vlaue and hence assingement is necessity
	 //age > 18 ? runMethod1(): runMethod2();
	boolean isAdult = age >= 18 ? true : false;
	System.out.println(isAdult);
	
	//operaor precendence
	int result = 23*13/10;
	System.out.println(result);
}
private static void runMethod2() {
	System.out.println("running method1");
}
public static void runMethod1() {
	System.out.println("running method1");
}
}
