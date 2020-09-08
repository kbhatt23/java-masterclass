package basics;

public class TrywithNoCatch {
	public static void main(String[] args) {
		try {
			handleException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void handleException()  throws Exception {
		int n=23;
		try {
			if(n==23) {
				throw new /* Runtime */Exception("forceful handling");
			}
		}finally {
			
		}
	}
}
