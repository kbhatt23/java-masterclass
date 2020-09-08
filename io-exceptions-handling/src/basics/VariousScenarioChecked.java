package basics;

//unchecked exception only
public class VariousScenarioChecked {
	public static void main(String[] args) {
		try {
			method1();
		} catch (CheckedException e) {
			// TODO Auto-generated catch block
			System.out.println("this wont execute");
			e.printStackTrace();
		}
	}

	private static void method1() throws CheckedException {
		System.out.println("method 1 called");
		try {
			method2();
		} /*
			 * catch (CheckedException e) {
			 * System.out.println("jai shree ram to support issue"); // hiding statkctrace
			 * // this helps in unnecessay showing of stack trace, claler method main will
			 * // think issue occured in this method only // after this methoid nothing will
			 * be printed //throw e; throw new RuntimeException(); }
			 */
		finally {
			System.out.println("executing to clean up at the end");
		}
	}

	// thros in method means it can or can not throw excpeion -> not mandaotry to
	// throw any exception actually in emthod
	// also uncheced exception are not foreced by complier to be hadnled someher in
	// calling method, or method where exception occurred
	private static int method2() throws CheckedException {
		System.out.println("method 2 called");
		// forcing runtinme /unchekd exception
		int y = 0;
		int x = 23;

		if (y == 0) {
			try {
				throw new CheckedException();
			} catch (CheckedException e) {
				e.printStackTrace();
				//throw e;
			}
		}
		return x / y;
	}
}
