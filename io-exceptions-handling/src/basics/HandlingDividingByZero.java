package basics;

public class HandlingDividingByZero {
	public static void main(String[] args) {
		int x = 23;
		int y = 0;
		System.out.println(divideUsingCheck(x, y));
		System.out.println(divideUsingTryCatch(x, y));
	}

	private static int divideUsingCheck(int x, int y) {
		//handling dividing by 0
		if(y == 0) return -1;
		return x / y;
	}
	
	private static int divideUsingTryCatch(int x, int y) {
		try {
			return x/y;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			return -1;
		}
	}
}
