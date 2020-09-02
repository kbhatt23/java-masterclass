package fibonacci;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println(nthFibonaciNumber(3));
	}

	public static int nthFibonaciNumber(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return nthFibonaciNumber(n - 1) + nthFibonaciNumber(n - 2);
	}
}
