package challenges2;

import java.util.function.Predicate;

public class LastDigitChecker {
	public static void main(String[] args) {
System.out.println(		hasSameLastDigit(23, 99, 93));
	}

	//private static Predicate<Integer> digitChecker = num -> num >= 10 && num <= 1000; 
	  public static boolean hasSameLastDigit(int num1, int num2, int num3){
	      if(!isValid(num1) || !isValid(num2) || !isValid(num3)) {
		  //if(!(num1 >= 10 && num1 <= 1000) || !(num2 >= 10 && num2 <= 1000) || !(num3 >= 10 && num3<= 1000)) {
	    	  return false;
	      }
	      
	      int num1LastDigit = num1 % 10;
	      int num2LastDigit = num2 % 10;
	      int num3LastDigit = num3 % 10;
	      if(num1LastDigit == num2LastDigit || num2LastDigit == num3LastDigit || num1LastDigit == num3LastDigit ) {
	    	  return true;
	      }
	      return false;
	    }
	  
	  public static boolean isValid(int num) {
		  return num >= 10 && num <= 1000;
	  }
}
