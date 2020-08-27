package challenges2;

public class NumberPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}
	
	 public static boolean isPalindrome(int number){
	     String numberStr = String.valueOf(number);
	     if(numberStr.contains("-"))
	    	 numberStr = numberStr.replace("-", "");
	     StringBuilder reverSb = new StringBuilder();
	     for(int i=numberStr.length()-1 ; i >= 0 ; i--) {
	    	 reverSb.append(numberStr.charAt(i));
	     }
	     return numberStr.equals(reverSb.toString());
	 }
}
