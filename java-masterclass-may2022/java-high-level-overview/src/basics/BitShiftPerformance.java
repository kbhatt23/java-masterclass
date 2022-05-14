package basics;

public class BitShiftPerformance {

	public static void main(String[] args) {
		int times = 1000000000;
		performDivision(times);
		performBitShiftDivision(times);
	}

	private static void performDivision(int times) {
		long start = System.currentTimeMillis();
		for(int i = 1 ; i <= times ; i++ ) {
			int store = times /2 ;
		}
		long end = System.currentTimeMillis();
		
		System.out.println("performDivision time taken "+(end-start));
	}
	
	private static void performBitShiftDivision(int times) {
		long start = System.currentTimeMillis();
		for(int i = 1 ; i <= times ; i++ ) {
			int store = times  >>> 1 ;
		}
		long end = System.currentTimeMillis();
		
		System.out.println("performBitShiftDivision time taken "+(end-start));
	}
}
