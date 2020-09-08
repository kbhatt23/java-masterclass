package basics;

public class ReturnTryCatchFinally {
	public static void main(String[] args) {
		int num = method1();
		System.out.println(num);
	}

	private static int method1() {
		try {
			int la = 0;
			if (la == 0)
				throw new Exception();
			return la;
		} catch (Exception e) {
			System.out.println("catch called ");
				throw e;
		} finally {
			return 32;
		}
	}
	
}
