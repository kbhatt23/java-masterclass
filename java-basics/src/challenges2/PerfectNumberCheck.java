package challenges2;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumberCheck {
public static void main(String[] args) {
System.out.println(	isPerfectNumber(28));
}
public static boolean isPerfectNumber(int number) {
	if(number < 1) {
		return false;
	}
	List<Integer> dividers = new ArrayList<Integer>();
	for(int i = 1 ; i<=number/2 ; i++) {
		if(number % i==0) {
			dividers.add(i);
		}
	}
	int sum=0;
	for(int a : dividers) {
		sum+=a;
	}
	System.out.println(dividers);
	return sum == number;
}
}
