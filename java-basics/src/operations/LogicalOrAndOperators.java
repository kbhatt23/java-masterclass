package operations;

public class LogicalOrAndOperators {
public static void main(String[] args) {
	// &&  operator significance
	if(returnFalse() & returnTrue()) {
		System.out.println("condition met");
	}
	System.out.println("using shorthand operators");
	if(returnFalse() && returnTrue()) {
		System.out.println("condition met");
	}
	
	System.out.println("lets go for antoher shorthand operator");
	if(returnTrue() | returnFalse()) {
		System.out.println("Or operator ki jeet");
	}
	System.out.println("lets go for good or operator");
	if(returnTrue() || returnFalse()) {
		System.out.println("Or operator ki jeet");
	}
}

public static boolean returnTrue() {
	System.out.println("calling returnTrue");
	return true;
}
public static boolean returnFalse() {
	System.out.println("calling returnFalse");
	return false;
}

}
