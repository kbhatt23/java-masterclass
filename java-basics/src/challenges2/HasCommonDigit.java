package challenges2;

public class HasCommonDigit {
	public static void main(String[] args) {

	}

	public static boolean hasSharedDigit(int num1, int num2) {
		if(num1 >=10 && num1 <=99 && num2 >=10 && num2 <=99) {
			
			String num1Str = String.valueOf(num1);
			String num2Str = String.valueOf(num2);
			for(int i=0 ; i< num1Str.length() ; i++) {
				int num1Digit = Integer.valueOf(num1Str.substring(i, i+1));
				for(int j =0 ; j<num2Str.length() ; j++) {
					int num2Digit = Integer.valueOf(num2Str.substring(j, j+1));	
					if(num1Digit == num2Digit) {
						return true;
					}
				}
			}
		return false;
		}else {
			return false;
		}
	}
}
