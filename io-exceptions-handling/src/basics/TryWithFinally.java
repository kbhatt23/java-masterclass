package basics;

public class TryWithFinally {
public static void main(String[] args) {
	try {
		method1();
		System.out.println("completed succesully and hence jai shree ram");
	} catch (CheckedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

private static void method1() throws CheckedException{
	System.out.println("method 1 called");
	try {
		method2();
	} catch (CheckedException e) {
		System.out.println("jai shree ram in method 1");
	}
	finally {
		System.out.println("cleaning up connections in method 1");
	}
}

private static void method2() throws CheckedException{
	System.out.println("method 2 called");	
	throw new CheckedException();
} 

}
