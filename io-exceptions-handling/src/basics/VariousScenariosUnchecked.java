package basics;

//unchecked exception only
public class VariousScenariosUnchecked {
	public static void main(String[] args) {
		try {
			method1();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	private static void method1() {
		System.out.println("method 1 called");
		try {
			method2();
		} catch (RuntimeException e) {
			System.out.println("jai shree ram to support issue");
			// hiding statkctrace
			// this helps in unnecessay showing of stack trace, claler method main will
			// think issue occured in this method only
			// after this methoid nothing will be printed
			//throw e;
		}
	}

	// thros in method means it can or can not throw excpeion -> not mandaotry to
	// throw any exception actually in emthod
	// also uncheced exception are not foreced by complier to be hadnled someher in
	// calling method, or method where exception occurred
	private static int method2() throws RuntimeException {
		System.out.println("method 2 called");
		// forcing runtinme /unchekd exception
		int y = 0;
		int x = 23;
		return x / y;
	}
}
