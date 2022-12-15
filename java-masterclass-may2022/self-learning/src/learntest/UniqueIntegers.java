package learntest;

import java.util.Arrays;

public class UniqueIntegers {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {}));
	}
	
	static int solution(int[] A) {
		return Arrays.stream(A)
		.distinct()
		.sum();
	}
}
