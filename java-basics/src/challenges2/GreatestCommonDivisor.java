package challenges2;

public class GreatestCommonDivisor {
public static void main(String[] args) {
	
}
public static int getGreatestCommonDivisor(int num1, int num2) {
	if(num1 < 10 || num2 < 10) {
		return -1;
	}
	int highest = (num2 > num1)? num2 : num1;
	int gcd = 1;
	for(int i = 1 ; i <highest/2 ; i++) {
		if(num1 % i ==0 && num2 % i ==0 && i > gcd) {
			gcd = i;
		}
	}
	return gcd;
}
}
