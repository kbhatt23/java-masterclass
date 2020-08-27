package challenges2;

public class GreatestPrimeFactor {
public static void main(String[] args) {
	System.out.println(getLargestPrime(16));
}

public static int getLargestPrime(int number) {
	if(number <= 1) {
		return -1;
	}
	int startNumber =1;
	int largetstPrime= 1;
	while(number > 1 && startNumber <=number) {
		if(number % startNumber == 0) {
			number /=startNumber;
			largetstPrime = startNumber;
			if(number > startNumber && startNumber !=1) {
				continue;
			}
		}
		startNumber++;
	}
	return largetstPrime;
}
}
